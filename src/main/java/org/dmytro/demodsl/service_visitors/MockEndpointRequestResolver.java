package org.dmytro.demodsl.service_visitors;

import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.matching.MultiValuePattern;
import com.github.tomakehurst.wiremock.matching.StringValuePattern;
import com.github.tomakehurst.wiremock.matching.UrlPattern;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.dmytro.demodsl.custom_emun.HttpRequestMethod;
import org.dmytro.demodsl.custom_emun.UrlMatchingType;
import org.dmytro.demodsl.custom_emun.condition_emun.CompositeConditionLogicalType;
import org.dmytro.demodsl.entity.*;
import org.dmytro.demodsl.entity.request_property.*;
import org.dmytro.demodsl.util.ExceptionUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.BiFunction;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

@Service
@Slf4j
@RequiredArgsConstructor
public class MockEndpointRequestResolver {

    private static final String UNSUPPORTED_CONDITION = "Unsupported condition: %s";

    public void stubMockEndpointRequest(MockEndpointRequestDefinition request) {

        MappingBuilder mappingBuilder = withHttpMethodForUrlPattern(request.getMethod(), resolveUrlPattern(request));
        log.info("Створено MappingBuilder з HTTP-методом та URL-шаблоном");

        mappingBuilder = mappingBuilder.atPriority(request.getPriority());
        log.info("Встановлено пріоритет для мапінгу");

        if (request.getRequestQueryParams() != null && !request.getRequestQueryParams().isEmpty()) {
            mappingBuilder = withQueryParams(mappingBuilder, request.getRequestQueryParams());
            log.info("Додано query-параметри до мапінгу");
        }

        if (request.getRequestHeaders() != null && !request.getRequestHeaders().isEmpty()) {
            mappingBuilder = withHeaders(mappingBuilder, request.getRequestHeaders());
            log.info("Додано заголовки до мапінгу");
        }

        if (request.getRequestCookies() != null && !request.getRequestCookies().isEmpty()) {
            mappingBuilder = withCookies(mappingBuilder, request.getRequestCookies());
            log.info("Додано cookies до мапінгу");
        }

        if (request.getRequestFormParams() != null && !request.getRequestFormParams().isEmpty()) {
            mappingBuilder = withRequestFormParams(mappingBuilder, request.getRequestFormParams());
            log.info("Додано form-параметри до мапінгу");
        }

        mappingBuilder.willReturn(
                aResponse()
                        .withStatus(200)
                        .withBody("{I am a mock response}")
                        .withHeader("Content-Type", "application/json")
        );
        log.info("Налаштовано відповідь: статус 200, тіло та заголовок Content-Type");

        WireMock.stubFor(mappingBuilder);

//        wireMockServer.stubFor(mappingBuilder);

//        WireMock.stubFor(
//                withHttpMethodForUrlPattern(
//                        request.getMethod(),
//                        resolveUrlPattern(request)
//                )
//                        .atPriority(request.getPriority())
//                        .wc
////                        .with
////                        .withQueryParams()
//                        .withHeaders()
//                        .withCookies()
//                        .withRequestBody()
//                        .willReturn(
//                                aResponse()
//                                        .withStatus(request.getStatusCode().value())
//                                        .withBody(request.getResponse())
//                                        .withHeader("Content-Type", "application/json")
//                        )
//        );
    }

    private MappingBuilder withQueryParams(@NotNull MappingBuilder mappingBuilder, @NotNull List<RequestQueryParam> requestQueryParams) {
        return withRequestProperties(mappingBuilder, requestQueryParams, mappingBuilder::withQueryParam);
    }

    private MappingBuilder withHeaders(@NotNull MappingBuilder mappingBuilder, @NotNull List<RequestHeader> requestHeaders) {
        return withRequestProperties(mappingBuilder, requestHeaders, mappingBuilder::withHeader);
    }

    private MappingBuilder withCookies(@NotNull MappingBuilder mappingBuilder, @NotNull List<RequestCookie> requestCookies) {
        requestCookies.forEach(requestProperty -> {
            String name = requestProperty.getName();
            Condition condition = requestProperty.getCondition();
            StringValuePattern stringValuePattern = mapConditionWithoutMultiValuePattern(condition);
            mappingBuilder.withCookie(name, stringValuePattern);
        });
        return mappingBuilder;
    }

    private MappingBuilder withRequestFormParams(@NotNull MappingBuilder mappingBuilder, @NotNull List<RequestFormParam> requestFormParams) {
        return withRequestProperties(mappingBuilder, requestFormParams, mappingBuilder::withFormParam);
    }

    private <T extends RequestProperty> MappingBuilder withRequestProperties(
            @NotNull MappingBuilder mappingBuilder,
            @NotNull List<T> requestProperties,
            BiFunction<String, MultiValuePattern, MappingBuilder> mappingFunction
    ) {
        requestProperties.forEach(requestProperty -> {
            String name = requestProperty.getName();
            Condition condition = requestProperty.getCondition();
            MultiValuePattern multiValuePattern = mapCondition(condition);
            mappingFunction.apply(name, multiValuePattern);
        });
        return mappingBuilder;

    }

    private MultiValuePattern mapCondition(@NotNull Condition condition) {
        MultiValuePattern result;
        switch (condition) {
            case SimpleCondition simpleCondition -> result = MultiValuePattern.of(mapSimpleCondition(simpleCondition));
            case CompositeCondition compositeCondition -> result = mapCompositeCondition(compositeCondition);
            case PresenceCondition presenceCondition ->
                    result = MultiValuePattern.of(mapPresenceCondition(presenceCondition));
            default -> throw new IllegalArgumentException(UNSUPPORTED_CONDITION.formatted(condition));
        }
        return result;
    }

    private StringValuePattern mapSimpleCondition(@NotNull SimpleCondition simpleCondition) {
        String value = simpleCondition.getValue();
        StringValuePattern result = switch (simpleCondition.getRequestConditionType()) {
            case EQUALS -> equalTo(value);
            case MATCHES_REGEX -> matching(value);
            case CONTAINS -> containing(value);
            case MATCHES_JSON_SCHEMA -> matchingJsonSchema(value);
            case EQUALS_XML -> equalToXml(value);
            case MATCHES_XPATH -> matchingXPath(value);
            case EQUALS_JSON -> equalToJson(value);
            case MATCHES_JSON_PATH -> matchingJsonPath(value);
            case BEFORE -> before(value);
            case AFTER -> after(value);
            case EQUALS_DATE_TIME -> equalToDateTime(value);
            default -> throw ExceptionUtils.illegalArgument(UNSUPPORTED_CONDITION.formatted(simpleCondition));
        };
        return simpleCondition.isNegated() ? not(result) : result;
    }

    private MultiValuePattern mapCompositeCondition(@NotNull CompositeCondition compositeCondition) {
        boolean isNegated = compositeCondition.isNegated();

        if (compositeCondition.getSubConditions() == null) {
            throw ExceptionUtils.illegalArgument("Composite condition without sub conditions: " + compositeCondition);
        }

        StringValuePattern[] stringValuePatterns = compositeCondition.getSubConditions().stream()
                .map(this::mapConditionWithoutMultiValuePattern)
                .toArray(StringValuePattern[]::new);

        MultiValuePattern result = switch (compositeCondition.getRequestConditionType()) {
            case AND -> {
                StringValuePattern and = and(stringValuePatterns);
                and = isNegated ? not(and) : and;
                yield MultiValuePattern.of(and);
            }
            case OR -> {
                StringValuePattern or = or(stringValuePatterns);
                or = isNegated ? not(or) : or;
                yield MultiValuePattern.of(or);
            }
            case VALUES_INCLUDE -> {
                if (isNegated) {
                    for (int i = 0; i < stringValuePatterns.length; i++) {
                        stringValuePatterns[i] = not(stringValuePatterns[i]);
                    }
                }
                yield including(stringValuePatterns);
            }
            case VALUES_ARE_EXACTLY -> {
                if (isNegated) {
                    for (int i = 0; i < stringValuePatterns.length; i++) {
                        stringValuePatterns[i] = not(stringValuePatterns[i]);
                    }
                }
                yield havingExactly(stringValuePatterns);
            }
            default -> throw new IllegalArgumentException(UNSUPPORTED_CONDITION.formatted(compositeCondition));
        };
        log.info("Mapped composite condition: {}", result);
        return result;
    }

    private StringValuePattern mapCompositeConditionWithoutMultiValuePattern(@NotNull CompositeCondition condition) {
        List<Condition> subConditions = condition.getSubConditions();
        if (subConditions == null) {
            throw ExceptionUtils.illegalArgument("Composite condition without sub conditions: " + condition);
        }

        subConditions.stream()
                .filter(CompositeCondition.class::isInstance)
                .map(CompositeCondition.class::cast)
                .filter(subCondition ->
                        subCondition.getRequestConditionType() == CompositeConditionLogicalType.VALUES_INCLUDE ||
                                subCondition.getRequestConditionType() == CompositeConditionLogicalType.VALUES_ARE_EXACTLY
                )
                .findAny()
                .ifPresent(
                        subCondition -> {
                            throw ExceptionUtils.illegalArgument("Composite condition type " + subCondition.getRequestConditionType() + " is not supported for nested values.");
                        }
                );

        StringValuePattern[] stringValuePatterns = subConditions.stream()
                .map(this::mapConditionWithoutMultiValuePattern)
                .toArray(StringValuePattern[]::new);

        StringValuePattern result = switch (condition.getRequestConditionType()) {
            case AND -> and(stringValuePatterns);
            case OR -> or(stringValuePatterns);
            default -> throw new IllegalArgumentException(UNSUPPORTED_CONDITION.formatted(condition));
        };
        return condition.isNegated() ? not(result) : result;
    }

    private StringValuePattern mapConditionWithoutMultiValuePattern(@NotNull Condition condition) {
        return switch (condition) {
            case SimpleCondition simpleCondition -> mapSimpleCondition(simpleCondition);
            case CompositeCondition compositeCondition ->
                    mapCompositeConditionWithoutMultiValuePattern(compositeCondition);
            case PresenceCondition presenceCondition -> mapPresenceCondition(presenceCondition);
            case null, default -> throw ExceptionUtils.illegalArgument(UNSUPPORTED_CONDITION.formatted(condition));
        };
    }

    private StringValuePattern mapPresenceCondition(PresenceCondition presenceCondition) {
        StringValuePattern result = switch (presenceCondition.getRequestConditionType()) {
            case IS_PRESENT -> not(absent());
            default -> throw new IllegalArgumentException(UNSUPPORTED_CONDITION.formatted(presenceCondition));
        };
        return presenceCondition.isNegated() ? not(result) : result;
    }

//    private ContentPattern<?> processValidationCondition(MockEndpointRequestDefinition request) {
//
//        List<RequestQueryParam> requestQueryParams = request.getRequestQueryParams();
//
//        if (requestQueryParams != null && !requestQueryParams.isEmpty()) {
//            return withQueryParams(requestQueryParams);
//        }
//
//
//        return switch (requestBodyValidationRule) {
//            case EqualsRequestBodyValidationRule rule -> equalTo(rule.getRequestData());
//            case ContainsRequestBodyValidationRule rule -> containing(rule.getRequestData());
//            case EqualsJsonRequestBodyValidationRule rule ->
//                    equalToJson(rule.getRequestData(), rule.getIgnoreArrayOrder(), rule.getIgnoreExtraFields());
//            case EqualsXmlRequestBodyValidationRule rule ->
//                    equalToXml(rule.getRequestData(), rule.getEnablePlaceholders());
//            case IsAbsentRequestBodyValidationRule rule -> absent();
//            case IsPresentRequestBodyValidationRule rule -> not(absent());
//            case MatchesJsonPathRequestBodyValidationRule rule ->
//                    matchingJsonPath(rule.getRequestData(), equalTo(rule.getComparisonData()));
//            default -> throw new IllegalArgumentException("Unsupported validation rule: " + requestBodyValidationRule);
//        };
//    }

    //14.03.2025
    public UrlPattern resolveUrlPattern(MockEndpointRequestDefinition request) {
        UrlMatchingType urlMatchingType = request.getUrlMatchingType();
        UrlPattern urlPattern = switch (urlMatchingType) {
            case PATH -> urlPathEqualTo(request.getPath());
            case PATH_AND_QUERY -> urlEqualTo(request.getPath());
            case PATH_AND_QUERY_REGEX -> urlMatching(request.getPath());
            case PATH_REGEX -> urlPathMatching(request.getPath());
            case PATH_TEMPLATE -> urlPathTemplate(request.getPath());
            case ANY_URL -> anyUrl();
            default -> throw new IllegalArgumentException("Unsupported URL matching type: " + urlMatchingType);
        };
        log.info("Resolved URL pattern: {}", urlPattern);
        log.info("Path {}", request.getPath());
        return urlPattern;
    }

    //14.03.2025
    public MappingBuilder withHttpMethodForUrlPattern(HttpRequestMethod httpMethod, UrlPattern urlPattern) {
        return switch (httpMethod) {
            case GET -> WireMock.get(urlPattern);
            case POST -> WireMock.post(urlPattern);
            case PUT -> WireMock.put(urlPattern);
            case PATCH -> WireMock.patch(urlPattern);
            case DELETE -> WireMock.delete(urlPattern);
            case OPTIONS -> WireMock.options(urlPattern);
            case TRACE -> WireMock.trace(urlPattern);
            case ANY -> WireMock.any(urlPattern);
            default -> throw new IllegalArgumentException("Unsupported HTTP method: " + httpMethod);
        };
    }

//    public StringValuePattern processValidationCondition(RequestBodyValidationRule requestBodyValidationRule) {
//        ValidationCondition condition = requestBodyValidationRule.getCondition();
//        boolean isNegated = requestBodyValidationRule.isNegated();
//
//        StringValuePattern pattern = switch (requestBodyValidationRule) {
//
//            case EqualsRequestBodyValidationRule rule -> {
//                validateConditionsAreEqual(ValidationCondition.EQUALS, condition);
//                yield equalTo(rule.getRequestData());
//            }
//
//            case ContainsRequestBodyValidationRule rule -> {
//                validateConditionsAreEqual(ValidationCondition.CONTAINS, condition);
//                yield containing(rule.getRequestData());
//            }
//
//            case EqualsJsonRequestBodyValidationRule rule -> {
//                validateConditionsAreEqual(ValidationCondition.EQUALS_JSON, condition);
//                yield equalToJson(rule.getRequestData(), rule.getIgnoreArrayOrder(), rule.getIgnoreExtraFields());
//            }
//
//            case EqualsXmlRequestBodyValidationRule rule -> {
//                validateConditionsAreEqual(ValidationCondition.EQUALS_XML, condition);
//                yield equalToXml(rule.getRequestData(), rule.getEnablePlaceholders());
//            }
//
//            case IsAbsentRequestBodyValidationRule rule -> {
//                validateConditionsAreEqual(ValidationCondition.IS_ABSENT, condition);
//                yield absent();
//            }
//
//            case IsPresentRequestBodyValidationRule rule -> {
//                validateConditionsAreEqual(ValidationCondition.IS_PRESENT, condition);
//                yield not(absent());
//            }
//
//            case MatchesJsonPathRequestBodyValidationRule rule -> {
//                validateConditionsAreEqual(ValidationCondition.MATCHES_JSON_PATH, condition);
//                BiFunction<JsonValidationCondition, String, StringValuePattern> function = getJsonValidationConditionProcessingFunction();
//                StringValuePattern jsonValuePattern = function.apply(rule.getJsonValidationCondition(), rule.getComparisonData());
//                yield matchingJsonPath(rule.getRequestData(), jsonValuePattern);
//            }
//
//            default -> throw new IllegalArgumentException("Unsupported validation condition: " + condition);
//        };
//
//        return isNegated ? not(pattern) : pattern;
//    }

//    public void validateConditionsAreEqual(ValidationCondition firstCondition, ValidationCondition secondCondition) {
//        if (firstCondition != secondCondition) {
//            throw new IllegalArgumentException("Validation conditions are not equal: " + firstCondition + " and " + secondCondition);
//        }
//    }

//    private BiFunction<JsonValidationCondition, String, StringValuePattern> getJsonValidationConditionProcessingFunction() {
//        return (jsonValidationCondition, comparisonData) ->
//                switch (jsonValidationCondition) {
//                    case JsonValidationCondition.EQUALS -> equalTo(comparisonData);
//                    case JsonValidationCondition.CONTAINS -> containing(comparisonData);
//                    case JsonValidationCondition.IS_PRESENT -> not(absent());
//                    case JsonValidationCondition.IS_ABSENT -> absent();
//                    default -> throw new IllegalArgumentException("Unsupported JSON validation condition: " + jsonValidationCondition);
//                };
//    }

}
