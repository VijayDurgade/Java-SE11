package org.example.questions.programs;

class Doctor {

    public void display() {
        System.out.print("display");
    }

    public void print(int age) {
        System.out.print(" Doctor ");
    }

}

public class Nurse extends Doctor {

    public void display(String name) { // line 2
        System.out.print(name);
    }

   /* public int print(int age) { // line 5
        System.out.print(" Nurse ");
        return age;
    }
*/
    public static void main(String[] args) {
        Nurse nurse = new Nurse();
        nurse.display(); // line 10
        nurse.display("Bob"); // line 11
        nurse.print(10); // line 12
    }
}

    /*The method display(String name) in Nurse is an overload, not an override,
    because it has a different parameter list compared to display() in Doctor.

    The method print(int age) in Nurse is attempting to override print(int age) in Doctor,
    but it changes the return type to int, which is not allowed because the return type must be the same
    for overriding methods. This will result in a compilation error.*/