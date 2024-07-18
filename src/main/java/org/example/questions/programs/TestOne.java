package org.example.questions.programs;

public class TestOne {
    public void method() {
        for (int i = 0; i < 3; i++) {
            System.out.print(i);
        }
      //  System.out.print(i); //Runtime error Bring it in scope
    }

    public static void main(String[] args) {
        TestOne one = new TestOne();
        one.method();
    }
}