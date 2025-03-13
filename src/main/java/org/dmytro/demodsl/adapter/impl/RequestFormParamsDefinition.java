package org.dmytro.demodsl.adapter.impl;

import jakarta.validation.constraints.NotNull;
import org.dmytro.demodsl.adapter.RequestPropertyDefinition;
import org.dmytro.demodsl.adapter.RequestPropertyRule;
import org.dmytro.demodsl.entity.Condition;
import org.dmytro.demodsl.entity.request_property.RequestFormParam;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class RequestFormParamsDefinition extends RequestPropertyDefinition<RequestFormParam> {

    public RequestFormParamsDefinition(@NotNull DmytroMockDSLParser.RequestFormParamsContext ctx) {
        rules = new ArrayList<>();
        mapGeneralPropertyContextToRules(ctx);
    }

    private void mapGeneralPropertyContextToRules(@NotNull DmytroMockDSLParser.RequestFormParamsContext ctx) {
        List<DmytroMockDSLParser.RequestFormParamRuleContext> requestFormParamRules = ctx.requestFormParamRule();
        List<RequestPropertyRule<RequestFormParam>> requestPropertyRules = requestFormParamRules.stream()
                .map(requestFormParamRuleContext -> {
                    DmytroMockDSLParser.ConditionContext conditionContext = requestFormParamRuleContext.condition();
                    DmytroMockDSLParser.SetNameCommandContext setNameCommandContext = requestFormParamRuleContext.setNameCommand();
                    BiFunction<String, Condition, RequestFormParam> requestPropertyAggregator = RequestFormParam::new;
                    return createRequestPropertyRuleFromContext(conditionContext, setNameCommandContext, requestPropertyAggregator);
                })
                .toList();
        rules.addAll(requestPropertyRules);
    }
}