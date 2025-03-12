package org.dmytro.demodsl.service_visitors;

import org.dmytro.demodsl.entity.Condition;
import org.dmytro.demodsl.entity.request_property.RequestProperty;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class RequestPropertyProcessorService {


    private static final ConditionProcessingService conditionProcessingService = new ConditionProcessingService();

    public <T extends RequestProperty> T processRequestProperty(
            String propertyName,
            DmytroMockDSLParser.ConditionContext conditionContext,
            BiFunction<String, Condition, T> requestPropertyBiFunction
    ) {
        Condition condition = conditionProcessingService.processConditionContext(conditionContext);

        return requestPropertyBiFunction.apply(propertyName, condition);
    }

    private <T extends RequestProperty> T calculateRequestProperty(
            String name,
            Condition condition,
            BiFunction<String, Condition, T> requestPropertyBiFunction
    ) {
        return requestPropertyBiFunction.apply(name, condition);
    }

}


