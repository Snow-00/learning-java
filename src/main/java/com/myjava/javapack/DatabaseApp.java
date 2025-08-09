package com.myjava.javapack;

import com.myjava.error.DatabaseErr;

public class DatabaseApp {
    public static void dbMain(String[] args) {
        connectDb("", "null");
        System.out.println("Success");
    }

    public static void connectDb(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseErr("Failed to connect DB");
        }
    }
}
