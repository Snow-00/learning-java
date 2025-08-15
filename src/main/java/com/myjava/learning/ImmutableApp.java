package com.myjava.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {
    public static void immutableMain(String[] args) {
        List<String> one = Collections.singletonList("satu");
        List<String> empty = Collections.emptyList();
        List<String> mutable = new ArrayList<>();
        
        mutable.add("null");
        mutable.add("kgag");

        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("ag", "ggdga");
        elements.add("agg"); // ERROR
    }
}
