package org.dmytro.demodsl.dsl_parser;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class QueryParam {
    private String name;
    private List<Condition> conditions;

    public QueryParam(String name) {
        this.name = name;
        this.conditions = new ArrayList<>();
    }

    public void addCondition(Condition condition) {
        conditions.add(condition);
    }
}




