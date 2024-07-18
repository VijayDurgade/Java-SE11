package org.example.questions.programs;

abstract class Person1 {
    public final void display() {
        System.out.println("Display method in Person");
    }

    public static void main(String[] args) {
        Person1 person = new Student1();//line 6
        person.display(); //line 7
    }
}

public class Student1 extends Person1 {
  //  public void display() //line 11
    {
        System.out.println("Display method in student");
    }
//In the Student1 class, you attempt to override the display method.
//This is not allowed because the method in the superclass Person1 is final.
}