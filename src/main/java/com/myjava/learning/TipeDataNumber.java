package com.myjava.learning;

public class TipeDataNumber {

    public static void TipeData(String[] args) {
        // byte iniByte = 100;
        // short iniShort = 1000;
        // int iniInt = 1000000;
        // long iniLong = 100000000000;
        // long iniLong2 = 10000000000000L; // must use L (?)

        float iniFloat = 10.10F; // must use F
        // double iniDouble = 10.10;

        // int can be used to store binary / hexa

        // for number java can use _ for seperation
        // long balance = 1_000_000_000L;
        // int amount = 1_000_000;

        // conversion number type
        // short iniNewShort = iniByte;
        // int iniNewInt = iniByte;
        
        // float iniNewFloat = (float) iniDouble;
        int iniInt2 = (int) iniFloat;

        System.out.println(iniInt2);
    }
}