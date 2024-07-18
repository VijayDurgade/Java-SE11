package org.example.questions.programs;

interface MyInterface {

    void method1();

}

class MyImplementation implements MyInterface {
    public void method1() {
        System.out.println("My Method");

    }
}

public class Testing1 {

    public static void main(String[] args) {

        MyInterface obj = new MyImplementation();
        obj.method1();
    }
}