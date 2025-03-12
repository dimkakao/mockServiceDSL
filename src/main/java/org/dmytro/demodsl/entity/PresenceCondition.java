package org.dmytro.demodsl.entity;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.dmytro.demodsl.custom_emun.condition_emun.PresenceLogicalConditionType;

@Getter
@Setter
@NoArgsConstructor
public class PresenceCondition extends Condition {
    @NotNull
    private PresenceLogicalConditionType requestConditionType;

    public PresenceCondition(PresenceLogicalConditionType requestConditionType) {
        this.requestConditionType = requestConditionType;
    }

    @Override
    public String toString() {
        return """
        PresenceCondition{
            isNegated=%s,
            requestConditionType=%s
        }
        """.formatted(isNegated, requestConditionType);
    }

}
