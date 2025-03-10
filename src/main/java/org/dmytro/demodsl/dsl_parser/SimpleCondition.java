package org.dmytro.demodsl.dsl_parser;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.dmytro.demodsl.dsl_parser.condition_emun.RequestConditionType;
import org.dmytro.demodsl.dsl_parser.condition_emun.SingleValueLogicalConditionType;

@Getter
@Setter
@NoArgsConstructor
public class SimpleCondition extends Condition {
    private String value;
    @NotNull
    private SingleValueLogicalConditionType requestConditionType;

    public SimpleCondition(SingleValueLogicalConditionType requestConditionType, String value) {
        this.requestConditionType = requestConditionType;
        this.value = value;
    }

    @Override
    public String toString() {
        return """
        SimpleCondition{
            value='%s',
            isNegated=%s,
            requestConditionType=%s
        }
        """.formatted(value, isNegated, requestConditionType);
    }

}
