package org.dmytro.demodsl.parser.old;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.dmytro.demodsl.dsl_parser.CompositeCondition;
import org.dmytro.demodsl.dsl_parser.Condition;
import org.dmytro.demodsl.dsl_parser.condition_emun.CompositeLogicalConditionType;
import org.dmytro.demodsl.dsl_parser.condition_emun.RequestConditionType;
import org.dmytro.demodsl.dsl_parser.SimpleCondition;
import org.dmytro.demodsl.parser.SyntaxErrorListener;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        String query = """
                QUERY_PARAMS {
                    ADD QUERY_PARAM {
                        SET NAME TO "USER_ID"
                        ADD CONDITION {
                            NOT (
                                SET REQUEST_CONDITION_TYPE TO "EQUALS"
                                SET VALUE TO "12345"
                            )
                        }
                        ADD CONDITION {
                            SET REQUEST_CONDITION_TYPE TO "MATCHES_REGEX"
                            SET VALUE TO "^[0-9]+$"
                        }
                        ADD CONDITION {
                            SET REQUEST_CONDITION_TYPE TO "AND"
                            ADD CONDITION {
                                SET REQUEST_CONDITION_TYPE TO "MATCHES_REGEX"пр
                                SET VALUE TO "^[0-9]+$"
                            }
                            ADD CONDITION {
                                NOT (
                                    SET REQUEST_CONDITION_TYPE TO "MATCHES_REGEX"
                                    SET VALUE TO "^[0-9]+$"
                                )
                            }
                        }
                    }
                    ADD QUERY_PARAM {
                        SET NAME TO "USER_NAME"
                        ADD CONDITION {
                            SET REQUEST_CONDITION_TYPE TO "EQUALS"
                            SET VALUE TO "12345"
                        }
                    }
                }
                """;


        QueryParamsLexer lexer = new QueryParamsLexer(CharStreams.fromString(query));
        lexer.removeErrorListeners();
        lexer.addErrorListener(new SyntaxErrorListener());

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QueryParamsParser parser = new QueryParamsParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new SyntaxErrorListener());

        // Викликаємо головне правило з граматики
        QueryParamsParser.QueryParamsContext context = parser.queryParams();

        List<QueryParamsParser.QueryParamContext> queryParamContexts = context.queryParam();

        queryParamContexts.forEach(queryParamContext -> {
            QueryParamsParser.SetNameCommandContext setNameContext = queryParamContext.setNameCommand();
            System.out.println("Set name :" + setNameContext.STRING().getText());
            List<QueryParamsParser.ConditionContext> conditionContexts = queryParamContext.condition();

            System.out.println("Conditions count: " + conditionContexts.size());
            conditionContexts.forEach(conditionContext -> {

                processConditionContextOld(conditionContext);
//                List<QueryParamsParser.Any_negated_conditionContext> anyNegatedConditionContexts = conditionContext.any_negated_condition();
//                anyNegatedConditionContexts.forEach(anyNegatedConditionContext -> {
//                    QueryParamsParser.Set_request_condition_typeContext requestConditionTypeContext = anyNegatedConditionContext.negated_simple_condition().simple_condition().set_request_condition_type();
//                    QueryParamsParser.Set_valueContext valueContext = anyNegatedConditionContext.negated_simple_condition().simple_condition().set_value();
//                    System.out.println("Request condition type :" + requestConditionTypeContext.STRING().getText());
//                    System.out.println("Value :" + valueContext.STRING().getText());
//                    anyNegatedConditionContext.negated_composite_condition().composite_condition().
//                });
                System.out.println("Condition :" + conditionContext.getText() + "\n");
            });

            System.out.println("Conditions NEW: " + conditionContexts.size());
            conditionContexts.forEach(conditionContext -> {
                List<Condition> conditions = processConditionContext(conditionContext);
                conditions.forEach(condition -> {
                    System.out.println("Condition: " + condition);
                });
            });
        });


//        System.out.println(queryParamContexts.toArray());

        System.out.println("Парсинг завершено: " + context.toStringTree(parser));
    }

    private static void processConditionContextOld(QueryParamsParser.ConditionContext conditionContext) {

        int childCount = conditionContext.getChildCount();
        System.out.println("Child count: " + childCount);

        List<QueryParamsParser.SimpleConditionContext> simpleConditionContexts = conditionContext.simpleCondition();
        List<QueryParamsParser.CompositeConditionContext> compositeConditionContexts = conditionContext.compositeCondition();
        List<QueryParamsParser.NegatedSimpleConditionContext> negatedSimpleConditionContexts = conditionContext.negatedSimpleCondition();
        List<QueryParamsParser.NegatedCompositeConditionContext> negatedCompositeConditionContexts = conditionContext.negatedCompositeCondition();

        simpleConditionContexts.forEach(simpleConditionContext -> {
            System.out.println("Simple condition: " + simpleConditionContext.getText());
        });

        compositeConditionContexts.forEach(compositeConditionContext -> {
            System.out.println("Composite condition: " + compositeConditionContext.getText());
        });

        negatedSimpleConditionContexts.forEach(negatedSimpleConditionContext -> {
            System.out.println("Negated simple condition: " + negatedSimpleConditionContext.getText());
        });

        negatedCompositeConditionContexts.forEach(negatedCompositeConditionContext -> {
            System.out.println("Negated composite condition: " + negatedCompositeConditionContext.getText());
        });
    }

    private static Condition processSimpleCondition(QueryParamsParser.SimpleConditionContext simpleConditionContext) {
        QueryParamsParser.SetRequestConditionTypeCommandContext requestConditionTypeContext = simpleConditionContext.setRequestConditionTypeCommand();
        QueryParamsParser.SetValueCommandContext valueContext = simpleConditionContext.setValueCommand();

        String requestConditionTypeStr = requestConditionTypeContext.STRING().getText().replace("\"", "");;
        RequestConditionType conditionType = RequestConditionType.valueOf(requestConditionTypeStr);
        String value = valueContext.STRING().getText();

        return null;
//        return new SimpleCondition(conditionType, value);
    }

    private static Condition processCompositeCondition(QueryParamsParser.CompositeConditionContext compositeConditionContext) {
        QueryParamsParser.SetRequestConditionTypeCommandContext requestConditionTypeContext = compositeConditionContext.setRequestConditionTypeCommand();
        String requestConditionTypeStr = requestConditionTypeContext.STRING().getText().replace("\"", "");;
        CompositeLogicalConditionType conditionType = CompositeLogicalConditionType.valueOf(requestConditionTypeStr);

        List<QueryParamsParser.ConditionContext> conditionContexts = compositeConditionContext.condition();
        List<Condition> subConditions = new ArrayList<>();
        conditionContexts.forEach(conditionContext -> {
            List<Condition> conditionList = processConditionContext(conditionContext);
            subConditions.addAll(conditionList);
        });

        CompositeCondition compositeCondition = new CompositeCondition(conditionType);
        compositeCondition.addAllSubConditions(subConditions);

        return compositeCondition;
    }

    private static Condition processNegatedSimpleCondition(QueryParamsParser.NegatedSimpleConditionContext negatedSimpleConditionContext) {
        QueryParamsParser.SimpleConditionContext simpleConditionContext = negatedSimpleConditionContext.simpleCondition();
        Condition condition = processSimpleCondition(simpleConditionContext);
        condition.setNegated(true);
        return condition;
    }

    private static Condition processNegatedCompositeCondition(QueryParamsParser.NegatedCompositeConditionContext negatedCompositeConditionContext) {
        QueryParamsParser.CompositeConditionContext compositeConditionContext = negatedCompositeConditionContext.compositeCondition();
        Condition condition = processCompositeCondition(compositeConditionContext);
        condition.setNegated(true);
        return condition;
    }

    private static List<Condition> processConditionContext(QueryParamsParser.ConditionContext conditionContext) {
        List<Condition> conditions = new ArrayList<>();

        List<QueryParamsParser.SimpleConditionContext> simpleConditionContexts = conditionContext.simpleCondition();
        List<QueryParamsParser.CompositeConditionContext> compositeConditionContexts = conditionContext.compositeCondition();
        List<QueryParamsParser.NegatedSimpleConditionContext> negatedSimpleConditionContexts = conditionContext.negatedSimpleCondition();
        List<QueryParamsParser.NegatedCompositeConditionContext> negatedCompositeConditionContexts = conditionContext.negatedCompositeCondition();

        List<Condition> simpleConditionList = simpleConditionContexts.stream().map(Main::processSimpleCondition).toList();
        List<Condition> compositeConditionList = compositeConditionContexts.stream().map(Main::processCompositeCondition).toList();
        List<Condition> negatedSimpleConditionList = negatedSimpleConditionContexts.stream().map(Main::processNegatedSimpleCondition).toList();
        List<Condition> negatedCompositeConditionList = negatedCompositeConditionContexts.stream().map(Main::processNegatedCompositeCondition).toList();

        conditions.addAll(simpleConditionList);
        conditions.addAll(compositeConditionList);
        conditions.addAll(negatedSimpleConditionList);
        conditions.addAll(negatedCompositeConditionList);

        return conditions;
    }
}
