package com.myjava.learning;

import com.myjava.javapack.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("Pak", "Eko");

        System.out.println(loginRequest);
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());

        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Pak"));
        System.out.println(new LoginRequest("Pak", "rahasia"));
    }
}
