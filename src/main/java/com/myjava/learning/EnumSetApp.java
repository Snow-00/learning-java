package com.myjava.learning;

import java.util.EnumSet;

public class EnumSetApp {
    public static enum Gender {
        MALE, FEMALE, NOT_MENTION
    }
    
    public static void enumMain(String[] args) {
        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        EnumSet<Gender> specificGender = EnumSet.of(Gender.MALE, Gender.FEMALE);

        for (var gender : genders) {
            System.out.println(gender);
        }

        for (var gender : specificGender) {
            System.out.println(gender);
        }
    }
}
