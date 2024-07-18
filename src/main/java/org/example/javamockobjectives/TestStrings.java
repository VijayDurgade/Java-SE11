package org.example.javamockobjectives;

public class TestStrings {
    public static void main(String[] args) {

        Long mobileNumber = 1234567890L;
        String mobileNoStr = String.valueOf(mobileNumber);
        System.out.println(mobileNoStr.length());
        if(mobileNoStr.length() != 10){
            System.out.println("Mobile number is not valid");
        }else {
            System.out.println("Mobile number is valid");
        }

        char firstDigit = mobileNoStr.charAt(0);
        for(int i =1; i<mobileNoStr.length(); i++){
           if(mobileNoStr.charAt(i) == firstDigit){
               return ;
           }
        }

        String repeat = "A".repeat(10);
        System.out.println(repeat);
    }
}
