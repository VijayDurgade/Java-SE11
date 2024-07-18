package org.example.questions;

public class Question6 {
    public static void main(String[] args) {
        String[] str = {"hello"};// Line 1
        StringBuilder sb = new StringBuilder(27);
        String s = new String(sb);

        Object[] obj = str; // Line 2
        obj[0] = sb; // Line 3 ==> Exception in thread "main" java.lang.ArrayStoreException

        String[] new_str = (String[]) obj; // Line 4
    }
}
