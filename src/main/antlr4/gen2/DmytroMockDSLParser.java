// Generated from DmytroMockDSL.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class DmytroMockDSLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, STRING=109, NUMBER=110, BOOLEAN=111, LINE_COMMENT=112, BLOCK_COMMENT=113, 
		WS=114;
	public static final int
		RULE_endpointDefinitionRequest = 0, RULE_requestDefinition = 1, RULE_responseDefinition = 2, 
		RULE_directResponseDefinition = 3, RULE_faultResponseDefinition = 4, RULE_faultTypes = 5, 
		RULE_proxyResponseDefinition = 6, RULE_responseDelay = 7, RULE_responseWebHooks = 8, 
		RULE_webHookDefinition = 9, RULE_responseHeaders = 10, RULE_responseHeader = 11, 
		RULE_timeUnits = 12, RULE_noDelay = 13, RULE_fixedDelay = 14, RULE_randomUniformDelay = 15, 
		RULE_randomLogNormalDelay = 16, RULE_chunkedDribbleDelay = 17, RULE_requestQueryParams = 18, 
		RULE_requestQueryParamRule = 19, RULE_requestHeaders = 20, RULE_requestHeaderRule = 21, 
		RULE_requestCookies = 22, RULE_requestCookieRule = 23, RULE_requestFormParams = 24, 
		RULE_requestFormParamRule = 25, RULE_requestBodyRules = 26, RULE_requestBodyRule = 27, 
		RULE_requestBodyRuleCondition = 28, RULE_neagetedGeneralRequestBodyRuleCondition = 29, 
		RULE_generalRequestBodyRuleCondition = 30, RULE_valueOnlyRequestBodyRuleCondition = 31, 
		RULE_equalsXmlRequestBodyRuleCondition = 32, RULE_equalsJsonRequestBodyRuleCondition = 33, 
		RULE_isPresentRequestBodyRuleCondition = 34, RULE_matchesJsonPathRequestBodyRuleCondition = 35, 
		RULE_matchesXPathRequestBodyRuleCondition = 36, RULE_matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition = 37, 
		RULE_negatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition = 38, 
		RULE_condition = 39, RULE_simpleCondition = 40, RULE_compositeCondition = 41, 
		RULE_negatedSimpleCondition = 42, RULE_negatedCompositeCondition = 43, 
		RULE_httpMethodTypes = 44, RULE_urlMatchTypes = 45, RULE_requestValueConditionTypes = 46, 
		RULE_genericConditionTypes = 47, RULE_requestCompositeConditionTypes = 48, 
		RULE_matchesJsonPathAndXPathConditionTypes = 49, RULE_isPresentConditionTypes = 50, 
		RULE_responseBodyTypes = 51, RULE_setNameCommand = 52, RULE_setValueCommand = 53, 
		RULE_setEndpointDescriptionCommand = 54, RULE_setHttpMethodCommand = 55, 
		RULE_setUrlMatchTypeCommand = 56, RULE_setPathCommand = 57, RULE_setPriorityCommand = 58, 
		RULE_setResponseStatusCodeCommand = 59, RULE_setRequestSingleConditionTypeCommand = 60, 
		RULE_setRequestMultipleConditionTypeCommand = 61, RULE_setRequestBodyConditionTypeCommand = 62, 
		RULE_setUrlCommand = 63, RULE_setFaultTypeCommand = 64, RULE_setHostnameRewritingCommand = 65, 
		RULE_setTemplatingCommand = 66, RULE_setResponseBodyTypeCommand = 67, 
		RULE_setDynamicResponseTemplatingCommand = 68, RULE_setIgnoreArrayOrderCommand = 69, 
		RULE_setIgnorExtraElementsCommand = 70, RULE_setEnableXmlUnitPlaceholdersCommand = 71;
	private static String[] makeRuleNames() {
		return new String[] {
			"endpointDefinitionRequest", "requestDefinition", "responseDefinition", 
			"directResponseDefinition", "faultResponseDefinition", "faultTypes", 
			"proxyResponseDefinition", "responseDelay", "responseWebHooks", "webHookDefinition", 
			"responseHeaders", "responseHeader", "timeUnits", "noDelay", "fixedDelay", 
			"randomUniformDelay", "randomLogNormalDelay", "chunkedDribbleDelay", 
			"requestQueryParams", "requestQueryParamRule", "requestHeaders", "requestHeaderRule", 
			"requestCookies", "requestCookieRule", "requestFormParams", "requestFormParamRule", 
			"requestBodyRules", "requestBodyRule", "requestBodyRuleCondition", "neagetedGeneralRequestBodyRuleCondition", 
			"generalRequestBodyRuleCondition", "valueOnlyRequestBodyRuleCondition", 
			"equalsXmlRequestBodyRuleCondition", "equalsJsonRequestBodyRuleCondition", 
			"isPresentRequestBodyRuleCondition", "matchesJsonPathRequestBodyRuleCondition", 
			"matchesXPathRequestBodyRuleCondition", "matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition", 
			"negatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition", 
			"condition", "simpleCondition", "compositeCondition", "negatedSimpleCondition", 
			"negatedCompositeCondition", "httpMethodTypes", "urlMatchTypes", "requestValueConditionTypes", 
			"genericConditionTypes", "requestCompositeConditionTypes", "matchesJsonPathAndXPathConditionTypes", 
			"isPresentConditionTypes", "responseBodyTypes", "setNameCommand", "setValueCommand", 
			"setEndpointDescriptionCommand", "setHttpMethodCommand", "setUrlMatchTypeCommand", 
			"setPathCommand", "setPriorityCommand", "setResponseStatusCodeCommand", 
			"setRequestSingleConditionTypeCommand", "setRequestMultipleConditionTypeCommand", 
			"setRequestBodyConditionTypeCommand", "setUrlCommand", "setFaultTypeCommand", 
			"setHostnameRewritingCommand", "setTemplatingCommand", "setResponseBodyTypeCommand", 
			"setDynamicResponseTemplatingCommand", "setIgnoreArrayOrderCommand", 
			"setIgnorExtraElementsCommand", "setEnableXmlUnitPlaceholdersCommand"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DEFINE'", "'ENDPOINT'", "'{'", "'}'", "'REQUEST'", "'RESPONSE'", 
			"'ADD'", "'DIRECT'", "'FAULT'", "'NO_FAULT'", "'CLOSE_SOCKET_WITH_NO_RESPONSE'", 
			"'SEND_BAD_HTTP_DATA_THEN_CLOSE_SOCKET'", "'SEND_200_RESPONSE_THEN_BAD_HTTP_DATA_THEN_CLOSE_SOCKET'", 
			"'PEER_CONNECTION_RESET'", "'PROXY'", "'DELAY'", "'SET'", "'TIME_UNIT'", 
			"'TO'", "'WEB_HOOKS'", "'WEB_HOOK'", "'HEADERS'", "'HEADER'", "'MS'", 
			"'S'", "'MIN'", "'H'", "'DELAY_TYPE'", "'NO_DELAY'", "'FIXED'", "'VALUE'", 
			"'RANDOM_UNIFORM'", "'LOWER_BOUND'", "'UPPER_BOUND'", "'RANDOM_LOG_NORMAL'", 
			"'MEDIAN_DELAY'", "'STANDART_DEVIATION'", "'CHUNKED_DRIBBLE'", "'CHUNK_NUMBER'", 
			"'TOTAL_DELAY'", "'QUERY_PARAMS'", "'QUERY_PARAM_RULE'", "'HEADER_RULE'", 
			"'COOKIES'", "'COOKIE_RULE'", "'FORM_PARAMS'", "'FORM_PARAM_RULE'", "'REQUEST_BODY_RULES'", 
			"'REQUEST_BODY_RULE'", "'NOT'", "'('", "')'", "'EQUALS_XML'", "'EQUALS_JSON'", 
			"'MATCHES_JSON_PATH'", "'MATCHES_X_PATH'", "'CONDITION_TYPE'", "'CONDITION'", 
			"'REQUEST_CONDITION_TYPE'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'PATCH'", 
			"'OPTIONS'", "'TRACE'", "'ANY'", "'PATH'", "'PATH_AND_QUERY'", "'PATH_AND_QUERY_REGEX'", 
			"'PATH_REGEX'", "'PATH_TEMPLATE'", "'ANY_URL'", "'EQUALS'", "'MATCHES_REGEX'", 
			"'CONTAINS'", "'MATCHES_JSON_SCHEMA'", "'MATCHES_XPATH'", "'BEFORE'", 
			"'AFTER'", "'EQUALS_DATE_TIME'", "'OR'", "'AND'", "'VALUES_INCLUDE'", 
			"'VALUES_ARE_EXACTLY'", "'IS_PRESENT'", "'JSON'", "'XML'", "'HTML'", 
			"'TEXT'", "'BASE64'", "'NAME'", "'DESCRIPTION'", "'METHOD'", "'URL_MATCH_TYPE'", 
			"'REQUEST_PATH'", "'PRIORITY'", "'STATUS_CODE'", "'REQUEST_BODY_CONDITION_TYPE'", 
			"'URL'", "'FAULT_TYPE'", "'HOSTNAME_REWRITING'", "'TEMPLATING'", "'BODY_TYPE'", 
			"'DYNAMIC_RESPONSE_TEMPLATING'", "'IGNORE_ARRAY_ORDER'", "'IGNORE_EXTRA_ELEMENTS'", 
			"'ENABLE_XMLUNIT_PLACEHOLDERS'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "STRING", "NUMBER", "BOOLEAN", "LINE_COMMENT", "BLOCK_COMMENT", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DmytroMockDSL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DmytroMockDSLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EndpointDefinitionRequestContext extends ParserRuleContext {
		public RequestDefinitionContext requestDefinition() {
			return getRuleContext(RequestDefinitionContext.class,0);
		}
		public ResponseDefinitionContext responseDefinition() {
			return getRuleContext(ResponseDefinitionContext.class,0);
		}
		public List<SetEndpointDescriptionCommandContext> setEndpointDescriptionCommand() {
			return getRuleContexts(SetEndpointDescriptionCommandContext.class);
		}
		public SetEndpointDescriptionCommandContext setEndpointDescriptionCommand(int i) {
			return getRuleContext(SetEndpointDescriptionCommandContext.class,i);
		}
		public EndpointDefinitionRequestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endpointDefinitionRequest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterEndpointDefinitionRequest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitEndpointDefinitionRequest(this);
		}
	}

	public final EndpointDefinitionRequestContext endpointDefinitionRequest() throws RecognitionException {
		EndpointDefinitionRequestContext _localctx = new EndpointDefinitionRequestContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_endpointDefinitionRequest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(T__0);
			setState(145);
			match(T__1);
			setState(146);
			match(T__2);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16) {
				{
				{
				setState(147);
				setEndpointDescriptionCommand();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			requestDefinition();
			setState(154);
			responseDefinition();
			setState(155);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequestDefinitionContext extends ParserRuleContext {
		public SetHttpMethodCommandContext setHttpMethodCommand() {
			return getRuleContext(SetHttpMethodCommandContext.class,0);
		}
		public SetUrlMatchTypeCommandContext setUrlMatchTypeCommand() {
			return getRuleContext(SetUrlMatchTypeCommandContext.class,0);
		}
		public SetPathCommandContext setPathCommand() {
			return getRuleContext(SetPathCommandContext.class,0);
		}
		public RequestBodyRulesContext requestBodyRules() {
			return getRuleContext(RequestBodyRulesContext.class,0);
		}
		public SetPriorityCommandContext setPriorityCommand() {
			return getRuleContext(SetPriorityCommandContext.class,0);
		}
		public RequestQueryParamsContext requestQueryParams() {
			return getRuleContext(RequestQueryParamsContext.class,0);
		}
		public RequestHeadersContext requestHeaders() {
			return getRuleContext(RequestHeadersContext.class,0);
		}
		public RequestCookiesContext requestCookies() {
			return getRuleContext(RequestCookiesContext.class,0);
		}
		public RequestFormParamsContext requestFormParams() {
			return getRuleContext(RequestFormParamsContext.class,0);
		}
		public RequestDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requestDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterRequestDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitRequestDefinition(this);
		}
	}

	public final RequestDefinitionContext requestDefinition() throws RecognitionException {
		RequestDefinitionContext _localctx = new RequestDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_requestDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__0);
			setState(158);
			match(T__4);
			setState(159);
			match(T__2);
			setState(160);
			setHttpMethodCommand();
			setState(161);
			setUrlMatchTypeCommand();
			setState(162);
			setPathCommand();
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(163);
				setPriorityCommand();
				}
			}

			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__40) {
				{
				setState(166);
				requestQueryParams();
				}
			}

			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(169);
				requestHeaders();
				}
			}

			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(172);
				requestCookies();
				}
			}

			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(175);
				requestFormParams();
				}
			}

			setState(178);
			requestBodyRules();
			setState(179);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResponseDefinitionContext extends ParserRuleContext {
		public DirectResponseDefinitionContext directResponseDefinition() {
			return getRuleContext(DirectResponseDefinitionContext.class,0);
		}
		public FaultResponseDefinitionContext faultResponseDefinition() {
			return getRuleContext(FaultResponseDefinitionContext.class,0);
		}
		public ProxyResponseDefinitionContext proxyResponseDefinition() {
			return getRuleContext(ProxyResponseDefinitionContext.class,0);
		}
		public ResponseDelayContext responseDelay() {
			return getRuleContext(ResponseDelayContext.class,0);
		}
		public ResponseWebHooksContext responseWebHooks() {
			return getRuleContext(ResponseWebHooksContext.class,0);
		}
		public ResponseDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_responseDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterResponseDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitResponseDefinition(this);
		}
	}

	public final ResponseDefinitionContext responseDefinition() throws RecognitionException {
		ResponseDefinitionContext _localctx = new ResponseDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_responseDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__0);
			setState(182);
			match(T__5);
			setState(183);
			match(T__2);
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(184);
				directResponseDefinition();
				}
				break;
			case 2:
				{
				setState(185);
				faultResponseDefinition();
				}
				break;
			case 3:
				{
				setState(186);
				proxyResponseDefinition();
				}
				break;
			}
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(189);
				responseDelay();
				}
			}

			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__19) {
				{
				setState(192);
				responseWebHooks();
				}
			}

			setState(195);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DirectResponseDefinitionContext extends ParserRuleContext {
		public SetResponseStatusCodeCommandContext setResponseStatusCodeCommand() {
			return getRuleContext(SetResponseStatusCodeCommandContext.class,0);
		}
		public SetResponseBodyTypeCommandContext setResponseBodyTypeCommand() {
			return getRuleContext(SetResponseBodyTypeCommandContext.class,0);
		}
		public SetValueCommandContext setValueCommand() {
			return getRuleContext(SetValueCommandContext.class,0);
		}
		public SetDynamicResponseTemplatingCommandContext setDynamicResponseTemplatingCommand() {
			return getRuleContext(SetDynamicResponseTemplatingCommandContext.class,0);
		}
		public ResponseHeadersContext responseHeaders() {
			return getRuleContext(ResponseHeadersContext.class,0);
		}
		public DirectResponseDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directResponseDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterDirectResponseDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitDirectResponseDefinition(this);
		}
	}

	public final DirectResponseDefinitionContext directResponseDefinition() throws RecognitionException {
		DirectResponseDefinitionContext _localctx = new DirectResponseDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_directResponseDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__6);
			setState(198);
			match(T__7);
			setState(199);
			match(T__5);
			setState(200);
			match(T__2);
			setState(201);
			setResponseStatusCodeCommand();
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(202);
				setDynamicResponseTemplatingCommand();
				}
				break;
			}
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(205);
				responseHeaders();
				}
			}

			setState(208);
			setResponseBodyTypeCommand();
			setState(209);
			setValueCommand();
			setState(210);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FaultResponseDefinitionContext extends ParserRuleContext {
		public SetFaultTypeCommandContext setFaultTypeCommand() {
			return getRuleContext(SetFaultTypeCommandContext.class,0);
		}
		public FaultResponseDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faultResponseDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterFaultResponseDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitFaultResponseDefinition(this);
		}
	}

	public final FaultResponseDefinitionContext faultResponseDefinition() throws RecognitionException {
		FaultResponseDefinitionContext _localctx = new FaultResponseDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_faultResponseDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__6);
			setState(213);
			match(T__8);
			setState(214);
			match(T__5);
			setState(215);
			match(T__2);
			setState(216);
			setFaultTypeCommand();
			setState(217);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FaultTypesContext extends ParserRuleContext {
		public FaultTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_faultTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterFaultTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitFaultTypes(this);
		}
	}

	public final FaultTypesContext faultTypes() throws RecognitionException {
		FaultTypesContext _localctx = new FaultTypesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_faultTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31744L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProxyResponseDefinitionContext extends ParserRuleContext {
		public SetUrlCommandContext setUrlCommand() {
			return getRuleContext(SetUrlCommandContext.class,0);
		}
		public ResponseHeadersContext responseHeaders() {
			return getRuleContext(ResponseHeadersContext.class,0);
		}
		public SetTemplatingCommandContext setTemplatingCommand() {
			return getRuleContext(SetTemplatingCommandContext.class,0);
		}
		public SetHostnameRewritingCommandContext setHostnameRewritingCommand() {
			return getRuleContext(SetHostnameRewritingCommandContext.class,0);
		}
		public ProxyResponseDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proxyResponseDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterProxyResponseDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitProxyResponseDefinition(this);
		}
	}

	public final ProxyResponseDefinitionContext proxyResponseDefinition() throws RecognitionException {
		ProxyResponseDefinitionContext _localctx = new ProxyResponseDefinitionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_proxyResponseDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(T__6);
			setState(222);
			match(T__14);
			setState(223);
			match(T__5);
			setState(224);
			match(T__2);
			setState(225);
			setUrlCommand();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(226);
				responseHeaders();
				}
			}

			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(229);
				setTemplatingCommand();
				}
				break;
			}
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(232);
				setHostnameRewritingCommand();
				}
			}

			setState(235);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResponseDelayContext extends ParserRuleContext {
		public NoDelayContext noDelay() {
			return getRuleContext(NoDelayContext.class,0);
		}
		public TimeUnitsContext timeUnits() {
			return getRuleContext(TimeUnitsContext.class,0);
		}
		public FixedDelayContext fixedDelay() {
			return getRuleContext(FixedDelayContext.class,0);
		}
		public RandomUniformDelayContext randomUniformDelay() {
			return getRuleContext(RandomUniformDelayContext.class,0);
		}
		public RandomLogNormalDelayContext randomLogNormalDelay() {
			return getRuleContext(RandomLogNormalDelayContext.class,0);
		}
		public ChunkedDribbleDelayContext chunkedDribbleDelay() {
			return getRuleContext(ChunkedDribbleDelayContext.class,0);
		}
		public ResponseDelayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_responseDelay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterResponseDelay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitResponseDelay(this);
		}
	}

	public final ResponseDelayContext responseDelay() throws RecognitionException {
		ResponseDelayContext _localctx = new ResponseDelayContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_responseDelay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(T__15);
			setState(238);
			match(T__2);
			{
			setState(250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(239);
				noDelay();
				}
				break;
			case 2:
				{
				{
				setState(240);
				match(T__16);
				setState(241);
				match(T__17);
				setState(242);
				match(T__18);
				setState(243);
				timeUnits();
				setState(248);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(244);
					fixedDelay();
					}
					break;
				case 2:
					{
					setState(245);
					randomUniformDelay();
					}
					break;
				case 3:
					{
					setState(246);
					randomLogNormalDelay();
					}
					break;
				case 4:
					{
					setState(247);
					chunkedDribbleDelay();
					}
					break;
				}
				}
				}
				break;
			}
			}
			setState(252);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResponseWebHooksContext extends ParserRuleContext {
		public List<WebHookDefinitionContext> webHookDefinition() {
			return getRuleContexts(WebHookDefinitionContext.class);
		}
		public WebHookDefinitionContext webHookDefinition(int i) {
			return getRuleContext(WebHookDefinitionContext.class,i);
		}
		public ResponseWebHooksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_responseWebHooks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterResponseWebHooks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitResponseWebHooks(this);
		}
	}

	public final ResponseWebHooksContext responseWebHooks() throws RecognitionException {
		ResponseWebHooksContext _localctx = new ResponseWebHooksContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_responseWebHooks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(T__19);
			setState(255);
			match(T__2);
			setState(257); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(256);
				webHookDefinition();
				}
				}
				setState(259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(261);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WebHookDefinitionContext extends ParserRuleContext {
		public SetHttpMethodCommandContext setHttpMethodCommand() {
			return getRuleContext(SetHttpMethodCommandContext.class,0);
		}
		public SetUrlCommandContext setUrlCommand() {
			return getRuleContext(SetUrlCommandContext.class,0);
		}
		public SetResponseBodyTypeCommandContext setResponseBodyTypeCommand() {
			return getRuleContext(SetResponseBodyTypeCommandContext.class,0);
		}
		public SetValueCommandContext setValueCommand() {
			return getRuleContext(SetValueCommandContext.class,0);
		}
		public ResponseHeadersContext responseHeaders() {
			return getRuleContext(ResponseHeadersContext.class,0);
		}
		public ResponseDelayContext responseDelay() {
			return getRuleContext(ResponseDelayContext.class,0);
		}
		public WebHookDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_webHookDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterWebHookDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitWebHookDefinition(this);
		}
	}

	public final WebHookDefinitionContext webHookDefinition() throws RecognitionException {
		WebHookDefinitionContext _localctx = new WebHookDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_webHookDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__6);
			setState(264);
			match(T__20);
			setState(265);
			match(T__2);
			setState(266);
			setHttpMethodCommand();
			setState(267);
			setUrlCommand();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(268);
				responseHeaders();
				}
			}

			setState(271);
			setResponseBodyTypeCommand();
			setState(272);
			setValueCommand();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(273);
				responseDelay();
				}
			}

			setState(276);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResponseHeadersContext extends ParserRuleContext {
		public List<ResponseHeaderContext> responseHeader() {
			return getRuleContexts(ResponseHeaderContext.class);
		}
		public ResponseHeaderContext responseHeader(int i) {
			return getRuleContext(ResponseHeaderContext.class,i);
		}
		public ResponseHeadersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_responseHeaders; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterResponseHeaders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitResponseHeaders(this);
		}
	}

	public final ResponseHeadersContext responseHeaders() throws RecognitionException {
		ResponseHeadersContext _localctx = new ResponseHeadersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_responseHeaders);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__21);
			setState(279);
			match(T__2);
			setState(281); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(280);
				responseHeader();
				}
				}
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(285);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResponseHeaderContext extends ParserRuleContext {
		public SetNameCommandContext setNameCommand() {
			return getRuleContext(SetNameCommandContext.class,0);
		}
		public SetValueCommandContext setValueCommand() {
			return getRuleContext(SetValueCommandContext.class,0);
		}
		public ResponseHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_responseHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterResponseHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitResponseHeader(this);
		}
	}

	public final ResponseHeaderContext responseHeader() throws RecognitionException {
		ResponseHeaderContext _localctx = new ResponseHeaderContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_responseHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(T__6);
			setState(288);
			match(T__22);
			setState(289);
			match(T__2);
			setState(290);
			setNameCommand();
			setState(291);
			setValueCommand();
			setState(292);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimeUnitsContext extends ParserRuleContext {
		public TimeUnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeUnits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterTimeUnits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitTimeUnits(this);
		}
	}

	public final TimeUnitsContext timeUnits() throws RecognitionException {
		TimeUnitsContext _localctx = new TimeUnitsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_timeUnits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 251658240L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NoDelayContext extends ParserRuleContext {
		public NoDelayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noDelay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterNoDelay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitNoDelay(this);
		}
	}

	public final NoDelayContext noDelay() throws RecognitionException {
		NoDelayContext _localctx = new NoDelayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_noDelay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__16);
			setState(297);
			match(T__27);
			setState(298);
			match(T__18);
			setState(299);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FixedDelayContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(DmytroMockDSLParser.NUMBER, 0); }
		public FixedDelayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedDelay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterFixedDelay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitFixedDelay(this);
		}
	}

	public final FixedDelayContext fixedDelay() throws RecognitionException {
		FixedDelayContext _localctx = new FixedDelayContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fixedDelay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(T__16);
			setState(302);
			match(T__27);
			setState(303);
			match(T__18);
			setState(304);
			match(T__29);
			setState(305);
			match(T__16);
			setState(306);
			match(T__30);
			setState(307);
			match(T__18);
			setState(308);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RandomUniformDelayContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(DmytroMockDSLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(DmytroMockDSLParser.NUMBER, i);
		}
		public RandomUniformDelayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_randomUniformDelay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterRandomUniformDelay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitRandomUniformDelay(this);
		}
	}

	public final RandomUniformDelayContext randomUniformDelay() throws RecognitionException {
		RandomUniformDelayContext _localctx = new RandomUniformDelayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_randomUniformDelay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__16);
			setState(311);
			match(T__27);
			setState(312);
			match(T__18);
			setState(313);
			match(T__31);
			setState(314);
			match(T__16);
			setState(315);
			match(T__32);
			setState(316);
			match(T__18);
			setState(317);
			match(NUMBER);
			setState(318);
			match(T__16);
			setState(319);
			match(T__33);
			setState(320);
			match(T__18);
			setState(321);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RandomLogNormalDelayContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(DmytroMockDSLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(DmytroMockDSLParser.NUMBER, i);
		}
		public RandomLogNormalDelayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_randomLogNormalDelay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterRandomLogNormalDelay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitRandomLogNormalDelay(this);
		}
	}

	public final RandomLogNormalDelayContext randomLogNormalDelay() throws RecognitionException {
		RandomLogNormalDelayContext _localctx = new RandomLogNormalDelayContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_randomLogNormalDelay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(T__16);
			setState(324);
			match(T__27);
			setState(325);
			match(T__18);
			setState(326);
			match(T__34);
			setState(327);
			match(T__16);
			setState(328);
			match(T__35);
			setState(329);
			match(T__18);
			setState(330);
			match(NUMBER);
			setState(331);
			match(T__16);
			setState(332);
			match(T__36);
			setState(333);
			match(T__18);
			setState(334);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChunkedDribbleDelayContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(DmytroMockDSLParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(DmytroMockDSLParser.NUMBER, i);
		}
		public ChunkedDribbleDelayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chunkedDribbleDelay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterChunkedDribbleDelay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitChunkedDribbleDelay(this);
		}
	}

	public final ChunkedDribbleDelayContext chunkedDribbleDelay() throws RecognitionException {
		ChunkedDribbleDelayContext _localctx = new ChunkedDribbleDelayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_chunkedDribbleDelay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(T__16);
			setState(337);
			match(T__27);
			setState(338);
			match(T__18);
			setState(339);
			match(T__37);
			setState(340);
			match(T__16);
			setState(341);
			match(T__38);
			setState(342);
			match(T__18);
			setState(343);
			match(NUMBER);
			setState(344);
			match(T__16);
			setState(345);
			match(T__39);
			setState(346);
			match(T__18);
			setState(347);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequestQueryParamsContext extends ParserRuleContext {
		public List<RequestQueryParamRuleContext> requestQueryParamRule() {
			return getRuleContexts(RequestQueryParamRuleContext.class);
		}
		public RequestQueryParamRuleContext requestQueryParamRule(int i) {
			return getRuleContext(RequestQueryParamRuleContext.class,i);
		}
		public RequestQueryParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requestQueryParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterRequestQueryParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitRequestQueryParams(this);
		}
	}

	public final RequestQueryParamsContext requestQueryParams() throws RecognitionException {
		RequestQueryParamsContext _localctx = new RequestQueryParamsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_requestQueryParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(T__40);
			setState(350);
			match(T__2);
			setState(352); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(351);
				requestQueryParamRule();
				}
				}
				setState(354); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(356);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequestQueryParamRuleContext extends ParserRuleContext {
		public SetNameCommandContext setNameCommand() {
			return getRuleContext(SetNameCommandContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public RequestQueryParamRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requestQueryParamRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterRequestQueryParamRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitRequestQueryParamRule(this);
		}
	}

	public final RequestQueryParamRuleContext requestQueryParamRule() throws RecognitionException {
		RequestQueryParamRuleContext _localctx = new RequestQueryParamRuleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_requestQueryParamRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(T__6);
			setState(359);
			match(T__41);
			setState(360);
			match(T__2);
			setState(361);
			setNameCommand();
			setState(362);
			condition();
			setState(363);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequestHeadersContext extends ParserRuleContext {
		public List<RequestHeaderRuleContext> requestHeaderRule() {
			return getRuleContexts(RequestHeaderRuleContext.class);
		}
		public RequestHeaderRuleContext requestHeaderRule(int i) {
			return getRuleContext(RequestHeaderRuleContext.class,i);
		}
		public RequestHeadersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requestHeaders; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterRequestHeaders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitRequestHeaders(this);
		}
	}

	public final RequestHeadersContext requestHeaders() throws RecognitionException {
		RequestHeadersContext _localctx = new RequestHeadersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_requestHeaders);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(T__21);
			setState(366);
			match(T__2);
			setState(368); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(367);
				requestHeaderRule();
				}
				}
				setState(370); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(372);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequestHeaderRuleContext extends ParserRuleContext {
		public SetNameCommandContext setNameCommand() {
			return getRuleContext(SetNameCommandContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public RequestHeaderRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requestHeaderRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterRequestHeaderRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitRequestHeaderRule(this);
		}
	}

	public final RequestHeaderRuleContext requestHeaderRule() throws RecognitionException {
		RequestHeaderRuleContext _localctx = new RequestHeaderRuleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_requestHeaderRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__6);
			setState(375);
			match(T__42);
			setState(376);
			match(T__2);
			setState(377);
			setNameCommand();
			setState(378);
			condition();
			setState(379);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequestCookiesContext extends ParserRuleContext {
		public List<RequestCookieRuleContext> requestCookieRule() {
			return getRuleContexts(RequestCookieRuleContext.class);
		}
		public RequestCookieRuleContext requestCookieRule(int i) {
			return getRuleContext(RequestCookieRuleContext.class,i);
		}
		public RequestCookiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requestCookies; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterRequestCookies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitRequestCookies(this);
		}
	}

	public final RequestCookiesContext requestCookies() throws RecognitionException {
		RequestCookiesContext _localctx = new RequestCookiesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_requestCookies);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(T__43);
			setState(382);
			match(T__2);
			setState(384); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(383);
				requestCookieRule();
				}
				}
				setState(386); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(388);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequestCookieRuleContext extends ParserRuleContext {
		public SetNameCommandContext setNameCommand() {
			return getRuleContext(SetNameCommandContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public RequestCookieRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requestCookieRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterRequestCookieRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitRequestCookieRule(this);
		}
	}

	public final RequestCookieRuleContext requestCookieRule() throws RecognitionException {
		RequestCookieRuleContext _localctx = new RequestCookieRuleContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_requestCookieRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(T__6);
			setState(391);
			match(T__44);
			setState(392);
			match(T__2);
			setState(393);
			setNameCommand();
			setState(394);
			condition();
			setState(395);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequestFormParamsContext extends ParserRuleContext {
		public List<RequestFormParamRuleContext> requestFormParamRule() {
			return getRuleContexts(RequestFormParamRuleContext.class);
		}
		public RequestFormParamRuleContext requestFormParamRule(int i) {
			return getRuleContext(RequestFormParamRuleContext.class,i);
		}
		public RequestFormParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requestFormParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterRequestFormParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitRequestFormParams(this);
		}
	}

	public final RequestFormParamsContext requestFormParams() throws RecognitionException {
		RequestFormParamsContext _localctx = new RequestFormParamsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_requestFormParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(T__45);
			setState(398);
			match(T__2);
			setState(400); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(399);
				requestFormParamRule();
				}
				}
				setState(402); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(404);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequestFormParamRuleContext extends ParserRuleContext {
		public SetNameCommandContext setNameCommand() {
			return getRuleContext(SetNameCommandContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public RequestFormParamRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requestFormParamRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterRequestFormParamRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitRequestFormParamRule(this);
		}
	}

	public final RequestFormParamRuleContext requestFormParamRule() throws RecognitionException {
		RequestFormParamRuleContext _localctx = new RequestFormParamRuleContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_requestFormParamRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(T__6);
			setState(407);
			match(T__46);
			setState(408);
			match(T__2);
			setState(409);
			setNameCommand();
			setState(410);
			condition();
			setState(411);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequestBodyRulesContext extends ParserRuleContext {
		public List<RequestBodyRuleContext> requestBodyRule() {
			return getRuleContexts(RequestBodyRuleContext.class);
		}
		public RequestBodyRuleContext requestBodyRule(int i) {
			return getRuleContext(RequestBodyRuleContext.class,i);
		}
		public RequestBodyRulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requestBodyRules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterRequestBodyRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitRequestBodyRules(this);
		}
	}

	public final RequestBodyRulesContext requestBodyRules() throws RecognitionException {
		RequestBodyRulesContext _localctx = new RequestBodyRulesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_requestBodyRules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(T__47);
			setState(414);
			match(T__2);
			setState(416); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(415);
				requestBodyRule();
				}
				}
				setState(418); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(420);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequestBodyRuleContext extends ParserRuleContext {
		public RequestBodyRuleConditionContext requestBodyRuleCondition() {
			return getRuleContext(RequestBodyRuleConditionContext.class,0);
		}
		public RequestBodyRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requestBodyRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterRequestBodyRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitRequestBodyRule(this);
		}
	}

	public final RequestBodyRuleContext requestBodyRule() throws RecognitionException {
		RequestBodyRuleContext _localctx = new RequestBodyRuleContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_requestBodyRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(T__6);
			setState(423);
			match(T__48);
			setState(424);
			match(T__2);
			setState(425);
			requestBodyRuleCondition();
			setState(426);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequestBodyRuleConditionContext extends ParserRuleContext {
		public GeneralRequestBodyRuleConditionContext generalRequestBodyRuleCondition() {
			return getRuleContext(GeneralRequestBodyRuleConditionContext.class,0);
		}
		public NeagetedGeneralRequestBodyRuleConditionContext neagetedGeneralRequestBodyRuleCondition() {
			return getRuleContext(NeagetedGeneralRequestBodyRuleConditionContext.class,0);
		}
		public RequestBodyRuleConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requestBodyRuleCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterRequestBodyRuleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitRequestBodyRuleCondition(this);
		}
	}

	public final RequestBodyRuleConditionContext requestBodyRuleCondition() throws RecognitionException {
		RequestBodyRuleConditionContext _localctx = new RequestBodyRuleConditionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_requestBodyRuleCondition);
		try {
			setState(430);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				generalRequestBodyRuleCondition();
				}
				break;
			case T__49:
				enterOuterAlt(_localctx, 2);
				{
				setState(429);
				neagetedGeneralRequestBodyRuleCondition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NeagetedGeneralRequestBodyRuleConditionContext extends ParserRuleContext {
		public GeneralRequestBodyRuleConditionContext generalRequestBodyRuleCondition() {
			return getRuleContext(GeneralRequestBodyRuleConditionContext.class,0);
		}
		public NeagetedGeneralRequestBodyRuleConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_neagetedGeneralRequestBodyRuleCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterNeagetedGeneralRequestBodyRuleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitNeagetedGeneralRequestBodyRuleCondition(this);
		}
	}

	public final NeagetedGeneralRequestBodyRuleConditionContext neagetedGeneralRequestBodyRuleCondition() throws RecognitionException {
		NeagetedGeneralRequestBodyRuleConditionContext _localctx = new NeagetedGeneralRequestBodyRuleConditionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_neagetedGeneralRequestBodyRuleCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(T__49);
			setState(433);
			match(T__50);
			setState(434);
			generalRequestBodyRuleCondition();
			setState(435);
			match(T__51);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GeneralRequestBodyRuleConditionContext extends ParserRuleContext {
		public ValueOnlyRequestBodyRuleConditionContext valueOnlyRequestBodyRuleCondition() {
			return getRuleContext(ValueOnlyRequestBodyRuleConditionContext.class,0);
		}
		public EqualsXmlRequestBodyRuleConditionContext equalsXmlRequestBodyRuleCondition() {
			return getRuleContext(EqualsXmlRequestBodyRuleConditionContext.class,0);
		}
		public EqualsJsonRequestBodyRuleConditionContext equalsJsonRequestBodyRuleCondition() {
			return getRuleContext(EqualsJsonRequestBodyRuleConditionContext.class,0);
		}
		public IsPresentRequestBodyRuleConditionContext isPresentRequestBodyRuleCondition() {
			return getRuleContext(IsPresentRequestBodyRuleConditionContext.class,0);
		}
		public MatchesJsonPathRequestBodyRuleConditionContext matchesJsonPathRequestBodyRuleCondition() {
			return getRuleContext(MatchesJsonPathRequestBodyRuleConditionContext.class,0);
		}
		public MatchesXPathRequestBodyRuleConditionContext matchesXPathRequestBodyRuleCondition() {
			return getRuleContext(MatchesXPathRequestBodyRuleConditionContext.class,0);
		}
		public GeneralRequestBodyRuleConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalRequestBodyRuleCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterGeneralRequestBodyRuleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitGeneralRequestBodyRuleCondition(this);
		}
	}

	public final GeneralRequestBodyRuleConditionContext generalRequestBodyRuleCondition() throws RecognitionException {
		GeneralRequestBodyRuleConditionContext _localctx = new GeneralRequestBodyRuleConditionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_generalRequestBodyRuleCondition);
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				valueOnlyRequestBodyRuleCondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(438);
				equalsXmlRequestBodyRuleCondition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(439);
				equalsJsonRequestBodyRuleCondition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(440);
				isPresentRequestBodyRuleCondition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(441);
				matchesJsonPathRequestBodyRuleCondition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(442);
				matchesXPathRequestBodyRuleCondition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueOnlyRequestBodyRuleConditionContext extends ParserRuleContext {
		public SetRequestBodyConditionTypeCommandContext setRequestBodyConditionTypeCommand() {
			return getRuleContext(SetRequestBodyConditionTypeCommandContext.class,0);
		}
		public GenericConditionTypesContext genericConditionTypes() {
			return getRuleContext(GenericConditionTypesContext.class,0);
		}
		public SetValueCommandContext setValueCommand() {
			return getRuleContext(SetValueCommandContext.class,0);
		}
		public ValueOnlyRequestBodyRuleConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueOnlyRequestBodyRuleCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterValueOnlyRequestBodyRuleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitValueOnlyRequestBodyRuleCondition(this);
		}
	}

	public final ValueOnlyRequestBodyRuleConditionContext valueOnlyRequestBodyRuleCondition() throws RecognitionException {
		ValueOnlyRequestBodyRuleConditionContext _localctx = new ValueOnlyRequestBodyRuleConditionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_valueOnlyRequestBodyRuleCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			setRequestBodyConditionTypeCommand();
			setState(446);
			genericConditionTypes();
			setState(447);
			setValueCommand();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualsXmlRequestBodyRuleConditionContext extends ParserRuleContext {
		public SetRequestBodyConditionTypeCommandContext setRequestBodyConditionTypeCommand() {
			return getRuleContext(SetRequestBodyConditionTypeCommandContext.class,0);
		}
		public SetValueCommandContext setValueCommand() {
			return getRuleContext(SetValueCommandContext.class,0);
		}
		public SetEnableXmlUnitPlaceholdersCommandContext setEnableXmlUnitPlaceholdersCommand() {
			return getRuleContext(SetEnableXmlUnitPlaceholdersCommandContext.class,0);
		}
		public EqualsXmlRequestBodyRuleConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalsXmlRequestBodyRuleCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterEqualsXmlRequestBodyRuleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitEqualsXmlRequestBodyRuleCondition(this);
		}
	}

	public final EqualsXmlRequestBodyRuleConditionContext equalsXmlRequestBodyRuleCondition() throws RecognitionException {
		EqualsXmlRequestBodyRuleConditionContext _localctx = new EqualsXmlRequestBodyRuleConditionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_equalsXmlRequestBodyRuleCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			setRequestBodyConditionTypeCommand();
			setState(450);
			match(T__52);
			setState(451);
			setValueCommand();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(452);
				setEnableXmlUnitPlaceholdersCommand();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EqualsJsonRequestBodyRuleConditionContext extends ParserRuleContext {
		public SetRequestBodyConditionTypeCommandContext setRequestBodyConditionTypeCommand() {
			return getRuleContext(SetRequestBodyConditionTypeCommandContext.class,0);
		}
		public SetValueCommandContext setValueCommand() {
			return getRuleContext(SetValueCommandContext.class,0);
		}
		public SetIgnoreArrayOrderCommandContext setIgnoreArrayOrderCommand() {
			return getRuleContext(SetIgnoreArrayOrderCommandContext.class,0);
		}
		public SetIgnorExtraElementsCommandContext setIgnorExtraElementsCommand() {
			return getRuleContext(SetIgnorExtraElementsCommandContext.class,0);
		}
		public EqualsJsonRequestBodyRuleConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalsJsonRequestBodyRuleCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterEqualsJsonRequestBodyRuleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitEqualsJsonRequestBodyRuleCondition(this);
		}
	}

	public final EqualsJsonRequestBodyRuleConditionContext equalsJsonRequestBodyRuleCondition() throws RecognitionException {
		EqualsJsonRequestBodyRuleConditionContext _localctx = new EqualsJsonRequestBodyRuleConditionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_equalsJsonRequestBodyRuleCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			setRequestBodyConditionTypeCommand();
			setState(456);
			match(T__53);
			setState(457);
			setValueCommand();
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(458);
				setIgnoreArrayOrderCommand();
				}
				break;
			}
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(461);
				setIgnorExtraElementsCommand();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IsPresentRequestBodyRuleConditionContext extends ParserRuleContext {
		public SetRequestBodyConditionTypeCommandContext setRequestBodyConditionTypeCommand() {
			return getRuleContext(SetRequestBodyConditionTypeCommandContext.class,0);
		}
		public IsPresentConditionTypesContext isPresentConditionTypes() {
			return getRuleContext(IsPresentConditionTypesContext.class,0);
		}
		public IsPresentRequestBodyRuleConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isPresentRequestBodyRuleCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterIsPresentRequestBodyRuleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitIsPresentRequestBodyRuleCondition(this);
		}
	}

	public final IsPresentRequestBodyRuleConditionContext isPresentRequestBodyRuleCondition() throws RecognitionException {
		IsPresentRequestBodyRuleConditionContext _localctx = new IsPresentRequestBodyRuleConditionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_isPresentRequestBodyRuleCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			setRequestBodyConditionTypeCommand();
			setState(465);
			isPresentConditionTypes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchesJsonPathRequestBodyRuleConditionContext extends ParserRuleContext {
		public SetRequestBodyConditionTypeCommandContext setRequestBodyConditionTypeCommand() {
			return getRuleContext(SetRequestBodyConditionTypeCommandContext.class,0);
		}
		public SetNameCommandContext setNameCommand() {
			return getRuleContext(SetNameCommandContext.class,0);
		}
		public MatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition() {
			return getRuleContext(MatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext.class,0);
		}
		public NegatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext negatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition() {
			return getRuleContext(NegatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext.class,0);
		}
		public MatchesJsonPathRequestBodyRuleConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchesJsonPathRequestBodyRuleCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterMatchesJsonPathRequestBodyRuleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitMatchesJsonPathRequestBodyRuleCondition(this);
		}
	}

	public final MatchesJsonPathRequestBodyRuleConditionContext matchesJsonPathRequestBodyRuleCondition() throws RecognitionException {
		MatchesJsonPathRequestBodyRuleConditionContext _localctx = new MatchesJsonPathRequestBodyRuleConditionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_matchesJsonPathRequestBodyRuleCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			setRequestBodyConditionTypeCommand();
			setState(468);
			match(T__54);
			setState(469);
			setNameCommand();
			setState(472);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__85:
				{
				setState(470);
				matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition();
				}
				break;
			case T__49:
				{
				setState(471);
				negatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchesXPathRequestBodyRuleConditionContext extends ParserRuleContext {
		public SetRequestBodyConditionTypeCommandContext setRequestBodyConditionTypeCommand() {
			return getRuleContext(SetRequestBodyConditionTypeCommandContext.class,0);
		}
		public SetNameCommandContext setNameCommand() {
			return getRuleContext(SetNameCommandContext.class,0);
		}
		public MatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition() {
			return getRuleContext(MatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext.class,0);
		}
		public NegatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext negatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition() {
			return getRuleContext(NegatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext.class,0);
		}
		public MatchesXPathRequestBodyRuleConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchesXPathRequestBodyRuleCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterMatchesXPathRequestBodyRuleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitMatchesXPathRequestBodyRuleCondition(this);
		}
	}

	public final MatchesXPathRequestBodyRuleConditionContext matchesXPathRequestBodyRuleCondition() throws RecognitionException {
		MatchesXPathRequestBodyRuleConditionContext _localctx = new MatchesXPathRequestBodyRuleConditionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_matchesXPathRequestBodyRuleCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			setRequestBodyConditionTypeCommand();
			setState(475);
			match(T__55);
			setState(476);
			setNameCommand();
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__85:
				{
				setState(477);
				matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition();
				}
				break;
			case T__49:
				{
				setState(478);
				negatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext extends ParserRuleContext {
		public MatchesJsonPathAndXPathConditionTypesContext matchesJsonPathAndXPathConditionTypes() {
			return getRuleContext(MatchesJsonPathAndXPathConditionTypesContext.class,0);
		}
		public SetValueCommandContext setValueCommand() {
			return getRuleContext(SetValueCommandContext.class,0);
		}
		public IsPresentConditionTypesContext isPresentConditionTypes() {
			return getRuleContext(IsPresentConditionTypesContext.class,0);
		}
		public MatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition(this);
		}
	}

	public final MatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition() throws RecognitionException {
		MatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext _localctx = new MatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(481);
				match(T__16);
				setState(482);
				match(T__56);
				setState(483);
				match(T__18);
				setState(484);
				matchesJsonPathAndXPathConditionTypes();
				setState(485);
				setValueCommand();
				}
				}
				break;
			case T__85:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(487);
				isPresentConditionTypes();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NegatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext extends ParserRuleContext {
		public MatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition() {
			return getRuleContext(MatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext.class,0);
		}
		public NegatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterNegatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitNegatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition(this);
		}
	}

	public final NegatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext negatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition() throws RecognitionException {
		NegatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext _localctx = new NegatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_negatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(T__49);
			setState(491);
			match(T__50);
			setState(492);
			matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition();
			setState(493);
			match(T__51);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public SimpleConditionContext simpleCondition() {
			return getRuleContext(SimpleConditionContext.class,0);
		}
		public CompositeConditionContext compositeCondition() {
			return getRuleContext(CompositeConditionContext.class,0);
		}
		public NegatedSimpleConditionContext negatedSimpleCondition() {
			return getRuleContext(NegatedSimpleConditionContext.class,0);
		}
		public NegatedCompositeConditionContext negatedCompositeCondition() {
			return getRuleContext(NegatedCompositeConditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(T__6);
			setState(496);
			match(T__57);
			setState(497);
			match(T__2);
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(498);
				simpleCondition();
				}
				break;
			case 2:
				{
				setState(499);
				compositeCondition();
				}
				break;
			case 3:
				{
				setState(500);
				negatedSimpleCondition();
				}
				break;
			case 4:
				{
				setState(501);
				negatedCompositeCondition();
				}
				break;
			}
			setState(504);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleConditionContext extends ParserRuleContext {
		public SetRequestSingleConditionTypeCommandContext setRequestSingleConditionTypeCommand() {
			return getRuleContext(SetRequestSingleConditionTypeCommandContext.class,0);
		}
		public SetValueCommandContext setValueCommand() {
			return getRuleContext(SetValueCommandContext.class,0);
		}
		public IsPresentConditionTypesContext isPresentConditionTypes() {
			return getRuleContext(IsPresentConditionTypesContext.class,0);
		}
		public SimpleConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSimpleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSimpleCondition(this);
		}
	}

	public final SimpleConditionContext simpleCondition() throws RecognitionException {
		SimpleConditionContext _localctx = new SimpleConditionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_simpleCondition);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(506);
				setRequestSingleConditionTypeCommand();
				setState(507);
				setValueCommand();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(509);
				match(T__16);
				setState(510);
				match(T__58);
				setState(511);
				match(T__18);
				setState(512);
				isPresentConditionTypes();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompositeConditionContext extends ParserRuleContext {
		public SetRequestMultipleConditionTypeCommandContext setRequestMultipleConditionTypeCommand() {
			return getRuleContext(SetRequestMultipleConditionTypeCommandContext.class,0);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public CompositeConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compositeCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterCompositeCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitCompositeCondition(this);
		}
	}

	public final CompositeConditionContext compositeCondition() throws RecognitionException {
		CompositeConditionContext _localctx = new CompositeConditionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_compositeCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			setRequestMultipleConditionTypeCommand();
			setState(516);
			condition();
			setState(518); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(517);
				condition();
				}
				}
				setState(520); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NegatedSimpleConditionContext extends ParserRuleContext {
		public SimpleConditionContext simpleCondition() {
			return getRuleContext(SimpleConditionContext.class,0);
		}
		public NegatedSimpleConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negatedSimpleCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterNegatedSimpleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitNegatedSimpleCondition(this);
		}
	}

	public final NegatedSimpleConditionContext negatedSimpleCondition() throws RecognitionException {
		NegatedSimpleConditionContext _localctx = new NegatedSimpleConditionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_negatedSimpleCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			match(T__49);
			setState(523);
			match(T__50);
			setState(524);
			simpleCondition();
			setState(525);
			match(T__51);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NegatedCompositeConditionContext extends ParserRuleContext {
		public CompositeConditionContext compositeCondition() {
			return getRuleContext(CompositeConditionContext.class,0);
		}
		public NegatedCompositeConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negatedCompositeCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterNegatedCompositeCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitNegatedCompositeCondition(this);
		}
	}

	public final NegatedCompositeConditionContext negatedCompositeCondition() throws RecognitionException {
		NegatedCompositeConditionContext _localctx = new NegatedCompositeConditionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_negatedCompositeCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(T__49);
			setState(528);
			match(T__50);
			setState(529);
			compositeCondition();
			setState(530);
			match(T__51);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HttpMethodTypesContext extends ParserRuleContext {
		public HttpMethodTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_httpMethodTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterHttpMethodTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitHttpMethodTypes(this);
		}
	}

	public final HttpMethodTypesContext httpMethodTypes() throws RecognitionException {
		HttpMethodTypesContext _localctx = new HttpMethodTypesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_httpMethodTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_la = _input.LA(1);
			if ( !(((((_la - 60)) & ~0x3f) == 0 && ((1L << (_la - 60)) & 255L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UrlMatchTypesContext extends ParserRuleContext {
		public UrlMatchTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_urlMatchTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterUrlMatchTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitUrlMatchTypes(this);
		}
	}

	public final UrlMatchTypesContext urlMatchTypes() throws RecognitionException {
		UrlMatchTypesContext _localctx = new UrlMatchTypesContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_urlMatchTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 63L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequestValueConditionTypesContext extends ParserRuleContext {
		public RequestValueConditionTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requestValueConditionTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterRequestValueConditionTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitRequestValueConditionTypes(this);
		}
	}

	public final RequestValueConditionTypesContext requestValueConditionTypes() throws RecognitionException {
		RequestValueConditionTypesContext _localctx = new RequestValueConditionTypesContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_requestValueConditionTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 534773767L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GenericConditionTypesContext extends ParserRuleContext {
		public GenericConditionTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConditionTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterGenericConditionTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitGenericConditionTypes(this);
		}
	}

	public final GenericConditionTypesContext genericConditionTypes() throws RecognitionException {
		GenericConditionTypesContext _localctx = new GenericConditionTypesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_genericConditionTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 15L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RequestCompositeConditionTypesContext extends ParserRuleContext {
		public RequestCompositeConditionTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requestCompositeConditionTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterRequestCompositeConditionTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitRequestCompositeConditionTypes(this);
		}
	}

	public final RequestCompositeConditionTypesContext requestCompositeConditionTypes() throws RecognitionException {
		RequestCompositeConditionTypesContext _localctx = new RequestCompositeConditionTypesContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_requestCompositeConditionTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_la = _input.LA(1);
			if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 15L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchesJsonPathAndXPathConditionTypesContext extends ParserRuleContext {
		public MatchesJsonPathAndXPathConditionTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchesJsonPathAndXPathConditionTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterMatchesJsonPathAndXPathConditionTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitMatchesJsonPathAndXPathConditionTypes(this);
		}
	}

	public final MatchesJsonPathAndXPathConditionTypesContext matchesJsonPathAndXPathConditionTypes() throws RecognitionException {
		MatchesJsonPathAndXPathConditionTypesContext _localctx = new MatchesJsonPathAndXPathConditionTypesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_matchesJsonPathAndXPathConditionTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 231L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IsPresentConditionTypesContext extends ParserRuleContext {
		public IsPresentConditionTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isPresentConditionTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterIsPresentConditionTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitIsPresentConditionTypes(this);
		}
	}

	public final IsPresentConditionTypesContext isPresentConditionTypes() throws RecognitionException {
		IsPresentConditionTypesContext _localctx = new IsPresentConditionTypesContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_isPresentConditionTypes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(T__85);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResponseBodyTypesContext extends ParserRuleContext {
		public ResponseBodyTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_responseBodyTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterResponseBodyTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitResponseBodyTypes(this);
		}
	}

	public final ResponseBodyTypesContext responseBodyTypes() throws RecognitionException {
		ResponseBodyTypesContext _localctx = new ResponseBodyTypesContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_responseBodyTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & 31L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetNameCommandContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DmytroMockDSLParser.STRING, 0); }
		public SetNameCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setNameCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSetNameCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSetNameCommand(this);
		}
	}

	public final SetNameCommandContext setNameCommand() throws RecognitionException {
		SetNameCommandContext _localctx = new SetNameCommandContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_setNameCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(T__16);
			setState(549);
			match(T__91);
			setState(550);
			match(T__18);
			setState(551);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetValueCommandContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DmytroMockDSLParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(DmytroMockDSLParser.NUMBER, 0); }
		public SetValueCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setValueCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSetValueCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSetValueCommand(this);
		}
	}

	public final SetValueCommandContext setValueCommand() throws RecognitionException {
		SetValueCommandContext _localctx = new SetValueCommandContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_setValueCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(T__16);
			setState(554);
			match(T__30);
			setState(555);
			match(T__18);
			setState(556);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetEndpointDescriptionCommandContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DmytroMockDSLParser.STRING, 0); }
		public SetEndpointDescriptionCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setEndpointDescriptionCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSetEndpointDescriptionCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSetEndpointDescriptionCommand(this);
		}
	}

	public final SetEndpointDescriptionCommandContext setEndpointDescriptionCommand() throws RecognitionException {
		SetEndpointDescriptionCommandContext _localctx = new SetEndpointDescriptionCommandContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_setEndpointDescriptionCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(T__16);
			setState(559);
			match(T__92);
			setState(560);
			match(T__18);
			setState(561);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetHttpMethodCommandContext extends ParserRuleContext {
		public HttpMethodTypesContext httpMethodTypes() {
			return getRuleContext(HttpMethodTypesContext.class,0);
		}
		public SetHttpMethodCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setHttpMethodCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSetHttpMethodCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSetHttpMethodCommand(this);
		}
	}

	public final SetHttpMethodCommandContext setHttpMethodCommand() throws RecognitionException {
		SetHttpMethodCommandContext _localctx = new SetHttpMethodCommandContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_setHttpMethodCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			match(T__16);
			setState(564);
			match(T__93);
			setState(565);
			match(T__18);
			setState(566);
			httpMethodTypes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetUrlMatchTypeCommandContext extends ParserRuleContext {
		public UrlMatchTypesContext urlMatchTypes() {
			return getRuleContext(UrlMatchTypesContext.class,0);
		}
		public SetUrlMatchTypeCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setUrlMatchTypeCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSetUrlMatchTypeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSetUrlMatchTypeCommand(this);
		}
	}

	public final SetUrlMatchTypeCommandContext setUrlMatchTypeCommand() throws RecognitionException {
		SetUrlMatchTypeCommandContext _localctx = new SetUrlMatchTypeCommandContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_setUrlMatchTypeCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			match(T__16);
			setState(569);
			match(T__94);
			setState(570);
			match(T__18);
			setState(571);
			urlMatchTypes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetPathCommandContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DmytroMockDSLParser.STRING, 0); }
		public SetPathCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setPathCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSetPathCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSetPathCommand(this);
		}
	}

	public final SetPathCommandContext setPathCommand() throws RecognitionException {
		SetPathCommandContext _localctx = new SetPathCommandContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_setPathCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(T__16);
			setState(574);
			match(T__95);
			setState(575);
			match(T__18);
			setState(576);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetPriorityCommandContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(DmytroMockDSLParser.NUMBER, 0); }
		public SetPriorityCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setPriorityCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSetPriorityCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSetPriorityCommand(this);
		}
	}

	public final SetPriorityCommandContext setPriorityCommand() throws RecognitionException {
		SetPriorityCommandContext _localctx = new SetPriorityCommandContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_setPriorityCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(T__16);
			setState(579);
			match(T__96);
			setState(580);
			match(T__18);
			setState(581);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetResponseStatusCodeCommandContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(DmytroMockDSLParser.NUMBER, 0); }
		public SetResponseStatusCodeCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setResponseStatusCodeCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSetResponseStatusCodeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSetResponseStatusCodeCommand(this);
		}
	}

	public final SetResponseStatusCodeCommandContext setResponseStatusCodeCommand() throws RecognitionException {
		SetResponseStatusCodeCommandContext _localctx = new SetResponseStatusCodeCommandContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_setResponseStatusCodeCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(T__16);
			setState(584);
			match(T__97);
			setState(585);
			match(T__18);
			setState(586);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetRequestSingleConditionTypeCommandContext extends ParserRuleContext {
		public RequestValueConditionTypesContext requestValueConditionTypes() {
			return getRuleContext(RequestValueConditionTypesContext.class,0);
		}
		public SetRequestSingleConditionTypeCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setRequestSingleConditionTypeCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSetRequestSingleConditionTypeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSetRequestSingleConditionTypeCommand(this);
		}
	}

	public final SetRequestSingleConditionTypeCommandContext setRequestSingleConditionTypeCommand() throws RecognitionException {
		SetRequestSingleConditionTypeCommandContext _localctx = new SetRequestSingleConditionTypeCommandContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_setRequestSingleConditionTypeCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(T__16);
			setState(589);
			match(T__58);
			setState(590);
			match(T__18);
			setState(591);
			requestValueConditionTypes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetRequestMultipleConditionTypeCommandContext extends ParserRuleContext {
		public RequestCompositeConditionTypesContext requestCompositeConditionTypes() {
			return getRuleContext(RequestCompositeConditionTypesContext.class,0);
		}
		public SetRequestMultipleConditionTypeCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setRequestMultipleConditionTypeCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSetRequestMultipleConditionTypeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSetRequestMultipleConditionTypeCommand(this);
		}
	}

	public final SetRequestMultipleConditionTypeCommandContext setRequestMultipleConditionTypeCommand() throws RecognitionException {
		SetRequestMultipleConditionTypeCommandContext _localctx = new SetRequestMultipleConditionTypeCommandContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_setRequestMultipleConditionTypeCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			match(T__16);
			setState(594);
			match(T__58);
			setState(595);
			match(T__18);
			setState(596);
			requestCompositeConditionTypes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetRequestBodyConditionTypeCommandContext extends ParserRuleContext {
		public SetRequestBodyConditionTypeCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setRequestBodyConditionTypeCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSetRequestBodyConditionTypeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSetRequestBodyConditionTypeCommand(this);
		}
	}

	public final SetRequestBodyConditionTypeCommandContext setRequestBodyConditionTypeCommand() throws RecognitionException {
		SetRequestBodyConditionTypeCommandContext _localctx = new SetRequestBodyConditionTypeCommandContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_setRequestBodyConditionTypeCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(T__16);
			setState(599);
			match(T__98);
			setState(600);
			match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetUrlCommandContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DmytroMockDSLParser.STRING, 0); }
		public SetUrlCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setUrlCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSetUrlCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSetUrlCommand(this);
		}
	}

	public final SetUrlCommandContext setUrlCommand() throws RecognitionException {
		SetUrlCommandContext _localctx = new SetUrlCommandContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_setUrlCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(T__16);
			setState(603);
			match(T__99);
			setState(604);
			match(T__18);
			setState(605);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetFaultTypeCommandContext extends ParserRuleContext {
		public FaultTypesContext faultTypes() {
			return getRuleContext(FaultTypesContext.class,0);
		}
		public SetFaultTypeCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setFaultTypeCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSetFaultTypeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSetFaultTypeCommand(this);
		}
	}

	public final SetFaultTypeCommandContext setFaultTypeCommand() throws RecognitionException {
		SetFaultTypeCommandContext _localctx = new SetFaultTypeCommandContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_setFaultTypeCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(T__16);
			setState(608);
			match(T__100);
			setState(609);
			match(T__18);
			setState(610);
			faultTypes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetHostnameRewritingCommandContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(DmytroMockDSLParser.BOOLEAN, 0); }
		public SetHostnameRewritingCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setHostnameRewritingCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSetHostnameRewritingCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSetHostnameRewritingCommand(this);
		}
	}

	public final SetHostnameRewritingCommandContext setHostnameRewritingCommand() throws RecognitionException {
		SetHostnameRewritingCommandContext _localctx = new SetHostnameRewritingCommandContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_setHostnameRewritingCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			match(T__16);
			setState(613);
			match(T__101);
			setState(614);
			match(T__18);
			setState(615);
			match(BOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetTemplatingCommandContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(DmytroMockDSLParser.BOOLEAN, 0); }
		public SetTemplatingCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setTemplatingCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSetTemplatingCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSetTemplatingCommand(this);
		}
	}

	public final SetTemplatingCommandContext setTemplatingCommand() throws RecognitionException {
		SetTemplatingCommandContext _localctx = new SetTemplatingCommandContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_setTemplatingCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(T__16);
			setState(618);
			match(T__102);
			setState(619);
			match(T__18);
			setState(620);
			match(BOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetResponseBodyTypeCommandContext extends ParserRuleContext {
		public ResponseBodyTypesContext responseBodyTypes() {
			return getRuleContext(ResponseBodyTypesContext.class,0);
		}
		public SetResponseBodyTypeCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setResponseBodyTypeCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSetResponseBodyTypeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSetResponseBodyTypeCommand(this);
		}
	}

	public final SetResponseBodyTypeCommandContext setResponseBodyTypeCommand() throws RecognitionException {
		SetResponseBodyTypeCommandContext _localctx = new SetResponseBodyTypeCommandContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_setResponseBodyTypeCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			match(T__16);
			setState(623);
			match(T__103);
			setState(624);
			match(T__18);
			setState(625);
			responseBodyTypes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetDynamicResponseTemplatingCommandContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(DmytroMockDSLParser.BOOLEAN, 0); }
		public SetDynamicResponseTemplatingCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setDynamicResponseTemplatingCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSetDynamicResponseTemplatingCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSetDynamicResponseTemplatingCommand(this);
		}
	}

	public final SetDynamicResponseTemplatingCommandContext setDynamicResponseTemplatingCommand() throws RecognitionException {
		SetDynamicResponseTemplatingCommandContext _localctx = new SetDynamicResponseTemplatingCommandContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_setDynamicResponseTemplatingCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(T__16);
			setState(628);
			match(T__104);
			setState(629);
			match(T__18);
			setState(630);
			match(BOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetIgnoreArrayOrderCommandContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(DmytroMockDSLParser.BOOLEAN, 0); }
		public SetIgnoreArrayOrderCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setIgnoreArrayOrderCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSetIgnoreArrayOrderCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSetIgnoreArrayOrderCommand(this);
		}
	}

	public final SetIgnoreArrayOrderCommandContext setIgnoreArrayOrderCommand() throws RecognitionException {
		SetIgnoreArrayOrderCommandContext _localctx = new SetIgnoreArrayOrderCommandContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_setIgnoreArrayOrderCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(T__16);
			setState(633);
			match(T__105);
			setState(634);
			match(T__18);
			setState(635);
			match(BOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetIgnorExtraElementsCommandContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(DmytroMockDSLParser.BOOLEAN, 0); }
		public SetIgnorExtraElementsCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setIgnorExtraElementsCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSetIgnorExtraElementsCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSetIgnorExtraElementsCommand(this);
		}
	}

	public final SetIgnorExtraElementsCommandContext setIgnorExtraElementsCommand() throws RecognitionException {
		SetIgnorExtraElementsCommandContext _localctx = new SetIgnorExtraElementsCommandContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_setIgnorExtraElementsCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			match(T__16);
			setState(638);
			match(T__106);
			setState(639);
			match(T__18);
			setState(640);
			match(BOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetEnableXmlUnitPlaceholdersCommandContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(DmytroMockDSLParser.BOOLEAN, 0); }
		public SetEnableXmlUnitPlaceholdersCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setEnableXmlUnitPlaceholdersCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).enterSetEnableXmlUnitPlaceholdersCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DmytroMockDSLListener ) ((DmytroMockDSLListener)listener).exitSetEnableXmlUnitPlaceholdersCommand(this);
		}
	}

	public final SetEnableXmlUnitPlaceholdersCommandContext setEnableXmlUnitPlaceholdersCommand() throws RecognitionException {
		SetEnableXmlUnitPlaceholdersCommandContext _localctx = new SetEnableXmlUnitPlaceholdersCommandContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_setEnableXmlUnitPlaceholdersCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			match(T__16);
			setState(643);
			match(T__107);
			setState(644);
			match(T__18);
			setState(645);
			match(BOOLEAN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001r\u0288\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u0095\b\u0000\n\u0000\f\u0000\u0098\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00a5\b\u0001\u0001"+
		"\u0001\u0003\u0001\u00a8\b\u0001\u0001\u0001\u0003\u0001\u00ab\b\u0001"+
		"\u0001\u0001\u0003\u0001\u00ae\b\u0001\u0001\u0001\u0003\u0001\u00b1\b"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00bc\b\u0002\u0001"+
		"\u0002\u0003\u0002\u00bf\b\u0002\u0001\u0002\u0003\u0002\u00c2\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003\u00cc\b\u0003\u0001\u0003\u0003\u0003"+
		"\u00cf\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00e4\b\u0006\u0001\u0006\u0003\u0006"+
		"\u00e7\b\u0006\u0001\u0006\u0003\u0006\u00ea\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00f9\b\u0007\u0003\u0007\u00fb\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0004\b\u0102\b\b\u000b\b\f\b\u0103\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u010e\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u0113\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0004\n\u011a\b\n\u000b\n\f\n\u011b\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0004\u0012\u0161\b\u0012\u000b\u0012\f\u0012\u0162\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0004"+
		"\u0014\u0171\b\u0014\u000b\u0014\f\u0014\u0172\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0004\u0016\u0181\b\u0016"+
		"\u000b\u0016\f\u0016\u0182\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0004\u0018\u0191\b\u0018\u000b\u0018\f\u0018"+
		"\u0192\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0004\u001a\u01a1\b\u001a\u000b\u001a\f\u001a\u01a2\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u01af\b\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01bc\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0003 \u01c6\b \u0001!\u0001!\u0001!\u0001!\u0003!\u01cc\b!\u0001"+
		"!\u0003!\u01cf\b!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#"+
		"\u0001#\u0003#\u01d9\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u01e0"+
		"\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u01e9\b%\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0003\'\u01f7\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0003(\u0202\b(\u0001)\u0001)\u0001)\u0004"+
		")\u0207\b)\u000b)\f)\u0208\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0001"+
		"/\u0001/\u00010\u00010\u00011\u00011\u00012\u00012\u00013\u00013\u0001"+
		"4\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u0001"+
		"6\u00016\u00016\u00016\u00016\u00017\u00017\u00017\u00017\u00017\u0001"+
		"8\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u00019\u00019\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0001=\u0001"+
		">\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001C\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001E\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0000"+
		"\u0000H\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0000\n\u0001\u0000\n\u000e"+
		"\u0001\u0000\u0018\u001b\u0001\u0000<C\u0001\u0000DI\u0002\u000057JQ\u0001"+
		"\u0000JM\u0001\u0000RU\u0002\u0000JLOQ\u0001\u0000W[\u0001\u0000mn\u026c"+
		"\u0000\u0090\u0001\u0000\u0000\u0000\u0002\u009d\u0001\u0000\u0000\u0000"+
		"\u0004\u00b5\u0001\u0000\u0000\u0000\u0006\u00c5\u0001\u0000\u0000\u0000"+
		"\b\u00d4\u0001\u0000\u0000\u0000\n\u00db\u0001\u0000\u0000\u0000\f\u00dd"+
		"\u0001\u0000\u0000\u0000\u000e\u00ed\u0001\u0000\u0000\u0000\u0010\u00fe"+
		"\u0001\u0000\u0000\u0000\u0012\u0107\u0001\u0000\u0000\u0000\u0014\u0116"+
		"\u0001\u0000\u0000\u0000\u0016\u011f\u0001\u0000\u0000\u0000\u0018\u0126"+
		"\u0001\u0000\u0000\u0000\u001a\u0128\u0001\u0000\u0000\u0000\u001c\u012d"+
		"\u0001\u0000\u0000\u0000\u001e\u0136\u0001\u0000\u0000\u0000 \u0143\u0001"+
		"\u0000\u0000\u0000\"\u0150\u0001\u0000\u0000\u0000$\u015d\u0001\u0000"+
		"\u0000\u0000&\u0166\u0001\u0000\u0000\u0000(\u016d\u0001\u0000\u0000\u0000"+
		"*\u0176\u0001\u0000\u0000\u0000,\u017d\u0001\u0000\u0000\u0000.\u0186"+
		"\u0001\u0000\u0000\u00000\u018d\u0001\u0000\u0000\u00002\u0196\u0001\u0000"+
		"\u0000\u00004\u019d\u0001\u0000\u0000\u00006\u01a6\u0001\u0000\u0000\u0000"+
		"8\u01ae\u0001\u0000\u0000\u0000:\u01b0\u0001\u0000\u0000\u0000<\u01bb"+
		"\u0001\u0000\u0000\u0000>\u01bd\u0001\u0000\u0000\u0000@\u01c1\u0001\u0000"+
		"\u0000\u0000B\u01c7\u0001\u0000\u0000\u0000D\u01d0\u0001\u0000\u0000\u0000"+
		"F\u01d3\u0001\u0000\u0000\u0000H\u01da\u0001\u0000\u0000\u0000J\u01e8"+
		"\u0001\u0000\u0000\u0000L\u01ea\u0001\u0000\u0000\u0000N\u01ef\u0001\u0000"+
		"\u0000\u0000P\u0201\u0001\u0000\u0000\u0000R\u0203\u0001\u0000\u0000\u0000"+
		"T\u020a\u0001\u0000\u0000\u0000V\u020f\u0001\u0000\u0000\u0000X\u0214"+
		"\u0001\u0000\u0000\u0000Z\u0216\u0001\u0000\u0000\u0000\\\u0218\u0001"+
		"\u0000\u0000\u0000^\u021a\u0001\u0000\u0000\u0000`\u021c\u0001\u0000\u0000"+
		"\u0000b\u021e\u0001\u0000\u0000\u0000d\u0220\u0001\u0000\u0000\u0000f"+
		"\u0222\u0001\u0000\u0000\u0000h\u0224\u0001\u0000\u0000\u0000j\u0229\u0001"+
		"\u0000\u0000\u0000l\u022e\u0001\u0000\u0000\u0000n\u0233\u0001\u0000\u0000"+
		"\u0000p\u0238\u0001\u0000\u0000\u0000r\u023d\u0001\u0000\u0000\u0000t"+
		"\u0242\u0001\u0000\u0000\u0000v\u0247\u0001\u0000\u0000\u0000x\u024c\u0001"+
		"\u0000\u0000\u0000z\u0251\u0001\u0000\u0000\u0000|\u0256\u0001\u0000\u0000"+
		"\u0000~\u025a\u0001\u0000\u0000\u0000\u0080\u025f\u0001\u0000\u0000\u0000"+
		"\u0082\u0264\u0001\u0000\u0000\u0000\u0084\u0269\u0001\u0000\u0000\u0000"+
		"\u0086\u026e\u0001\u0000\u0000\u0000\u0088\u0273\u0001\u0000\u0000\u0000"+
		"\u008a\u0278\u0001\u0000\u0000\u0000\u008c\u027d\u0001\u0000\u0000\u0000"+
		"\u008e\u0282\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0001\u0000\u0000"+
		"\u0091\u0092\u0005\u0002\u0000\u0000\u0092\u0096\u0005\u0003\u0000\u0000"+
		"\u0093\u0095\u0003l6\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u0098"+
		"\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0096"+
		"\u0001\u0000\u0000\u0000\u0099\u009a\u0003\u0002\u0001\u0000\u009a\u009b"+
		"\u0003\u0004\u0002\u0000\u009b\u009c\u0005\u0004\u0000\u0000\u009c\u0001"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u0001\u0000\u0000\u009e\u009f"+
		"\u0005\u0005\u0000\u0000\u009f\u00a0\u0005\u0003\u0000\u0000\u00a0\u00a1"+
		"\u0003n7\u0000\u00a1\u00a2\u0003p8\u0000\u00a2\u00a4\u0003r9\u0000\u00a3"+
		"\u00a5\u0003t:\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a8\u0003"+
		"$\u0012\u0000\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000"+
		"\u0000\u0000\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u00ab\u0003(\u0014"+
		"\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00ae\u0003,\u0016\u0000"+
		"\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00b1\u00030\u0018\u0000\u00b0"+
		"\u00af\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u00034\u001a\u0000\u00b3\u00b4"+
		"\u0005\u0004\u0000\u0000\u00b4\u0003\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005\u0001\u0000\u0000\u00b6\u00b7\u0005\u0006\u0000\u0000\u00b7\u00bb"+
		"\u0005\u0003\u0000\u0000\u00b8\u00bc\u0003\u0006\u0003\u0000\u00b9\u00bc"+
		"\u0003\b\u0004\u0000\u00ba\u00bc\u0003\f\u0006\u0000\u00bb\u00b8\u0001"+
		"\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bc\u00be\u0001\u0000\u0000\u0000\u00bd\u00bf\u0003"+
		"\u000e\u0007\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00be\u00bf\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c1\u0001\u0000\u0000\u0000\u00c0\u00c2\u0003"+
		"\u0010\b\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\u0004"+
		"\u0000\u0000\u00c4\u0005\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0007"+
		"\u0000\u0000\u00c6\u00c7\u0005\b\u0000\u0000\u00c7\u00c8\u0005\u0006\u0000"+
		"\u0000\u00c8\u00c9\u0005\u0003\u0000\u0000\u00c9\u00cb\u0003v;\u0000\u00ca"+
		"\u00cc\u0003\u0088D\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0001\u0000\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd\u00cf"+
		"\u0003\u0014\n\u0000\u00ce\u00cd\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0003"+
		"\u0086C\u0000\u00d1\u00d2\u0003j5\u0000\u00d2\u00d3\u0005\u0004\u0000"+
		"\u0000\u00d3\u0007\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0007\u0000"+
		"\u0000\u00d5\u00d6\u0005\t\u0000\u0000\u00d6\u00d7\u0005\u0006\u0000\u0000"+
		"\u00d7\u00d8\u0005\u0003\u0000\u0000\u00d8\u00d9\u0003\u0080@\u0000\u00d9"+
		"\u00da\u0005\u0004\u0000\u0000\u00da\t\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0007\u0000\u0000\u0000\u00dc\u000b\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0005\u0007\u0000\u0000\u00de\u00df\u0005\u000f\u0000\u0000\u00df\u00e0"+
		"\u0005\u0006\u0000\u0000\u00e0\u00e1\u0005\u0003\u0000\u0000\u00e1\u00e3"+
		"\u0003~?\u0000\u00e2\u00e4\u0003\u0014\n\u0000\u00e3\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e7\u0003\u0084B\u0000\u00e6\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e8\u00ea\u0003\u0082A\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ec\u0005\u0004\u0000\u0000\u00ec\r\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0005\u0010\u0000\u0000\u00ee\u00fa\u0005\u0003\u0000\u0000\u00ef"+
		"\u00fb\u0003\u001a\r\u0000\u00f0\u00f1\u0005\u0011\u0000\u0000\u00f1\u00f2"+
		"\u0005\u0012\u0000\u0000\u00f2\u00f3\u0005\u0013\u0000\u0000\u00f3\u00f8"+
		"\u0003\u0018\f\u0000\u00f4\u00f9\u0003\u001c\u000e\u0000\u00f5\u00f9\u0003"+
		"\u001e\u000f\u0000\u00f6\u00f9\u0003 \u0010\u0000\u00f7\u00f9\u0003\""+
		"\u0011\u0000\u00f8\u00f4\u0001\u0000\u0000\u0000\u00f8\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f7\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fb\u0001\u0000\u0000\u0000\u00fa\u00ef\u0001\u0000"+
		"\u0000\u0000\u00fa\u00f0\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0005\u0004\u0000\u0000\u00fd\u000f\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0005\u0014\u0000\u0000\u00ff\u0101\u0005\u0003"+
		"\u0000\u0000\u0100\u0102\u0003\u0012\t\u0000\u0101\u0100\u0001\u0000\u0000"+
		"\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000"+
		"\u0000\u0105\u0106\u0005\u0004\u0000\u0000\u0106\u0011\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0005\u0007\u0000\u0000\u0108\u0109\u0005\u0015\u0000"+
		"\u0000\u0109\u010a\u0005\u0003\u0000\u0000\u010a\u010b\u0003n7\u0000\u010b"+
		"\u010d\u0003~?\u0000\u010c\u010e\u0003\u0014\n\u0000\u010d\u010c\u0001"+
		"\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0003\u0086C\u0000\u0110\u0112\u0003j5"+
		"\u0000\u0111\u0113\u0003\u000e\u0007\u0000\u0112\u0111\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0005\u0004\u0000\u0000\u0115\u0013\u0001\u0000\u0000"+
		"\u0000\u0116\u0117\u0005\u0016\u0000\u0000\u0117\u0119\u0005\u0003\u0000"+
		"\u0000\u0118\u011a\u0003\u0016\u000b\u0000\u0119\u0118\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000"+
		"\u0000\u011d\u011e\u0005\u0004\u0000\u0000\u011e\u0015\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0005\u0007\u0000\u0000\u0120\u0121\u0005\u0017\u0000"+
		"\u0000\u0121\u0122\u0005\u0003\u0000\u0000\u0122\u0123\u0003h4\u0000\u0123"+
		"\u0124\u0003j5\u0000\u0124\u0125\u0005\u0004\u0000\u0000\u0125\u0017\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0007\u0001\u0000\u0000\u0127\u0019\u0001"+
		"\u0000\u0000\u0000\u0128\u0129\u0005\u0011\u0000\u0000\u0129\u012a\u0005"+
		"\u001c\u0000\u0000\u012a\u012b\u0005\u0013\u0000\u0000\u012b\u012c\u0005"+
		"\u001d\u0000\u0000\u012c\u001b\u0001\u0000\u0000\u0000\u012d\u012e\u0005"+
		"\u0011\u0000\u0000\u012e\u012f\u0005\u001c\u0000\u0000\u012f\u0130\u0005"+
		"\u0013\u0000\u0000\u0130\u0131\u0005\u001e\u0000\u0000\u0131\u0132\u0005"+
		"\u0011\u0000\u0000\u0132\u0133\u0005\u001f\u0000\u0000\u0133\u0134\u0005"+
		"\u0013\u0000\u0000\u0134\u0135\u0005n\u0000\u0000\u0135\u001d\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0005\u0011\u0000\u0000\u0137\u0138\u0005\u001c"+
		"\u0000\u0000\u0138\u0139\u0005\u0013\u0000\u0000\u0139\u013a\u0005 \u0000"+
		"\u0000\u013a\u013b\u0005\u0011\u0000\u0000\u013b\u013c\u0005!\u0000\u0000"+
		"\u013c\u013d\u0005\u0013\u0000\u0000\u013d\u013e\u0005n\u0000\u0000\u013e"+
		"\u013f\u0005\u0011\u0000\u0000\u013f\u0140\u0005\"\u0000\u0000\u0140\u0141"+
		"\u0005\u0013\u0000\u0000\u0141\u0142\u0005n\u0000\u0000\u0142\u001f\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0005\u0011\u0000\u0000\u0144\u0145\u0005"+
		"\u001c\u0000\u0000\u0145\u0146\u0005\u0013\u0000\u0000\u0146\u0147\u0005"+
		"#\u0000\u0000\u0147\u0148\u0005\u0011\u0000\u0000\u0148\u0149\u0005$\u0000"+
		"\u0000\u0149\u014a\u0005\u0013\u0000\u0000\u014a\u014b\u0005n\u0000\u0000"+
		"\u014b\u014c\u0005\u0011\u0000\u0000\u014c\u014d\u0005%\u0000\u0000\u014d"+
		"\u014e\u0005\u0013\u0000\u0000\u014e\u014f\u0005n\u0000\u0000\u014f!\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0005\u0011\u0000\u0000\u0151\u0152\u0005"+
		"\u001c\u0000\u0000\u0152\u0153\u0005\u0013\u0000\u0000\u0153\u0154\u0005"+
		"&\u0000\u0000\u0154\u0155\u0005\u0011\u0000\u0000\u0155\u0156\u0005\'"+
		"\u0000\u0000\u0156\u0157\u0005\u0013\u0000\u0000\u0157\u0158\u0005n\u0000"+
		"\u0000\u0158\u0159\u0005\u0011\u0000\u0000\u0159\u015a\u0005(\u0000\u0000"+
		"\u015a\u015b\u0005\u0013\u0000\u0000\u015b\u015c\u0005n\u0000\u0000\u015c"+
		"#\u0001\u0000\u0000\u0000\u015d\u015e\u0005)\u0000\u0000\u015e\u0160\u0005"+
		"\u0003\u0000\u0000\u015f\u0161\u0003&\u0013\u0000\u0160\u015f\u0001\u0000"+
		"\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000"+
		"\u0000\u0000\u0164\u0165\u0005\u0004\u0000\u0000\u0165%\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0005\u0007\u0000\u0000\u0167\u0168\u0005*\u0000\u0000"+
		"\u0168\u0169\u0005\u0003\u0000\u0000\u0169\u016a\u0003h4\u0000\u016a\u016b"+
		"\u0003N\'\u0000\u016b\u016c\u0005\u0004\u0000\u0000\u016c\'\u0001\u0000"+
		"\u0000\u0000\u016d\u016e\u0005\u0016\u0000\u0000\u016e\u0170\u0005\u0003"+
		"\u0000\u0000\u016f\u0171\u0003*\u0015\u0000\u0170\u016f\u0001\u0000\u0000"+
		"\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000"+
		"\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000"+
		"\u0000\u0174\u0175\u0005\u0004\u0000\u0000\u0175)\u0001\u0000\u0000\u0000"+
		"\u0176\u0177\u0005\u0007\u0000\u0000\u0177\u0178\u0005+\u0000\u0000\u0178"+
		"\u0179\u0005\u0003\u0000\u0000\u0179\u017a\u0003h4\u0000\u017a\u017b\u0003"+
		"N\'\u0000\u017b\u017c\u0005\u0004\u0000\u0000\u017c+\u0001\u0000\u0000"+
		"\u0000\u017d\u017e\u0005,\u0000\u0000\u017e\u0180\u0005\u0003\u0000\u0000"+
		"\u017f\u0181\u0003.\u0017\u0000\u0180\u017f\u0001\u0000\u0000\u0000\u0181"+
		"\u0182\u0001\u0000\u0000\u0000\u0182\u0180\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000\u0000\u0184"+
		"\u0185\u0005\u0004\u0000\u0000\u0185-\u0001\u0000\u0000\u0000\u0186\u0187"+
		"\u0005\u0007\u0000\u0000\u0187\u0188\u0005-\u0000\u0000\u0188\u0189\u0005"+
		"\u0003\u0000\u0000\u0189\u018a\u0003h4\u0000\u018a\u018b\u0003N\'\u0000"+
		"\u018b\u018c\u0005\u0004\u0000\u0000\u018c/\u0001\u0000\u0000\u0000\u018d"+
		"\u018e\u0005.\u0000\u0000\u018e\u0190\u0005\u0003\u0000\u0000\u018f\u0191"+
		"\u00032\u0019\u0000\u0190\u018f\u0001\u0000\u0000\u0000\u0191\u0192\u0001"+
		"\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001"+
		"\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0195\u0005"+
		"\u0004\u0000\u0000\u01951\u0001\u0000\u0000\u0000\u0196\u0197\u0005\u0007"+
		"\u0000\u0000\u0197\u0198\u0005/\u0000\u0000\u0198\u0199\u0005\u0003\u0000"+
		"\u0000\u0199\u019a\u0003h4\u0000\u019a\u019b\u0003N\'\u0000\u019b\u019c"+
		"\u0005\u0004\u0000\u0000\u019c3\u0001\u0000\u0000\u0000\u019d\u019e\u0005"+
		"0\u0000\u0000\u019e\u01a0\u0005\u0003\u0000\u0000\u019f\u01a1\u00036\u001b"+
		"\u0000\u01a0\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005\u0004\u0000"+
		"\u0000\u01a55\u0001\u0000\u0000\u0000\u01a6\u01a7\u0005\u0007\u0000\u0000"+
		"\u01a7\u01a8\u00051\u0000\u0000\u01a8\u01a9\u0005\u0003\u0000\u0000\u01a9"+
		"\u01aa\u00038\u001c\u0000\u01aa\u01ab\u0005\u0004\u0000\u0000\u01ab7\u0001"+
		"\u0000\u0000\u0000\u01ac\u01af\u0003<\u001e\u0000\u01ad\u01af\u0003:\u001d"+
		"\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01ad\u0001\u0000\u0000"+
		"\u0000\u01af9\u0001\u0000\u0000\u0000\u01b0\u01b1\u00052\u0000\u0000\u01b1"+
		"\u01b2\u00053\u0000\u0000\u01b2\u01b3\u0003<\u001e\u0000\u01b3\u01b4\u0005"+
		"4\u0000\u0000\u01b4;\u0001\u0000\u0000\u0000\u01b5\u01bc\u0003>\u001f"+
		"\u0000\u01b6\u01bc\u0003@ \u0000\u01b7\u01bc\u0003B!\u0000\u01b8\u01bc"+
		"\u0003D\"\u0000\u01b9\u01bc\u0003F#\u0000\u01ba\u01bc\u0003H$\u0000\u01bb"+
		"\u01b5\u0001\u0000\u0000\u0000\u01bb\u01b6\u0001\u0000\u0000\u0000\u01bb"+
		"\u01b7\u0001\u0000\u0000\u0000\u01bb\u01b8\u0001\u0000\u0000\u0000\u01bb"+
		"\u01b9\u0001\u0000\u0000\u0000\u01bb\u01ba\u0001\u0000\u0000\u0000\u01bc"+
		"=\u0001\u0000\u0000\u0000\u01bd\u01be\u0003|>\u0000\u01be\u01bf\u0003"+
		"^/\u0000\u01bf\u01c0\u0003j5\u0000\u01c0?\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c2\u0003|>\u0000\u01c2\u01c3\u00055\u0000\u0000\u01c3\u01c5\u0003"+
		"j5\u0000\u01c4\u01c6\u0003\u008eG\u0000\u01c5\u01c4\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6A\u0001\u0000\u0000\u0000"+
		"\u01c7\u01c8\u0003|>\u0000\u01c8\u01c9\u00056\u0000\u0000\u01c9\u01cb"+
		"\u0003j5\u0000\u01ca\u01cc\u0003\u008aE\u0000\u01cb\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc\u01ce\u0001\u0000"+
		"\u0000\u0000\u01cd\u01cf\u0003\u008cF\u0000\u01ce\u01cd\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cfC\u0001\u0000\u0000\u0000"+
		"\u01d0\u01d1\u0003|>\u0000\u01d1\u01d2\u0003d2\u0000\u01d2E\u0001\u0000"+
		"\u0000\u0000\u01d3\u01d4\u0003|>\u0000\u01d4\u01d5\u00057\u0000\u0000"+
		"\u01d5\u01d8\u0003h4\u0000\u01d6\u01d9\u0003J%\u0000\u01d7\u01d9\u0003"+
		"L&\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d8\u01d7\u0001\u0000\u0000"+
		"\u0000\u01d9G\u0001\u0000\u0000\u0000\u01da\u01db\u0003|>\u0000\u01db"+
		"\u01dc\u00058\u0000\u0000\u01dc\u01df\u0003h4\u0000\u01dd\u01e0\u0003"+
		"J%\u0000\u01de\u01e0\u0003L&\u0000\u01df\u01dd\u0001\u0000\u0000\u0000"+
		"\u01df\u01de\u0001\u0000\u0000\u0000\u01e0I\u0001\u0000\u0000\u0000\u01e1"+
		"\u01e2\u0005\u0011\u0000\u0000\u01e2\u01e3\u00059\u0000\u0000\u01e3\u01e4"+
		"\u0005\u0013\u0000\u0000\u01e4\u01e5\u0003b1\u0000\u01e5\u01e6\u0003j"+
		"5\u0000\u01e6\u01e9\u0001\u0000\u0000\u0000\u01e7\u01e9\u0003d2\u0000"+
		"\u01e8\u01e1\u0001\u0000\u0000\u0000\u01e8\u01e7\u0001\u0000\u0000\u0000"+
		"\u01e9K\u0001\u0000\u0000\u0000\u01ea\u01eb\u00052\u0000\u0000\u01eb\u01ec"+
		"\u00053\u0000\u0000\u01ec\u01ed\u0003J%\u0000\u01ed\u01ee\u00054\u0000"+
		"\u0000\u01eeM\u0001\u0000\u0000\u0000\u01ef\u01f0\u0005\u0007\u0000\u0000"+
		"\u01f0\u01f1\u0005:\u0000\u0000\u01f1\u01f6\u0005\u0003\u0000\u0000\u01f2"+
		"\u01f7\u0003P(\u0000\u01f3\u01f7\u0003R)\u0000\u01f4\u01f7\u0003T*\u0000"+
		"\u01f5\u01f7\u0003V+\u0000\u01f6\u01f2\u0001\u0000\u0000\u0000\u01f6\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f5"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9"+
		"\u0005\u0004\u0000\u0000\u01f9O\u0001\u0000\u0000\u0000\u01fa\u01fb\u0003"+
		"x<\u0000\u01fb\u01fc\u0003j5\u0000\u01fc\u0202\u0001\u0000\u0000\u0000"+
		"\u01fd\u01fe\u0005\u0011\u0000\u0000\u01fe\u01ff\u0005;\u0000\u0000\u01ff"+
		"\u0200\u0005\u0013\u0000\u0000\u0200\u0202\u0003d2\u0000\u0201\u01fa\u0001"+
		"\u0000\u0000\u0000\u0201\u01fd\u0001\u0000\u0000\u0000\u0202Q\u0001\u0000"+
		"\u0000\u0000\u0203\u0204\u0003z=\u0000\u0204\u0206\u0003N\'\u0000\u0205"+
		"\u0207\u0003N\'\u0000\u0206\u0205\u0001\u0000\u0000\u0000\u0207\u0208"+
		"\u0001\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0001\u0000\u0000\u0000\u0209S\u0001\u0000\u0000\u0000\u020a\u020b\u0005"+
		"2\u0000\u0000\u020b\u020c\u00053\u0000\u0000\u020c\u020d\u0003P(\u0000"+
		"\u020d\u020e\u00054\u0000\u0000\u020eU\u0001\u0000\u0000\u0000\u020f\u0210"+
		"\u00052\u0000\u0000\u0210\u0211\u00053\u0000\u0000\u0211\u0212\u0003R"+
		")\u0000\u0212\u0213\u00054\u0000\u0000\u0213W\u0001\u0000\u0000\u0000"+
		"\u0214\u0215\u0007\u0002\u0000\u0000\u0215Y\u0001\u0000\u0000\u0000\u0216"+
		"\u0217\u0007\u0003\u0000\u0000\u0217[\u0001\u0000\u0000\u0000\u0218\u0219"+
		"\u0007\u0004\u0000\u0000\u0219]\u0001\u0000\u0000\u0000\u021a\u021b\u0007"+
		"\u0005\u0000\u0000\u021b_\u0001\u0000\u0000\u0000\u021c\u021d\u0007\u0006"+
		"\u0000\u0000\u021da\u0001\u0000\u0000\u0000\u021e\u021f\u0007\u0007\u0000"+
		"\u0000\u021fc\u0001\u0000\u0000\u0000\u0220\u0221\u0005V\u0000\u0000\u0221"+
		"e\u0001\u0000\u0000\u0000\u0222\u0223\u0007\b\u0000\u0000\u0223g\u0001"+
		"\u0000\u0000\u0000\u0224\u0225\u0005\u0011\u0000\u0000\u0225\u0226\u0005"+
		"\\\u0000\u0000\u0226\u0227\u0005\u0013\u0000\u0000\u0227\u0228\u0005m"+
		"\u0000\u0000\u0228i\u0001\u0000\u0000\u0000\u0229\u022a\u0005\u0011\u0000"+
		"\u0000\u022a\u022b\u0005\u001f\u0000\u0000\u022b\u022c\u0005\u0013\u0000"+
		"\u0000\u022c\u022d\u0007\t\u0000\u0000\u022dk\u0001\u0000\u0000\u0000"+
		"\u022e\u022f\u0005\u0011\u0000\u0000\u022f\u0230\u0005]\u0000\u0000\u0230"+
		"\u0231\u0005\u0013\u0000\u0000\u0231\u0232\u0005m\u0000\u0000\u0232m\u0001"+
		"\u0000\u0000\u0000\u0233\u0234\u0005\u0011\u0000\u0000\u0234\u0235\u0005"+
		"^\u0000\u0000\u0235\u0236\u0005\u0013\u0000\u0000\u0236\u0237\u0003X,"+
		"\u0000\u0237o\u0001\u0000\u0000\u0000\u0238\u0239\u0005\u0011\u0000\u0000"+
		"\u0239\u023a\u0005_\u0000\u0000\u023a\u023b\u0005\u0013\u0000\u0000\u023b"+
		"\u023c\u0003Z-\u0000\u023cq\u0001\u0000\u0000\u0000\u023d\u023e\u0005"+
		"\u0011\u0000\u0000\u023e\u023f\u0005`\u0000\u0000\u023f\u0240\u0005\u0013"+
		"\u0000\u0000\u0240\u0241\u0005m\u0000\u0000\u0241s\u0001\u0000\u0000\u0000"+
		"\u0242\u0243\u0005\u0011\u0000\u0000\u0243\u0244\u0005a\u0000\u0000\u0244"+
		"\u0245\u0005\u0013\u0000\u0000\u0245\u0246\u0005n\u0000\u0000\u0246u\u0001"+
		"\u0000\u0000\u0000\u0247\u0248\u0005\u0011\u0000\u0000\u0248\u0249\u0005"+
		"b\u0000\u0000\u0249\u024a\u0005\u0013\u0000\u0000\u024a\u024b\u0005n\u0000"+
		"\u0000\u024bw\u0001\u0000\u0000\u0000\u024c\u024d\u0005\u0011\u0000\u0000"+
		"\u024d\u024e\u0005;\u0000\u0000\u024e\u024f\u0005\u0013\u0000\u0000\u024f"+
		"\u0250\u0003\\.\u0000\u0250y\u0001\u0000\u0000\u0000\u0251\u0252\u0005"+
		"\u0011\u0000\u0000\u0252\u0253\u0005;\u0000\u0000\u0253\u0254\u0005\u0013"+
		"\u0000\u0000\u0254\u0255\u0003`0\u0000\u0255{\u0001\u0000\u0000\u0000"+
		"\u0256\u0257\u0005\u0011\u0000\u0000\u0257\u0258\u0005c\u0000\u0000\u0258"+
		"\u0259\u0005\u0013\u0000\u0000\u0259}\u0001\u0000\u0000\u0000\u025a\u025b"+
		"\u0005\u0011\u0000\u0000\u025b\u025c\u0005d\u0000\u0000\u025c\u025d\u0005"+
		"\u0013\u0000\u0000\u025d\u025e\u0005m\u0000\u0000\u025e\u007f\u0001\u0000"+
		"\u0000\u0000\u025f\u0260\u0005\u0011\u0000\u0000\u0260\u0261\u0005e\u0000"+
		"\u0000\u0261\u0262\u0005\u0013\u0000\u0000\u0262\u0263\u0003\n\u0005\u0000"+
		"\u0263\u0081\u0001\u0000\u0000\u0000\u0264\u0265\u0005\u0011\u0000\u0000"+
		"\u0265\u0266\u0005f\u0000\u0000\u0266\u0267\u0005\u0013\u0000\u0000\u0267"+
		"\u0268\u0005o\u0000\u0000\u0268\u0083\u0001\u0000\u0000\u0000\u0269\u026a"+
		"\u0005\u0011\u0000\u0000\u026a\u026b\u0005g\u0000\u0000\u026b\u026c\u0005"+
		"\u0013\u0000\u0000\u026c\u026d\u0005o\u0000\u0000\u026d\u0085\u0001\u0000"+
		"\u0000\u0000\u026e\u026f\u0005\u0011\u0000\u0000\u026f\u0270\u0005h\u0000"+
		"\u0000\u0270\u0271\u0005\u0013\u0000\u0000\u0271\u0272\u0003f3\u0000\u0272"+
		"\u0087\u0001\u0000\u0000\u0000\u0273\u0274\u0005\u0011\u0000\u0000\u0274"+
		"\u0275\u0005i\u0000\u0000\u0275\u0276\u0005\u0013\u0000\u0000\u0276\u0277"+
		"\u0005o\u0000\u0000\u0277\u0089\u0001\u0000\u0000\u0000\u0278\u0279\u0005"+
		"\u0011\u0000\u0000\u0279\u027a\u0005j\u0000\u0000\u027a\u027b\u0005\u0013"+
		"\u0000\u0000\u027b\u027c\u0005o\u0000\u0000\u027c\u008b\u0001\u0000\u0000"+
		"\u0000\u027d\u027e\u0005\u0011\u0000\u0000\u027e\u027f\u0005k\u0000\u0000"+
		"\u027f\u0280\u0005\u0013\u0000\u0000\u0280\u0281\u0005o\u0000\u0000\u0281"+
		"\u008d\u0001\u0000\u0000\u0000\u0282\u0283\u0005\u0011\u0000\u0000\u0283"+
		"\u0284\u0005l\u0000\u0000\u0284\u0285\u0005\u0013\u0000\u0000\u0285\u0286"+
		"\u0005o\u0000\u0000\u0286\u008f\u0001\u0000\u0000\u0000$\u0096\u00a4\u00a7"+
		"\u00aa\u00ad\u00b0\u00bb\u00be\u00c1\u00cb\u00ce\u00e3\u00e6\u00e9\u00f8"+
		"\u00fa\u0103\u010d\u0112\u011b\u0162\u0172\u0182\u0192\u01a2\u01ae\u01bb"+
		"\u01c5\u01cb\u01ce\u01d8\u01df\u01e8\u01f6\u0201\u0208";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}