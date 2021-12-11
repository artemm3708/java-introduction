package com.hillel.homework.hw3;

public class AnimalShelter {

    public static void main(String[] args) {

        int dogs = 24;
        int cats = 8;
        int feed = 50;
        int money = 2;

        System.out.println("Для котов в месяц нужно " + catsEat(cats, feed) + " грамм корма");
        System.out.println("Для собак в месяц нужно " + dogsEat(dogs, feed) + " грамм корма");
        System.out.println(moneySpend(money, cats, feed, dogs) + " долларов нужно в месяц на содержание приюта");


    }

    public static int catsEat(int cats, int feed) {
        int days = 30;
        int amount = 3;
        int catMonth = cats * feed * amount * days;
        return catMonth;
    }

    public static int dogsEat(int dogs, int feed) {
        int days = 30;
        int amount = 3;
        int dogMonth = dogs * feed * days * amount;
        return dogMonth;
    }

    public static int moneySpend(int money, int cats, int feed, int dogs) {
        int moneyMonth = money * catsEat(cats, feed) + dogsEat(dogs, feed);
        return moneyMonth;
    }


}
