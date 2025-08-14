package com.myjava.learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void collMain(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("dag");
        collection.add("gud");
        collection.add("dagl");
        collection.addAll(List.of("rerr", "gadg", "ggg"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("REMOVE");

        collection.remove("dag");
        collection.removeAll(List.of("dagl", "ggg"));

        for (var value : collection) {
            System.out.println(value);
        }
    }
}
