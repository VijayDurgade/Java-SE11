package org.example.javamockobjectives;

public class RegexDemo1 {
    public static void main(String[] args) {
        // Test cases
        String[] testCases = {
                "Sherlock Holmes",
                "John Doe",
                "alice Wonderland",
                "Tom",
                "Harry Potter",
                "Vija",
                "Vija D",
                "V D",
                "V",
                "V Dur"
        };

        // Regular expression
        String regex = "([A-Z][a-z]*|[A-Z])\\s?([A-Z][a-z]*|[A-Z])?";

        // Checking names against the regex
        for (String testCase : testCases) {
            System.out.println(testCase + ": " + testCase.matches(regex));
        }
    }
}