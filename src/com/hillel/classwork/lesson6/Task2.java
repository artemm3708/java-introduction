package com.hillel.classwork.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int start = 1000;
        int end = 1500;


        int distance = Integer.parseInt(reader.readLine());
        boolean result = range(start, end, distance);
        System.out.println(result);

    }

    public static boolean range(int distance, int start, int end) {
        if (distance < start || distance > end) {
            return false;
        } else {
            return true;
        }

    }


}




