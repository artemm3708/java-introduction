package com.hillel.homework.hw5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        char c = '+';
        int b = Integer.parseInt(reader.readLine());

        int sum = a + signs(c) + b;
        System.out.println(sum);

    }

    public static char signs(char c) {

        if (c == '+') {
            return '+';
        } else if (c =='-') {
            return '-';
        } else if (c == '*') {
            return '*';
        } else {
            return '/';
        }

    }


}


