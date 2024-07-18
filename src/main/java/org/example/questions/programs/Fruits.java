package org.example.questions.programs;

public interface Fruits {
     void taste();

    public static void main(String[] args) {
        Fruits fruits = new Fruits() {
            @Override
            public void taste() {
                System.out.println("Taste is good...");
            }
        };
    }
}
