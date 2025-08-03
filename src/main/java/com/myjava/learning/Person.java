package com.myjava.learning;

class Person {
    String name;
    String address;
    final String country = "Singapore";

    // constructor
    Person(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    Person(String paramName) {
        this(paramName, null); // call the prev constructor
    }

    Person() {}

    void sayHello(String name) {
        System.out.println(name + " " + this.name);
    }
}