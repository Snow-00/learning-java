package com.myjava.learning;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import com.myjava.javapack.PersonComparator;
import com.myjava.javapack.PersonList;

public class SortedSetApp {
    public static void sortedSetMain(String[] args) {
        // SortedSet<PersonList> people = new TreeSet<>(new PersonComparator().reversed());
        SortedSet<PersonList> people = new TreeSet<>(new PersonComparator());

        people.add(new PersonList("null"));
        people.add(new PersonList("bud"));
        people.add(new PersonList("Null"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        SortedSet<PersonList> sortedSet = Collections.unmodifiableSortedSet(people);
        sortedSet.add(new PersonList("gag"));
    }
}
