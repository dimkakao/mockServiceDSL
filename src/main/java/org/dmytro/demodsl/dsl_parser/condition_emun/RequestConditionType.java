package org.dmytro.demodsl.dsl_parser.condition_emun;

public enum RequestConditionType implements LogicalConditionType {
    EQUALS,
    MATCHES_REGEX,
    CONTAINS,
    EQUALS_XML,
    MATCHES_XPATH,
    EQUALS_JSON,
    MATCHES_JSON_PATH,
    IS_PRESENT,
    MATCHES_JSON_SCHEMA,
    OR,
    AND,
    BEFORE,
    AFTER,
    EQUALS_DATE_TIME,
    VALUES_INCLUDE,
    VALUES_ARE_EXACTLY;
}
