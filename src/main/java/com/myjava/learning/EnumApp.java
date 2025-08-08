package com.myjava.learning;

import com.myjava.javapack.Customer;
import com.myjava.javapack.Level;

public class EnumApp {
    public static void enumMain(String[] args) {
        Customer customer = new Customer();
        customer.setName("gaag");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        String levelName = Level.VIP.name();
        System.out.println(levelName);

        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        for (var value : Level.values()) {
            System.out.println(value);
        }
    }
}
