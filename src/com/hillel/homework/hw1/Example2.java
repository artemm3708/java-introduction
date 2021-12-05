package com.hillel.homework.hw1;

public class Example2 {

    public static void main(String[] args) {

        int a = 282;
        int b = 112;
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        int x = a;
        a = b;
        b = x;

        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }


}
