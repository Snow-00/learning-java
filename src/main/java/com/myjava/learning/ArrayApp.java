package com.myjava.learning;

import com.myjava.util.ArrayHelper;

public class ArrayApp {
    public static void arrayMain(String[] args) {
        String[] names = {"aff", "ddd", "aga"};
        Integer[] numbers = {1, 2, 3};

        // System.out.println(ArrayHelper.<String>count(names));
        System.out.println(ArrayHelper.count(names));
        System.out.println(ArrayHelper.count(numbers));
    }
}
