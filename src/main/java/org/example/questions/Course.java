package org.example.questions;

public class Course {

    static int i = demo();
    static {
        System.out.print(i);// line 1
    }

    public Course() {
        System.out.print("hello");
    }
    public static void main(String[] args) {

        new Course();
        System.out.println("Hello");

    }
    static int demo() {
        System.out.print("Inside Demo");
        return 10;

    }
}

