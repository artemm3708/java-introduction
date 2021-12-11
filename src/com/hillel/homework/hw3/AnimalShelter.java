package com.hillel.homework.hw3;

public class AnimalShelter {

    public static void main(String[] args) {

        System.out.println("Для котов в месяц нужно " + catMonth() + " грамм корма");
        System.out.println("Для собак в месяц нужно " + dogMonth() + " грамм корма");
        System.out.println(moneyMonth() + " долларов нужно в месяц на содержание приюта");


    }

    public static void countAnimals() {
        int dogs = 24;
        int cats = 8;
    }

    public static void meals() {
        int feed = 50;
        int money = 2;
    }

    public static int catMonth() {
        int cats = 8;
        int feed = 50;
        return feed * cats * 3 * 30;
    }

    public static int dogMonth() {
        int dogs = 24;
        int feed = 50;
        return feed * dogs * 3 * 30;
    }

    public static int moneyMonth() {
        int money = 2;
        return money * (catMonth() + dogMonth());
    }


}
