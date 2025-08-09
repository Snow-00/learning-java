package com.myjava.learning;

import java.io.BufferedReader;
import java.io.FileReader;
// import java.io.IOException;

public class ReadApp {
    public static void readMain(String[] args) {
        // BufferedReader reader = null;

        // try {
        //     reader = new BufferedReader(
        //         new FileReader("README.md")
        //     );
        //     while (true) {
        //         String line = reader.readLine();
        //         if (line == null) {
        //             break;
        //         }
        //         System.out.println(line);
        //     }

        // } catch (Throwable throwable) {
        //     System.out.println("Error baca file " + throwable.getMessage());
        // } finally {
        //     if (reader != null) {
        //         try {
        //             reader.close();
        //             System.out.println("Success closed");
        //         } catch (IOException e) {
        //             System.out.println("Error menutup resource " + e.getMessage());
        //         }
        //     }
        // }

        // TRY WITH RESOURCE (AUTOCLOSE READER)
        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }

        } catch (Throwable throwable) {
            System.out.println("Error baca file " + throwable.getMessage());
        }
    }
}
