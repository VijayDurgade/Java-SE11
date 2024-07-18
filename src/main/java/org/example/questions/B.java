package org.example.questions;

import org.example.questions.programs.A;

public class B extends A {

    public void accessProtectedMembers(){
        System.out.println("Protected variable: " + protectedVariable);
        protectedMethod();
    }

    public static void main(String[] args) {
        B b = new B();
        b.accessProtectedMembers();
    }
}
