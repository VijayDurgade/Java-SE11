package org.example.javamockobjectives;

import java.io.Serializable;

public class Product implements Serializable {
    private final String productName;
    private final transient String productId;
    public String brandName;
    public static int brandId = 10001;

    public Product(String productName, String productId) {

        this.productName = productName;

        this.productId = productId;

        brandName = "Infy";

        brandId++;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productId='" + productId + '\'' +
                ", brandName='" + brandName + '\'' +
                ", brandId='" + brandId + '\'' +
                '}';
    }
}