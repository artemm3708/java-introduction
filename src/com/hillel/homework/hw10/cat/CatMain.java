package com.hillel.homework.hw10.cat;

public class CatMain {

    public static void main(String[] args) {

        Cat cat = new Cat("Polo", "Bengal", 3, 5);
        Cat cat1 = new Cat("Rocky", "Maine Coon", 5, 6);

        System.out.println(cat);
        System.out.println(cat1);

        System.out.println(cat.equals(cat1));

    }

}
