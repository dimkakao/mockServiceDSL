package org.dmytro.demodsl.adapter.impl;

import jakarta.validation.constraints.NotNull;
import org.dmytro.demodsl.adapter.RequestPropertyDefinition;
import org.dmytro.demodsl.adapter.RequestPropertyRule;
import org.dmytro.demodsl.entity.Condition;
import org.dmytro.demodsl.entity.request_property.RequestQueryParam;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class RequestQueryParamsDefinition extends RequestPropertyDefinition<RequestQueryParam> {

    public RequestQueryParamsDefinition(@NotNull DmytroMockDSLParser.RequestQueryParamsContext ctx) {
        rules = new ArrayList<>();
        mapGeneralPropertyContextToRules(ctx);
    }

    private void mapGeneralPropertyContextToRules(@NotNull DmytroMockDSLParser.RequestQueryParamsContext ctx) {
        List<DmytroMockDSLParser.RequestQueryParamRuleContext> requestQueryParamRules = ctx.requestQueryParamRule();
        List<RequestPropertyRule<RequestQueryParam>> requestPropertyRules = requestQueryParamRules.stream()
                .map(requestQueryParamRuleContext -> {
                    DmytroMockDSLParser.ConditionContext conditionContext = requestQueryParamRuleContext.condition();
                    DmytroMockDSLParser.SetNameCommandContext setNameCommandContext = requestQueryParamRuleContext.setNameCommand();
                    BiFunction<String, Condition, RequestQueryParam> requestPropertyAggregator = RequestQueryParam::new;
                    return createRequestPropertyRuleFromContext(conditionContext, setNameCommandContext, requestPropertyAggregator);
                })
                .toList();
        rules.addAll(requestPropertyRules);
    }
}