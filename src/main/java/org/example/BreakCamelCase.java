package org.example;

public class BreakCamelCase {

    public static String camelCase(String input) {

        StringBuilder builder = new StringBuilder();
        for (String w : input.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])")) {
            builder.append(w);
            builder.append(" ");
        }
        return builder.toString().trim();
    }
}
