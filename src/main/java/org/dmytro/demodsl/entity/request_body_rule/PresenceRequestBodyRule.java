package org.dmytro.demodsl.entity.request_body_rule;

import jakarta.validation.constraints.NotBlank;
import org.dmytro.demodsl.entity.request_body_rule.RequestBodyRule;

public class PresenceRequestBodyRule extends RequestBodyRule {
    @NotBlank
    private String conditionType = "IS_PRESENT";
}