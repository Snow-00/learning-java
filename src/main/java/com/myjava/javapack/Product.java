package com.myjava.javapack;

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

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Product)) {
            return false;
        }

        Product product = (Product) o;

        if (this.price != product.price) {
            return false;
        }

        if (this.name == null) {
            return product.name == null;
        }

        return this.name.equals(product.name);
    }

    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}
