package org.example.questions.programs;

public class JavaTest {
    public static void main(String[] args) {

        String s1 = "Infosys";
        String s2 = "Infosys";

        if (s1 == s2) {
            System.out.print("Equal");
        } else {
            System.out.print(" UnEqual");
        }

        if (s1.equals(s2)) {
            System.out.print(" Equal");
        } else {
            System.out.print(" UnEqual");
        }
    }
}