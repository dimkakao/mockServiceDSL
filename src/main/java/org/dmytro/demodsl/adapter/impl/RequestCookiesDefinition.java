package org.dmytro.demodsl.adapter.impl;

import jakarta.validation.constraints.NotNull;
import org.dmytro.demodsl.adapter.RequestPropertyDefinition;
import org.dmytro.demodsl.adapter.RequestPropertyRule;
import org.dmytro.demodsl.entity.Condition;
import org.dmytro.demodsl.entity.request_property.RequestCookie;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class RequestCookiesDefinition extends RequestPropertyDefinition<RequestCookie> {

    public RequestCookiesDefinition(@NotNull DmytroMockDSLParser.RequestCookiesContext ctx) {
        rules = new ArrayList<>();
        mapGeneralPropertyContextToRules(ctx);
    }

    private void mapGeneralPropertyContextToRules(@NotNull DmytroMockDSLParser.RequestCookiesContext ctx) {
        List<DmytroMockDSLParser.RequestCookieRuleContext> requestCookieRules = ctx.requestCookieRule();
        List<RequestPropertyRule<RequestCookie>> requestPropertyRules = requestCookieRules.stream()
                .map(requestHeaderRuleContext -> {
                    DmytroMockDSLParser.ConditionContext conditionContext = requestHeaderRuleContext.condition();
                    DmytroMockDSLParser.SetNameCommandContext setNameCommandContext = requestHeaderRuleContext.setNameCommand();
                    BiFunction<String, Condition, RequestCookie> requestPropertyAggregator = RequestCookie::new;
                    return createRequestPropertyRuleFromContext(conditionContext, setNameCommandContext, requestPropertyAggregator);
                })
                .toList();
        rules.addAll(requestPropertyRules);
    }
}