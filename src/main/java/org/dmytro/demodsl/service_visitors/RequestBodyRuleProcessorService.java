package org.dmytro.demodsl.service_visitors;

import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.tuple.Pair;
import org.dmytro.demodsl.custom_emun.condition_emun.BodyMatchesJsonPathOrXPathLogicalConditionType;
import org.dmytro.demodsl.custom_emun.condition_emun.GeneralLogicalConditionType;
import org.dmytro.demodsl.entity.MockEndpointRequestDefinition;
import org.dmytro.demodsl.entity.request_body_rule.*;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;
import org.dmytro.demodsl.util.ExceptionUtils;
import org.dmytro.demodsl.util.QuadFunction;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class RequestBodyRuleProcessorService {

    private static final String CONDITION_WITHOUT_TYPE_MESSAGE = "Attempt to proces condition without condition type.";


    public void processRequestBodyRules(
            DmytroMockDSLParser.RequestDefinitionContext requestDefinitionContext,
            MockEndpointRequestDefinition mockEndpointRequestDefinition
    ) {
        if (ObjectUtils.anyNull(requestDefinitionContext, mockEndpointRequestDefinition)) {
            throw ExceptionUtils.illegalArgument("RequestDefinitionContext and MockEndpointRequestDefinition must not be null");
        }

        DmytroMockDSLParser.RequestBodyRulesContext requestBodyRulesContext = requestDefinitionContext.requestBodyRules();

        List<DmytroMockDSLParser.RequestBodyRuleContext> requestBodyRuleContexts = requestBodyRulesContext.requestBodyRule();

        List<RequestBodyRule> requestBodyRules = requestBodyRuleContexts.stream()
                .map(this::processRequestBodyRuleContext)
                .toList();

        mockEndpointRequestDefinition.setRequestBodyRules(requestBodyRules);
    }

    private RequestBodyRule processRequestBodyRuleContext(DmytroMockDSLParser.RequestBodyRuleContext requestBodyRuleContext) {
        String conditionType = requestBodyRuleContext.requestBodyRuleCondition().getText().toUpperCase();
        log.info("conditionType: " + conditionType);

        DmytroMockDSLParser.RequestBodyRuleConditionContext requestBodyRuleConditionContext = requestBodyRuleContext.requestBodyRuleCondition();

        DmytroMockDSLParser.GeneralRequestBodyRuleConditionContext generalRequestBodyRuleConditionContext =
                requestBodyRuleConditionContext.generalRequestBodyRuleCondition();

        DmytroMockDSLParser.NeagetedGeneralRequestBodyRuleConditionContext neagetedGeneralRequestBodyRuleConditionContext
                = requestBodyRuleConditionContext.neagetedGeneralRequestBodyRuleCondition();

        RequestBodyRule result = null;
        if (ObjectUtils.isNotEmpty(generalRequestBodyRuleConditionContext)) {
            result = processGeneralRequestBodyRuleConditionContext(generalRequestBodyRuleConditionContext);
        } else if (ObjectUtils.isNotEmpty(neagetedGeneralRequestBodyRuleConditionContext)) {
            result = processNegatedGeneralRequestBodyRuleConditionContext(neagetedGeneralRequestBodyRuleConditionContext);
        } else {
            throw ExceptionUtils.illegalArgument(CONDITION_WITHOUT_TYPE_MESSAGE);
        }
        return result;
    }

    private RequestBodyRule processGeneralRequestBodyRuleConditionContext(
            DmytroMockDSLParser.GeneralRequestBodyRuleConditionContext generalRequestBodyRuleConditionContext
    ) {
        RequestBodyRule result;
        if (ObjectUtils.isNotEmpty(generalRequestBodyRuleConditionContext.valueOnlyRequestBodyRuleCondition())) {
            result = processValueOnlyRequestBodyRuleCondition(generalRequestBodyRuleConditionContext.valueOnlyRequestBodyRuleCondition());
        } else if (ObjectUtils.isNotEmpty(generalRequestBodyRuleConditionContext.equalsXmlRequestBodyRuleCondition())) {
            result = processEqualsXmlRequestBodyRuleCondition(generalRequestBodyRuleConditionContext.equalsXmlRequestBodyRuleCondition());
        } else if (ObjectUtils.isNotEmpty(generalRequestBodyRuleConditionContext.equalsJsonRequestBodyRuleCondition())) {
            result = processEqualsJsonRequestBodyRuleCondition(generalRequestBodyRuleConditionContext.equalsJsonRequestBodyRuleCondition());
        } else if (ObjectUtils.isNotEmpty(generalRequestBodyRuleConditionContext.isPresentRequestBodyRuleCondition())) {
            result = processIsPresentRequestBodyRuleCondition(generalRequestBodyRuleConditionContext.isPresentRequestBodyRuleCondition());
        } else if (ObjectUtils.isNotEmpty(generalRequestBodyRuleConditionContext.matchesJsonPathRequestBodyRuleCondition())) {
            result = processMatchesJsonPathRequestBodyRuleCondition(generalRequestBodyRuleConditionContext.matchesJsonPathRequestBodyRuleCondition());
        } else if (ObjectUtils.isNotEmpty(generalRequestBodyRuleConditionContext.matchesXPathRequestBodyRuleCondition())) {
            result = processMatchesXPathRequestBodyRuleCondition(generalRequestBodyRuleConditionContext.matchesXPathRequestBodyRuleCondition());
        } else {
            throw ExceptionUtils.illegalArgument(CONDITION_WITHOUT_TYPE_MESSAGE);
        }
        return result;
    }

    private RequestBodyRule processNegatedGeneralRequestBodyRuleConditionContext(
            DmytroMockDSLParser.NeagetedGeneralRequestBodyRuleConditionContext neagetedGeneralRequestBodyRuleConditionContext
    ) {
        RequestBodyRule result = processGeneralRequestBodyRuleConditionContext(neagetedGeneralRequestBodyRuleConditionContext.generalRequestBodyRuleCondition());
        result.setNegated(true);
        return result;
    }

    private RequestBodyRule processValueOnlyRequestBodyRuleCondition(
            @NotNull DmytroMockDSLParser.ValueOnlyRequestBodyRuleConditionContext valueOnlyRequestBodyRuleConditionContext
    ) {
        GeneralLogicalConditionType conditionType = Optional.ofNullable(valueOnlyRequestBodyRuleConditionContext.genericConditionTypes())
                .map(ParseTree::getText)
                .filter(StringUtils::hasText)
                .map(String::toUpperCase)
                .map(GeneralLogicalConditionType::valueOf)
                .orElseThrow(ExceptionUtils.illegalArgumentSupplier("Attempt to process value only condition without condition type."));

        log.info("conditionType: " + conditionType);

        String value = getValueFromSetValueCommandContext(valueOnlyRequestBodyRuleConditionContext.setValueCommand());

        log.info("value: " + value);
        return new ValueOnlyRequestBodyRule(conditionType, value);
    }

    private RequestBodyRule processEqualsXmlRequestBodyRuleCondition(
            @NotNull DmytroMockDSLParser.EqualsXmlRequestBodyRuleConditionContext equalsXmlRequestBodyRuleCondition
    ) {
        String value = getValueFromSetValueCommandContext(equalsXmlRequestBodyRuleCondition.setValueCommand());

        Boolean isEnabledXmlUnitPlaceholders =
                processBooleanValueFromTerminalNode(
                        Optional.ofNullable(equalsXmlRequestBodyRuleCondition.setEnableXmlUnitPlaceholdersCommand())
                                .map(DmytroMockDSLParser.SetEnableXmlUnitPlaceholdersCommandContext::BOOLEAN)
                                .orElse(null)
                );

        return new EqualsXmlRequestBodyRule(value, isEnabledXmlUnitPlaceholders);
    }

    private RequestBodyRule processEqualsJsonRequestBodyRuleCondition(
            @NotNull DmytroMockDSLParser.EqualsJsonRequestBodyRuleConditionContext equalsJsonRequestBodyRuleCondition
    ) {
        String value = getValueFromSetValueCommandContext(equalsJsonRequestBodyRuleCondition.setValueCommand());

        Boolean isIgnoredArrayOrder =
                processBooleanValueFromTerminalNode(
                        Optional.ofNullable(equalsJsonRequestBodyRuleCondition.setIgnoreArrayOrderCommand())
                                .map(DmytroMockDSLParser.SetIgnoreArrayOrderCommandContext::BOOLEAN)
                                .orElse(null)
                );

        Boolean isEnabledXmlUnitPlaceholders =
                processBooleanValueFromTerminalNode(
                        Optional.ofNullable(equalsJsonRequestBodyRuleCondition.setIgnorExtraElementsCommand())
                                .map(DmytroMockDSLParser.SetIgnorExtraElementsCommandContext::BOOLEAN)
                                .orElse(null)
                );

        return new EqualsJsonRequestBodyRule(value, isIgnoredArrayOrder, isEnabledXmlUnitPlaceholders);
    }

    private Boolean processBooleanValueFromTerminalNode(TerminalNode booleanTerminalNode) {
        return Optional.ofNullable(booleanTerminalNode)
                .map(ParseTree::getText)
                .map(String::toUpperCase)
                .map(Boolean::valueOf)
                .orElse(Boolean.FALSE);
    }

    private RequestBodyRule processIsPresentRequestBodyRuleCondition(
            @NotNull DmytroMockDSLParser.IsPresentRequestBodyRuleConditionContext isPresentRequestBodyRuleConditionContext
    ) {
        return new PresenceRequestBodyRule();
    }

    private RequestBodyRule processMatchesXPathRequestBodyRuleCondition(
            @NotNull DmytroMockDSLParser.MatchesXPathRequestBodyRuleConditionContext matchesXPathRequestBodyRuleConditionContext
    ) {
        return processMatchesJsonPathRequestBodyRuleCondition(
                matchesXPathRequestBodyRuleConditionContext.setNameCommand(),
                matchesXPathRequestBodyRuleConditionContext.matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition(),
                matchesXPathRequestBodyRuleConditionContext.negatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition(),
                MatchesXPathRequestBodyRule::new
        );
    }

    private RequestBodyRule processMatchesJsonPathRequestBodyRuleCondition(
            @NotNull DmytroMockDSLParser.MatchesJsonPathRequestBodyRuleConditionContext matchesJsonPathRequestBodyRuleConditionContext
    ) {
        return processMatchesJsonPathRequestBodyRuleCondition(
                matchesJsonPathRequestBodyRuleConditionContext.setNameCommand(),
                matchesJsonPathRequestBodyRuleConditionContext.matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition(),
                matchesJsonPathRequestBodyRuleConditionContext.negatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition(),
                MatchesJsonPathRequestBodyRule::new
        );
//        DmytroMockDSLParser.MatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext innerConditionContext
//                = matchesJsonPathRequestBodyRuleConditionContext.matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition();
//
//        DmytroMockDSLParser.NegatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext negatedInnerConditionContext
//                = matchesJsonPathRequestBodyRuleConditionContext.negatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition();
//
//        DmytroMockDSLParser.MatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext innerConditionContextToProcess;
//
//        boolean isInnerConditionNegated = false;
//
//        if (ObjectUtils.isNotEmpty(innerConditionContext)) {
//            innerConditionContextToProcess = innerConditionContext;
//        } else if (ObjectUtils.isNotEmpty(negatedInnerConditionContext)) {
//            innerConditionContextToProcess = negatedInnerConditionContext.matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition();
//            isInnerConditionNegated = true;
//        } else {
//            throw ExceptionUtils.illegalArgument(CONDITION_WITHOUT_TYPE_MESSAGE);
//        }
//
//        Pair<BodyMatchesJsonPathOrXPathLogicalConditionType, String> innerConditionValueResolvedPair
//                = processMatchesJsonOrXPathInnerCondition(innerConditionContextToProcess);
//
//        String name = getNameFromSetNameCommandContext(matchesJsonPathRequestBodyRuleConditionContext.setNameCommand());
//        BodyMatchesJsonPathOrXPathLogicalConditionType innerConditionType = innerConditionValueResolvedPair.getLeft();
//        String value = innerConditionValueResolvedPair.getRight();
//
//        if (innerConditionType.equals(BodyMatchesJsonPathOrXPathLogicalConditionType.IS_PRESENT) && StringUtils.hasText(value)) {
//            throw ExceptionUtils.illegalArgument("Attempt to process isPresent inner condition with value.");
//        }
//
//
//        return new MatchesJsonPathRequestBodyRule(name, innerConditionType, value, isInnerConditionNegated);
    }

    private RequestBodyRule processMatchesJsonPathRequestBodyRuleCondition(
            DmytroMockDSLParser.SetNameCommandContext setNameCommand,
            DmytroMockDSLParser.MatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext innerConditionContext,
            DmytroMockDSLParser.NegatedMatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext negatedInnerConditionContext,
            QuadFunction<String, BodyMatchesJsonPathOrXPathLogicalConditionType, String, Boolean, RequestBodyRule> requestBodyRuleSupplier
    ) {
        DmytroMockDSLParser.MatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext innerConditionContextToProcess;

        Boolean isInnerConditionNegated = false;

        if (ObjectUtils.isNotEmpty(innerConditionContext)) {
            innerConditionContextToProcess = innerConditionContext;
        } else if (ObjectUtils.isNotEmpty(negatedInnerConditionContext)) {
            innerConditionContextToProcess = negatedInnerConditionContext.matchesJsonPathAndXPathRequestBodyRuleConditionInnerCondition();
            isInnerConditionNegated = true;
        } else {
            throw ExceptionUtils.illegalArgument(CONDITION_WITHOUT_TYPE_MESSAGE);
        }

        Pair<BodyMatchesJsonPathOrXPathLogicalConditionType, String> innerConditionValueResolvedPair
                = processMatchesJsonOrXPathInnerCondition(innerConditionContextToProcess);

        String name = getNameFromSetNameCommandContext(setNameCommand);
        BodyMatchesJsonPathOrXPathLogicalConditionType innerConditionType = innerConditionValueResolvedPair.getLeft();
        String value = innerConditionValueResolvedPair.getRight();

        if (innerConditionType.equals(BodyMatchesJsonPathOrXPathLogicalConditionType.IS_PRESENT) && StringUtils.hasText(value)) {
            throw ExceptionUtils.illegalArgument("Attempt to process isPresent inner condition with value.");
        }

        return requestBodyRuleSupplier.apply(name, innerConditionType, value, isInnerConditionNegated);
    }

    private Pair<BodyMatchesJsonPathOrXPathLogicalConditionType, String> processMatchesJsonOrXPathInnerCondition(
            @NotNull DmytroMockDSLParser.MatchesJsonPathAndXPathRequestBodyRuleConditionInnerConditionContext innerConditionContext
    ) {
        BodyMatchesJsonPathOrXPathLogicalConditionType condition
                = Optional.ofNullable(innerConditionContext.matchesJsonPathAndXPathConditionTypes())
                .map(ParseTree::getText)
                .filter(StringUtils::hasText)
                .map(BodyMatchesJsonPathOrXPathLogicalConditionType::valueOf)
                .orElseThrow(ExceptionUtils.illegalArgumentSupplier("Attempt to process inner condition without condition type."));

        String value = getValueFromSetValueCommandContext(innerConditionContext.setValueCommand());

        return Pair.of(condition, value);
    }

    private String getValueFromSetValueCommandContext(DmytroMockDSLParser.SetValueCommandContext setValueCommand) {
        Optional<TerminalNode> terminalStringNode = Optional.ofNullable(setValueCommand)
                .map(DmytroMockDSLParser.SetValueCommandContext::STRING);

        Optional<TerminalNode> terminalNumberNode = Optional.ofNullable(setValueCommand)
                .map(DmytroMockDSLParser.SetValueCommandContext::NUMBER);

        return terminalStringNode
                .or(() -> terminalNumberNode)
                .map(ParseTree::getText)
                .map(value -> value.replaceFirst("^\"", "").replaceFirst("\"$", ""))
                .orElseThrow(ExceptionUtils.illegalArgumentSupplier("Attempt to process value only condition without value."));
    }

    private String getNameFromSetNameCommandContext(DmytroMockDSLParser.SetNameCommandContext setNameCommand) {
        return Optional.ofNullable(setNameCommand)
                .map(DmytroMockDSLParser.SetNameCommandContext::STRING)
                .map(ParseTree::getText)
                .map(value -> value.replaceFirst("^\"", "").replaceFirst("\"$", ""))
                .orElseThrow(ExceptionUtils.illegalArgumentSupplier("Attempt to retrieve name value without content."));
    }

}