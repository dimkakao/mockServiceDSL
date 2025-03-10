package org.dmytro.demodsl.parser.actual;


import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.dmytro.demodsl.dsl_parser.CompositeCondition;
import org.dmytro.demodsl.dsl_parser.Condition;
import org.dmytro.demodsl.dsl_parser.PresenceCondition;
import org.dmytro.demodsl.dsl_parser.condition_emun.CompositeLogicalConditionType;
import org.dmytro.demodsl.dsl_parser.condition_emun.PresenceLogicalConditionType;
import org.dmytro.demodsl.dsl_parser.condition_emun.RequestConditionType;
import org.dmytro.demodsl.dsl_parser.SimpleCondition;
import org.dmytro.demodsl.dsl_parser.condition_emun.SingleValueLogicalConditionType;
import org.dmytro.demodsl.parser.SyntaxErrorListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws Exception {
        String query = """
                DEFINE ENDPOINT {
                   \s
                    SET DESCRIPTION TO "Descrgffgiption"
                   \s
                    DEFINE REQUEST {
                   \s
                        SET METHOD TO POST
                       \s
                        SET URL_MATCH_TYPE TO PATH
                       \s
                        SET REQUEST_PATH TO "/api//users"
                       \s
                        SET PRIORITY TO 100
                       \s
                        QUERY_PARAMS {
                            ADD QUERY_PARAM_RULE {
                                SET NAME TO "USER_ID"
                                ADD CONDITION {
                                    SET REQUEST_CONDITION_TYPE TO AND
                                    ADD CONDITION {
                                        NOT (
                                            SET REQUEST_CONDITION_TYPE TO IS_PRESENT
                                        )
                                    }
                                    ADD CONDITION {
                                        NOT (
                                            SET REQUEST_CONDITION_TYPE TO MATCHES_REGEX
                                            SET VALUE TO "^[0-9]+$"
                                        )
                                    }
                                }
                            }
                            ADD QUERY_PARAM_RULE {
                                SET NAME TO "USER_XXX"
                                ADD CONDITION {
                                    NOT (
                                        SET REQUEST_CONDITION_TYPE TO MATCHES_REGEX
                                        SET VALUE TO "^[0-9]+$"
                                    )
                                }
                            }
                            ADD QUERY_PARAM_RULE {
                                SET NAME TO "USER_ID"
                                ADD CONDITION {
                                    NOT (
                                        SET REQUEST_CONDITION_TYPE TO AND
                                        ADD CONDITION {
                                            SET REQUEST_CONDITION_TYPE TO IS_PRESENT
                                        }
                                        ADD CONDITION {
                                            NOT (
                                                SET REQUEST_CONDITION_TYPE TO EQUALS
                                                SET VALUE TO "^[0-9]+$"
                                            )
                                        }
                                    )
                                }
                            }
                        }
                       \s
                        HEADERS {
                            ADD HEADER_RULE {
                                SET NAME TO "USER_XXX"
                                ADD CONDITION {
                                    NOT (
                                        SET REQUEST_CONDITION_TYPE TO MATCHES_REGEX
                                        SET VALUE TO "^[0-9]+$"
                                    )
                                }
                            }
                        }
                       \s
                        COOKIES {
                            ADD COOKIE_RULE {
                                SET NAME TO "USER_XXX"
                                ADD CONDITION {
                                    NOT (
                                        SET REQUEST_CONDITION_TYPE TO MATCHES_REGEX
                                        SET VALUE TO "^[0-9]+$"
                                    )
                                }
                            }
                        }
                       \s
                        FORM_PARAMS {
                            ADD FORM_PARAM_RULE {
                                SET NAME TO "USER_XXX"
                                ADD CONDITION {
                                    NOT (
                                        SET REQUEST_CONDITION_TYPE TO MATCHES_REGEX
                                        SET VALUE TO "^[0-9]+$"
                                    )
                                }
                            }
                        }
                       \s
                        REQUEST_BODY_RULES {
                            ADD REQUEST_BODY_RULE {
                                SET REQUEST_BODY_CONDITION_TYPE TO CONTAINS
                                SET VALUE TO "asas"
                            }
                            ADD REQUEST_BODY_RULE {
                                SET REQUEST_BODY_CONDITION_TYPE TO CONTAINS
                                SET VALUE TO "asas"
                            }
                        }
                       \s
                    }
                   \s
                    DEFINE RESPONSE {
                   \s
                  \s
                    }
                   \s
                                
                }
                """;


        DmytroMockDSLLexer lexer = new DmytroMockDSLLexer(CharStreams.fromString(query));
        lexer.removeErrorListeners();
        lexer.addErrorListener(new SyntaxErrorListener());

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DmytroMockDSLParser parser = new DmytroMockDSLParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new SyntaxErrorListener());

        // Викликаємо головне правило з граматики
        DmytroMockDSLParser.EndpointDefinitionRequestContext endpointDefinitionRequestContext = parser.endpointDefinitionRequest();

        DmytroMockDSLParser.RequestDefinitionContext requestDefinitionContext = endpointDefinitionRequestContext.requestDefinition();

        DmytroMockDSLParser.RequestQueryParamsContext requestQueryParamsContext = requestDefinitionContext.requestQueryParams();

        List<DmytroMockDSLParser.RequestQueryParamRuleContext> requestQueryParamRuleContexts = requestQueryParamsContext.requestQueryParamRule();

        requestQueryParamRuleContexts.forEach(requestQueryParamRuleContext -> {
            DmytroMockDSLParser.SetNameCommandContext setNameContext = requestQueryParamRuleContext.setNameCommand();
            System.out.println("Set name :" + setNameContext.STRING().getText());
            DmytroMockDSLParser.ConditionContext condition = requestQueryParamRuleContext.condition();
            processConditionContext(condition).forEach(System.out::println);

        });
    }

//    private static void processConditionContextOld(QueryParamsParser.ConditionContext conditionContext) {
//
//        int childCount = conditionContext.getChildCount();
//        System.out.println("Child count: " + childCount);
//
//        List<QueryParamsParser.SimpleConditionContext> simpleConditionContexts = conditionContext.simpleCondition();
//        List<QueryParamsParser.CompositeConditionContext> compositeConditionContexts = conditionContext.compositeCondition();
//        List<QueryParamsParser.NegatedSimpleConditionContext> negatedSimpleConditionContexts = conditionContext.negatedSimpleCondition();
//        List<QueryParamsParser.NegatedCompositeConditionContext> negatedCompositeConditionContexts = conditionContext.negatedCompositeCondition();
//
//        simpleConditionContexts.forEach(simpleConditionContext -> {
//            System.out.println("Simple condition: " + simpleConditionContext.getText());
//        });
//
//        compositeConditionContexts.forEach(compositeConditionContext -> {
//            System.out.println("Composite condition: " + compositeConditionContext.getText());
//        });
//
//        negatedSimpleConditionContexts.forEach(negatedSimpleConditionContext -> {
//            System.out.println("Negated simple condition: " + negatedSimpleConditionContext.getText());
//        });
//
//        negatedCompositeConditionContexts.forEach(negatedCompositeConditionContext -> {
//            System.out.println("Negated composite condition: " + negatedCompositeConditionContext.getText());
//        });
//    }

    private static Condition processSimpleCondition(DmytroMockDSLParser.SimpleConditionContext simpleConditionContext) {
        DmytroMockDSLParser.SetRequestSingleConditionTypeCommandContext setRequestSingleConditionTypeCommandContext = simpleConditionContext.setRequestSingleConditionTypeCommand();

        String requestConditionTypeStr = null;

        Optional<DmytroMockDSLParser.SetRequestSingleConditionTypeCommandContext> singleConditionTypeCommandContextOptional = Optional.ofNullable(setRequestSingleConditionTypeCommandContext);

        if (singleConditionTypeCommandContextOptional.isPresent()) {
            requestConditionTypeStr = setRequestSingleConditionTypeCommandContext
                    .requestValueConditionTypes()
                    .getText();
            DmytroMockDSLParser.SetValueCommandContext valueContext = simpleConditionContext.setValueCommand();
            SingleValueLogicalConditionType conditionType = SingleValueLogicalConditionType.valueOf(requestConditionTypeStr);
            String value = valueContext.STRING().getText();

            return new SimpleCondition(conditionType, value);

        } else {
            requestConditionTypeStr = simpleConditionContext.requestExistenceCondition().getText();
            PresenceLogicalConditionType conditionType = PresenceLogicalConditionType.valueOf(requestConditionTypeStr);
            return new PresenceCondition(conditionType);
        }


//        return new SimpleCondition(conditionType, value);
    }

    private static Condition processCompositeCondition(DmytroMockDSLParser.CompositeConditionContext compositeConditionContext) {

        DmytroMockDSLParser.SetRequestMultipleConditionTypeCommandContext setRequestMultipleConditionTypeCommandContext =
                compositeConditionContext.setRequestMultipleConditionTypeCommand();

        String requestConditionTypeStr = setRequestMultipleConditionTypeCommandContext.requestCompositeConditionTypes().getText();

        CompositeLogicalConditionType conditionType = CompositeLogicalConditionType.valueOf(requestConditionTypeStr);


        List<DmytroMockDSLParser.ConditionContext> conditionContexts = compositeConditionContext.condition();
        List<Condition> subConditions = new ArrayList<>();
        conditionContexts.forEach(conditionContext -> {
            List<Condition> conditionList = processConditionContext(conditionContext);
            subConditions.addAll(conditionList);
        });

        CompositeCondition compositeCondition = new CompositeCondition(conditionType);
        compositeCondition.addAllSubConditions(subConditions);

        return compositeCondition;
    }

    private static Condition processNegatedSimpleCondition(DmytroMockDSLParser.NegatedSimpleConditionContext negatedSimpleConditionContext) {
        DmytroMockDSLParser.SimpleConditionContext simpleConditionContext = negatedSimpleConditionContext.simpleCondition();
        Condition condition = processSimpleCondition(simpleConditionContext);
        condition.setNegated(true);
        return condition;
    }

    private static Condition processNegatedCompositeCondition(DmytroMockDSLParser.NegatedCompositeConditionContext negatedCompositeConditionContext) {
        DmytroMockDSLParser.CompositeConditionContext compositeConditionContext = negatedCompositeConditionContext.compositeCondition();
        Condition condition = processCompositeCondition(compositeConditionContext);
        condition.setNegated(true);
        return condition;
    }

    private static List<Condition> processConditionContext(DmytroMockDSLParser.ConditionContext conditionContext) {
        List<Condition> conditions = new ArrayList<>();

        List<DmytroMockDSLParser.SimpleConditionContext> simpleConditionContexts = conditionContext.simpleCondition();
        List<DmytroMockDSLParser.CompositeConditionContext> compositeConditionContexts = conditionContext.compositeCondition();
        List<DmytroMockDSLParser.NegatedSimpleConditionContext> negatedSimpleConditionContexts = conditionContext.negatedSimpleCondition();
        List<DmytroMockDSLParser.NegatedCompositeConditionContext> negatedCompositeConditionContexts = conditionContext.negatedCompositeCondition();

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
