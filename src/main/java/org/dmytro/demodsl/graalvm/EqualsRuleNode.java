//package org.dmytro.demodsl.graalvm;
//
//import com.oracle.truffle.api.nodes.Node;
//
//public class EqualsRuleNode extends RuleNode {
//
//    @Child
//    private ExpressionNode left;
//    @Child private ExpressionNode right;
//
//    public EqualsRuleNode(ExpressionNode left, ExpressionNode right) {
//        this.left = left;
//        this.right = right;
//    }
//
//    @Override
//    public boolean execute() {
//        String leftValue = left.execute();
//        String rightValue = right.execute();
//        return leftValue.equals(rightValue);
//    }
//}
