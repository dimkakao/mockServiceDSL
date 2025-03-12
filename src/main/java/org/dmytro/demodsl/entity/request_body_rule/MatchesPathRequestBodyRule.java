package org.dmytro.demodsl.entity.request_body_rule;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import org.dmytro.demodsl.custom_emun.condition_emun.BodyMatchesJsonPathOrXPathLogicalConditionType;

@Getter
public abstract class MatchesPathRequestBodyRule extends RequestBodyRule {
    @NotNull
    protected String conditionType;
    @NotNull
    protected String name;
    @NotNull
    protected BodyMatchesJsonPathOrXPathLogicalConditionType innerConditionType;
    protected String value;
}
