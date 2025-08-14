package com.myjava.learning;

import java.util.Arrays;

import com.myjava.javapack.PersonPack;

public class ComparableApp {
    public static void compareMain(String[] args) {
        PersonPack[] people = {
            new PersonPack("Joko", "Jkt"),
            new PersonPack("Budi", "Bdg"),
            new PersonPack("Rudi", "Sby"),
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
