package com.hillel.classwork.lesson7;

public class Task2 {

    public static void main(String[] args) throws InterruptedException {

        int i = 10;
        do {
            System.out.println("До взрыва бомбы " + i);
            Thread.sleep(1000);
            i--;
            if (i == 5) {
                break;
            }
        } while (i >= 0);
        System.out.println("Вы обезвредили бомбу");


    }

}
