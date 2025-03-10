package org.dmytro.demodsl.parser.old;// Generated from QueryParams.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QueryParamsParser}.
 */
public interface QueryParamsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QueryParamsParser#queryParams}.
	 * @param ctx the parse tree
	 */
	void enterQueryParams(QueryParamsParser.QueryParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParamsParser#queryParams}.
	 * @param ctx the parse tree
	 */
	void exitQueryParams(QueryParamsParser.QueryParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParamsParser#queryParam}.
	 * @param ctx the parse tree
	 */
	void enterQueryParam(QueryParamsParser.QueryParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParamsParser#queryParam}.
	 * @param ctx the parse tree
	 */
	void exitQueryParam(QueryParamsParser.QueryParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParamsParser#setNameCommand}.
	 * @param ctx the parse tree
	 */
	void enterSetNameCommand(QueryParamsParser.SetNameCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParamsParser#setNameCommand}.
	 * @param ctx the parse tree
	 */
	void exitSetNameCommand(QueryParamsParser.SetNameCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParamsParser#setRequestConditionTypeCommand}.
	 * @param ctx the parse tree
	 */
	void enterSetRequestConditionTypeCommand(QueryParamsParser.SetRequestConditionTypeCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParamsParser#setRequestConditionTypeCommand}.
	 * @param ctx the parse tree
	 */
	void exitSetRequestConditionTypeCommand(QueryParamsParser.SetRequestConditionTypeCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParamsParser#setValueCommand}.
	 * @param ctx the parse tree
	 */
	void enterSetValueCommand(QueryParamsParser.SetValueCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParamsParser#setValueCommand}.
	 * @param ctx the parse tree
	 */
	void exitSetValueCommand(QueryParamsParser.SetValueCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParamsParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(QueryParamsParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParamsParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(QueryParamsParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParamsParser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCondition(QueryParamsParser.SimpleConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParamsParser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCondition(QueryParamsParser.SimpleConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParamsParser#compositeCondition}.
	 * @param ctx the parse tree
	 */
	void enterCompositeCondition(QueryParamsParser.CompositeConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParamsParser#compositeCondition}.
	 * @param ctx the parse tree
	 */
	void exitCompositeCondition(QueryParamsParser.CompositeConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParamsParser#negatedSimpleCondition}.
	 * @param ctx the parse tree
	 */
	void enterNegatedSimpleCondition(QueryParamsParser.NegatedSimpleConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParamsParser#negatedSimpleCondition}.
	 * @param ctx the parse tree
	 */
	void exitNegatedSimpleCondition(QueryParamsParser.NegatedSimpleConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParamsParser#negatedCompositeCondition}.
	 * @param ctx the parse tree
	 */
	void enterNegatedCompositeCondition(QueryParamsParser.NegatedCompositeConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParamsParser#negatedCompositeCondition}.
	 * @param ctx the parse tree
	 */
	void exitNegatedCompositeCondition(QueryParamsParser.NegatedCompositeConditionContext ctx);
}