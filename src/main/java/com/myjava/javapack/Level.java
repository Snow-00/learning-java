package com.myjava.javapack;

public enum Level {
    STANDAR("Standard level"),
    PREMIUM("Premium Level"),
    VIP("VIP level");

    private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
