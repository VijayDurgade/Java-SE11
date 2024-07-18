package org.example.questions;

public class ReverseStringUsingStringBuilder {

    public static void main(String[] args) {

        String name = "vijay";
        StringBuilder builder=new StringBuilder(name);
        String reverseString = builder.reverse().toString();
        System.out.println("Original String " + name);
        System.out.println("Reverse String " + reverseString);


    }
}
