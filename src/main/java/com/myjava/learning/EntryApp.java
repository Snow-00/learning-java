package com.myjava.learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {
    public static void entryMain(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("ruf", "ruf");
        map.put("daf", "daf");
        map.put("funk", "funk");
        
        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (var entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
