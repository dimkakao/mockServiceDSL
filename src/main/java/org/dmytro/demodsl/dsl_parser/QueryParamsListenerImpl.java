//package org.dmytro.demodsl.dsl_parser;
//
//import org.dmytro.demodsl.parser.QueryParamsBaseListener;
//import org.dmytro.demodsl.parser.QueryParamsParser;
//
//import java.util.*;
//
//public class QueryParamsListenerImpl extends QueryParamsBaseListener {
//    private String queryName;
//    private List<Map<String, String>> conditions = new ArrayList<>();
//
//
//    @Override
//    public void enterSimple_condition(QueryParamsParser.Simple_conditionContext ctx) {
//        Map<String, String> condition = new HashMap<>();
//        condition.put("type", ctx.STRING(0).getText().replace("\"", ""));
//        condition.put("value", ctx.STRING(1).getText().replace("\"", ""));
//        conditions.add(condition);
//    }
//
//    @Override
//    public void enterNot_condition(QueryParamsParser.Not_conditionContext ctx) {
//        Map<String, String> condition = new HashMap<>();
//        condition.put("type", "NOT " + ctx.simple_condition().STRING(0).getText().replace("\"", ""));
//        condition.put("value", ctx.simple_condition().STRING(1).getText().replace("\"", ""));
//        conditions.add(condition);
//    }
//
//    public String getQueryName() {
//        return queryName;
//    }
//
//    public List<Map<String, String>> getConditions() {
//        return conditions;
//    }
//}
