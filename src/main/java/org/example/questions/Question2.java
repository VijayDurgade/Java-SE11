package org.example.questions;

public class Question2 {
    public static void main(String[] args) {

        switch (22) {

            case 20:
            case 21:
            case 22:
                System.out.println("invalid match");
                break;

            case 23:
                System.out.println("in 23");
                //continue;

            default:
                System.out.println("in default");
                break;
        }

    }

}
