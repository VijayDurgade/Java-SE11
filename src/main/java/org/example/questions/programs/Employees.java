package org.example.questions.programs;

 public class Employees {
    private static int employeeId;
    private String employeeName;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Employees(String employeeName) {

        ++employeeId;
        this.employeeName = employeeName;
    }

    public static int getEmployeeId() {
        return employeeId;
    }
}
class Tests {
    public static void main(String[] args) {
        Employees employee1 = new Employees("Gloria");
        Employees employee2 = new Employees("Shristi");

        System.out.println(employee1.getEmployeeId() + employee1.getEmployeeName());
        System.out.println(employee2.getEmployeeId() + "" + employee2.getEmployeeName());
    }
}
