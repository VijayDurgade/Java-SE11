package org.example.questions;

import java.util.Scanner;

public class MobileNumberValidator {

    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);
        long mobileNo = scanner.nextLong();
       // long mobileNo = 1234567890L; // Example mobile number

        if (isValidMobileNumber(mobileNo)) {
            System.out.println("The mobile number is valid.");
        } else {
            System.out.println("The mobile number is invalid.");
        }
    }

    public static boolean isValidMobileNumber(long mobileNo) {
        // Check if the number is 10 digits long
        if (String.valueOf(mobileNo).length() != 10) {
            return false;
        }

        // Convert the number to a string
        String mobileNoStr = String.valueOf(mobileNo);

        // Check if all digits are the same
        char firstDigit = mobileNoStr.charAt(0);
        for (int i = 1; i < mobileNoStr.length(); i++) {
            if (mobileNoStr.charAt(i) != firstDigit) {
                return true;
            }
        }

        // If all digits are the same, return false
        return false;
    }
}
