package org.example.questions;

public class ReverseStringUsingCharacterArray {

    public static String reverseString(String input) {
        char[] chars = input.toCharArray();
        int n = chars.length;
        char[] reverse = new char[n];

        for (int i = 0; i < n; i++) {
            reverse[i] = chars[n-1-i];

        }
        return new String(reverse);
    }

    public static void main(String[] args) {

        String original = "Vijay Durgade";
        String reversed = reverseString(original);
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
        

            

    }
}
