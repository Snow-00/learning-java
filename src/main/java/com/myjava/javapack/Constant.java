package com.myjava.javapack;

public class Constant {
    // static variable usually final
    public static final String APPLICATION = "Learning Java";
    public static final int VERSION = 1;
    public static final int PROCESSORS;

    static {
        System.out.println("Akses Contant");
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
