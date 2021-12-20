package com.hillel.homework.hw6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessNumber {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double r = Math.random();
        int random = (int) (r * 10);
        System.out.println("Угадайте число от 0 до 10");
        int guess = Integer.parseInt(reader.readLine());

        while (guess != random) {
            System.out.println("Введите число еще раз");
            guess = Integer.parseInt(reader.readLine());
        }
        System.out.println("Поздравляем, Вы угадали число: " + random);


    }

}
