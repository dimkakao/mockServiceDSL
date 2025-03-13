package org.dmytro.demodsl.service_visitors;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.dmytro.demodsl.adapter.RequestPropertyDefinition;
import org.dmytro.demodsl.adapter.impl.RequestCookiesDefinition;
import org.dmytro.demodsl.adapter.impl.RequestFormParamsDefinition;
import org.dmytro.demodsl.adapter.impl.RequestHeadersDefinition;
import org.dmytro.demodsl.adapter.impl.RequestQueryParamsDefinition;
import org.dmytro.demodsl.entity.Condition;
import org.dmytro.demodsl.entity.request_property.*;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;

@Service
@Slf4j
public class RequestPropertyProcessorService {

    private static final ConditionProcessingService conditionProcessingService = new ConditionProcessingService();

    public List<RequestQueryParam> mapRequestQueryParamsContextToListOfRequestQueryParam(
            @NotNull DmytroMockDSLParser.RequestQueryParamsContext requestQueryParamsContext
    ) {
        RequestQueryParamsDefinition requestQueryParamsDefinition = new RequestQueryParamsDefinition(requestQueryParamsContext);
        return mapRequestPropertyDefinitionToListOfRequestProperties(requestQueryParamsDefinition);
    }

    public List<RequestHeader> mapRequestHeadersContextToListOfRequestHeader(
            @NotNull DmytroMockDSLParser.RequestHeadersContext requestHeadersContext
    ) {
        RequestHeadersDefinition requestHeadersDefinition = new RequestHeadersDefinition(requestHeadersContext);
        return mapRequestPropertyDefinitionToListOfRequestProperties(requestHeadersDefinition);
    }

    public List<RequestCookie> mapRequestCookiesContextToListOfRequestCookie(
            @NotNull DmytroMockDSLParser.RequestCookiesContext requestCookiesContext
    ) {
        RequestCookiesDefinition requestCookiesDefinition = new RequestCookiesDefinition(requestCookiesContext);
        return mapRequestPropertyDefinitionToListOfRequestProperties(requestCookiesDefinition);
    }

    public List<RequestFormParam> mapRequestFormParamsContextToListOfRequestFormParam(
            @NotNull DmytroMockDSLParser.RequestFormParamsContext requestFormParamsContext) {
        RequestFormParamsDefinition requestFormParamsDefinition = new RequestFormParamsDefinition(requestFormParamsContext);
        return mapRequestPropertyDefinitionToListOfRequestProperties(requestFormParamsDefinition);
    }

    public <T extends RequestProperty> List<T> mapRequestPropertyDefinitionToListOfRequestProperties(
            @NotNull RequestPropertyDefinition<T> requestPropertyDefinition
    ) {
        return Optional.ofNullable(requestPropertyDefinition)
                .map(RequestPropertyDefinition::getRules)
                .stream()
                .flatMap(List::stream)
                .map(requestPropertyRule -> {
                    String name = requestPropertyRule.getName();
                    DmytroMockDSLParser.ConditionContext conditionContext = requestPropertyRule.getCondition();
                    return processRequestPropertyRuleContext(name, conditionContext, requestPropertyRule.requestPropertyAggregator());
                })
                .toList();
    }

    private <T extends RequestProperty> T processRequestPropertyRuleContext(
            @NotBlank String propertyName,
            @NotNull DmytroMockDSLParser.ConditionContext conditionContext,
            @NotNull BiFunction<String, Condition, T> requestPropertyAggregator
    ) {
        log.info("propertyName: " + propertyName);
        Condition condition = conditionProcessingService.processConditionContext(conditionContext);
        log.info("Condition: " + condition);
        T requestProperty = requestPropertyAggregator.apply(propertyName, condition);
        log.info("RequestProperty: " + requestProperty);
        return requestProperty;
    }



}


