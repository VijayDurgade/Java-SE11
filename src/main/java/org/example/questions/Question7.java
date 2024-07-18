package org.example.questions;

public class Question7 {
    public static void main(String[] args) {

        Boolean[] bool = new Boolean[2];
        bool[1] = new Boolean(Boolean.parseBoolean("True"));
        bool[0] = Boolean.valueOf(null);
        System.out.println(bool[0] + " " + bool[1]);

    }
}