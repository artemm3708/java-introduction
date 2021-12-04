package com.hillel.homework.hw1;

public class Ab {

    public static void main(String[] args) {

        int a = -865_647;
        int b = 276;
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a=" + a);
        System.out.println("b=" + b);

    }
}
