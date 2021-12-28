package com.hillel.homework.hw8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lottery {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int[] company = new int[7];
        int[] player = new int[7];

        companyArray(company);
        playerArray(player);
        System.out.println(Arrays.toString(company));
        System.out.println(Arrays.toString(player));
        amountEquality(company, player);

    }

    private static void companyArray(int[] company) {
        for (int i = 0; i < company.length; i++) {
            company[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(company);
    }

    private static void playerArray(int[] player) throws IOException {
        System.out.println("Введите 10 чисел от 0 до 9: ");
        for (int i = 0; i < player.length; i++) {
            player[i] = Integer.parseInt(READER.readLine());
            if (player[i] > 9) {
                System.out.println("Ваше число больше допустимого");
                break;
            }
        }
        Arrays.sort(player);
    }

    private static void amountEquality(int[] company, int[] player) {
        int equality = 0;
        for (int i = 0; i < company.length; i++) {
            if (company[i] == player[i]) {
                equality += 1;
            }
        }
        System.out.println("Количество совпадений: " + equality);
    }
}
