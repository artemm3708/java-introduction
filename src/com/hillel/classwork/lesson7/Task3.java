package com.hillel.classwork.lesson7;

public class Task3 {

    public static void main(String[] args) {

        int i = 0;
        for (i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }



    }

}
