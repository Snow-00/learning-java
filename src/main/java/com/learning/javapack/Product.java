package com.learning.javapack;

public class Product {
    public String name;
    public int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // override println method
    public String toString() {
        return "Product name: " + this.name + ", price: " + this.price;
    }
}
