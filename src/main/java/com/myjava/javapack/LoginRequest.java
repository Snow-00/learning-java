package com.myjava.javapack;

public record LoginRequest(String username, String password) {
    public LoginRequest {
        System.out.println("Membuat obj login");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }

    // ERROR -> RECORD FIELD IS FINAL
    // public void setUsername() {
    //     this.username = ""; 
    // }
}
