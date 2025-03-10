package org.dmytro.demodsl.dsl_parser;

import java.util.*;

public class DSLParser {
    private String input;
    private int index = 0;

    public DSLParser(String input) {
        this.input = input;
    }

    public void parse() {
        while (index < input.length()) {
            if (match("QUERY_PARAMS")) {
                consumeBlock();
            } else {
                index++;
            }
        }
    }

    private void consumeBlock() {
        Stack<Character> stack = new Stack<>();
        int start = index;
        while (index < input.length()) {
            char c = input.charAt(index);
            if (c == '{') stack.push(c);
            if (c == '}') {
                stack.pop();
                if (stack.isEmpty()) break;
            }
            index++;
        }
        String block = input.substring(start, index + 1);
        System.out.println("Block: " + block);
    }

    private boolean match(String keyword) {
        if (input.startsWith(keyword, index)) {
            index += keyword.length();
            return true;
        }
        return false;
    }

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
            }
        }""";
        DSLParser parser = new DSLParser(input);
        parser.parse();
    }
}
