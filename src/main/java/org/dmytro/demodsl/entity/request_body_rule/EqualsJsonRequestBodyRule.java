package org.dmytro.demodsl.entity.request_body_rule;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EqualsJsonRequestBodyRule extends RequestBodyRule {
    @NotBlank
    private String conditionType = "EQUALS_JSON";
    @NotBlank
    private String value;
    @NotNull
    private Boolean isIgnoredArrayOrder = true;
    @NotNull
    private Boolean isIgnoredExtraElements = true;
}
