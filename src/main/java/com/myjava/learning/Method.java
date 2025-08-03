package com.myjava.learning;

public class Method {

    public static void MethodJava(String[] args) {
        sayHello();
        sayHello(12);
        sayHello("dfdfa");
        sayHello("dfdfa", "haha");

        var result = sum(100, 200);

        System.out.println(result);

        sayCongrats();
        sayCongrats(1, 3, 10);
    }

    static void sayHello() {
        System.out.println("Hello1");
    }

    static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

    static void sayCongrats(int... values) {
        var total = 0;

        for (var value : values) {
            total += value;
        }

        if (total > 10) {
            System.out.println("Selamat");
        } else {
            System.out.println("gagal");
        }
    }

    // Method overloading
    static void sayHello(String name) {
        System.out.println(name);
    }

    static void sayHello(String first, String last) {
        System.out.println(first + " " + last);
    }

    static void sayHello(int age) {
        System.out.println(age);
    }
}