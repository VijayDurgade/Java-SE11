package org.example.javamockobjectives;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileStream {

    public static void main(String[] args) throws Exception {

        Product product = new Product("Laptop", "20345678");

        ObjectOutputStream objOutStream = new ObjectOutputStream(new FileOutputStream("product.dat"));

        objOutStream.writeObject(product);

        Product product2 = new Product("Laptop", "20345678");

        ObjectInputStream objInStream = new ObjectInputStream(new FileInputStream("product.dat"));

        Product prodRead = (Product) objInStream.readObject();

        System.out.println(prodRead);

        objOutStream.close();

        objInStream.close();
    }
}