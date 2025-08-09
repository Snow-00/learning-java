package com.myjava.learning;

import com.myjava.javapack.MyData;

public class CovariantApp {
    public static void covarMain(String[] args) {
        MyData<String> stringMyData = new MyData<String>("gag");
        process(stringMyData);

        // MyData<? extends Object> myData = stringMyData;
    }

    public static void process(MyData<? extends Object> myData) {
        System.out.println(myData.getData());
        // myData.setData(1); // ERROR
    }
}
