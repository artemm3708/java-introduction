package com.hillel.homework.hw5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Calculator {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число");
        double a = Integer.parseInt(reader.readLine());
        System.out.println("Введите операцию");
        String ch = reader.readLine();
        char c = signs(ch);
        System.out.println("Введите число");
        double b = Integer.parseInt(reader.readLine());

        calculation(a, b, c);
        System.out.println("Результат: " + calculation(a, b, c));

    }

    public static char signs(String c) {

        if (c.equals("+")) {
            return '+';
        } else if (c.equals("-")) {
            return '-';
        } else if (c.equals("*")) {
            return '*';
        } else {
            return '/';
        }

    }

    public static double calculation(double a, double b, char c) {
        double result;
        if (c == '+') {
            return result = a + b;
        } if (c == '-') {
            return result = a - b;
        } if (c == '*') {
            return result =  a * b;
        } else {
            return result = a / b;
            }
        }


    }



