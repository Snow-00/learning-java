package com.myjava.learning;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class HashMapApp {
    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void mapMain(String[] args) {
        Map<String, String> map = new HashMap<>();  // comparing key using equals method
        map.put("first", "ddf");
        map.put("middle", "gaga");
        map.put("last", "kkda");

        System.out.println(map.get("first"));
        System.out.println(map.get("middle"));
        System.out.println(map.get("last"));

        Map<Integer, Integer> weakMap = new WeakHashMap<>();

        for (int i=0; i<1_000_000; i++) {
            weakMap.put(i, i);
        }

        System.gc(); // garbage collector

        System.out.println(weakMap.size());

        Map<String, String> identityMap = new IdentityHashMap<>(); // comparing key using reference

        String key1 = "name.first";

        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name + dot + first;

        System.out.println(key1.equals(key2));
        System.out.println(key1 == key2);

        identityMap.put(key1, "kunci");
        identityMap.put(key2, "kunci");

        System.out.println(identityMap.size());

        Map<String, String> linkedMap = new LinkedHashMap<>();

        linkedMap.put("first", "kkk");
        linkedMap.put("last", "vav");
        linkedMap.put("middle", "agag");

        Set<String> keys = linkedMap.keySet();
        for (var key : keys) {
            System.out.println(key);
        }

        Map<Level, String> enumMap = new EnumMap<>(Level.class);
        enumMap.put(Level.FREE, "cdcd");
        enumMap.put(Level.VIP, "ruf");

        for (var key : enumMap.keySet()) {
            System.out.println(enumMap.get(key));
        }
    }
}
