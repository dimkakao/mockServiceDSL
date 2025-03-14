package org.dmytro.demodsl.entity.request_body_rule;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class EqualsJsonRequestBodyRule extends RequestBodyRule {
    @NotBlank
    private String conditionType = "EQUALS_JSON";
    @NotBlank
    private String value;
    @NotNull
    private Boolean isIgnoredArrayOrder = true;
    @NotNull
    private Boolean isIgnoredExtraElements = true;

    public EqualsJsonRequestBodyRule(String value, Boolean isIgnoredArrayOrder, Boolean isIgnoredExtraElements) {
        this.value = value;
        this.isIgnoredArrayOrder = isIgnoredArrayOrder;
        this.isIgnoredExtraElements = isIgnoredExtraElements;
    }

    @Override
    public String toString() {
        return """
        EqualsJsonRequestBodyRule{
            conditionType='%s',
            value='%s',
            isIgnoredArrayOrder=%b,
            isIgnoredExtraElements=%b,
            isNegated=%b
        }""".formatted(conditionType, value, isIgnoredArrayOrder, isIgnoredExtraElements, isNegated);
    }

}
