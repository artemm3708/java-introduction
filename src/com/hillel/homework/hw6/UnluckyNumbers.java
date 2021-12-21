package com.hillel.homework.hw6;

public class UnluckyNumbers {

    public static void main(String[] args) {

        int i = 0;
        for (i = 0; i <= 100; i++) {
            if (i % 10 == 4 || i % 10 == 9) {
                continue;
            } if (i >= 40 && i < 50) {
                continue;
            } if (i >= 90 && i < 100) {
                continue;
            }
            System.out.println(i);
        }

    }

}
