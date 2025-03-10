package org.dmytro.demodsl.dsl_parser.condition_emun;

public enum GeneralLogicalConditionType implements LogicalConditionType {
    EQUALS,
    MATCHES_REGEX,
    CONTAINS,
    MATCHES_JSON_SCHEMA;
}
