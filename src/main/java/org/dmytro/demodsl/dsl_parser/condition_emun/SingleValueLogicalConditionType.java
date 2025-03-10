package org.dmytro.demodsl.dsl_parser.condition_emun;

public enum SingleValueLogicalConditionType {
    EQUALS,
    MATCHES_REGEX,
    CONTAINS,
    MATCHES_JSON_SCHEMA,
    EQUALS_XML,
    MATCHES_XPATH,
    EQUALS_JSON,
    MATCHES_JSON_PATH,
    BEFORE,
    AFTER,
    EQUALS_DATE_TIME;
}
