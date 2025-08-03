package com.myjava.learning;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hello " + name + " my name is Employee: " + this.name);
    }
}

class Manager extends Employee {   
    void sayHello(String name) {
        System.out.println("Hello " + name + " my name is " + this.name);
    }

    String getStatus() {
        return "Ini Manager";
    }

    Manager(String name) {
        super(name);
    }
}

class VicePresident extends Manager {

    // method overriding
    void sayHello(String name) {
        System.out.println("Hello " + name + " this is VP " + this.name);
    }

    String getStatus() {
        return "Ini VP";
    }

    String getParent() {
        return super.getStatus();
    }

    VicePresident(String name) {
        super(name);
    }
}