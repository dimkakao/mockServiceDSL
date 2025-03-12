package org.dmytro.demodsl.entity;

import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.dmytro.demodsl.custom_emun.condition_emun.SingleValueLogicalConditionType;

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
