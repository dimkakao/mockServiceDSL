package org.dmytro.demodsl.service_visitors;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.dmytro.demodsl.adapter.RequestPropertyDefinition;
import org.dmytro.demodsl.adapter.impl.RequestHeadersDefinition;
import org.dmytro.demodsl.adapter.impl.RequestQueryParamsDefinition;
import org.dmytro.demodsl.entity.Condition;
import org.dmytro.demodsl.entity.request_property.RequestHeader;
import org.dmytro.demodsl.entity.request_property.RequestProperty;
import org.dmytro.demodsl.entity.request_property.RequestQueryParam;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;

public class RequestPropertyProcessorService {


    private static final ConditionProcessingService conditionProcessingService = new ConditionProcessingService();


//    private List<RequestQueryParam> mapRequestQueryParamsContextToListOfRequestQueryParam(
//            @NotNull DmytroMockDSLParser.RequestQueryParamsContext requestQueryParams
//    ) {
//        List<RequestQueryParam> result = new ArrayList<>();
//        Optional.ofNullable(requestQueryParams)
//                .map(DmytroMockDSLParser.RequestQueryParamsContext::requestQueryParamRule)
//                .ifPresent(requestQueryParamRules -> {
//                    requestQueryParamRules.forEach(requestQueryParamRule -> {
//                        RequestQueryParam requestQueryParam = processRequestPropertyRuleContext(
//                                requestQueryParamRule.setNameCommand().STRING().getText(),
//                                requestQueryParamRule.condition(),
//                                RequestQueryParam::new
//                        );
//                        result.add(requestQueryParam);
//                    });
//                });
//        return result;
//    }

    public List<RequestQueryParam> mapRequestQueryParamsContextToListOfRequestQueryParam(
            @NotNull DmytroMockDSLParser.RequestQueryParamsContext requestQueryParamsContext
    ) {
        RequestQueryParamsDefinition requestQueryParamsDefinition = new RequestQueryParamsDefinition(requestQueryParamsContext);
        return mapRequestPropertyDefinitionToListOfRequestProperties(requestQueryParamsDefinition);

        //ПРАЦЮЄ
//        return Optional.ofNullable(requestQueryParamsDefinition)
//                .map(DmytroMockDSLParser.RequestQueryParamsContext::requestQueryParamRule)
//                .stream()
//                .flatMap(List::stream)
//                .map(requestQueryParamRule -> {
//                    Optional<DmytroMockDSLParser.RequestQueryParamRuleContext> requestQueryParamRuleOptional
//                            = Optional.ofNullable(requestQueryParamRule);
//
//                    DmytroMockDSLParser.ConditionContext conditionContext = requestQueryParamRuleOptional
//                            .map(DmytroMockDSLParser.RequestQueryParamRuleContext::condition)
//                            .orElseThrow(ExceptionUtils.illegalArgumentSupplier("RequestQueryParamContext does not contain condition."));
//
//                    String name = requestQueryParamRuleOptional
//                            .map(DmytroMockDSLParser.RequestQueryParamRuleContext::setNameCommand)
//                            .map(DmytroMockDSLParser.SetNameCommandContext::STRING)
//                            .map(ParseTree::getText)
//                            .filter(StringUtils::hasText)
//                            .orElseThrow(ExceptionUtils.illegalArgumentSupplier("RequestQueryParamContext does not contain name."));
//
//                    return processRequestPropertyRuleContext(name, conditionContext, RequestQueryParam::new);
//                })
//                .toList();
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

    public List<RequestHeader> mapRequestHeadersContextToListOfRequestHeader(
            @NotNull DmytroMockDSLParser.RequestHeadersContext requestHeadersContext
    ) {
        RequestHeadersDefinition requestQueryParamsDefinition = new RequestHeadersDefinition(requestHeadersContext);
        return mapRequestPropertyDefinitionToListOfRequestProperties(requestQueryParamsDefinition);


//        return Optional.ofNullable(requestHeadersDefinition)
//                .map(DmytroMockDSLParser.RequestHeadersContext::requestHeaderRule)
//                .stream()
//                .flatMap(List::stream)
//                .map(requestHeaderRule -> {
//                    Optional<DmytroMockDSLParser.RequestHeaderRuleContext> requestHeaderRuleOptional
//                            = Optional.ofNullable(requestHeaderRule);
//
//                    DmytroMockDSLParser.ConditionContext conditionContext = requestHeaderRuleOptional
//                            .map(DmytroMockDSLParser.RequestHeaderRuleContext::condition)
//                            .orElseThrow(ExceptionUtils.illegalArgumentSupplier("RequestHeaderRuleContext does not contain condition."));
//
//                    String name = requestHeaderRuleOptional
//                            .map(DmytroMockDSLParser.RequestHeaderRuleContext::setNameCommand)
//                            .map(DmytroMockDSLParser.SetNameCommandContext::STRING)
//                            .map(ParseTree::getText)
//                            .filter(StringUtils::hasText)
//                            .orElseThrow(ExceptionUtils.illegalArgumentSupplier("RequestHeaderRuleContext does not contain name."));
//
//                    return processRequestPropertyRuleContext(name, conditionContext, RequestHeader::new);
//                })
//                .toList();
    }

    private <T extends RequestProperty> T processRequestPropertyRuleContext(
            @NotBlank String propertyName,
            @NotNull DmytroMockDSLParser.ConditionContext conditionContext,
            BiFunction<String, Condition, T> requestPropertyAggregator
    ) {
        System.out.println("propertyName: " + propertyName);
        T requestProperty = processRequestProperty(
                propertyName,
                conditionContext,
                requestPropertyAggregator
        );
        System.out.println("RequestProperty: " + requestProperty);
        return requestProperty;
    }

    public <T extends RequestProperty> T processRequestProperty(
            String propertyName,
            DmytroMockDSLParser.ConditionContext conditionContext,
            BiFunction<String, Condition, T> requestPropertyBiFunction
    ) {
        Condition condition = conditionProcessingService.processConditionContext(conditionContext);

        return requestPropertyBiFunction.apply(propertyName, condition);
    }

}


