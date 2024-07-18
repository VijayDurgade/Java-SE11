package org.example.javamockobjectives;

public class RegexDemo {

    public static void main(String[] args) {
        String name = " Sherlock Holmes";
        String regex = "[(A-Z)][(a-z)]*((A-Z){1}[a-z]*)*";
        System.out.println(name.matches(regex));


    }
}
