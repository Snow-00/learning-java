package com.myjava.learning;

public class ForEach {

    public static void ForEachClass(String[] args) {
        String[] names = {"rara", "fdfa", "fafbd"};

        for (var i=0; i<names.length; i++) {
            System.out.println(names[i]);
        }
        
        for (var value : names) {
            System.out.println(value);
        }
    }
}