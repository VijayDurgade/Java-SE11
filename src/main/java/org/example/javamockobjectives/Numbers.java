package org.example.javamockobjectives;

public class Numbers {

    public void m1(int i, float f) {
        System.out.println("int float method");
    }

    public void m2(float f, int i) {
        System.out.println("float int method");
    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        numbers.m1(20, 20);

    }
}
