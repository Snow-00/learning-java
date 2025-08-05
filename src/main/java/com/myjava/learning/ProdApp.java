package com.myjava.learning;

import com.myjava.javapack.Product;

public class ProdApp {
    public static void prodMain(String[] args) {
        Product product = new Product("G gcc", 2_000_000);
        System.out.println(product.name);

        System.out.println(product);
    }
}
