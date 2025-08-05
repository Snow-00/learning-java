package com.myjava.learning;

import com.myjava.javapack.Product;

public class EqualsApp {
    public static void equalsMain(String[] args) {
        String first = "Rendy";
        first = first + " " + "Pwn";

        System.out.println(first);

        String second = "Rendy Pwn";
        
        System.out.println(second);
        System.out.println(first.equals(second));

        Product product = new Product("Lenovo", 1000);

        Product product2 = new Product("Lenovo", 1000);

        System.out.println(product.equals(product2));
        System.out.println(product.hashCode() == product2.hashCode());
        System.out.println(product.hashCode());
        System.out.println(product2.hashCode());
    }
}
