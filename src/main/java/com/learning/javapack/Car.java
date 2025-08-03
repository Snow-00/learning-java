package com.learning.javapack;

public interface Car extends HasBrand, IsMaintenance {
    // default method in interface is public abstract
    void drive();
    int getTier();

    default boolean isBig() {
        return false;
    }
}
