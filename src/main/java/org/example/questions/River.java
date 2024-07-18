package org.example.questions;

public class River {
    int Depth =10;
    //Line 1
    float temp = 30.0f;

    public void flow() {

        for (int i = 0; i < 1; i += 10) {

            int depth = 20; // Line 2

            depth++; // Line 3

            temp--;

        }


        //System.out.println(depth); // Line 4
        System.out.println(temp); // Line 5
    }
    public static void main(String [] args) {

        new River().flow();

    }

}