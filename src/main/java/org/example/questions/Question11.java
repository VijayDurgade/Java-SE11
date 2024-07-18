package org.example.questions;

import java.util.Scanner;
//product of numbers
public class Question11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 1;
        while (number > 0) {

            result *= number % 10;
            number = number / 10;
        }
        System.out.println(result);

    }


}
