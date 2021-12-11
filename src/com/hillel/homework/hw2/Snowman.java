package com.hillel.homework.hw2;

public class Snowman {

    public static void main(String[] args) {

        int r1 = 1;
        double r2 = 0.5;
        double r3 = 0.2;
        double p = 0.7;

        //вычисляем объем шаров (4/3)*PI*r^3

        int m = 4;
        int n = 3;
        float ddd = (float) m / n;

        double volume1 = ddd * (Math.PI) * (Math.pow(r1, 3));
        double volume2 = ddd * (Math.PI) * (Math.pow(r2, 3));
        double volume3 = ddd * (Math.PI) * (Math.pow(r3, 3));

        System.out.println("Объем шаров: ");
        System.out.println("объем первого шара= " + volume1);
        System.out.println("объем второго шара= " + volume2);
        System.out.println("объем третьего шара= " + volume3);
        System.out.println();

        // находим массу m=pv

        double m1 = p * volume1;
        double m2 = p * volume2;
        double m3 = p * volume3;


        System.out.println("Масса шаров: ");
        System.out.println("масса первого шара= " + m1);
        System.out.println("масса второго шара= " + m2);
        System.out.println("масса третьего шара= " + m3);
        System.out.println();

        // масса снеговика

        double snowman = m1 + m2 + m3;
        System.out.println("масса снеговика= " + snowman);


    }
}
