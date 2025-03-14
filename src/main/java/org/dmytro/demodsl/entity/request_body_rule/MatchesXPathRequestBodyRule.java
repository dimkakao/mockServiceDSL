package org.dmytro.demodsl.entity.request_body_rule;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.dmytro.demodsl.custom_emun.condition_emun.BodyMatchesJsonPathOrXPathLogicalConditionType;

@Getter
@Setter
public class MatchesXPathRequestBodyRule extends MatchesPathRequestBodyRule{
    private String conditionType = "MATCHES_XPATH";

    public MatchesXPathRequestBodyRule(String name, BodyMatchesJsonPathOrXPathLogicalConditionType innerConditionType, String value, Boolean isNegated) {
        super(name, innerConditionType, value, isNegated);
    }

    @Override
    public String toString() {
        return """
        MatchesXPathRequestBodyRule{
            conditionType='%s',
            name='%s',
            innerConditionType=%s,
            value='%s',
            isNegated=%b
        }""".formatted(conditionType, name, innerConditionType, value, isNegated);
    }

}
