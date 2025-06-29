package org.dmytro.demodsl.validation_rule;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.dmytro.demodsl.custom_emun.JsonValidationCondition;
import org.springframework.lang.Nullable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MatchesJsonPathRequestBodyValidationRule extends RequestBodyValidationRule {
    @NotNull
    private JsonValidationCondition jsonValidationCondition;
    @NotBlank
    private String requestData;
    @Nullable
    private String comparisonData;
}
