package org.dmytro.demodsl.adapter.impl;

import org.dmytro.demodsl.adapter.RequestPropertyDefinition;
import org.dmytro.demodsl.adapter.RequestPropertyRule;
import org.dmytro.demodsl.entity.Condition;
import org.dmytro.demodsl.entity.request_property.RequestQueryParam;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;
import org.dmytro.demodsl.util.ExceptionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;

public class RequestQueryParamsDefinition extends RequestPropertyDefinition<RequestQueryParam> {

    public RequestQueryParamsDefinition(DmytroMockDSLParser.RequestQueryParamsContext ctx) {
        rules = new ArrayList<>();
        mapContextToRules(ctx);
    }

    private void mapContextToRules(DmytroMockDSLParser.RequestQueryParamsContext ctx) {
        List<DmytroMockDSLParser.RequestQueryParamRuleContext> requestQueryParamRules = ctx.requestQueryParamRule();
        List<RequestPropertyRule<RequestQueryParam>> requestPropertyRules = requestQueryParamRules.stream()
                .map(this::mapRuleContextToRequestPropertyRule)
                .toList();
        rules.addAll(requestPropertyRules);
    }

    private RequestPropertyRule<RequestQueryParam> mapRuleContextToRequestPropertyRule(DmytroMockDSLParser.RequestQueryParamRuleContext requestQueryParamRule) {
        RequestPropertyRule<RequestQueryParam> requestPropertyRule = new RequestPropertyRule<>() {
            @Override
            public DmytroMockDSLParser.ConditionContext getCondition() {
                return Optional.ofNullable(requestQueryParamRule.condition())
                        .orElseThrow(ExceptionUtils.illegalArgumentSupplier("RequestQueryParamContext does not contain condition."));
            }

            @Override
            public BiFunction<String, Condition, RequestQueryParam> requestPropertyAggregator() {
                return RequestQueryParam::new;
            }
        };
        requestPropertyRule.setSetNameCommandContext(requestQueryParamRule.setNameCommand());
        return requestPropertyRule;
    }

}
