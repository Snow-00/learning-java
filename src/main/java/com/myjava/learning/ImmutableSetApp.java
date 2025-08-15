package com.myjava.learning;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("gaga");

        Set<String> mutable = new HashSet<>();
        mutable.add("ggag");
        mutable.add("null");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("kkag", "gagd", "gggad");

        // set.remove("kkag"); ERROR
    }
}
