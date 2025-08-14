package com.myjava.learning;

import java.util.List;

import com.myjava.javapack.PersonList;

public class MutableApp {
    public static void mutableMain(String[] args) {
        PersonList person = new PersonList("agg");

        person.addHobby("Game");
        person.addHobby("Coding");

        doSomething(person.getHobbies());

        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    // IDEALLY THIS IS WRONG
    // Update list must from addHobby method
    public static void doSomething(List<String> hobbies) {
        hobbies.add("bukan");
    }
}
