package org.example.javamockobjectives;

public class StringQuestion {
    public static void main(String[] args) {

        String str = " Infoys Certified Java Programmer Mock";
        //System.out.println(str.length());
        String strUpdated = str.trim().substring(6,7)+str.trim().substring(37);
        System.out.println(strUpdated);
    }
}
