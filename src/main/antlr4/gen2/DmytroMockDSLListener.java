// Generated from DmytroMockDSL.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DmytroMockDSLParser}.
 */
public interface DmytroMockDSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#endpointDefinitionRequest}.
	 * @param ctx the parse tree
	 */
	void enterEndpointDefinitionRequest(DmytroMockDSLParser.EndpointDefinitionRequestContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#endpointDefinitionRequest}.
	 * @param ctx the parse tree
	 */
	void exitEndpointDefinitionRequest(DmytroMockDSLParser.EndpointDefinitionRequestContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#requestDefinition}.
	 * @param ctx the parse tree
	 */
	void enterRequestDefinition(DmytroMockDSLParser.RequestDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#requestDefinition}.
	 * @param ctx the parse tree
	 */
	void exitRequestDefinition(DmytroMockDSLParser.RequestDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#responseDefinition}.
	 * @param ctx the parse tree
	 */
	void enterResponseDefinition(DmytroMockDSLParser.ResponseDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#responseDefinition}.
	 * @param ctx the parse tree
	 */
	void exitResponseDefinition(DmytroMockDSLParser.ResponseDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#directResponseDefinition}.
	 * @param ctx the parse tree
	 */
	void enterDirectResponseDefinition(DmytroMockDSLParser.DirectResponseDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#directResponseDefinition}.
	 * @param ctx the parse tree
	 */
	void exitDirectResponseDefinition(DmytroMockDSLParser.DirectResponseDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#setResponseBodyTypeCommand}.
	 * @param ctx the parse tree
	 */
	void enterSetResponseBodyTypeCommand(DmytroMockDSLParser.SetResponseBodyTypeCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#setResponseBodyTypeCommand}.
	 * @param ctx the parse tree
	 */
	void exitSetResponseBodyTypeCommand(DmytroMockDSLParser.SetResponseBodyTypeCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#responseBodyTypes}.
	 * @param ctx the parse tree
	 */
	void enterResponseBodyTypes(DmytroMockDSLParser.ResponseBodyTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#responseBodyTypes}.
	 * @param ctx the parse tree
	 */
	void exitResponseBodyTypes(DmytroMockDSLParser.ResponseBodyTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#setDynamicResponseTemplatingCommand}.
	 * @param ctx the parse tree
	 */
	void enterSetDynamicResponseTemplatingCommand(DmytroMockDSLParser.SetDynamicResponseTemplatingCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#setDynamicResponseTemplatingCommand}.
	 * @param ctx the parse tree
	 */
	void exitSetDynamicResponseTemplatingCommand(DmytroMockDSLParser.SetDynamicResponseTemplatingCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#setResponseStatusCodeCommand}.
	 * @param ctx the parse tree
	 */
	void enterSetResponseStatusCodeCommand(DmytroMockDSLParser.SetResponseStatusCodeCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#setResponseStatusCodeCommand}.
	 * @param ctx the parse tree
	 */
	void exitSetResponseStatusCodeCommand(DmytroMockDSLParser.SetResponseStatusCodeCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#faultResponseDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFaultResponseDefinition(DmytroMockDSLParser.FaultResponseDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#faultResponseDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFaultResponseDefinition(DmytroMockDSLParser.FaultResponseDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#setFaultTypeCommand}.
	 * @param ctx the parse tree
	 */
	void enterSetFaultTypeCommand(DmytroMockDSLParser.SetFaultTypeCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#setFaultTypeCommand}.
	 * @param ctx the parse tree
	 */
	void exitSetFaultTypeCommand(DmytroMockDSLParser.SetFaultTypeCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#faultTypes}.
	 * @param ctx the parse tree
	 */
	void enterFaultTypes(DmytroMockDSLParser.FaultTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#faultTypes}.
	 * @param ctx the parse tree
	 */
	void exitFaultTypes(DmytroMockDSLParser.FaultTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#proxyResponseDefinition}.
	 * @param ctx the parse tree
	 */
	void enterProxyResponseDefinition(DmytroMockDSLParser.ProxyResponseDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#proxyResponseDefinition}.
	 * @param ctx the parse tree
	 */
	void exitProxyResponseDefinition(DmytroMockDSLParser.ProxyResponseDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#setHostnameRewritingCommand}.
	 * @param ctx the parse tree
	 */
	void enterSetHostnameRewritingCommand(DmytroMockDSLParser.SetHostnameRewritingCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#setHostnameRewritingCommand}.
	 * @param ctx the parse tree
	 */
	void exitSetHostnameRewritingCommand(DmytroMockDSLParser.SetHostnameRewritingCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#setTemplatingCommand}.
	 * @param ctx the parse tree
	 */
	void enterSetTemplatingCommand(DmytroMockDSLParser.SetTemplatingCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#setTemplatingCommand}.
	 * @param ctx the parse tree
	 */
	void exitSetTemplatingCommand(DmytroMockDSLParser.SetTemplatingCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#responseDelay}.
	 * @param ctx the parse tree
	 */
	void enterResponseDelay(DmytroMockDSLParser.ResponseDelayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#responseDelay}.
	 * @param ctx the parse tree
	 */
	void exitResponseDelay(DmytroMockDSLParser.ResponseDelayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#responseWebHooks}.
	 * @param ctx the parse tree
	 */
	void enterResponseWebHooks(DmytroMockDSLParser.ResponseWebHooksContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#responseWebHooks}.
	 * @param ctx the parse tree
	 */
	void exitResponseWebHooks(DmytroMockDSLParser.ResponseWebHooksContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#webHookDefinition}.
	 * @param ctx the parse tree
	 */
	void enterWebHookDefinition(DmytroMockDSLParser.WebHookDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#webHookDefinition}.
	 * @param ctx the parse tree
	 */
	void exitWebHookDefinition(DmytroMockDSLParser.WebHookDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#responseHeaders}.
	 * @param ctx the parse tree
	 */
	void enterResponseHeaders(DmytroMockDSLParser.ResponseHeadersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#responseHeaders}.
	 * @param ctx the parse tree
	 */
	void exitResponseHeaders(DmytroMockDSLParser.ResponseHeadersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#responseHeader}.
	 * @param ctx the parse tree
	 */
	void enterResponseHeader(DmytroMockDSLParser.ResponseHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#responseHeader}.
	 * @param ctx the parse tree
	 */
	void exitResponseHeader(DmytroMockDSLParser.ResponseHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#setUrlCommand}.
	 * @param ctx the parse tree
	 */
	void enterSetUrlCommand(DmytroMockDSLParser.SetUrlCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#setUrlCommand}.
	 * @param ctx the parse tree
	 */
	void exitSetUrlCommand(DmytroMockDSLParser.SetUrlCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#timeUnits}.
	 * @param ctx the parse tree
	 */
	void enterTimeUnits(DmytroMockDSLParser.TimeUnitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#timeUnits}.
	 * @param ctx the parse tree
	 */
	void exitTimeUnits(DmytroMockDSLParser.TimeUnitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#noDelay}.
	 * @param ctx the parse tree
	 */
	void enterNoDelay(DmytroMockDSLParser.NoDelayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#noDelay}.
	 * @param ctx the parse tree
	 */
	void exitNoDelay(DmytroMockDSLParser.NoDelayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#fixedDelay}.
	 * @param ctx the parse tree
	 */
	void enterFixedDelay(DmytroMockDSLParser.FixedDelayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#fixedDelay}.
	 * @param ctx the parse tree
	 */
	void exitFixedDelay(DmytroMockDSLParser.FixedDelayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#randomUniformDelay}.
	 * @param ctx the parse tree
	 */
	void enterRandomUniformDelay(DmytroMockDSLParser.RandomUniformDelayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#randomUniformDelay}.
	 * @param ctx the parse tree
	 */
	void exitRandomUniformDelay(DmytroMockDSLParser.RandomUniformDelayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#randomLogNormalDelay}.
	 * @param ctx the parse tree
	 */
	void enterRandomLogNormalDelay(DmytroMockDSLParser.RandomLogNormalDelayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#randomLogNormalDelay}.
	 * @param ctx the parse tree
	 */
	void exitRandomLogNormalDelay(DmytroMockDSLParser.RandomLogNormalDelayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#chunkedDribbleDelay}.
	 * @param ctx the parse tree
	 */
	void enterChunkedDribbleDelay(DmytroMockDSLParser.ChunkedDribbleDelayContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#chunkedDribbleDelay}.
	 * @param ctx the parse tree
	 */
	void exitChunkedDribbleDelay(DmytroMockDSLParser.ChunkedDribbleDelayContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#setEndpointDescriptionCommand}.
	 * @param ctx the parse tree
	 */
	void enterSetEndpointDescriptionCommand(DmytroMockDSLParser.SetEndpointDescriptionCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#setEndpointDescriptionCommand}.
	 * @param ctx the parse tree
	 */
	void exitSetEndpointDescriptionCommand(DmytroMockDSLParser.SetEndpointDescriptionCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#setHttpMethodCommand}.
	 * @param ctx the parse tree
	 */
	void enterSetHttpMethodCommand(DmytroMockDSLParser.SetHttpMethodCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#setHttpMethodCommand}.
	 * @param ctx the parse tree
	 */
	void exitSetHttpMethodCommand(DmytroMockDSLParser.SetHttpMethodCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#setUrlMatchTypeCommand}.
	 * @param ctx the parse tree
	 */
	void enterSetUrlMatchTypeCommand(DmytroMockDSLParser.SetUrlMatchTypeCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#setUrlMatchTypeCommand}.
	 * @param ctx the parse tree
	 */
	void exitSetUrlMatchTypeCommand(DmytroMockDSLParser.SetUrlMatchTypeCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#setPathCommand}.
	 * @param ctx the parse tree
	 */
	void enterSetPathCommand(DmytroMockDSLParser.SetPathCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#setPathCommand}.
	 * @param ctx the parse tree
	 */
	void exitSetPathCommand(DmytroMockDSLParser.SetPathCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#setPriorityCommand}.
	 * @param ctx the parse tree
	 */
	void enterSetPriorityCommand(DmytroMockDSLParser.SetPriorityCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#setPriorityCommand}.
	 * @param ctx the parse tree
	 */
	void exitSetPriorityCommand(DmytroMockDSLParser.SetPriorityCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#requestQueryParams}.
	 * @param ctx the parse tree
	 */
	void enterRequestQueryParams(DmytroMockDSLParser.RequestQueryParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#requestQueryParams}.
	 * @param ctx the parse tree
	 */
	void exitRequestQueryParams(DmytroMockDSLParser.RequestQueryParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#requestQueryParamRule}.
	 * @param ctx the parse tree
	 */
	void enterRequestQueryParamRule(DmytroMockDSLParser.RequestQueryParamRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#requestQueryParamRule}.
	 * @param ctx the parse tree
	 */
	void exitRequestQueryParamRule(DmytroMockDSLParser.RequestQueryParamRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#requestHeaders}.
	 * @param ctx the parse tree
	 */
	void enterRequestHeaders(DmytroMockDSLParser.RequestHeadersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#requestHeaders}.
	 * @param ctx the parse tree
	 */
	void exitRequestHeaders(DmytroMockDSLParser.RequestHeadersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#requestHeaderRule}.
	 * @param ctx the parse tree
	 */
	void enterRequestHeaderRule(DmytroMockDSLParser.RequestHeaderRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#requestHeaderRule}.
	 * @param ctx the parse tree
	 */
	void exitRequestHeaderRule(DmytroMockDSLParser.RequestHeaderRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#requestCookies}.
	 * @param ctx the parse tree
	 */
	void enterRequestCookies(DmytroMockDSLParser.RequestCookiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#requestCookies}.
	 * @param ctx the parse tree
	 */
	void exitRequestCookies(DmytroMockDSLParser.RequestCookiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#requestCookieRule}.
	 * @param ctx the parse tree
	 */
	void enterRequestCookieRule(DmytroMockDSLParser.RequestCookieRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#requestCookieRule}.
	 * @param ctx the parse tree
	 */
	void exitRequestCookieRule(DmytroMockDSLParser.RequestCookieRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#requestFormParams}.
	 * @param ctx the parse tree
	 */
	void enterRequestFormParams(DmytroMockDSLParser.RequestFormParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#requestFormParams}.
	 * @param ctx the parse tree
	 */
	void exitRequestFormParams(DmytroMockDSLParser.RequestFormParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#requestFormParamRule}.
	 * @param ctx the parse tree
	 */
	void enterRequestFormParamRule(DmytroMockDSLParser.RequestFormParamRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#requestFormParamRule}.
	 * @param ctx the parse tree
	 */
	void exitRequestFormParamRule(DmytroMockDSLParser.RequestFormParamRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#requestBodyRules}.
	 * @param ctx the parse tree
	 */
	void enterRequestBodyRules(DmytroMockDSLParser.RequestBodyRulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#requestBodyRules}.
	 * @param ctx the parse tree
	 */
	void exitRequestBodyRules(DmytroMockDSLParser.RequestBodyRulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#requestBodyRule}.
	 * @param ctx the parse tree
	 */
	void enterRequestBodyRule(DmytroMockDSLParser.RequestBodyRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#requestBodyRule}.
	 * @param ctx the parse tree
	 */
	void exitRequestBodyRule(DmytroMockDSLParser.RequestBodyRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#requestBodyRuleCondition}.
	 * @param ctx the parse tree
	 */
	void enterRequestBodyRuleCondition(DmytroMockDSLParser.RequestBodyRuleConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#requestBodyRuleCondition}.
	 * @param ctx the parse tree
	 */
	void exitRequestBodyRuleCondition(DmytroMockDSLParser.RequestBodyRuleConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#neagetedGeneralRequestBodyRuleCondition}.
	 * @param ctx the parse tree
	 */
	void enterNeagetedGeneralRequestBodyRuleCondition(DmytroMockDSLParser.NeagetedGeneralRequestBodyRuleConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#neagetedGeneralRequestBodyRuleCondition}.
	 * @param ctx the parse tree
	 */
	void exitNeagetedGeneralRequestBodyRuleCondition(DmytroMockDSLParser.NeagetedGeneralRequestBodyRuleConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#generalRequestBodyRuleCondition}.
	 * @param ctx the parse tree
	 */
	void enterGeneralRequestBodyRuleCondition(DmytroMockDSLParser.GeneralRequestBodyRuleConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#generalRequestBodyRuleCondition}.
	 * @param ctx the parse tree
	 */
	void exitGeneralRequestBodyRuleCondition(DmytroMockDSLParser.GeneralRequestBodyRuleConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#valueOnlyRequestBodyRuleCondition}.
	 * @param ctx the parse tree
	 */
	void enterValueOnlyRequestBodyRuleCondition(DmytroMockDSLParser.ValueOnlyRequestBodyRuleConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#valueOnlyRequestBodyRuleCondition}.
	 * @param ctx the parse tree
	 */
	void exitValueOnlyRequestBodyRuleCondition(DmytroMockDSLParser.ValueOnlyRequestBodyRuleConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#equalsXmlRequestBodyRuleCondition}.
	 * @param ctx the parse tree
	 */
	void enterEqualsXmlRequestBodyRuleCondition(DmytroMockDSLParser.EqualsXmlRequestBodyRuleConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#equalsXmlRequestBodyRuleCondition}.
	 * @param ctx the parse tree
	 */
	void exitEqualsXmlRequestBodyRuleCondition(DmytroMockDSLParser.EqualsXmlRequestBodyRuleConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#equalsJsonRequestBodyRuleCondition}.
	 * @param ctx the parse tree
	 */
	void enterEqualsJsonRequestBodyRuleCondition(DmytroMockDSLParser.EqualsJsonRequestBodyRuleConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#equalsJsonRequestBodyRuleCondition}.
	 * @param ctx the parse tree
	 */
	void exitEqualsJsonRequestBodyRuleCondition(DmytroMockDSLParser.EqualsJsonRequestBodyRuleConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#isPresentRequestBodyRuleCondition}.
	 * @param ctx the parse tree
	 */
	void enterIsPresentRequestBodyRuleCondition(DmytroMockDSLParser.IsPresentRequestBodyRuleConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#isPresentRequestBodyRuleCondition}.
	 * @param ctx the parse tree
	 */
	void exitIsPresentRequestBodyRuleCondition(DmytroMockDSLParser.IsPresentRequestBodyRuleConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#matchesJsonPathRequestBodyRuleCondition}.
	 * @param ctx the parse tree
	 */
	void enterMatchesJsonPathRequestBodyRuleCondition(DmytroMockDSLParser.MatchesJsonPathRequestBodyRuleConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#matchesJsonPathRequestBodyRuleCondition}.
	 * @param ctx the parse tree
	 */
	void exitMatchesJsonPathRequestBodyRuleCondition(DmytroMockDSLParser.MatchesJsonPathRequestBodyRuleConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#matchesXPathRequestBodyRuleCondition}.
	 * @param ctx the parse tree
	 */
	void enterMatchesXPathRequestBodyRuleCondition(DmytroMockDSLParser.MatchesXPathRequestBodyRuleConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#matchesXPathRequestBodyRuleCondition}.
	 * @param ctx the parse tree
	 */
	void exitMatchesXPathRequestBodyRuleCondition(DmytroMockDSLParser.MatchesXPathRequestBodyRuleConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition}.
	 * @param ctx the parse tree
	 */
	void enterMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition(DmytroMockDSLParser.MatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition}.
	 * @param ctx the parse tree
	 */
	void exitMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition(DmytroMockDSLParser.MatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#negatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition}.
	 * @param ctx the parse tree
	 */
	void enterNegatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition(DmytroMockDSLParser.NegatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#negatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition}.
	 * @param ctx the parse tree
	 */
	void exitNegatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition(DmytroMockDSLParser.NegatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#setNameCommand}.
	 * @param ctx the parse tree
	 */
	void enterSetNameCommand(DmytroMockDSLParser.SetNameCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#setNameCommand}.
	 * @param ctx the parse tree
	 */
	void exitSetNameCommand(DmytroMockDSLParser.SetNameCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#setValueCommand}.
	 * @param ctx the parse tree
	 */
	void enterSetValueCommand(DmytroMockDSLParser.SetValueCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#setValueCommand}.
	 * @param ctx the parse tree
	 */
	void exitSetValueCommand(DmytroMockDSLParser.SetValueCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#setRequestSingleConditionTypeCommand}.
	 * @param ctx the parse tree
	 */
	void enterSetRequestSingleConditionTypeCommand(DmytroMockDSLParser.SetRequestSingleConditionTypeCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#setRequestSingleConditionTypeCommand}.
	 * @param ctx the parse tree
	 */
	void exitSetRequestSingleConditionTypeCommand(DmytroMockDSLParser.SetRequestSingleConditionTypeCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#setRequestMultipleConditionTypeCommand}.
	 * @param ctx the parse tree
	 */
	void enterSetRequestMultipleConditionTypeCommand(DmytroMockDSLParser.SetRequestMultipleConditionTypeCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#setRequestMultipleConditionTypeCommand}.
	 * @param ctx the parse tree
	 */
	void exitSetRequestMultipleConditionTypeCommand(DmytroMockDSLParser.SetRequestMultipleConditionTypeCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#setRequestBodyConditionTypeCommand}.
	 * @param ctx the parse tree
	 */
	void enterSetRequestBodyConditionTypeCommand(DmytroMockDSLParser.SetRequestBodyConditionTypeCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#setRequestBodyConditionTypeCommand}.
	 * @param ctx the parse tree
	 */
	void exitSetRequestBodyConditionTypeCommand(DmytroMockDSLParser.SetRequestBodyConditionTypeCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(DmytroMockDSLParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(DmytroMockDSLParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCondition(DmytroMockDSLParser.SimpleConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#simpleCondition}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCondition(DmytroMockDSLParser.SimpleConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#compositeCondition}.
	 * @param ctx the parse tree
	 */
	void enterCompositeCondition(DmytroMockDSLParser.CompositeConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#compositeCondition}.
	 * @param ctx the parse tree
	 */
	void exitCompositeCondition(DmytroMockDSLParser.CompositeConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#negatedSimpleCondition}.
	 * @param ctx the parse tree
	 */
	void enterNegatedSimpleCondition(DmytroMockDSLParser.NegatedSimpleConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#negatedSimpleCondition}.
	 * @param ctx the parse tree
	 */
	void exitNegatedSimpleCondition(DmytroMockDSLParser.NegatedSimpleConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#negatedCompositeCondition}.
	 * @param ctx the parse tree
	 */
	void enterNegatedCompositeCondition(DmytroMockDSLParser.NegatedCompositeConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#negatedCompositeCondition}.
	 * @param ctx the parse tree
	 */
	void exitNegatedCompositeCondition(DmytroMockDSLParser.NegatedCompositeConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#httpMethodTypes}.
	 * @param ctx the parse tree
	 */
	void enterHttpMethodTypes(DmytroMockDSLParser.HttpMethodTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#httpMethodTypes}.
	 * @param ctx the parse tree
	 */
	void exitHttpMethodTypes(DmytroMockDSLParser.HttpMethodTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#urlMatchTypes}.
	 * @param ctx the parse tree
	 */
	void enterUrlMatchTypes(DmytroMockDSLParser.UrlMatchTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#urlMatchTypes}.
	 * @param ctx the parse tree
	 */
	void exitUrlMatchTypes(DmytroMockDSLParser.UrlMatchTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#requestValueConditionTypes}.
	 * @param ctx the parse tree
	 */
	void enterRequestValueConditionTypes(DmytroMockDSLParser.RequestValueConditionTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#requestValueConditionTypes}.
	 * @param ctx the parse tree
	 */
	void exitRequestValueConditionTypes(DmytroMockDSLParser.RequestValueConditionTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#genericConditionTypes}.
	 * @param ctx the parse tree
	 */
	void enterGenericConditionTypes(DmytroMockDSLParser.GenericConditionTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#genericConditionTypes}.
	 * @param ctx the parse tree
	 */
	void exitGenericConditionTypes(DmytroMockDSLParser.GenericConditionTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#requestCompositeConditionTypes}.
	 * @param ctx the parse tree
	 */
	void enterRequestCompositeConditionTypes(DmytroMockDSLParser.RequestCompositeConditionTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#requestCompositeConditionTypes}.
	 * @param ctx the parse tree
	 */
	void exitRequestCompositeConditionTypes(DmytroMockDSLParser.RequestCompositeConditionTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#matchesJsonPathAndXPathConditionTypes}.
	 * @param ctx the parse tree
	 */
	void enterMatchesJsonPathAndXPathConditionTypes(DmytroMockDSLParser.MatchesJsonPathAndXPathConditionTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#matchesJsonPathAndXPathConditionTypes}.
	 * @param ctx the parse tree
	 */
	void exitMatchesJsonPathAndXPathConditionTypes(DmytroMockDSLParser.MatchesJsonPathAndXPathConditionTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DmytroMockDSLParser#isPresentConditionType}.
	 * @param ctx the parse tree
	 */
	void enterIsPresentConditionType(DmytroMockDSLParser.IsPresentConditionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DmytroMockDSLParser#isPresentConditionType}.
	 * @param ctx the parse tree
	 */
	void exitIsPresentConditionType(DmytroMockDSLParser.IsPresentConditionTypeContext ctx);
}