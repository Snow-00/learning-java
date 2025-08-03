package com.myjava.learning;

public class PersonApp {

    public static void PersonMain(String[] args) {
        var person1 = new Person("budi", "rasuna");
        person1.name = "esfs";
        person1.address = "jalan";

        person1.sayHello("Hasdf");

        Person person2 = new Person("joko", "street");
        person2.sayHello("dodit");

        Person person3;
        person3 = new Person("dudi");

        person3.sayHello("adgd");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person2);
        System.out.println(person3.address);
    }
}