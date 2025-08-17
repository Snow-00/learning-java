package com.myjava.learning;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> map = new TreeMap<>();
        
        map.put("null", "gag2");
        map.put("abb", "affa");
        map.put("linn", "af3r");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println(map.lowerKey("linn"));
        System.out.println(map.higherKey("linn"));

        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (var key : mapDesc.keySet()) {
            System.out.println(key);
        }
    }
}
