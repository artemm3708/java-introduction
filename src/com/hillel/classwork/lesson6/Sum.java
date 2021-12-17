package com.hillel.classwork.lesson6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sum {

    public static void main(String[] args) {

        int a1 = 121;
        int a2 = 1323;
        long l1 = 12342343;
        long l2 = 23432432;
        double d1 = 121.23;
        double d2 = 2134.22;

        sum(a1, a2);
        sum(l1, l2);
        sum(d1, d2);

        System.out.println(sum(a1, a2));
        System.out.println(sum(l1, l2));
        System.out.println(sum(d1, d2));


    }

    public static double sum(int a1, int a2) {

        return a1 + a2;

    }

    public static double sum(long l1, long l2) {

        double result2 = l1 + l2;
        return result2;

    }

    public static double sum(double d1, double d2) {

        double result3 = d1 + d2;
        return result3;
    }

}
