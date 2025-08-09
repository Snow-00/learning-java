package com.myjava.learning;

import com.myjava.javapack.MyData;
import com.myjava.javapack.Pair;

public class GenericClassApp {
    public static void genericMain(String[] args) {
        // Generic class must use object
        MyData<String> stringMyData = new MyData<String>("ada");
        MyData<Integer> integerMyData = new MyData<Integer>(1);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);

        Pair<String, Integer> pair = new Pair<String, Integer>("fir", 2);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
