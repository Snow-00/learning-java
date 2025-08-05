package com.myjava.learning;

import com.myjava.javapack.Category;

public class CategoryApp {
    public static void catMain(String[] args) {
        var category = new Category();
        category.setId("ID");

        System.out.println(category.getId());
        System.out.println(category.isExpensive());

        category.setId(null);

        System.out.println(category.getId());
    }
}
