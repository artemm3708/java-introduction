package com.hillel.homework.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Airport {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите габариты вашего багажа");
        System.out.println("Высота: ");
        int height = Integer.parseInt(reader.readLine());
        System.out.println("Длина: ");
        int length = Integer.parseInt(reader.readLine());
        System.out.println("Ширина: ");
        int width = Integer.parseInt(reader.readLine());

        System.out.println("Выберите Ваш багаж");
        System.out.println("1 - рюкзак, 2 - чемодан: ");
        int choice = Integer.parseInt(reader.readLine());
        int a = 1;
        int b = 2;

        falseInput(height, length, width);

        if (choice == a) {
            choiceBackpack(height, length, width);
        } else if (choice == b) {
            choiceSuitcase(height, length, width);
        } else {
            System.out.println("Выберите багаж");
        }

    }

    public static void falseInput(int height, int length, int width) {

        if (height < 1 || length < 1 || width < 1) {
            System.out.println("Проверьте правильность введенных данных");
        }
    }

    public static void choiceBackpack(int height, int length, int width) {

        if (height <= 40 && length <= 55 && width <= 20) {
            System.out.println("Ваш багаж проходит по габаритам");
        } else if (height > 40 || length > 55 || width > 20) {
            System.out.println("Ваш багаж не проходит по габаритам");
        }
    }

    public static void choiceSuitcase(int height, int length, int width) {
        if (height <= 53 && length <= 40 && width <= 22) {
            System.out.println("Ваш багаж проходит по габаритам");
        } else if (height > 53 || length > 40 || width > 22) {
            System.out.println("Ваш багаж не проходит по габаритам");
        }
    }


}
