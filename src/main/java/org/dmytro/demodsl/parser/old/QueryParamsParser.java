package org.dmytro.demodsl.parser.old;// Generated from QueryParams.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class QueryParamsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, STRING=15, WS=16;
	public static final int
		RULE_queryParams = 0, RULE_queryParam = 1, RULE_setNameCommand = 2, RULE_setRequestConditionTypeCommand = 3, 
		RULE_setValueCommand = 4, RULE_condition = 5, RULE_simpleCondition = 6, 
		RULE_compositeCondition = 7, RULE_negatedSimpleCondition = 8, RULE_negatedCompositeCondition = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"queryParams", "queryParam", "setNameCommand", "setRequestConditionTypeCommand", 
			"setValueCommand", "condition", "simpleCondition", "compositeCondition", 
			"negatedSimpleCondition", "negatedCompositeCondition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'QUERY_PARAMS'", "'{'", "'}'", "'ADD'", "'QUERY_PARAM'", "'SET'", 
			"'NAME'", "'TO'", "'REQUEST_CONDITION_TYPE'", "'VALUE'", "'CONDITION'", 
			"'NOT'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "STRING", "WS"
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
	public String getGrammarFileName() { return "QueryParams.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QueryParamsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryParamsContext extends ParserRuleContext {
		public List<QueryParamContext> queryParam() {
			return getRuleContexts(QueryParamContext.class);
		}
		public QueryParamContext queryParam(int i) {
			return getRuleContext(QueryParamContext.class,i);
		}
		public QueryParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParamsListener ) ((QueryParamsListener)listener).enterQueryParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParamsListener ) ((QueryParamsListener)listener).exitQueryParams(this);
		}
	}

	public final QueryParamsContext queryParams() throws RecognitionException {
		QueryParamsContext _localctx = new QueryParamsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_queryParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(21);
			match(T__1);
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				queryParam();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(27);
			match(T__2);
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
	public static class QueryParamContext extends ParserRuleContext {
		public SetNameCommandContext setNameCommand() {
			return getRuleContext(SetNameCommandContext.class,0);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public QueryParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParamsListener ) ((QueryParamsListener)listener).enterQueryParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParamsListener ) ((QueryParamsListener)listener).exitQueryParam(this);
		}
	}

	public final QueryParamContext queryParam() throws RecognitionException {
		QueryParamContext _localctx = new QueryParamContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_queryParam);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__3);
			setState(30);
			match(T__4);
			setState(31);
			match(T__1);
			setState(32);
			setNameCommand();
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				condition();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(38);
			match(T__2);
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
		public TerminalNode STRING() { return getToken(QueryParamsParser.STRING, 0); }
		public SetNameCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setNameCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParamsListener ) ((QueryParamsListener)listener).enterSetNameCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParamsListener ) ((QueryParamsListener)listener).exitSetNameCommand(this);
		}
	}

	public final SetNameCommandContext setNameCommand() throws RecognitionException {
		SetNameCommandContext _localctx = new SetNameCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_setNameCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__5);
			setState(41);
			match(T__6);
			setState(42);
			match(T__7);
			setState(43);
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
	public static class SetRequestConditionTypeCommandContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(QueryParamsParser.STRING, 0); }
		public SetRequestConditionTypeCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setRequestConditionTypeCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParamsListener ) ((QueryParamsListener)listener).enterSetRequestConditionTypeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParamsListener ) ((QueryParamsListener)listener).exitSetRequestConditionTypeCommand(this);
		}
	}

	public final SetRequestConditionTypeCommandContext setRequestConditionTypeCommand() throws RecognitionException {
		SetRequestConditionTypeCommandContext _localctx = new SetRequestConditionTypeCommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_setRequestConditionTypeCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__5);
			setState(46);
			match(T__8);
			setState(47);
			match(T__7);
			setState(48);
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
		public TerminalNode STRING() { return getToken(QueryParamsParser.STRING, 0); }
		public SetValueCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setValueCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParamsListener ) ((QueryParamsListener)listener).enterSetValueCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParamsListener ) ((QueryParamsListener)listener).exitSetValueCommand(this);
		}
	}

	public final SetValueCommandContext setValueCommand() throws RecognitionException {
		SetValueCommandContext _localctx = new SetValueCommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_setValueCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__5);
			setState(51);
			match(T__9);
			setState(52);
			match(T__7);
			setState(53);
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
	public static class ConditionContext extends ParserRuleContext {
		public List<SimpleConditionContext> simpleCondition() {
			return getRuleContexts(SimpleConditionContext.class);
		}
		public SimpleConditionContext simpleCondition(int i) {
			return getRuleContext(SimpleConditionContext.class,i);
		}
		public List<CompositeConditionContext> compositeCondition() {
			return getRuleContexts(CompositeConditionContext.class);
		}
		public CompositeConditionContext compositeCondition(int i) {
			return getRuleContext(CompositeConditionContext.class,i);
		}
		public List<NegatedSimpleConditionContext> negatedSimpleCondition() {
			return getRuleContexts(NegatedSimpleConditionContext.class);
		}
		public NegatedSimpleConditionContext negatedSimpleCondition(int i) {
			return getRuleContext(NegatedSimpleConditionContext.class,i);
		}
		public List<NegatedCompositeConditionContext> negatedCompositeCondition() {
			return getRuleContexts(NegatedCompositeConditionContext.class);
		}
		public NegatedCompositeConditionContext negatedCompositeCondition(int i) {
			return getRuleContext(NegatedCompositeConditionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParamsListener ) ((QueryParamsListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParamsListener ) ((QueryParamsListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__3);
			setState(56);
			match(T__10);
			setState(57);
			match(T__1);
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(62);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(58);
					simpleCondition();
					}
					break;
				case 2:
					{
					setState(59);
					compositeCondition();
					}
					break;
				case 3:
					{
					setState(60);
					negatedSimpleCondition();
					}
					break;
				case 4:
					{
					setState(61);
					negatedCompositeCondition();
					}
					break;
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 || _la==T__11 );
			setState(66);
			match(T__2);
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
		public SetRequestConditionTypeCommandContext setRequestConditionTypeCommand() {
			return getRuleContext(SetRequestConditionTypeCommandContext.class,0);
		}
		public SetValueCommandContext setValueCommand() {
			return getRuleContext(SetValueCommandContext.class,0);
		}
		public SimpleConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParamsListener ) ((QueryParamsListener)listener).enterSimpleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParamsListener ) ((QueryParamsListener)listener).exitSimpleCondition(this);
		}
	}

	public final SimpleConditionContext simpleCondition() throws RecognitionException {
		SimpleConditionContext _localctx = new SimpleConditionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_simpleCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			setRequestConditionTypeCommand();
			setState(69);
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
	public static class CompositeConditionContext extends ParserRuleContext {
		public SetRequestConditionTypeCommandContext setRequestConditionTypeCommand() {
			return getRuleContext(SetRequestConditionTypeCommandContext.class,0);
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
			if ( listener instanceof QueryParamsListener ) ((QueryParamsListener)listener).enterCompositeCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParamsListener ) ((QueryParamsListener)listener).exitCompositeCondition(this);
		}
	}

	public final CompositeConditionContext compositeCondition() throws RecognitionException {
		CompositeConditionContext _localctx = new CompositeConditionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compositeCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			setRequestConditionTypeCommand();
			setState(72);
			condition();
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				condition();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
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
			if ( listener instanceof QueryParamsListener ) ((QueryParamsListener)listener).enterNegatedSimpleCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParamsListener ) ((QueryParamsListener)listener).exitNegatedSimpleCondition(this);
		}
	}

	public final NegatedSimpleConditionContext negatedSimpleCondition() throws RecognitionException {
		NegatedSimpleConditionContext _localctx = new NegatedSimpleConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_negatedSimpleCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__11);
			setState(79);
			match(T__12);
			setState(80);
			simpleCondition();
			setState(81);
			match(T__13);
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
			if ( listener instanceof QueryParamsListener ) ((QueryParamsListener)listener).enterNegatedCompositeCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QueryParamsListener ) ((QueryParamsListener)listener).exitNegatedCompositeCondition(this);
		}
	}

	public final NegatedCompositeConditionContext negatedCompositeCondition() throws RecognitionException {
		NegatedCompositeConditionContext _localctx = new NegatedCompositeConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_negatedCompositeCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(T__11);
			setState(84);
			match(T__12);
			setState(85);
			compositeCondition();
			setState(86);
			match(T__13);
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
		"\u0004\u0001\u0010Y\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000"+
		"\u0018\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001#\b"+
		"\u0001\u000b\u0001\f\u0001$\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0004\u0005?\b\u0005\u000b\u0005\f\u0005"+
		"@\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0004\u0007K\b\u0007\u000b\u0007\f\u0007L\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0000\u0000U\u0000\u0014\u0001\u0000\u0000\u0000\u0002\u001d\u0001\u0000"+
		"\u0000\u0000\u0004(\u0001\u0000\u0000\u0000\u0006-\u0001\u0000\u0000\u0000"+
		"\b2\u0001\u0000\u0000\u0000\n7\u0001\u0000\u0000\u0000\fD\u0001\u0000"+
		"\u0000\u0000\u000eG\u0001\u0000\u0000\u0000\u0010N\u0001\u0000\u0000\u0000"+
		"\u0012S\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0001\u0000\u0000\u0015"+
		"\u0017\u0005\u0002\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000\u0017"+
		"\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019"+
		"\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0003\u0000\u0000\u001c"+
		"\u0001\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0004\u0000\u0000\u001e"+
		"\u001f\u0005\u0005\u0000\u0000\u001f \u0005\u0002\u0000\u0000 \"\u0003"+
		"\u0004\u0002\u0000!#\u0003\n\u0005\u0000\"!\u0001\u0000\u0000\u0000#$"+
		"\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&\'\u0005\u0003\u0000\u0000\'\u0003\u0001"+
		"\u0000\u0000\u0000()\u0005\u0006\u0000\u0000)*\u0005\u0007\u0000\u0000"+
		"*+\u0005\b\u0000\u0000+,\u0005\u000f\u0000\u0000,\u0005\u0001\u0000\u0000"+
		"\u0000-.\u0005\u0006\u0000\u0000./\u0005\t\u0000\u0000/0\u0005\b\u0000"+
		"\u000001\u0005\u000f\u0000\u00001\u0007\u0001\u0000\u0000\u000023\u0005"+
		"\u0006\u0000\u000034\u0005\n\u0000\u000045\u0005\b\u0000\u000056\u0005"+
		"\u000f\u0000\u00006\t\u0001\u0000\u0000\u000078\u0005\u0004\u0000\u0000"+
		"89\u0005\u000b\u0000\u00009>\u0005\u0002\u0000\u0000:?\u0003\f\u0006\u0000"+
		";?\u0003\u000e\u0007\u0000<?\u0003\u0010\b\u0000=?\u0003\u0012\t\u0000"+
		">:\u0001\u0000\u0000\u0000>;\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000>=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000@A\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0005"+
		"\u0003\u0000\u0000C\u000b\u0001\u0000\u0000\u0000DE\u0003\u0006\u0003"+
		"\u0000EF\u0003\b\u0004\u0000F\r\u0001\u0000\u0000\u0000GH\u0003\u0006"+
		"\u0003\u0000HJ\u0003\n\u0005\u0000IK\u0003\n\u0005\u0000JI\u0001\u0000"+
		"\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001"+
		"\u0000\u0000\u0000M\u000f\u0001\u0000\u0000\u0000NO\u0005\f\u0000\u0000"+
		"OP\u0005\r\u0000\u0000PQ\u0003\f\u0006\u0000QR\u0005\u000e\u0000\u0000"+
		"R\u0011\u0001\u0000\u0000\u0000ST\u0005\f\u0000\u0000TU\u0005\r\u0000"+
		"\u0000UV\u0003\u000e\u0007\u0000VW\u0005\u000e\u0000\u0000W\u0013\u0001"+
		"\u0000\u0000\u0000\u0005\u0019$>@L";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}