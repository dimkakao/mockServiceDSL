package org.dmytro.demodsl.adapter;

import lombok.Setter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.dmytro.demodsl.entity.Condition;
import org.dmytro.demodsl.entity.request_property.RequestProperty;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;
import org.dmytro.demodsl.util.ExceptionUtils;
import org.springframework.util.StringUtils;

import java.util.Optional;
import java.util.function.BiFunction;

@Setter
public abstract class RequestPropertyRule<T extends RequestProperty> {

    protected DmytroMockDSLParser.SetNameCommandContext setNameCommandContext;

    public String getName() {
        return Optional.ofNullable(setNameCommandContext)
                .map(DmytroMockDSLParser.SetNameCommandContext::STRING)
                .map(ParseTree::getText)
                .filter(StringUtils::hasText)
                .orElseThrow(ExceptionUtils.illegalArgumentSupplier("RequestPropertyRule does not contain name."));
    }

    public abstract DmytroMockDSLParser.ConditionContext getCondition();

    public abstract BiFunction<String, Condition, T> requestPropertyAggregator();

}
