package com.myjava.learning;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void sortedMain(String[] args) {
        Comparator<String> strComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        SortedMap<String, String> sortedMap = new TreeMap<>(strComparator);

        sortedMap.put("first", "dedi");
        sortedMap.put("adk", "sdk");
        sortedMap.put("lolai", "afda");

        for (var key : sortedMap.keySet()) {
            System.out.println(key);
        }
    }
}
