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
        setPriorityCommand?
        requestQueryParams?
        requestHeaders?
        requestCookies?
        requestFormParams?
        requestBodyRules
    '}';

responseDefinition:
    'DEFINE' 'RESPONSE' '{'
    (directResponseDefinition | faultResponseDefinition | proxyResponseDefinition)
    responseDelay?
    responseWebHooks?
    '}';

directResponseDefinition:
    'ADD' 'DIRECT' 'RESPONSE' '{'
        setResponseStatusCodeCommand
        setDynamicResponseTemplatingCommand?
        responseHeaders?
        setResponseBodyTypeCommand
        setValueCommand
    '}';

faultResponseDefinition:
    'ADD' 'FAULT' 'RESPONSE' '{'
        setFaultTypeCommand
    '}';

faultTypes:
      'NO_FAULT'
    | 'CLOSE_SOCKET_WITH_NO_RESPONSE'
    | 'SEND_BAD_HTTP_DATA_THEN_CLOSE_SOCKET'
    | 'SEND_200_RESPONSE_THEN_BAD_HTTP_DATA_THEN_CLOSE_SOCKET'
    | 'PEER_CONNECTION_RESET'
    ;

proxyResponseDefinition:
    'ADD' 'PROXY' 'RESPONSE' '{'
        setUrlCommand
        responseHeaders?
        setTemplatingCommand?
        setHostnameRewritingCommand?
    '}';

responseDelay:
    'DELAY' '{' (
        (
        noDelay | 
        (
            'SET' 'TIME_UNIT' 'TO' timeUnits
            (fixedDelay | randomUniformDelay | randomLogNormalDelay | chunkedDribbleDelay)
        )
        )
    )
    '}'
    ;

responseWebHooks:
    'WEB_HOOKS' '{'
        webHookDefinition+
    '}';

webHookDefinition:
    'ADD' 'WEB_HOOK' '{'
        setHttpMethodCommand
        setUrlCommand
        responseHeaders?
        setResponseBodyTypeCommand
        setValueCommand
        responseDelay?
    '}';

responseHeaders:
    'HEADERS' '{'
        responseHeader+
    '}';

responseHeader:
    'ADD' 'HEADER' '{'
        setNameCommand
        setValueCommand
    '}';


timeUnits:
    'MS'
    | 'S'
    | 'MIN'
    | 'H'
    ;

noDelay:
    'SET' 'DELAY_TYPE' 'TO' 'NO_DELAY';

fixedDelay:
    'SET' 'DELAY_TYPE' 'TO' 'FIXED'
    'SET' 'VALUE' 'TO' NUMBER;

randomUniformDelay:
    'SET' 'DELAY_TYPE' 'TO' 'RANDOM_UNIFORM'
    'SET' 'LOWER_BOUND' 'TO' NUMBER
    'SET' 'UPPER_BOUND' 'TO' NUMBER;

randomLogNormalDelay:
    'SET' 'DELAY_TYPE' 'TO' 'RANDOM_LOG_NORMAL'
    'SET' 'MEDIAN_DELAY' 'TO' NUMBER
    'SET' 'STANDART_DEVIATION' 'TO' NUMBER;

chunkedDribbleDelay:
    'SET' 'DELAY_TYPE' 'TO' 'CHUNKED_DRIBBLE'
    'SET' 'CHUNK_NUMBER' 'TO' NUMBER
    'SET' 'TOTAL_DELAY' 'TO' NUMBER;





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
    | neagetedGeneralRequestBodyRuleCondition
    ;

neagetedGeneralRequestBodyRuleCondition:
    'NOT' '(' generalRequestBodyRuleCondition ')';

generalRequestBodyRuleCondition:
    valueOnlyRequestBodyRuleCondition
    | equalsXmlRequestBodyRuleCondition
    | equalsJsonRequestBodyRuleCondition
    | isPresentRequestBodyRuleCondition
    | matchesJsonPathRequestBodyRuleCondition
    | matchesXPathRequestBodyRuleCondition
     ;

valueOnlyRequestBodyRuleCondition:
    setRequestBodyConditionTypeCommand genericConditionTypes
    setValueCommand;

equalsXmlRequestBodyRuleCondition:
   setRequestBodyConditionTypeCommand 'EQUALS_XML'
   setValueCommand
   setEnableXmlUnitPlaceholdersCommand?
   ;


equalsJsonRequestBodyRuleCondition:
   setRequestBodyConditionTypeCommand 'EQUALS_JSON'
   setValueCommand
   setIgnoreArrayOrderCommand?
   setIgnorExtraElementsCommand?
   ;

isPresentRequestBodyRuleCondition:
  setRequestBodyConditionTypeCommand isPresentConditionTypes;

matchesJsonPathRequestBodyRuleCondition:
    setRequestBodyConditionTypeCommand 'MATCHES_JSON_PATH'
    setNameCommand
   (matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition | negatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition);

matchesXPathRequestBodyRuleCondition:
    setRequestBodyConditionTypeCommand 'MATCHES_X_PATH'
    setNameCommand
    (matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition | negatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition);

matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition:
    (
        'SET' 'CONDITION_TYPE' 'TO' matchesJsonPathAndXPathConditionTypes
        setValueCommand
    )
    |
    (isPresentConditionTypes);

negatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition:
    'NOT' '('
        matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition
    ')';











condition:
    'ADD' 'CONDITION' '{'
        (simpleCondition | compositeCondition | negatedSimpleCondition | negatedCompositeCondition)
    '}';

simpleCondition:
    (
        setRequestSingleConditionTypeCommand
        setValueCommand
    )
    |
    (
        'SET' 'REQUEST_CONDITION_TYPE' 'TO' isPresentConditionTypes
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





httpMethodTypes: (
       'GET'
     | 'POST'
     | 'PUT'
     | 'DELETE'
     | 'PATCH'
     | 'OPTIONS'
     | 'TRACE'
     | 'ANY'
);

urlMatchTypes: (
       'PATH'
     | 'PATH_AND_QUERY'
     | 'PATH_AND_QUERY_REGEX'
     | 'PATH_REGEX'
     | 'PATH_TEMPLATE'
     | 'ANY_URL'
);

requestValueConditionTypes:
     'EQUALS'
    | 'MATCHES_REGEX'
    | 'CONTAINS'
    | 'MATCHES_JSON_SCHEMA'
    | 'EQUALS_XML'
    | 'MATCHES_XPATH'
    | 'EQUALS_JSON'
    | 'MATCHES_JSON_PATH'
    | 'BEFORE'
    | 'AFTER'
    | 'EQUALS_DATE_TIME'
    ;

genericConditionTypes:
      'EQUALS'
    | 'MATCHES_REGEX'
    | 'CONTAINS'
    | 'MATCHES_JSON_SCHEMA'
    ;

requestCompositeConditionTypes:
       'OR'
     | 'AND'
     | 'VALUES_INCLUDE'
     | 'VALUES_ARE_EXACTLY'
     ;

matchesJsonPathAndXPathConditionTypes:
       'EQUALS'
     | 'MATCHES_REGEX'
     | 'CONTAINS'
     | 'BEFORE'
     | 'AFTER'
     | 'EQUALS_DATE_TIME'
     ;

isPresentConditionTypes: 'IS_PRESENT';

responseBodyTypes:
    'JSON'
    | 'XML'
    | 'HTML'
    | 'TEXT'
    | 'BASE64'
    ;



setNameCommand: 'SET' 'NAME' 'TO' STRING;
setValueCommand: 'SET' 'VALUE' 'TO' (STRING | NUMBER);

setEndpointDescriptionCommand: 'SET' 'DESCRIPTION' 'TO' STRING;
setHttpMethodCommand: 'SET' 'METHOD' 'TO' httpMethodTypes;
setUrlMatchTypeCommand: 'SET' 'URL_MATCH_TYPE' 'TO' urlMatchTypes;
setPathCommand: 'SET' 'REQUEST_PATH' 'TO' STRING;
setPriorityCommand: 'SET' 'PRIORITY' 'TO' NUMBER; //ТУТ ПЕРЕВІРКА НА НЕВІДЄМНЕ В КОДІ

setResponseStatusCodeCommand: 'SET' 'STATUS_CODE' 'TO' NUMBER;

setRequestSingleConditionTypeCommand: 'SET' 'REQUEST_CONDITION_TYPE' 'TO' requestValueConditionTypes;
setRequestMultipleConditionTypeCommand: 'SET' 'REQUEST_CONDITION_TYPE' 'TO' requestCompositeConditionTypes;
setRequestBodyConditionTypeCommand: 'SET' 'REQUEST_BODY_CONDITION_TYPE' 'TO';
setUrlCommand: 'SET' 'URL' 'TO' STRING;

setFaultTypeCommand: 'SET' 'FAULT_TYPE' 'TO' faultTypes;

setHostnameRewritingCommand: 'SET' 'HOSTNAME_REWRITING' 'TO' BOOLEAN;
setTemplatingCommand: 'SET' 'TEMPLATING' 'TO' BOOLEAN;

setResponseBodyTypeCommand: 'SET' 'BODY_TYPE' 'TO' responseBodyTypes;

setDynamicResponseTemplatingCommand: 'SET' 'DYNAMIC_RESPONSE_TEMPLATING' 'TO' BOOLEAN;


setIgnoreArrayOrderCommand: 'SET' 'IGNORE_ARRAY_ORDER' 'TO' BOOLEAN;
setIgnorExtraElementsCommand: 'SET' 'IGNORE_EXTRA_ELEMENTS' 'TO' BOOLEAN;

setEnableXmlUnitPlaceholdersCommand: 'SET' 'ENABLE_XMLUNIT_PLACEHOLDERS' 'TO' BOOLEAN;



STRING: '"' ~["]* '"';
NUMBER: '-'? [0-9]+ ('.' [0-9]+)?;
BOOLEAN: 'true' | 'false' | 'TRUE' | 'FALSE';
LINE_COMMENT : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;
WS: [ \t\r\n]+ -> skip;