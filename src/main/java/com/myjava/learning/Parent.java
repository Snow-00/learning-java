package com.myjava.learning;

class Parent {

    String name;
    void doIt() {
        System.out.println("From Parent");
    }
}

class Child extends Parent {
    String name;
    void doIt() {
        System.out.println("From Child");
    }
}