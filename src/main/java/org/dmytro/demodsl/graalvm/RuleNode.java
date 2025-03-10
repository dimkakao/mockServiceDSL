//package org.dmytro.demodsl.graalvm;
//
//import com.oracle.truffle.api.nodes.Node;
//import org.graalvm.truffle.api.nodes.*;
//
//@NodeChild("left")
//@NodeChild("right")
//public abstract class RuleNode extends Node {
//    public abstract boolean execute();
//}
//
//public class ContainsRuleNode extends RuleNode {
//
//    @Child private ExpressionNode left;
//    @Child private ExpressionNode right;
//
//    public ContainsRuleNode(ExpressionNode left, ExpressionNode right) {
//        this.left = left;
//        this.right = right;
//    }
//
//    @Override
//    public boolean execute() {
//        String leftValue = left.execute();
//        String rightValue = right.execute();
//        return leftValue.contains(rightValue);
//    }
//}
//
