//package org.dmytro.demodsl.dsl_parser;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//
//public class QueryParamsParser {
//    private final String input;
//    private int index;
//
//    public QueryParamsParser(String input) {
//        this.input = input;
//        this.index = 0;
//    }
//
//    public QueryParams parse() {
//        QueryParams queryParams = new QueryParams();
//
////        consumeWhitespace();
////        if (match("QUERY_PARAMS")) {
////            consumeWhitespace();
////
////            if (match("{")) {
////                queryParams.setParams();
////            }
////        }
//
//        List<Condition> conditions = new ArrayList<>();
//        while (index < input.length()) {
//            if (match("QUERY_PARAMS")) {
//                consumeWhitespace();
//                if (match("{")) {
//                    conditions.addAll(parseQueryParams());
//                }
//            } else {
//                index++;
//            }
//        }
//        return queryParams;
//    }
//
//    private List<Condition> parseQueryParams() {
//        List<Condition> conditions = new ArrayList<>();
//        while (index < input.length()) {
//            consumeWhitespace();
//            if (match("ADD QUERY_PARAM")) {
//                consumeWhitespace();
//                if (match("{")) {
//                    conditions.add(parseQueryParam());
//                }
//            } else if (match("}")) {
//                return conditions;
//            } else {
//                index++;
//            }
//        }
//        return conditions;
//    }
//
//    private Condition parseQueryParam() {
//        String name = "";
//        List<Condition> conditions = new ArrayList<>();
//        while (index < input.length()) {
//            consumeWhitespace();
//            if (match("SET NAME TO")) {
//                name = parseString();
//            } else if (match("ADD CONDITION")) {
//                consumeWhitespace();
//                if (match("{")) {
//                    conditions.add(parseCondition());
//                }
//            } else if (match("}")) {
//                CompositeCondition composite = new CompositeCondition(RequestConditionType.AND);
//                composite.setSubConditions(conditions);
//                return composite;
//            } else {
//                index++;
//            }
//        }
//        return null;
//    }
//
//    private Condition parseCondition() {
//        boolean isNegated = false;
//        if (match("NOT")) {
//            consumeWhitespace();
//            if (match("(")) {
//                isNegated = true;
//            }
//        }
//        RequestConditionType type = null;
//        String value = null;
//        List<Condition> subConditions = new ArrayList<>();
//        while (index < input.length()) {
//            consumeWhitespace();
//            if (match("SET REQUEST_CONDITION_TYPE TO")) {
//                type = RequestConditionType.valueOf(parseString());
//            } else if (match("SET VALUE TO")) {
//                value = parseString();
//            } else if (match("ADD CONDITION")) {
//                consumeWhitespace();
//                if (match("{")) {
//                    subConditions.add(parseCondition());
//                }
//            } else if (match(")")) {
//                break;
//            } else if (match("}")) {
//                if (type != null && !subConditions.isEmpty()) {
//                    CompositeCondition composite = new CompositeCondition(type);
//                    composite.setNegated(isNegated);
//                    composite.setSubConditions(subConditions);
//                    return composite;
//                } else if (type != null && value != null) {
//                    SimpleCondition condition = new SimpleCondition(type, value);
//                    condition.setNegated(isNegated);
//                    return condition;
//                }
//            } else {
//                index++;
//            }
//        }
//        return null;
//    }
//
//    private String parseString() {
//        consumeWhitespace();
//        if (input.charAt(index) == '"') {
//            int start = ++index;
//            while (index < input.length() && input.charAt(index) != '"') {
//                index++;
//            }
//            return input.substring(start, index++);
//        }
//        return "";
//    }
//
//    private void consumeWhitespace() {
//        while (index < input.length() && Character.isWhitespace(input.charAt(index))) {
//            index++;
//        }
//    }
//
//    private boolean match(String keyword) {
//        if (input.startsWith(keyword, index)) {
//            index += keyword.length();
//            return true;
//        }
//        return false;
//    }
//}
