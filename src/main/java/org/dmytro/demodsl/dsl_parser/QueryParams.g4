grammar QueryParams;

queryParams:
    'QUERY_PARAMS' '{'
        queryParam+
    '}';

queryParam:
    'ADD' 'QUERY_PARAM' '{'
       setNameCommand
       condition+
    '}';

setNameCommand: 'SET' 'NAME' 'TO' STRING;
setRequestConditionTypeCommand: 'SET' 'REQUEST_CONDITION_TYPE' 'TO' STRING;
setValueCommand: 'SET' 'VALUE' 'TO' STRING;

condition:
    'ADD' 'CONDITION' '{'
        (simpleCondition | compositeCondition | negatedSimpleCondition | negatedCompositeCondition)+
    '}';

simpleCondition:
    setRequestConditionTypeCommand
    setValueCommand;

compositeCondition:
    setRequestConditionTypeCommand
    condition
    condition+;

negatedSimpleCondition:
    'NOT' '('
        simpleCondition
    ')';

negatedCompositeCondition:
    'NOT' '('
        compositeCondition
    ')';

//any_affirmative_condition: ;
//any_negated_condition: negated_simple_condition | negated_composite_condition;

STRING: '"' ~["]* '"';
WS: [ \t\r\n]+ -> skip;
