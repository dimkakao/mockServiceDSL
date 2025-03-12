package org.dmytro.demodsl.entity.request_body_rule;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.dmytro.demodsl.custom_emun.condition_emun.GeneralLogicalConditionType;

public class ValueOnlyRequestBodyRule extends RequestBodyRule {
    @NotNull
    private GeneralLogicalConditionType conditionType;
    @NotBlank
    private String value;
}
