package org.dmytro.demodsl.dsl_parser.condition_emun;

public enum CompositeLogicalConditionType implements LogicalConditionType {
    OR,
    AND,
    VALUES_INCLUDE,
    VALUES_ARE_EXACTLY;
}
