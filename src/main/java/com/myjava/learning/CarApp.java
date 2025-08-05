package com.myjava.learning;

import com.myjava.javapack.Avanza;
import com.myjava.javapack.Car;

public class CarApp {
    public static void carMain(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
    }
}
