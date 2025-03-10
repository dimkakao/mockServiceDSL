grammar DmytroMockDSL;

endpointDefinitionRequest:
    'DEFINE' 'ENDPOINT' '{'
        setEndpointDescriptionCommand*
        requestDefinition
        responseDefinition
    '}';

requestDefinition:
    'DEFINE' 'REQUEST' '{'
        setHttpMethodCommand
        setUrlMatchTypeCommand
        setPathCommand
        setPriorityCommand
        requestQueryParams?
        requestHeaders?
        requestCookies?
        requestFormParams?
        requestBodyRules
    '}';

responseDefinition:
    'DEFINE' 'RESPONSE' '{'
//        setRequestDescriptionCommand
//        queryParams
    '}';

setEndpointDescriptionCommand: 'SET' 'DESCRIPTION' 'TO' STRING;
setHttpMethodCommand: 'SET' 'METHOD' 'TO' HTTP_METHOD_TYPES;
setUrlMatchTypeCommand: 'SET' 'URL_MATCH_TYPE' 'TO' URL_MATCH_TYPES;
setPathCommand: 'SET' 'REQUEST_PATH' 'TO' STRING;
setPriorityCommand: 'SET' 'PRIORITY' 'TO' PRIORITY_VALUE;

requestQueryParams:
    'QUERY_PARAMS' '{'
        requestQueryParamRule+
    '}';

requestQueryParamRule:
    'ADD' 'QUERY_PARAM_RULE' '{'
       setNameCommand
       condition
    '}';

requestHeaders:
    'HEADERS' '{'
        requestHeaderRule+
    '}';

requestHeaderRule:
    'ADD' 'HEADER_RULE' '{'
       setNameCommand
       condition
    '}';

requestCookies:
    'COOKIES' '{'
        requestCookieRule+
    '}';

requestCookieRule:
    'ADD' 'COOKIE_RULE' '{'
       setNameCommand
       condition
    '}';

requestFormParams:
    'FORM_PARAMS' '{'
        requestFormParamRule+
    '}';

requestFormParamRule:
    'ADD' 'FORM_PARAM_RULE' '{'
       setNameCommand
       condition
    '}';


requestBodyRules:
    'REQUEST_BODY_RULES' '{'
        requestBodyRule+
    '}';

requestBodyRule:
    'ADD' 'REQUEST_BODY_RULE' '{'
       requestBodyRuleCondition
    '}';

requestBodyRuleCondition:
       generalRequestBodyRuleCondition
//       | ('NOT' '(' generalRequestBodyRuleCondition ')')
       ;

generalRequestBodyRuleCondition:
     valueOnlyRequestBodyRuleCondition
//     | equalsXmlRequestBodyRuleCondition
     ;

valueOnlyRequestBodyRuleCondition:
    'SET' 'REQUEST_BODY_CONDITION_TYPE' 'TO' GENERIC_CONDITION_TYPES
    setValueCommand;

equalsXmlRequestBodyRuleCondition:
   'SET' 'REQUEST_BODY_CONDITION_TYPE' 'TO' 'EQUALS_XML'
   setValueCommand
   ('SET' 'ENABLE_XMLUNIT_PLACEHOLDERS' 'TO' BOOLEAN)?;

//matchesJsonPathOrXPathRequestBodyRuleCondition:
//   'SET' 'REQUEST_BODY_CONDITION_TYPE' 'TO' ('MATCHES_JSON_PATH' | 'MATCHES_XPATH')
//   setValueCommand
//   ('SET' 'ENABLE_XMLUNIT_PLACEHOLDERS' 'TO' BOOLEAN)?;








setNameCommand: 'SET' 'NAME' 'TO' STRING;
setValueCommand: 'SET' 'VALUE' 'TO' (STRING | NUMBER);


setRequestSingleConditionTypeCommand: 'SET' 'REQUEST_CONDITION_TYPE' 'TO' (GENERIC_CONDITION_TYPES | REQUEST_VALUE_CONDITION_TYPES);
setRequestMultipleConditionTypeCommand: 'SET' 'REQUEST_CONDITION_TYPE' 'TO' REQUEST_COMPOSITE_CONDITION_TYPES;



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
        'SET' 'REQUEST_CONDITION_TYPE' 'TO' REQUEST_EXISTENCE_CONDITION
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



HTTP_METHOD_TYPES: (
     'GET' | 'POST' | 'PUT' | 'DELETE'| 'PATCH'| 'OPTIONS'| 'TRACE'| 'ANY'
);

URL_MATCH_TYPES: (
     'PATH' | 'PATH_AND_QUERY' | 'PATH_AND_QUERY_REGEX' | 'PATH_REGEX'| 'PATH_TEMPLATE'| 'ANY_URL'
);

REQUEST_VALUE_CONDITION_TYPES: (
    'EQUALS_XML' | 'MATCHES_XPATH' | 'EQUALS_JSON' |
    'MATCHES_JSON_PATH'  | 'BEFORE' | 'AFTER' |
    'EQUALS_DATE_TIME'
);

GENERIC_CONDITION_TYPES: (
    'EQUALS' | 'MATCHES_REGEX' | 'CONTAINS' | 'MATCHES_JSON_SCHEMA'
);


REQUEST_COMPOSITE_CONDITION_TYPES: (
     'OR' | 'AND' | 'VALUES_INCLUDE' | 'VALUES_ARE_EXACTLY'
);

REQUEST_EXISTENCE_CONDITION: 'IS_PRESENT';

STRING: '"' ~["]* '"';
PRIORITY_VALUE: [1-9][0-9]? | '100';
NUMBER: '-'? [0-9]+ ('.' [0-9]+)?;
INT: '-'? [0-9]+;
BOOLEAN: 'true' | 'false' | 'TRUE' | 'FALSE';

WS: [ \t\r\n]+ -> skip;
