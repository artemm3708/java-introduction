package com.hillel.homework.hw2;

public class Example {

    public static void main(String[] args) {
        // | a- b | / (a + b) ^3 - √c

        int a = 59;
        int b = 498;
        int c = 200;

        double d = (Math.abs(a - b) / (Math.pow((a + b), 3)) - Math.sqrt(c));
        System.out.println("d = " + d);
    }
}
