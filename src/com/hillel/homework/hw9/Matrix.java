package com.hillel.homework.hw9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Matrix {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Укажите количество строк массива: ");
        int line = Integer.parseInt(READER.readLine());
        System.out.println("Укажите количество столбцов массива: ");
        int column = Integer.parseInt(READER.readLine());

        int[][] arr = new int[line][column];
        fillArray(arr);
        printArray(arr);
        int reverse[][] = new int[column][line];
        reverseArray(reverse, arr);
        printArray(reverse);

    }


    private static void fillArray(int[][] arr) throws IOException {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Введите число: ");
                arr[i][j] = Integer.parseInt(READER.readLine());
            }
        }
    }

    private static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void reverseArray(int[][] reverse, int arr[][]) {
        for (int i = 0; i < reverse.length; i++) {
            for (int j = 0; j < reverse[i].length; j++) {
                reverse[i][j] = arr[j][i];
            }
        }
    }

}
