package com.learning.javapack;

public class ProductApp {

    public static void productMain(String[] args) {
        Product product = new Product("Asus", 2000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}