package com.myjava.learning;

public class StackTraceApp {
    public static void stackMain(String[] args) {
        try {
            sampleError();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    public static void sampleError() {
        try {
            String[] names = {"asd", "daf", "d"};

            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
