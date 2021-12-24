package com.hillel.homework.hw7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CopyArray {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int[] bigArray = new int[20];

        fillArray(bigArray);

        int[] small1 = new int[10];
        int[] small2 = new int[10];

        smallArray(bigArray, small1);
        array2(bigArray, small2);


    }

    private static void fillArray(int[] bigArray) throws IOException {
        System.out.println("Введите 20 чисел: ");
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = Integer.parseInt(READER.readLine());
        }
    }

    private static void smallArray(int[] bigArray, int[] small1) {
        System.out.println("Первый массив: ");
        for (int i = 0; i < small1.length; i++) {
            small1[i] = bigArray[i];
            System.out.println(small1[i]);
        }
    }

    private static void array2(int[] bigArray, int[] small2) {
        System.out.print("Второй массив: ");
        for (int i = 0; i < small2.length; i++) {
            small2[i] = bigArray[i + (bigArray.length / 2)];
            System.out.print(small2[i] + ", ");
        }
    }


}

