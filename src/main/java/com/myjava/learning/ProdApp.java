package com.myjava.learning;

import com.learning.javapack.Product;

public class ProdApp {
    public static void main(String[] args) {
        Product product = new Product("G gcc", 2_000_000);
        System.out.println(product.name);

        System.out.println(product);
    }
}
