package org.example.questions;

public class Question9 {
    private final int a = 1;
    //final int b;
    static int c = 0;

    public Question9() {
        System.out.println(a);
        //System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        new Question9();
    }
}
