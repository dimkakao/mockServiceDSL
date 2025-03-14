package org.dmytro.demodsl.service_visitors;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.lang3.ObjectUtils;
import org.dmytro.demodsl.custom_emun.condition_emun.CompositeLogicalConditionType;
import org.dmytro.demodsl.custom_emun.condition_emun.PresenceLogicalConditionType;
import org.dmytro.demodsl.custom_emun.condition_emun.SingleValueLogicalConditionType;
import org.dmytro.demodsl.entity.CompositeCondition;
import org.dmytro.demodsl.entity.Condition;
import org.dmytro.demodsl.entity.PresenceCondition;
import org.dmytro.demodsl.entity.SimpleCondition;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;
import org.dmytro.demodsl.util.ExceptionUtils;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

@Service
public class ConditionProcessingService {

    private static final String CONDITION_WITHOUT_TYPE_MESSAGE = "Attempt to process %s condition without condition type.";
    private static final String SIMPLE_CONDITION_WITHOUT_TYPE_MESSAGE = String.format(CONDITION_WITHOUT_TYPE_MESSAGE, "simple");
    private static final String COMPOSITE_CONDITION_WITHOUT_TYPE_MESSAGE = String.format(CONDITION_WITHOUT_TYPE_MESSAGE, "composite");

    public Condition processConditionContext(DmytroMockDSLParser.ConditionContext conditionContext) {
        if (ObjectUtils.isEmpty(conditionContext)) {
            throw ExceptionUtils.illegalArgument("Attempt to process empty condition.");
        }

        Condition result;

        DmytroMockDSLParser.SimpleConditionContext simpleConditionContext = conditionContext.simpleCondition();
        DmytroMockDSLParser.CompositeConditionContext compositeConditionContext = conditionContext.compositeCondition();
        DmytroMockDSLParser.NegatedSimpleConditionContext negatedSimpleConditionContext = conditionContext.negatedSimpleCondition();
        DmytroMockDSLParser.NegatedCompositeConditionContext negatedCompositeConditionContext = conditionContext.negatedCompositeCondition();
        if (ObjectUtils.isNotEmpty(simpleConditionContext)) {
            result = processSimpleCondition(simpleConditionContext);
        } else if (ObjectUtils.isNotEmpty(compositeConditionContext)) {
            result = processCompositeCondition(compositeConditionContext);
        } else if (ObjectUtils.isNotEmpty(negatedSimpleConditionContext)) {
            result = processNegatedSimpleCondition(negatedSimpleConditionContext);
        } else if (ObjectUtils.isNotEmpty(negatedCompositeConditionContext)) {
            result = processNegatedCompositeCondition(negatedCompositeConditionContext);
        } else {
            throw ExceptionUtils.illegalArgument("Attempt to process condition without information.");
        }
        return result;
    }

    private Condition processSimpleCondition(DmytroMockDSLParser.SimpleConditionContext simpleConditionContext) {
        if (ObjectUtils.isEmpty(simpleConditionContext)) {
            throw new IllegalArgumentException("Attempt to process empty simple condition.");
        }

        DmytroMockDSLParser.SetRequestSingleConditionTypeCommandContext setRequestSingleConditionTypeCommandContext
                = simpleConditionContext.setRequestSingleConditionTypeCommand();

        DmytroMockDSLParser.IsPresentConditionTypesContext presentConditionTypes
                = simpleConditionContext.isPresentConditionTypes();

        Condition result;

        if (ObjectUtils.isNotEmpty(setRequestSingleConditionTypeCommandContext)) {
            result = processSimpleConditionSingleValueLogicalType(
                    setRequestSingleConditionTypeCommandContext, simpleConditionContext.setValueCommand()
            );
        } else if (ObjectUtils.isNotEmpty(presentConditionTypes)) {
            result = processSimpleConditionPresentConditionLogicalType(presentConditionTypes);
        } else {
            throw ExceptionUtils.illegalArgument(SIMPLE_CONDITION_WITHOUT_TYPE_MESSAGE);
        }
        return result;
    }


    private Condition processSimpleConditionSingleValueLogicalType(
            DmytroMockDSLParser.SetRequestSingleConditionTypeCommandContext setRequestSingleConditionTypeCommandContext,
            DmytroMockDSLParser.SetValueCommandContext setValueCommandContext
    ) {
        String requestConditionTypeStr = Optional.ofNullable(setRequestSingleConditionTypeCommandContext)
                .map(DmytroMockDSLParser.SetRequestSingleConditionTypeCommandContext::requestValueConditionTypes)
                .map(RuleContext::getText)
                .filter(StringUtils::hasText)
                .orElseThrow(ExceptionUtils.illegalArgumentSupplier(SIMPLE_CONDITION_WITHOUT_TYPE_MESSAGE));

        SingleValueLogicalConditionType conditionType = SingleValueLogicalConditionType.valueOf(requestConditionTypeStr);

        String propertyValue = Optional.ofNullable(setValueCommandContext)
                .map(DmytroMockDSLParser.SetValueCommandContext::STRING)
                .map(ParseTree::getText)
                .map(value -> value.replaceFirst("^\"", "").replaceFirst("\"$", ""))
                .orElseThrow(ExceptionUtils.illegalArgumentSupplier("Attempt to process simple condition without propertyValue."));

        return new SimpleCondition(conditionType, propertyValue);
    }

    private Condition processSimpleConditionPresentConditionLogicalType(DmytroMockDSLParser.IsPresentConditionTypesContext presentConditionTypes) {
        String requestConditionTypeStr = Optional.ofNullable(presentConditionTypes)
                .map(DmytroMockDSLParser.IsPresentConditionTypesContext::getText)
                .orElseThrow(ExceptionUtils.illegalArgumentSupplier(SIMPLE_CONDITION_WITHOUT_TYPE_MESSAGE));
        PresenceLogicalConditionType conditionType = PresenceLogicalConditionType.valueOf(requestConditionTypeStr);
        return new PresenceCondition(conditionType);
    }

    private Condition processCompositeCondition(DmytroMockDSLParser.CompositeConditionContext compositeConditionContext) {
        if (ObjectUtils.isEmpty(compositeConditionContext)) {
            throw ExceptionUtils.illegalArgument("Attempt to process empty composite condition.");
        }

        String requestConditionTypeStr =
                Optional.ofNullable(compositeConditionContext.setRequestMultipleConditionTypeCommand())
                        .map(DmytroMockDSLParser.SetRequestMultipleConditionTypeCommandContext::requestCompositeConditionTypes)
                        .map(ParseTree::getText)
                        .filter(StringUtils::hasText)
                        .orElseThrow(ExceptionUtils.illegalArgumentSupplier(COMPOSITE_CONDITION_WITHOUT_TYPE_MESSAGE));

        CompositeLogicalConditionType conditionType = CompositeLogicalConditionType.valueOf(requestConditionTypeStr);

        List<DmytroMockDSLParser.ConditionContext> conditionContexts = compositeConditionContext.condition();

        if (ObjectUtils.isEmpty(conditionContexts)) {
            throw ExceptionUtils.illegalArgument("Attempt to process composite condition without sub conditions.");
        }

        List<Condition> subConditions = conditionContexts.stream()
                .map(this::processConditionContext)
                .toList();

        return new CompositeCondition(conditionType, subConditions);
    }

    private Condition processNegatedSimpleCondition(DmytroMockDSLParser.NegatedSimpleConditionContext negatedSimpleConditionContext) {
        Optional<Condition> processedSimpleConditionOptional = Optional.ofNullable(negatedSimpleConditionContext)
                .map(DmytroMockDSLParser.NegatedSimpleConditionContext::simpleCondition)
                .map(this::processSimpleCondition);
        return negateCondition(processedSimpleConditionOptional);
    }

    private Condition processNegatedCompositeCondition(DmytroMockDSLParser.NegatedCompositeConditionContext negatedCompositeConditionContext) {
        Optional<Condition> processedCompositeConditionOptional = Optional.ofNullable(negatedCompositeConditionContext)
                .map(DmytroMockDSLParser.NegatedCompositeConditionContext::compositeCondition)
                .map(this::processCompositeCondition);
        return negateCondition(processedCompositeConditionOptional);
    }

    @NonNull
    private Condition negateCondition(Optional<Condition> conditionOptional) {
        return conditionOptional.map(condition -> {
            condition.setNegated(true);
            return condition;
        }).orElseThrow(ExceptionUtils.illegalArgumentSupplier("Attempt to negate empty condition."));
    }
}
