package com.hillel.homework.hw2;

public class Snowman {

    public static void main(String[] args) {

        int r1 = 1;
        double r2 = 0.5;
        double r3 = 0.2;
        double p = 0.7 / (Math.pow(1,3));

        //по формуле все должно быть в см, ниже перевожу все значения
        int e1 = r1 * 100;
        double e2 = r2 * 100;
        double e3 = r3 * 100;
        double p1 = 0.7 / (Math.pow(1,3));

        //вычисляем объем шаров (4/3)*PI*r^3

        int m = 4;
        int n = 3;
        float ddd = (float) m / n;

        double volume1 = ddd * (Math.PI) * (Math.pow(e1, 3));
        System.out.println(volume1);

        double volume2 = ddd * (Math.PI) * (Math.pow(e2, 3));
        System.out.println(volume2);

        double volume3 = ddd * (Math.PI) * (Math.pow(e3, 3));
        System.out.println(volume3);




    }
}
