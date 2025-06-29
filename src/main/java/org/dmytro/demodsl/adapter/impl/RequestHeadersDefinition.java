package org.dmytro.demodsl.adapter.impl;

import jakarta.validation.constraints.NotNull;
import org.dmytro.demodsl.adapter.RequestPropertyDefinition;
import org.dmytro.demodsl.adapter.RequestPropertyRule;
import org.dmytro.demodsl.entity.Condition;
import org.dmytro.demodsl.entity.request_property.RequestHeader;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class RequestHeadersDefinition extends RequestPropertyDefinition<RequestHeader> {

    public RequestHeadersDefinition(@NotNull DmytroMockDSLParser.RequestHeadersContext ctx) {
        rules = new ArrayList<>();
        mapGeneralPropertyContextToRules(ctx);
    }

    private void mapGeneralPropertyContextToRules(@NotNull DmytroMockDSLParser.RequestHeadersContext ctx) {
        List<DmytroMockDSLParser.RequestHeaderRuleContext> requestHeaderRules = ctx.requestHeaderRule();
        List<RequestPropertyRule<RequestHeader>> requestPropertyRules = requestHeaderRules.stream()
                .map(requestHeaderRuleContext -> {
                    DmytroMockDSLParser.ConditionContext conditionContext = requestHeaderRuleContext.condition();
                    DmytroMockDSLParser.SetNameCommandContext setNameCommandContext = requestHeaderRuleContext.setNameCommand();
                    BiFunction<String, Condition, RequestHeader> requestPropertyAggregator = RequestHeader::new;
                    return createRequestPropertyRuleFromContext(conditionContext, setNameCommandContext, requestPropertyAggregator);
                })
                .toList();
        rules.addAll(requestPropertyRules);
    }
}