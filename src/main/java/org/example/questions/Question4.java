package org.example.questions;

public class Question4 {

    public static void main(String[] args) {

        StringBuilder message = new StringBuilder("hello java!");
        int pos = 0;

        try {
            for (pos = 0; pos < 12; pos++) {

                switch (message.charAt(pos)) {

                    case 'a':
                    case 'e':
                    case 'o':
                        String uc = Character.toString(message.charAt(pos)).toUpperCase();
                        message.replace(pos, pos + 1, uc);
                }
            }
        } catch (Exception e) {

            System.out.println("Out of limits");
        }
        System.out.println(message);
    }
}
