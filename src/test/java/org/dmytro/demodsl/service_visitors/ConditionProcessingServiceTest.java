package org.dmytro.demodsl.service_visitors;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.dmytro.demodsl.custom_emun.condition_emun.SingleValueLogicalConditionType;
import org.dmytro.demodsl.entity.Condition;
import org.dmytro.demodsl.entity.SimpleCondition;
import org.dmytro.demodsl.parser.DmytroMockDSLParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ConditionProcessingServiceTest {

    @Test
    void whenCorrectSimpleCondition_processConditionContext_returnsValidSimpleCondition() {

        // Заглушка для загального ConditionContext
        DmytroMockDSLParser.ConditionContext conditionContext = mock(DmytroMockDSLParser.ConditionContext.class);

        // Заглушка для SimpleConditionContext
        DmytroMockDSLParser.SimpleConditionContext simpleConditionContext = mock(DmytroMockDSLParser.SimpleConditionContext.class);

        // Заглушка для команди встановлення типу умови
        DmytroMockDSLParser.SetRequestSingleConditionTypeCommandContext setRequestSingleConditionTypeCommandContext
                = mock(DmytroMockDSLParser.SetRequestSingleConditionTypeCommandContext.class);

        // Заглушка для типу умови
        DmytroMockDSLParser.RequestValueConditionTypesContext requestValueConditionTypesContext = mock(DmytroMockDSLParser.RequestValueConditionTypesContext.class);

        // Налаштування повернення значення EQUALS для getText() в типі умови
        when(requestValueConditionTypesContext.getText()).thenReturn("EQUALS");


        // Заглушка для SetValueCommandContext
        DmytroMockDSLParser.SetValueCommandContext setValueCommandContext = mock(DmytroMockDSLParser.SetValueCommandContext.class);
        // Мокаємо getText для STRING() в SetValueCommandContext
        TerminalNode terminalNode = mock(TerminalNode.class);
        when(terminalNode.getText()).thenReturn("testValue");
        when(setValueCommandContext.STRING()).thenReturn(terminalNode);

        // Встановлюємо моковані значення для інших методів
        when(conditionContext.simpleCondition()).thenReturn(simpleConditionContext);
        when(simpleConditionContext.setRequestSingleConditionTypeCommand()).thenReturn(setRequestSingleConditionTypeCommandContext);
        when(simpleConditionContext.setValueCommand()).thenReturn(setValueCommandContext);
        when(simpleConditionContext.setRequestSingleConditionTypeCommand()).thenReturn(setRequestSingleConditionTypeCommandContext);
        when(setRequestSingleConditionTypeCommandContext.requestValueConditionTypes()).thenReturn(requestValueConditionTypesContext);

        // Створюємо екземпляр Visitor та викликаємо метод
        ConditionProcessingService conditionProcessingService = new ConditionProcessingService();
        Condition result = conditionProcessingService.processConditionContext(conditionContext);

        // Перевірка результатів
        assertNotNull(result);
        assertInstanceOf(SimpleCondition.class, result);
        SimpleCondition simpleCondition = (SimpleCondition) result;
        assertEquals(SingleValueLogicalConditionType.EQUALS, simpleCondition.getRequestConditionType());
        assertEquals("testValue", simpleCondition.getValue());

        System.out.println("SimpleCondition: " + simpleCondition);
    }

}