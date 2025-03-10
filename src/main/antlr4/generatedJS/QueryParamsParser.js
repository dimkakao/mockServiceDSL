// Generated from QueryParams.g4 by ANTLR 4.13.2
// jshint ignore: start
import antlr4 from 'antlr4';
import QueryParamsListener from './QueryParamsListener.js';
const serializedATN = [4,1,16,89,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,
2,5,7,5,2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,1,0,1,0,1,0,4,0,24,8,0,11,0,12,0,
25,1,0,1,0,1,1,1,1,1,1,1,1,1,1,4,1,35,8,1,11,1,12,1,36,1,1,1,1,1,2,1,2,1,
2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,5,1,5,1,5,1,5,1,5,1,
5,1,5,4,5,63,8,5,11,5,12,5,64,1,5,1,5,1,6,1,6,1,6,1,7,1,7,1,7,4,7,75,8,7,
11,7,12,7,76,1,8,1,8,1,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,9,0,0,10,0,2,4,6,
8,10,12,14,16,18,0,0,85,0,20,1,0,0,0,2,29,1,0,0,0,4,40,1,0,0,0,6,45,1,0,
0,0,8,50,1,0,0,0,10,55,1,0,0,0,12,68,1,0,0,0,14,71,1,0,0,0,16,78,1,0,0,0,
18,83,1,0,0,0,20,21,5,1,0,0,21,23,5,2,0,0,22,24,3,2,1,0,23,22,1,0,0,0,24,
25,1,0,0,0,25,23,1,0,0,0,25,26,1,0,0,0,26,27,1,0,0,0,27,28,5,3,0,0,28,1,
1,0,0,0,29,30,5,4,0,0,30,31,5,5,0,0,31,32,5,2,0,0,32,34,3,4,2,0,33,35,3,
10,5,0,34,33,1,0,0,0,35,36,1,0,0,0,36,34,1,0,0,0,36,37,1,0,0,0,37,38,1,0,
0,0,38,39,5,3,0,0,39,3,1,0,0,0,40,41,5,6,0,0,41,42,5,7,0,0,42,43,5,8,0,0,
43,44,5,15,0,0,44,5,1,0,0,0,45,46,5,6,0,0,46,47,5,9,0,0,47,48,5,8,0,0,48,
49,5,15,0,0,49,7,1,0,0,0,50,51,5,6,0,0,51,52,5,10,0,0,52,53,5,8,0,0,53,54,
5,15,0,0,54,9,1,0,0,0,55,56,5,4,0,0,56,57,5,11,0,0,57,62,5,2,0,0,58,63,3,
12,6,0,59,63,3,14,7,0,60,63,3,16,8,0,61,63,3,18,9,0,62,58,1,0,0,0,62,59,
1,0,0,0,62,60,1,0,0,0,62,61,1,0,0,0,63,64,1,0,0,0,64,62,1,0,0,0,64,65,1,
0,0,0,65,66,1,0,0,0,66,67,5,3,0,0,67,11,1,0,0,0,68,69,3,6,3,0,69,70,3,8,
4,0,70,13,1,0,0,0,71,72,3,6,3,0,72,74,3,10,5,0,73,75,3,10,5,0,74,73,1,0,
0,0,75,76,1,0,0,0,76,74,1,0,0,0,76,77,1,0,0,0,77,15,1,0,0,0,78,79,5,12,0,
0,79,80,5,13,0,0,80,81,3,12,6,0,81,82,5,14,0,0,82,17,1,0,0,0,83,84,5,12,
0,0,84,85,5,13,0,0,85,86,3,14,7,0,86,87,5,14,0,0,87,19,1,0,0,0,5,25,36,62,
64,76];


const atn = new antlr4.atn.ATNDeserializer().deserialize(serializedATN);

const decisionsToDFA = atn.decisionToState.map( (ds, index) => new antlr4.dfa.DFA(ds, index) );

const sharedContextCache = new antlr4.atn.PredictionContextCache();

export default class QueryParamsParser extends antlr4.Parser {

    static grammarFileName = "QueryParams.g4";
    static literalNames = [ null, "'QUERY_PARAMS'", "'{'", "'}'", "'ADD'", 
                            "'QUERY_PARAM'", "'SET'", "'NAME'", "'TO'", 
                            "'REQUEST_CONDITION_TYPE'", "'VALUE'", "'CONDITION'", 
                            "'NOT'", "'('", "')'" ];
    static symbolicNames = [ null, null, null, null, null, null, null, null, 
                             null, null, null, null, null, null, null, "STRING", 
                             "WS" ];
    static ruleNames = [ "queryParams", "queryParam", "setNameCommand", 
                         "setRequestConditionTypeCommand", "setValueCommand", 
                         "condition", "simpleCondition", "compositeCondition", 
                         "negatedSimpleCondition", "negatedCompositeCondition" ];

    constructor(input) {
        super(input);
        this._interp = new antlr4.atn.ParserATNSimulator(this, atn, decisionsToDFA, sharedContextCache);
        this.ruleNames = QueryParamsParser.ruleNames;
        this.literalNames = QueryParamsParser.literalNames;
        this.symbolicNames = QueryParamsParser.symbolicNames;
    }



	queryParams() {
	    let localctx = new QueryParamsContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 0, QueryParamsParser.RULE_queryParams);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 20;
	        this.match(QueryParamsParser.T__0);
	        this.state = 21;
	        this.match(QueryParamsParser.T__1);
	        this.state = 23; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 22;
	            this.queryParam();
	            this.state = 25; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===4);
	        this.state = 27;
	        this.match(QueryParamsParser.T__2);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	queryParam() {
	    let localctx = new QueryParamContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 2, QueryParamsParser.RULE_queryParam);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 29;
	        this.match(QueryParamsParser.T__3);
	        this.state = 30;
	        this.match(QueryParamsParser.T__4);
	        this.state = 31;
	        this.match(QueryParamsParser.T__1);
	        this.state = 32;
	        this.setNameCommand();
	        this.state = 34; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 33;
	            this.condition();
	            this.state = 36; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===4);
	        this.state = 38;
	        this.match(QueryParamsParser.T__2);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	setNameCommand() {
	    let localctx = new SetNameCommandContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 4, QueryParamsParser.RULE_setNameCommand);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 40;
	        this.match(QueryParamsParser.T__5);
	        this.state = 41;
	        this.match(QueryParamsParser.T__6);
	        this.state = 42;
	        this.match(QueryParamsParser.T__7);
	        this.state = 43;
	        this.match(QueryParamsParser.STRING);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	setRequestConditionTypeCommand() {
	    let localctx = new SetRequestConditionTypeCommandContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 6, QueryParamsParser.RULE_setRequestConditionTypeCommand);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 45;
	        this.match(QueryParamsParser.T__5);
	        this.state = 46;
	        this.match(QueryParamsParser.T__8);
	        this.state = 47;
	        this.match(QueryParamsParser.T__7);
	        this.state = 48;
	        this.match(QueryParamsParser.STRING);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	setValueCommand() {
	    let localctx = new SetValueCommandContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 8, QueryParamsParser.RULE_setValueCommand);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 50;
	        this.match(QueryParamsParser.T__5);
	        this.state = 51;
	        this.match(QueryParamsParser.T__9);
	        this.state = 52;
	        this.match(QueryParamsParser.T__7);
	        this.state = 53;
	        this.match(QueryParamsParser.STRING);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	condition() {
	    let localctx = new ConditionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 10, QueryParamsParser.RULE_condition);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 55;
	        this.match(QueryParamsParser.T__3);
	        this.state = 56;
	        this.match(QueryParamsParser.T__10);
	        this.state = 57;
	        this.match(QueryParamsParser.T__1);
	        this.state = 62; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 62;
	            this._errHandler.sync(this);
	            var la_ = this._interp.adaptivePredict(this._input,2,this._ctx);
	            switch(la_) {
	            case 1:
	                this.state = 58;
	                this.simpleCondition();
	                break;

	            case 2:
	                this.state = 59;
	                this.compositeCondition();
	                break;

	            case 3:
	                this.state = 60;
	                this.negatedSimpleCondition();
	                break;

	            case 4:
	                this.state = 61;
	                this.negatedCompositeCondition();
	                break;

	            }
	            this.state = 64; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===6 || _la===12);
	        this.state = 66;
	        this.match(QueryParamsParser.T__2);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	simpleCondition() {
	    let localctx = new SimpleConditionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 12, QueryParamsParser.RULE_simpleCondition);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 68;
	        this.setRequestConditionTypeCommand();
	        this.state = 69;
	        this.setValueCommand();
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	compositeCondition() {
	    let localctx = new CompositeConditionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 14, QueryParamsParser.RULE_compositeCondition);
	    var _la = 0;
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 71;
	        this.setRequestConditionTypeCommand();
	        this.state = 72;
	        this.condition();
	        this.state = 74; 
	        this._errHandler.sync(this);
	        _la = this._input.LA(1);
	        do {
	            this.state = 73;
	            this.condition();
	            this.state = 76; 
	            this._errHandler.sync(this);
	            _la = this._input.LA(1);
	        } while(_la===4);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	negatedSimpleCondition() {
	    let localctx = new NegatedSimpleConditionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 16, QueryParamsParser.RULE_negatedSimpleCondition);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 78;
	        this.match(QueryParamsParser.T__11);
	        this.state = 79;
	        this.match(QueryParamsParser.T__12);
	        this.state = 80;
	        this.simpleCondition();
	        this.state = 81;
	        this.match(QueryParamsParser.T__13);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}



	negatedCompositeCondition() {
	    let localctx = new NegatedCompositeConditionContext(this, this._ctx, this.state);
	    this.enterRule(localctx, 18, QueryParamsParser.RULE_negatedCompositeCondition);
	    try {
	        this.enterOuterAlt(localctx, 1);
	        this.state = 83;
	        this.match(QueryParamsParser.T__11);
	        this.state = 84;
	        this.match(QueryParamsParser.T__12);
	        this.state = 85;
	        this.compositeCondition();
	        this.state = 86;
	        this.match(QueryParamsParser.T__13);
	    } catch (re) {
	    	if(re instanceof antlr4.error.RecognitionException) {
		        localctx.exception = re;
		        this._errHandler.reportError(this, re);
		        this._errHandler.recover(this, re);
		    } else {
		    	throw re;
		    }
	    } finally {
	        this.exitRule();
	    }
	    return localctx;
	}


}

QueryParamsParser.EOF = antlr4.Token.EOF;
QueryParamsParser.T__0 = 1;
QueryParamsParser.T__1 = 2;
QueryParamsParser.T__2 = 3;
QueryParamsParser.T__3 = 4;
QueryParamsParser.T__4 = 5;
QueryParamsParser.T__5 = 6;
QueryParamsParser.T__6 = 7;
QueryParamsParser.T__7 = 8;
QueryParamsParser.T__8 = 9;
QueryParamsParser.T__9 = 10;
QueryParamsParser.T__10 = 11;
QueryParamsParser.T__11 = 12;
QueryParamsParser.T__12 = 13;
QueryParamsParser.T__13 = 14;
QueryParamsParser.STRING = 15;
QueryParamsParser.WS = 16;

QueryParamsParser.RULE_queryParams = 0;
QueryParamsParser.RULE_queryParam = 1;
QueryParamsParser.RULE_setNameCommand = 2;
QueryParamsParser.RULE_setRequestConditionTypeCommand = 3;
QueryParamsParser.RULE_setValueCommand = 4;
QueryParamsParser.RULE_condition = 5;
QueryParamsParser.RULE_simpleCondition = 6;
QueryParamsParser.RULE_compositeCondition = 7;
QueryParamsParser.RULE_negatedSimpleCondition = 8;
QueryParamsParser.RULE_negatedCompositeCondition = 9;

class QueryParamsContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = QueryParamsParser.RULE_queryParams;
    }

	queryParam = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(QueryParamContext);
	    } else {
	        return this.getTypedRuleContext(QueryParamContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof QueryParamsListener ) {
	        listener.enterQueryParams(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof QueryParamsListener ) {
	        listener.exitQueryParams(this);
		}
	}


}



class QueryParamContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = QueryParamsParser.RULE_queryParam;
    }

	setNameCommand() {
	    return this.getTypedRuleContext(SetNameCommandContext,0);
	};

	condition = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ConditionContext);
	    } else {
	        return this.getTypedRuleContext(ConditionContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof QueryParamsListener ) {
	        listener.enterQueryParam(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof QueryParamsListener ) {
	        listener.exitQueryParam(this);
		}
	}


}



class SetNameCommandContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = QueryParamsParser.RULE_setNameCommand;
    }

	STRING() {
	    return this.getToken(QueryParamsParser.STRING, 0);
	};

	enterRule(listener) {
	    if(listener instanceof QueryParamsListener ) {
	        listener.enterSetNameCommand(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof QueryParamsListener ) {
	        listener.exitSetNameCommand(this);
		}
	}


}



class SetRequestConditionTypeCommandContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = QueryParamsParser.RULE_setRequestConditionTypeCommand;
    }

	STRING() {
	    return this.getToken(QueryParamsParser.STRING, 0);
	};

	enterRule(listener) {
	    if(listener instanceof QueryParamsListener ) {
	        listener.enterSetRequestConditionTypeCommand(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof QueryParamsListener ) {
	        listener.exitSetRequestConditionTypeCommand(this);
		}
	}


}



class SetValueCommandContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = QueryParamsParser.RULE_setValueCommand;
    }

	STRING() {
	    return this.getToken(QueryParamsParser.STRING, 0);
	};

	enterRule(listener) {
	    if(listener instanceof QueryParamsListener ) {
	        listener.enterSetValueCommand(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof QueryParamsListener ) {
	        listener.exitSetValueCommand(this);
		}
	}


}



class ConditionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = QueryParamsParser.RULE_condition;
    }

	simpleCondition = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(SimpleConditionContext);
	    } else {
	        return this.getTypedRuleContext(SimpleConditionContext,i);
	    }
	};

	compositeCondition = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(CompositeConditionContext);
	    } else {
	        return this.getTypedRuleContext(CompositeConditionContext,i);
	    }
	};

	negatedSimpleCondition = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(NegatedSimpleConditionContext);
	    } else {
	        return this.getTypedRuleContext(NegatedSimpleConditionContext,i);
	    }
	};

	negatedCompositeCondition = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(NegatedCompositeConditionContext);
	    } else {
	        return this.getTypedRuleContext(NegatedCompositeConditionContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof QueryParamsListener ) {
	        listener.enterCondition(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof QueryParamsListener ) {
	        listener.exitCondition(this);
		}
	}


}



class SimpleConditionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = QueryParamsParser.RULE_simpleCondition;
    }

	setRequestConditionTypeCommand() {
	    return this.getTypedRuleContext(SetRequestConditionTypeCommandContext,0);
	};

	setValueCommand() {
	    return this.getTypedRuleContext(SetValueCommandContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof QueryParamsListener ) {
	        listener.enterSimpleCondition(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof QueryParamsListener ) {
	        listener.exitSimpleCondition(this);
		}
	}


}



class CompositeConditionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = QueryParamsParser.RULE_compositeCondition;
    }

	setRequestConditionTypeCommand() {
	    return this.getTypedRuleContext(SetRequestConditionTypeCommandContext,0);
	};

	condition = function(i) {
	    if(i===undefined) {
	        i = null;
	    }
	    if(i===null) {
	        return this.getTypedRuleContexts(ConditionContext);
	    } else {
	        return this.getTypedRuleContext(ConditionContext,i);
	    }
	};

	enterRule(listener) {
	    if(listener instanceof QueryParamsListener ) {
	        listener.enterCompositeCondition(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof QueryParamsListener ) {
	        listener.exitCompositeCondition(this);
		}
	}


}



class NegatedSimpleConditionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = QueryParamsParser.RULE_negatedSimpleCondition;
    }

	simpleCondition() {
	    return this.getTypedRuleContext(SimpleConditionContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof QueryParamsListener ) {
	        listener.enterNegatedSimpleCondition(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof QueryParamsListener ) {
	        listener.exitNegatedSimpleCondition(this);
		}
	}


}



class NegatedCompositeConditionContext extends antlr4.ParserRuleContext {

    constructor(parser, parent, invokingState) {
        if(parent===undefined) {
            parent = null;
        }
        if(invokingState===undefined || invokingState===null) {
            invokingState = -1;
        }
        super(parent, invokingState);
        this.parser = parser;
        this.ruleIndex = QueryParamsParser.RULE_negatedCompositeCondition;
    }

	compositeCondition() {
	    return this.getTypedRuleContext(CompositeConditionContext,0);
	};

	enterRule(listener) {
	    if(listener instanceof QueryParamsListener ) {
	        listener.enterNegatedCompositeCondition(this);
		}
	}

	exitRule(listener) {
	    if(listener instanceof QueryParamsListener ) {
	        listener.exitNegatedCompositeCondition(this);
		}
	}


}




QueryParamsParser.QueryParamsContext = QueryParamsContext; 
QueryParamsParser.QueryParamContext = QueryParamContext; 
QueryParamsParser.SetNameCommandContext = SetNameCommandContext; 
QueryParamsParser.SetRequestConditionTypeCommandContext = SetRequestConditionTypeCommandContext; 
QueryParamsParser.SetValueCommandContext = SetValueCommandContext; 
QueryParamsParser.ConditionContext = ConditionContext; 
QueryParamsParser.SimpleConditionContext = SimpleConditionContext; 
QueryParamsParser.CompositeConditionContext = CompositeConditionContext; 
QueryParamsParser.NegatedSimpleConditionContext = NegatedSimpleConditionContext; 
QueryParamsParser.NegatedCompositeConditionContext = NegatedCompositeConditionContext; 
