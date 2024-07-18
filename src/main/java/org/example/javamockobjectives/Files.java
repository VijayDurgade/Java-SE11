package org.example.javamockobjectives;

import java.io.File;

public class Files {
    public static void main(String[] args) {

        File obj = new File("/java/system");

        System.out.print(obj.getParent());

        System.out.print(" " + obj.isFile());
    }
}
