package org.example.questions.programs;

public class Tester1 {
    public static void main(String[] args) {
        Base obj = new Derived();
        obj.method(25);

    }
}
    class Base {
        public static void method(int a) {

            System.out.println("Base Method");
        }

    }

    class Derived extends Base {

        public static void method(int a) {
            System.out.println("Derived Method");

        }

    }
