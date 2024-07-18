package org.example.questions;

public class Question8 {
    public static void main(String[] args) {
        int i = 'A';
        double d = 2e2;
        char c = 32;
        long l = 5 ^ 2;

        if (i < d && d > c || i > l && i > c || c > l) {
            System.out.println(c / l);
        } else {
            System.out.println(l / c);
        }
    }
}
