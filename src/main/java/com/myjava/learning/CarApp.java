package com.myjava.learning;

import com.learning.javapack.Avanza;
import com.learning.javapack.Car;

public class CarApp {
    public static void carMain(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
    }
}
