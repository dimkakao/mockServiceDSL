package org.dmytro.demodsl.entity.request_body_rule;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.dmytro.demodsl.custom_emun.condition_emun.GeneralLogicalConditionType;

@Setter
@Getter
@AllArgsConstructor
public class ValueOnlyRequestBodyRule extends RequestBodyRule {

    @NotNull
    private GeneralLogicalConditionType conditionType;
    @NotBlank
    private String value;

    @Override
    public String toString() {
        return "ValueOnlyRequestBodyRule\n" +
                "conditionType=" + conditionType +
                ",\n value='" + value + '\'' +
                ",\n isNegated=" + isNegated +
                '}';
    }
}
