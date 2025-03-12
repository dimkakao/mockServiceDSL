package org.dmytro.demodsl.service;

import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.matching.ContentPattern;
import com.github.tomakehurst.wiremock.matching.StringValuePattern;
import com.github.tomakehurst.wiremock.matching.UrlPattern;
import org.dmytro.demodsl.custom_emun.HttpRequestMethod;
import org.dmytro.demodsl.entity.MockEndpointRequestDefinition;
import org.dmytro.demodsl.custom_emun.JsonValidationCondition;
import org.dmytro.demodsl.custom_emun.ValidationCondition;
import org.dmytro.demodsl.validation_rule.*;
import org.springframework.stereotype.Service;

import java.util.function.BiFunction;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

@Service
public class MockEndpointRequestResolver {

//    {
//        WireMock.stubFor(
//                WireMock.post(
//                                urlEqualTo("/your-endpoint")
//                        )
//                        .withRequestBody(
//                                equalToJson("{\"key\": \"value\", \"anotherKey\": \"anotherValue\"}")
//                        )
//                        .willReturn(
//                                aResponse()
//                                        .withStatus(200)
//                                        .withBody("{\"mock\": \"response йоу\"}")
//                                        .withHeader("Content-Type", "application/json")
//                        )
//        );
//    }

    public void stubMockEndpointRequest(MockEndpointRequestDefinition request) {
//        RequestBodyValidationRule requestBodyValidationRule = request.getRequestBodyValidationRule();
//        ContentPattern<?> requestBodyPattern = processValidationCondition(requestBodyValidationRule);
//
//        HttpRequestMethod method = request.getMethod();
//        WireMock.stubFor(
//                withHttpMethodForUrlPattern(
//                        method,
//                        resolveUrlPattern(request)
//                )
//                .withRequestBody(requestBodyPattern)
//                .willReturn(
//                        aResponse()
//                                .withStatus(request.getStatusCode().value())
//                                .withBody(request.getResponse())
//                                .withHeader("Content-Type", "application/json")
//                )
//        );
    }

    public UrlPattern resolveUrlPattern(MockEndpointRequestDefinition request) {
        String path = request.getPath();
        return WireMock.urlPathEqualTo(path);
    }

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

    public StringValuePattern processValidationCondition(RequestBodyValidationRule requestBodyValidationRule) {
        ValidationCondition condition = requestBodyValidationRule.getCondition();
        boolean isNegated = requestBodyValidationRule.isNegated();

        StringValuePattern pattern = switch (requestBodyValidationRule) {

            case EqualsRequestBodyValidationRule rule -> {
                validateConditionsAreEqual(ValidationCondition.EQUALS, condition);
                yield equalTo(rule.getRequestData());
            }

            case ContainsRequestBodyValidationRule rule -> {
                validateConditionsAreEqual(ValidationCondition.CONTAINS, condition);
                yield containing(rule.getRequestData());
            }

            case EqualsJsonRequestBodyValidationRule rule -> {
                validateConditionsAreEqual(ValidationCondition.EQUALS_JSON, condition);
                yield equalToJson(rule.getRequestData(), rule.getIgnoreArrayOrder(), rule.getIgnoreExtraFields());
            }

            case EqualsXmlRequestBodyValidationRule rule -> {
                validateConditionsAreEqual(ValidationCondition.EQUALS_XML, condition);
                yield equalToXml(rule.getRequestData(), rule.getEnablePlaceholders());
            }

            case IsAbsentRequestBodyValidationRule rule -> {
                validateConditionsAreEqual(ValidationCondition.IS_ABSENT, condition);
                yield absent();
            }

            case IsPresentRequestBodyValidationRule rule -> {
                validateConditionsAreEqual(ValidationCondition.IS_PRESENT, condition);
                yield not(absent());
            }

            case MatchesJsonPathRequestBodyValidationRule rule -> {
                validateConditionsAreEqual(ValidationCondition.MATCHES_JSON_PATH, condition);
                BiFunction<JsonValidationCondition, String, StringValuePattern> function = getJsonValidationConditionProcessingFunction();
                StringValuePattern jsonValuePattern = function.apply(rule.getJsonValidationCondition(), rule.getComparisonData());
                yield matchingJsonPath(rule.getRequestData(), jsonValuePattern);
            }

            default -> throw new IllegalArgumentException("Unsupported validation condition: " + condition);
        };

        return isNegated ? not(pattern) : pattern;
    }

    public void validateConditionsAreEqual(ValidationCondition firstCondition, ValidationCondition secondCondition) {
        if (firstCondition != secondCondition) {
            throw new IllegalArgumentException("Validation conditions are not equal: " + firstCondition + " and " + secondCondition);
        }
    }

    private BiFunction<JsonValidationCondition, String, StringValuePattern> getJsonValidationConditionProcessingFunction() {
        return (jsonValidationCondition, comparisonData) ->
                switch (jsonValidationCondition) {
                    case JsonValidationCondition.EQUALS -> equalTo(comparisonData);
                    case JsonValidationCondition.CONTAINS -> containing(comparisonData);
                    case JsonValidationCondition.IS_PRESENT -> not(absent());
                    case JsonValidationCondition.IS_ABSENT -> absent();
                    default ->
                            throw new IllegalArgumentException("Unsupported JSON validation condition: " + jsonValidationCondition);
                };
    }

}
