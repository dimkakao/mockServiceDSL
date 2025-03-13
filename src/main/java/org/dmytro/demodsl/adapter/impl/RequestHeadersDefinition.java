package org.dmytro.demodsl.adapter.impl;

import org.dmytro.demodsl.adapter.RequestPropertyDefinition;
import org.dmytro.demodsl.adapter.RequestPropertyRule;
import org.dmytro.demodsl.entity.Condition;
import org.dmytro.demodsl.entity.request_property.RequestHeader;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;
import org.dmytro.demodsl.util.ExceptionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;

public class RequestHeadersDefinition extends RequestPropertyDefinition<RequestHeader> {

    public RequestHeadersDefinition(DmytroMockDSLParser.RequestHeadersContext ctx) {
        rules = new ArrayList<>();
        mapContextToRules(ctx);
    }

    private void mapContextToRules(DmytroMockDSLParser.RequestHeadersContext ctx) {
        List<DmytroMockDSLParser.RequestHeaderRuleContext> requestQueryParamRules = ctx.requestHeaderRule();
        List<RequestPropertyRule<RequestHeader>> requestPropertyRules = requestQueryParamRules.stream()
                .map(this::mapRuleContextToRequestPropertyRule)
                .toList();
        rules.addAll(requestPropertyRules);
    }

    private RequestPropertyRule<RequestHeader> mapRuleContextToRequestPropertyRule(DmytroMockDSLParser.RequestHeaderRuleContext requestHeaderRule) {
        RequestPropertyRule<RequestHeader> requestPropertyRule = new RequestPropertyRule<>() {
            @Override
            public DmytroMockDSLParser.ConditionContext getCondition() {
                return Optional.ofNullable(requestHeaderRule.condition())
                        .orElseThrow(ExceptionUtils.illegalArgumentSupplier("RequestQueryParamContext does not contain condition."));
            }

            @Override
            public BiFunction<String, Condition, RequestHeader> requestPropertyAggregator() {
                return RequestHeader::new;
            }
        };
        requestPropertyRule.setSetNameCommandContext(requestHeaderRule.setNameCommand());
        return requestPropertyRule;
    }

}
