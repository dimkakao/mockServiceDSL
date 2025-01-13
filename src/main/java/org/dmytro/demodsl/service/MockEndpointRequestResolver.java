package org.dmytro.demodsl.service;

import com.github.tomakehurst.wiremock.client.MappingBuilder;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.matching.ContentPattern;
import com.github.tomakehurst.wiremock.matching.StringValuePattern;
import com.github.tomakehurst.wiremock.matching.UrlPattern;
import org.dmytro.demodsl.component.HttpRequestType;
import org.dmytro.demodsl.component.MockEndpointRequest;
import org.dmytro.demodsl.validation_condition.JsonValidationCondition;
import org.dmytro.demodsl.validation_condition.ValidationCondition;
import org.dmytro.demodsl.validation_rule.*;
import org.springframework.stereotype.Component;
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

    public void stubMockEndpointRequest(MockEndpointRequest request) {

        MappingBuilder mappingBuilder = resolveRequestMapping(request);
        ContentPattern<?> requestBodyPattern = resolveRequestBodyPattern(request);
//        mappingBuilder
//                .withRequestBody(requestBodyPattern)
//                .willReturn(
//                        aResponse()
//                                .withStatus(200)
//                                .withBody(request.getResponse())
//                                .withHeader("Content-Type", "application/json")
//                );

        WireMock.stubFor(
                mappingBuilder
                .withRequestBody(requestBodyPattern)
                .willReturn(
                        aResponse()
                                .withStatus(200)
                                .withBody(request.getResponse())
                                .withHeader("Content-Type", "application/json")
                ));
    }

    public MappingBuilder resolveRequestMapping(MockEndpointRequest request) {

        UrlPattern urlPattern = resolveUrlPattern(request);
        HttpRequestType method = request.getMethod();

        return switch (method) {
            case GET -> WireMock.get(urlPattern);
            case POST -> WireMock.post(urlPattern);
            case PUT -> WireMock.put(urlPattern);
            case PATCH -> WireMock.patch(urlPattern);
            case DELETE -> WireMock.delete(urlPattern);
            case OPTIONS -> WireMock.options(urlPattern);
            case TRACE -> WireMock.trace(urlPattern);
            case ANY -> WireMock.any(urlPattern);
            default -> throw new IllegalArgumentException("Unsupported HTTP method: " + method);
        };

    }

    public UrlPattern resolveUrlPattern(MockEndpointRequest request) {
        String path = request.getPath();
        return WireMock.urlPathEqualTo(path);
    }

    public ContentPattern resolveRequestBodyPattern(MockEndpointRequest request) {
        RequestBodyValidationRule requestBodyValidationRule = request.getRequestBodyValidationRule();
        //        switch (condition) {
//
//            case EQUALS -> {
//                if (requestBodyValidationRule instanceof EqualsJsonRequestBodyValidationRule rule) {
//                    return equalToJson(rule.getRequestData(), rule.isIgnoreArrayOrder(), rule.isIgnoreExtraFields());
//                } else {
//                    throw new IllegalArgumentException("Request body validation rule mismatch for condition: " +
//                            condition + ". Expected: " + EqualsJsonRequestBodyValidationRule.class);
//                }
//            }
//
//            case CONTAINS -> {
//                if (requestBodyValidationRule instanceof ContainsRequestBodyValidationRule rule) {
//                    return containing(rule.getRequestData());
//                } else {
//                    throw new IllegalArgumentException("Request body validation rule mismatch for condition: " +
//                            condition + ". Expected: " + ContainsRequestBodyValidationRule.class);
//                }
//            }
//
//            case EQUALS_JSON -> {
//                if (requestBodyValidationRule instanceof EqualsJsonRequestBodyValidationRule rule) {
//                    return equalToJson(rule.getRequestData(), rule.isIgnoreArrayOrder(), rule.isIgnoreExtraFields());
//                } else {
//                    throw new IllegalArgumentException("Request body validation rule mismatch for condition: " +
//                            condition + ". Expected: " + EqualsJsonRequestBodyValidationRule.class);
//                }
//            }
//            case EQUALS_XML -> {
//                if (requestBodyValidationRule instanceof EqualsXmlRequestBodyValidationRule rule) {
//                    return equalToXml(rule.getRequestData(), rule.isEnablePlaceholders());
//                } else {
//                    throw new IllegalArgumentException("Request body validation rule mismatch for condition: " +
//                            condition + ". Expected: " + EqualsXmlRequestBodyValidationRule.class);
//                }
//            }
//            case IS_ABSENT -> {
//                if (requestBodyValidationRule instanceof IsAbsentRequestBodyValidationRule rule) {
//                    return absent();
//                } else {
//                    throw new IllegalArgumentException("Request body validation rule mismatch for condition: " +
//                            condition + ". Expected: " + IsAbsentRequestBodyValidationRule.class);
//                }
//            }
//            case IS_PRESENT -> {
//                if (requestBodyValidationRule instanceof IsPresentRequestBodyValidationRule rule) {
//                    return not(absent());
//                } else {
//                    throw new IllegalArgumentException("Request body validation rule mismatch for condition: " +
//                            condition + ". Expected: " + IsPresentRequestBodyValidationRule.class);
//                }
//            }
//            case MATCHES_JSON_PATH -> {
//                if (requestBodyValidationRule instanceof MatchesJsonPathRequestBodyValidationRule rule) {
//                    JsonValidationCondition jsonValidationCondition = rule.getJsonValidationCondition();
//                    BiFunction<JsonValidationCondition, String, StringValuePattern> function
//                            = getJsonValidationConditionProcessingFunction();
//                    StringValuePattern jsonValuePattern = function.apply(jsonValidationCondition, rule.getComparisonData());
//                    return matchingJsonPath(rule.getRequestData(), jsonValuePattern);
//                } else {
//                    throw new IllegalArgumentException("Request body validation rule mismatch for condition: " +
//                            condition + ". Expected: " + MatchesJsonPathRequestBodyValidationRule.class);
//                }
//            }
//        }
        return processValidationCondition(requestBodyValidationRule);
    }



    public ContentPattern processValidationCondition(RequestBodyValidationRule requestBodyValidationRule) {

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

//        StringValuePattern pattern = switch (condition) {
//
//            case EQUALS -> {
//                // Перевірка і обробка для умови "EQUALS"
//                if (requestBodyValidationRule instanceof EqualsJsonRequestBodyValidationRule rule) {
//                    yield  equalToJson(rule.getRequestData(), rule.isIgnoreArrayOrder(), rule.isIgnoreExtraFields());
//                } else {
//                    throw new IllegalArgumentException("Request body validation rule mismatch for condition: " +
//                            condition + ". Expected: " + EqualsJsonRequestBodyValidationRule.class);
//                }
//            }
//
//            case CONTAINS -> {
//                // Перевірка і обробка для умови "CONTAINS"
//                if (requestBodyValidationRule instanceof ContainsRequestBodyValidationRule rule) {
//                    yield containing(rule.getRequestData());
//                } else {
//                    throw new IllegalArgumentException("Request body validation rule mismatch for condition: " +
//                            condition + ". Expected: " + ContainsRequestBodyValidationRule.class);
//                }
//            }
//
//            case EQUALS_JSON -> {
//                // Перевірка і обробка для умови "EQUALS_JSON"
//                if (requestBodyValidationRule instanceof EqualsJsonRequestBodyValidationRule rule) {
//                    yield equalToJson(rule.getRequestData(), rule.isIgnoreArrayOrder(), rule.isIgnoreExtraFields());
//                } else {
//                    throw new IllegalArgumentException("Request body validation rule mismatch for condition: " +
//                            condition + ". Expected: " + EqualsJsonRequestBodyValidationRule.class);
//                }
//            }
//
//            case EQUALS_XML -> {
//                // Перевірка і обробка для умови "EQUALS_XML"
//                if (requestBodyValidationRule instanceof EqualsXmlRequestBodyValidationRule rule) {
//                    yield equalToXml(rule.getRequestData(), rule.isEnablePlaceholders());
//                } else {
//                    throw new IllegalArgumentException("Request body validation rule mismatch for condition: " +
//                            condition + ". Expected: " + EqualsXmlRequestBodyValidationRule.class);
//                }
//            }
//
//            case IS_ABSENT -> {
//                // Перевірка і обробка для умови "IS_ABSENT"
//                if (requestBodyValidationRule instanceof IsAbsentRequestBodyValidationRule rule) {
//                    yield absent();
//                } else {
//                    throw new IllegalArgumentException("Request body validation rule mismatch for condition: " +
//                            condition + ". Expected: " + IsAbsentRequestBodyValidationRule.class);
//                }
//            }
//
//            case IS_PRESENT -> {
//                // Перевірка і обробка для умови "IS_PRESENT"
//                if (requestBodyValidationRule instanceof IsPresentRequestBodyValidationRule rule) {
//                    yield not(absent());
//                } else {
//                    throw new IllegalArgumentException("Request body validation rule mismatch for condition: " +
//                            condition + ". Expected: " + IsPresentRequestBodyValidationRule.class);
//                }
//            }
//
//            case MATCHES_JSON_PATH -> {
//                // Перевірка і обробка для умови "MATCHES_JSON_PATH"
//                if (requestBodyValidationRule instanceof MatchesJsonPathRequestBodyValidationRule rule) {
//                    JsonValidationCondition jsonValidationCondition = rule.getJsonValidationCondition();
//                    BiFunction<JsonValidationCondition, String, StringValuePattern> function = getJsonValidationConditionProcessingFunction();
//                    StringValuePattern jsonValuePattern = function.apply(jsonValidationCondition, rule.getComparisonData());
//                    yield matchingJsonPath(rule.getRequestData(), jsonValuePattern);
//                } else {
//                    throw new IllegalArgumentException("Request body validation rule mismatch for condition: " +
//                            condition + ". Expected: " + MatchesJsonPathRequestBodyValidationRule.class);
//                }
//            }
//
//            default -> throw new IllegalArgumentException("Unsupported validation condition: " + condition);
//        };
//
//        return isNegated ? not(pattern) : pattern;
//    }

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
