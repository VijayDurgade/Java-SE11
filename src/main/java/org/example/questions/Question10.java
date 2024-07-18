package org.example.questions;

import java.util.Scanner;
//Write a program that reads an integer from the keyboard (we assume that the number is greater than 0, no need to check).
//
//Then calculates the sum of numbers from 1 to the entered integer, and displays the result on the screen.
public class Question10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp =0;
        for(int i=1; i< number; i++){
            temp = temp + i;

        }
        System.out.println(temp);

    }
}
