package org.dmytro.demodsl.util;

public class StringUtils {

    public static String indent(String input, int tabCount) {
        if (input == null || tabCount <= 0) {
            return input;
        }
        StringBuilder indentedString = new StringBuilder();
        String indent = " ".repeat(tabCount);

        for (String line : input.split("\n")) {
            indentedString.append(indent).append(line).append("\n");
        }

        return indentedString.toString().trim();
    }

    public static String indent(String input) {
       int tabCount = 4;
       return indent(input, tabCount);
    }
}
