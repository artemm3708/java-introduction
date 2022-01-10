package com.hillel.homework.hw9;

public class NegativeNumbers {

    public static void main(String[] args) {

        int[][] arr = new int[3][4];

        fillArray(arr);

        printNegativeNumbers(arr);

    }

    private static void fillArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * (10 - (-10))) + (-10);
            }
        }
    }

    private static void printNegativeNumbers(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0) {
                    System.out.println("(" + i + ", " + j + "): " + arr[i][j] + " - отрицательное число");
                }
            }
        }
    }

}
