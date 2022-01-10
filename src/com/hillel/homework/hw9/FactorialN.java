package com.hillel.homework.hw9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialN {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введите число: ");

        int i = Integer.parseInt(READER.readLine());

        System.out.println("Факториал числа " + i + " = " + factorial(i));

    }

    public static long factorial(int i) {

        if (i == 1) {
            return i;
        }
        return i * factorial(i - 1);
    }

}
