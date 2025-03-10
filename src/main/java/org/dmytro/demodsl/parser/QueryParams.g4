grammar QueryParams;

queryParams:
    'QUERY_PARAMS' '{'
        queryParam+
    '}';

queryParam:
    'ADD' 'QUERY_PARAM' '{'
       setNameCommand
       condition
//       condition+
    '}';

setNameCommand: 'SET' 'NAME' 'TO' STRING;

setRequestSingleConditionTypeCommand: 'SET' 'REQUEST_CONDITION_TYPE' 'TO' REQUEST_SINGLE_CONDITION_TYPE_VALUE;
setRequestMultipleConditionTypeCommand: 'SET' 'REQUEST_CONDITION_TYPE' 'TO' REQUEST_MULTIPLE_CONDITION_TYPE_VALUE;

setValueCommand: 'SET' 'VALUE' 'TO' (STRING | NUMBER);

condition:
    'ADD' 'CONDITION' '{'
        (simpleCondition | compositeCondition | negatedSimpleCondition | negatedCompositeCondition)+
    '}';

simpleCondition:
    (
        setRequestSingleConditionTypeCommand
        setValueCommand
    )
    |
    (
        'SET' 'REQUEST_CONDITION_TYPE' 'TO' REQUEST_IS_PRESENT_CONDITION_TYPE_VALUE
    );

compositeCondition:
    setRequestMultipleConditionTypeCommand
    condition
    condition+
    ;

negatedSimpleCondition:
    'NOT' '('
        simpleCondition
    ')';

negatedCompositeCondition:
    'NOT' '('
        compositeCondition
    ')';

REQUEST_SINGLE_CONDITION_TYPE_VALUE: (
    'EQUALS' | 'MATCHES_REGEX' | 'CONTAINS' | 'EQUALS_XML' | 'MATCHES_XPATH' | 'EQUALS_JSON' |
    'MATCHES_JSON_PATH' | 'MATCHES_JSON_SCHEMA' | 'BEFORE' | 'AFTER' |
    'EQUALS_DATE_TIME'
);

REQUEST_MULTIPLE_CONDITION_TYPE_VALUE: (
     'OR' | 'AND' | 'VALUES_INCLUDE' | 'VALUES_ARE_EXACTLY'
);

REQUEST_IS_PRESENT_CONDITION_TYPE_VALUE: 'IS_PRESENT';

STRING: '"' ~["]* '"';
NUMBER: '-'? [0-9]+ ('.' [0-9]+)?;
WS: [ \t\r\n]+ -> skip;
