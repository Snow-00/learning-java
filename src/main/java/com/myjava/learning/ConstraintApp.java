package com.myjava.learning;

public class ConstraintApp {
    public static void ConstraintMain(String[] args) {
        NumberData<Integer> intNumberData = new NumberData<>(1);
        NumberData<Long> longNumberData = new NumberData<>(10000L);

        // NumberData<String> strNumberData = new NumberData<String>("null");  // ERROR

        System.out.println(intNumberData.getData());
        System.out.println(longNumberData.getData());

        // Data<Manager> manager = new Data<>(new Manager()); // ERROR, MUST IMPLEMENT CanSayHello
        Data<VicePresident> vicePresident = new Data<>(new VicePresident());

        System.out.println(vicePresident.getData(null));
    }

    public static interface CanSayHello {
        void sayHello(String name);
    }

    public static abstract class Employee {}

    public static class Manager extends Employee {}

    public static class VicePresident extends Employee implements CanSayHello {
        @Override
        public void sayHello(String name) {
            System.out.println("Hello " + name);
        }
    }

    public static class Data<T extends Employee & CanSayHello> {
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData(T data) {
            return data;
        }

        public void setData(T data) {
            this.data = data;
            this.data.sayHello(null);
        }
    }

    public static class NumberData<T extends Number> {
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
