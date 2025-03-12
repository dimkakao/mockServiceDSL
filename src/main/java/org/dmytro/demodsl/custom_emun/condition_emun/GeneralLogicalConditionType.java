package org.dmytro.demodsl.custom_emun.condition_emun;

public enum GeneralLogicalConditionType implements LogicalConditionType {
    EQUALS,
    MATCHES_REGEX,
    CONTAINS,
    MATCHES_JSON_SCHEMA;
}
