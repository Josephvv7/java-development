package com.pluralsight;

public class NameFormatter {

    private NameFormatter() {}

    public static String format(String firstName, String lastName) {

    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        StringBuilder builder = new StringBuilder();

        builder.append(lastName).append(", ");

        if (!prefix.isEmpty()) {
            builder.append(prefix).append(" ");
        }

        builder.append(firstName);

        if (!middleName.isEmpty()){
            builder.append(" ").append(middleName);
        }

        if (!suffix.isEmpty()) {
            builder.append(", ").append(suffix);
        }

        return builder.toString();
    }

    public static String format(String fullName) {

    }
}
