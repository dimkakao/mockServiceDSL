package org.dmytro.demodsl.entity.request_body_rule;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class EqualsXmlRequestBodyRule extends RequestBodyRule {
    @NotBlank
    private String conditionType = "EQUALS_XML";
    @NotBlank
    private String value;
    @NotNull
    private Boolean isEnabledXmlUnitPlaceholders = false;
}
