package com.myjava.learning;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void navigableMain(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("kur", "abb", "bil"));

        NavigableSet<String> nameReverse = names.descendingSet();
        // NavigableSet<String> bil = names.headSet("bil", true);
        NavigableSet<String> bil = names.tailSet("bil", true);

        for (var name : bil) {
            System.out.println(name);
        }
    }
}
