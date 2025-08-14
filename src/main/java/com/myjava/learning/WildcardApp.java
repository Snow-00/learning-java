package com.myjava.learning;

import com.myjava.javapack.MyData;

public class WildcardApp {
    public static void wildMain(String[] args) {
        print(new MyData<Integer>(1));
        print(new MyData<String>("dag"));
        print(new MyData<Manager>(new Manager(null)));
    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
