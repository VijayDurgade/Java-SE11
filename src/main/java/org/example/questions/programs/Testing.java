package org.example.questions.programs;

abstract class BaseAbsClass {
    public void method() {
        System.out.println("BaseAbsClass Method");
    }

    public abstract void method2();

}

class DerivedClass extends BaseAbsClass {

    public void method2() {
        System.out.println("Derived method");

    }

}

public class Testing {

    public static void main(String[] args) {
        BaseAbsClass obj = new DerivedClass();
        obj.method2();

    }
}