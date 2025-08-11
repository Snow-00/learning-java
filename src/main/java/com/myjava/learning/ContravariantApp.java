package com.myjava.learning;

import com.myjava.javapack.MyData;

public class ContravariantApp {
    public static void contraMain(String[] args) {
        MyData<Object> objMyData = new MyData<Object>("args");
        objMyData.setData(1000);
        MyData<? super String> myData = objMyData;

        process(objMyData);
        System.out.println(objMyData.getData());
        System.out.println(myData.getData());
    }

    public static void process(MyData<? super String> myData) {
        // THIS ERROR
        // String value = (String) myData.getData();
        // System.out.println("Process " + value);

        Object value = myData.getData();
        System.out.println("Process " + value);

        myData.setData("fab");
    }
}
