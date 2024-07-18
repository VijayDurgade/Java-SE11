package org.example.questions;

public class Question5 {
    public static void main(String[] args) {
        for (int i = 0, j = 0; i <= 10 & j <= 10; i += 2) {
            if ((i != 6) && j != 6)
                System.out.println(i);
        }
    }
}
