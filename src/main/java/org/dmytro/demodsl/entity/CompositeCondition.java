package org.dmytro.demodsl.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.dmytro.demodsl.custom_emun.condition_emun.CompositeConditionLogicalType;
import org.dmytro.demodsl.util.StringUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CompositeCondition extends Condition {
    private List<Condition> subConditions;
    private CompositeConditionLogicalType requestConditionType;

    public CompositeCondition(CompositeConditionLogicalType requestConditionType) {
        this.requestConditionType = requestConditionType;
        this.subConditions = new ArrayList<>();
    }

    public CompositeCondition(CompositeConditionLogicalType requestConditionType, List<Condition> subConditions) {
        this.requestConditionType = requestConditionType;
        this.subConditions = subConditions;
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
            subConditions=
            %s,
            isNegated=%s,
            requestConditionType=%s
        }
        """.formatted(StringUtils.indent(subConditions.toString()), isNegated, requestConditionType);
    }

}
