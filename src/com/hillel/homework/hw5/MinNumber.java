package com.hillel.homework.hw5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите 3 случайных числа: ");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int lower = Math.min(Math.min(a, b), c);
        System.out.println(lower + " меньше всего");

        min(a, b, c);


    }

    public static void min(int a, int b, int c) {

        if (a < b && a < c) {
            System.out.println(a + " наименьшее из всех");
        } else if (b < a && b < c) {
            System.out.println(b + " наименьшее из всех");
        } else if (c < a && c < b) {
            System.out.println(c + " наименьшее из всех");
        } else if (a == c && b == c && a == b) {
            System.out.println("Все числа равны");
        } else if (a == b) {
            System.out.println("Числа a и b наименьшие");
        } else if (a == c) {
            System.out.println("Числа a и c наименьшие");
        } else if (b == c) {
            System.out.println("Числа b и c наименьшие");

        }
    }

}
