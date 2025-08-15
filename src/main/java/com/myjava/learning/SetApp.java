package com.myjava.learning;

// import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void setMain(String[] args) {
        // Set<String> names = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();

        names.add("gag");
        names.add("ddd");
        names.add("ggd");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
