package com.myjava.learning;

import com.myjava.javapack.MyData;

public class InvariantApp {
    public static void invariantMain(String[] args) {
        MyData<String> stringMyData = new MyData<String>("daff");
        // doIt(stringMyData); // ERROR
        // MyData<Object> objMyData = stringMyData; // ERROR

        MyData<Object> objMyData = new MyData<Object>(1000);
        // MyData<Integer> integerMyData = objMyData; // ERROR
    }

    public static void doIt(MyData<Object> objMyData) {
        // do nothing
    }
}
