package org.dmytro.demodsl.entity.request_body_rule;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class EqualsXmlRequestBodyRule extends RequestBodyRule {
    @NotBlank
    private String conditionType = "EQUALS_XML";
    @NotBlank
    private String value;
    @NotNull
    private Boolean isEnabledXmlUnitPlaceholders = false;

    public EqualsXmlRequestBodyRule(String value, Boolean isEnabledXmlUnitPlaceholders) {
        this.value = value;
        this.isEnabledXmlUnitPlaceholders = isEnabledXmlUnitPlaceholders;
    }

    @Override
    public String toString() {
        return """
        EqualsXmlRequestBodyRule{
            conditionType='%s',
            value='%s',
            isEnabledXmlUnitPlaceholders=%b,
            isNegated=%b
        }""".formatted(conditionType, value, isEnabledXmlUnitPlaceholders, isNegated);
    }
}
