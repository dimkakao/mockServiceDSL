package org.dmytro.demodsl.entity.request_body_rule;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.dmytro.demodsl.custom_emun.condition_emun.BodyMatchesJsonPathOrXPathLogicalConditionType;

@Getter
@Setter
public abstract class MatchesPathRequestBodyRule extends RequestBodyRule {
    @NotNull
    protected String conditionType;
    @NotNull
    protected String name;
    @NotNull
    protected BodyMatchesJsonPathOrXPathLogicalConditionType innerConditionType;
    protected String value;

    protected MatchesPathRequestBodyRule(String name, BodyMatchesJsonPathOrXPathLogicalConditionType innerConditionType, String value, Boolean isNegated) {
        this.name = name;
        this.innerConditionType = innerConditionType;
        this.value = value;
        this.isNegated = isNegated;
    }
}
