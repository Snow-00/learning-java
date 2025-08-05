package com.myjava.learning;

import com.myjava.javapack.HelloWorld;

public class HelloWorldApp {
    public static void helloMain(String[] args) {
        HelloWorld helloWorld = new HelloWorld() {
            public void sayHello() {
                System.out.println("Hello");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        helloWorld.sayHello();
        helloWorld.sayHello("Hulu");
    }
}
