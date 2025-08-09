package com.myjava.learning;

import com.myjava.annotation.Fancy;
import com.myjava.javapack.Avanza;
import com.myjava.javapack.Car;

@Fancy(name = "CarApp", tags = {"application", "java"})
public class CarApp {
    public static void carMain(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
    }
}
