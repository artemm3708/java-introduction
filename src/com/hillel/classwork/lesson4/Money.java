package com.hillel.classwork.lesson4;

public class Money {

    public static void main(String[] args) {

        int a = 3000;
        int b = 4500;
        int c = 5800;
        int year = 12 * 10;

        double aa = a * year;
        System.out.println(aa);

        double bb = b * year;
        System.out.println(bb);

        double cc = c * year;
        System.out.println(cc);


        double aaa = (aa / 100) * 5;
        System.out.println(aaa);

        double bbb = (bb / 100) * 5;
        System.out.println(bbb);

        double ccc = (cc / 100) * 5;
        System.out.println(ccc);

        double averageA = aa - aaa;
        double averageB = bb - bbb;
        double averageC = cc - ccc;


        double everage = (averageA + averageB + averageC) / 3;
        System.out.println(everage);


    }
}
