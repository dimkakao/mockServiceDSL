package org.dmytro.demodsl.validation_rule;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContainsRequestBodyValidationRule extends RequestBodyValidationRule {
    @NotBlank
    private String requestData;
}