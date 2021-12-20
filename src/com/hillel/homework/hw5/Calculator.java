package com.hillel.homework.hw5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        char b = (char)reader.read();
        int c = Integer.parseInt(reader.readLine());
        int result = a + b + c;
        System.out.println(result);

    }

    public static void signs() {


    }


}
