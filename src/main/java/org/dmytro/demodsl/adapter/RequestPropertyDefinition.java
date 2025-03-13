package org.dmytro.demodsl.adapter;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import org.dmytro.demodsl.entity.Condition;
import org.dmytro.demodsl.entity.request_property.RequestProperty;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;

import java.util.List;
import java.util.function.BiFunction;

@Getter
public abstract class RequestPropertyDefinition<T extends RequestProperty> {

    protected List<RequestPropertyRule<T>> rules;

    protected RequestPropertyRule<T> createRequestPropertyRuleFromContext(
            @NotNull DmytroMockDSLParser.ConditionContext conditionContext,
            @NotNull DmytroMockDSLParser.SetNameCommandContext setNameCommandContext,
            @NotNull BiFunction<String, Condition, T> requestPropertyAggregator
    ) {
        RequestPropertyRule<T> requestPropertyRule = new RequestPropertyRule<>() {
            @Override
            public DmytroMockDSLParser.ConditionContext getCondition() {
                return conditionContext;
            }

            @Override
            public BiFunction<String, Condition, T> requestPropertyAggregator() {
                return requestPropertyAggregator;
            }
        };
        requestPropertyRule.setSetNameCommandContext(setNameCommandContext);
        return requestPropertyRule;
    }
}
