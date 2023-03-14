package org.example;

public class Main {
    public static boolean isValidUkrainianPhoneNumber(String phoneNumber) {
        String regex = "^\\(\\+380\\)\\d{2}-\\d{3}-\\d{2}-\\d{2}$";
        return phoneNumber.matches(regex);
    }

    public static String removeExtraSpaces(String input) {
        String regex = "\\s+";
        return input.replaceAll(regex, " ");
    }

    public static String removeHtmlTags(String html) {
        String regex = "<[^>]*>";
        return html.replaceAll(regex, "");
    }
}