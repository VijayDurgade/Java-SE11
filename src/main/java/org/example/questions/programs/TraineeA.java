package org.example.questions.programs;

class EmployeeA {
    public static void display() { // line 2
        System.out.print(" Employee ");
    }
}
public class TraineeA extends EmployeeA {
    public static void display() {  //line 5
        System.out.print(" Trainee ");
    }

    public static void main(String[] args) {
        EmployeeA employee = new TraineeA();
        employee.display(); // line 9

    }
}