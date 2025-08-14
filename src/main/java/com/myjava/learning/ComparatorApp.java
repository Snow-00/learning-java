package com.myjava.learning;

import java.util.Arrays;
import java.util.Comparator;

import com.myjava.javapack.PersonPack;

// THIS IS TO COMPARE W/ DIFFERENT CLASS
// THIS CODE IS JUST EXAMPLE
public class ComparatorApp {
    public static void comparatorMain(String[] args) {
        PersonPack[] people = {
            new PersonPack("Joko", "Jkt"),
            new PersonPack("Budi", "Bdg"),
            new PersonPack("Rudi", "Sby"),
        };

        Comparator<PersonPack> comparator = new Comparator<PersonPack>() {
            @Override
            public int compare(PersonPack o1, PersonPack o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Arrays.sort(people, comparator);

        System.out.println(Arrays.toString(people));
    }
}
