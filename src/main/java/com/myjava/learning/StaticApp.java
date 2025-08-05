package com.myjava.learning;

import com.myjava.javapack.Constant;
import com.myjava.javapack.Country;
import com.myjava.util.MathUtil;

public class StaticApp {
    public static void staticMain(String[] args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);
        System.out.println(
            MathUtil.sum(1,2,3)
        );

        Country.City city = new Country.City();
        city.setName("asfd");

        System.out.println(city.getName());

        System.out.println(Constant.PROCESSORS);
    }
}
