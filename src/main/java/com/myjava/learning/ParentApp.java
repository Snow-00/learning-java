package com.myjava.learning;

public class ParentApp {

    public static void parentMain(String[] args) {
        Child child = new Child();
        child.name = "Tet";
        child.doIt();
        System.out.println(child.name);

        Parent parent = child; 
        parent.doIt(); // do it from child
        System.out.println(parent.name);

        // Parent parent = new Parent();
        // parent.doIt(); // do it from child
        // System.out.println(parent.name);

        // Child child = (Child) parent;  // parent to child needs explicit conversion
        // child.name = "Tet";
        // child.doIt();
        // System.out.println(child.name);
    }
}