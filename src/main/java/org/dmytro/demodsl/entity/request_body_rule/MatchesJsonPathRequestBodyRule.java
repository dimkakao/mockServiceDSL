package org.dmytro.demodsl.entity.request_body_rule;

import lombok.Getter;
import lombok.Setter;
import org.dmytro.demodsl.custom_emun.condition_emun.BodyMatchesJsonPathOrXPathLogicalConditionType;

@Getter
@Setter
public class MatchesJsonPathRequestBodyRule extends MatchesPathRequestBodyRule {
    private String conditionType = "MATCHES_JSON_PATH";

    public MatchesJsonPathRequestBodyRule(String name, BodyMatchesJsonPathOrXPathLogicalConditionType innerConditionType, String value, Boolean isNegated) {
        super(name, innerConditionType, value, isNegated);
    }

    @Override
    public String toString() {
        return """
        MatchesJsonPathRequestBodyRule{
            conditionType='%s',
            name='%s',
            innerConditionType=%s,
            value='%s',
            isNegated=%b
        }""".formatted(conditionType, name, innerConditionType, value, isNegated);
    }

}
