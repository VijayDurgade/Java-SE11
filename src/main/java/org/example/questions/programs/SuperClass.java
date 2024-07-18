package org.example.questions.programs;

public class SuperClass {
    private void displayName() {
        System.out.println("Super Class");

    }

    public static void main(String[] args) {
        SuperClass superClass = new Subclass();
        superClass.displayName();

    }


}

class Subclass extends SuperClass {
    private void displayName() {
        System.out.println("SubClass is a type of  SuperClass");

    }
}
