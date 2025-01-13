package org.dmytro.demodsl.validation_rule;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.dmytro.demodsl.validation_condition.ValidationCondition;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EqualsRequestBodyValidationRule extends RequestBodyValidationRule {
    @NotBlank
    private String requestData;
}
