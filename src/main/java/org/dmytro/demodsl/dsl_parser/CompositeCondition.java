package org.dmytro.demodsl.dsl_parser;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.dmytro.demodsl.dsl_parser.condition_emun.CompositeLogicalConditionType;
import org.dmytro.demodsl.dsl_parser.condition_emun.RequestConditionType;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CompositeCondition extends Condition {
    private List<Condition> subConditions;
    private CompositeLogicalConditionType requestConditionType;

    public CompositeCondition(CompositeLogicalConditionType requestConditionType) {
        this.requestConditionType = requestConditionType;
        this.subConditions = new ArrayList<>();
    }

    public void addSubCondition(Condition condition) {
        subConditions.add(condition);
    }

    public void addAllSubConditions(Collection<Condition> conditions) {
        subConditions.addAll(conditions);
    }

    @Override
    public String toString() {
        return """
        CompositeCondition{
            subConditions=%s,
            isNegated=%s,
            requestConditionType=%s
        }
        """.formatted(subConditions, isNegated, requestConditionType);
    }

}
