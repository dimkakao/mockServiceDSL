package org.dmytro.demodsl.dsl_parser;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = """
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
                            SET REQUEST_CONDITION_TYPE TO "MATCHES_REGEX" 
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
            } 
        """;

//        QueryParamsParser parser = new QueryParamsParser(input);
//        List<Condition> conditions = parser.parse();
//
//        // Додатковий код для виведення результатів парсингу
//        for (Condition condition : conditions) {
//            System.out.println(condition);
//        }
    }
}
