package com.myjava.learning;

import com.myjava.javapack.City;

public class LocationApp {
    public static void locationMain(String[] args) {
        // var location = new Location(); // error
        var city = new City();
        city.name = "jakarta";

        System.out.println(city.name);
        city.run();
    }
}
