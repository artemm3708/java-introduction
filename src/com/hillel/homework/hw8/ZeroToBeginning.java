package com.hillel.homework.hw8;

import java.util.Arrays;

public class ZeroToBeginning {

    public static void main(String[] args) {

        int[] arr = {7, 6, 0, 24, 4, 0, 10, 0, 56};

        int[] numbers = {3, 9, 56, 0, 23, 90, 0, 4, 8, 0};

        long start = System.currentTimeMillis();

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        long firstEnd = System.currentTimeMillis();

        BubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));

        long end = System.currentTimeMillis();

        System.out.println("time Arrays.sort: " + (firstEnd - start));
        System.out.println("time BubbleSort: " + (end - start));

    }

    private static void BubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
    }

}
