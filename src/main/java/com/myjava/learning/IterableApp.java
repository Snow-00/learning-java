package com.myjava.learning;

import java.util.List;

public class IterableApp {
    public static void iterableMain(String[] args) {
        Iterable<String> names = List.of("Dfa", "grog", "gdga");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
