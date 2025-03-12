package org.dmytro.demodsl.validation_rule;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.dmytro.demodsl.custom_emun.ValidationCondition;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "condition",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = EqualsRequestBodyValidationRule.class, name = "EQUALS"),
        @JsonSubTypes.Type(value = ContainsRequestBodyValidationRule.class, name = "CONTAINS"),
        @JsonSubTypes.Type(value = EqualsJsonRequestBodyValidationRule.class, name = "EQUALS_JSON"),
        @JsonSubTypes.Type(value = EqualsXmlRequestBodyValidationRule.class, name = "EQUALS_XML"),
        @JsonSubTypes.Type(value = IsPresentRequestBodyValidationRule.class, name = "IS_PRESENT"),
        @JsonSubTypes.Type(value = IsAbsentRequestBodyValidationRule.class, name = "IS_ABSENT"),
        @JsonSubTypes.Type(value = MatchesJsonPathRequestBodyValidationRule.class, name = "MATCHES_JSON_PATH")
})
public abstract class RequestBodyValidationRule {
    @NotNull
    @JsonProperty("condition")
    private ValidationCondition condition;
    private boolean isNegated = false;
}
