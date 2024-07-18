package org.example.questions;

import java.util.Scanner;
//Reverse integer number
public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int reverse = 0;
        int remainder;
        System.out.println("Reverse Number");
        while (number != 0){

            remainder = number % 10;
            reverse =  reverse* 10 + remainder;
            number /=10;
        }

        System.out.println(reverse);

    }
}
