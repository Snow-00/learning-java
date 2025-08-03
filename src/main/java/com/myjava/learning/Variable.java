package com.myjava.learning;

public class Variable {

    public static void Var(String[] args) {
        // String name;
        // name = "Test";

        // int age = 10;

        // System.out.println(name);
        // System.out.println(age);

        // var addr = "Jakarta";
        
        // System.out.println(addr);

        // final String apps = "belajar";
        // final var tes = "haha";
        // final var num = 134;

        // System.out.println(apps);
        // System.out.println(tes);
        // System.out.println(num);

        String[] strArray;
        strArray = new String[4];

        strArray[0] = "esef";
        strArray[1] = "esefw";

        String[] newArr = new String[3];

        newArr[0] = "efsdf";
        newArr[2] = "dfsf";

        System.out.println(strArray[0]);
        System.out.println(newArr[2]);

        int[] intArray = {1, 2, 3};
        int[] intNewArray = new int[]{10, 20, 3, 4};

        System.out.println(intArray.length);
        System.out.println(intNewArray.length);
    }
}