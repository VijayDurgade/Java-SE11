package org.example.questions.programs;

class PersonA {
    public PersonA(String name) {
        System.out.println(name);
    }

}
public class StudentA extends PersonA {
     public StudentA() { //line 8  need to add super("Default Name") at line 8 to remove compile time error
         super("Default Name");
         System.out.println("Student");
    }

    public static void main(String[] args) { // line 11
        new PersonA("Bob");

    }

}