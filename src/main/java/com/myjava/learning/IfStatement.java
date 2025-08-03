package com.myjava.learning;

public class IfStatement {

    public static void IfElse(String[] args) {
        var nilai = 71;
        var absen = 90;

        if (nilai >= 77 && absen >= 71) {
            System.out.println("SELAMAT");
        } else if (nilai > 70) {
            System.out.println("Lulus");
        } else {
            System.out.println("Gagal");
        }

        String ucapan = nilai >= 75 ? "Selamat" : "Gagal bro";

        System.out.println(ucapan);
    }
}