package org.example.questions;

public class Solution {
    private static int numberOfMonth = 12; // January - 1, February - 2, ..., December - 12

    public static void main(String[] args) {
        boolean condition1 = numberOfMonth == 12;  // December
        boolean condition2 = numberOfMonth == 1;  // January
        boolean condition3 = numberOfMonth == 2;  // February

        boolean isWinter = (condition1 || condition2 || condition3);

        System.out.println(isWinter);
    }
}
