package com.hillel.homework.hw2;

import static java.lang.Math.pow;

public class Example {

    public static void main(String[] args) {
        // | a- b | / (a + b) ^3 - √c

        int a = 649;
        int b = 348;
        int c = 4393;

        double d = (Math.abs(a - b) / (Math.pow((a + b), 3)) - Math.sqrt(c));
        System.out.println("d = " + d);
    }
}
