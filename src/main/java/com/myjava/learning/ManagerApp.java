package com.myjava.learning;

public class ManagerApp {

    public static void managerMain(String[] args) {
        var manager = new Manager("Dello");
        manager.name = "Doll";
        manager.sayHello("dodit");

        var vp = new VicePresident("Dei");
        vp.sayHello("dodit");

        manager.sayHello("ll");

        System.out.println(manager.getStatus());
        System.out.println(vp.getStatus());
        System.out.println(vp.getParent());

        // Polymorphism
        Employee employee = new Employee("Teta");
        employee.sayHello("dodit");

        employee = new Manager("Teta");
        employee.sayHello("dodit");

        employee = new VicePresident("Teta");
        employee.sayHello("dodit");

        sayHello(new Employee("Joko"));
        sayHello(new Manager("Dani"));
        sayHello(new VicePresident("Ray"));
    }

    static void sayHello(Employee employee) {
        if (employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}