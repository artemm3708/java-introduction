package com.hillel.homework.hw7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOrder {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введите длину массива: ");
        int arrayLength = Integer.parseInt(READER.readLine());
        int[] numbers = new int[arrayLength];

        fillArray(numbers);
        arrayOrder(numbers);


    }

    public static void fillArray(int[] numbers) throws IOException {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите число: ");
            numbers[i] = Integer.parseInt(READER.readLine());
        }
    }

    public static boolean isArrayTrue(int[] numbers) {

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= numbers[i - 1]) {
                return false;
            }
        } return true;

    }

    public static void arrayOrder(int[] numbers) {
        if (isArrayTrue(numbers) == true) {
            System.out.println("Последовательность чисел строгая");
        } if (isArrayTrue(numbers) == false) {
            System.out.println("Последовательность чисел не строгая");
        }

    }

}
