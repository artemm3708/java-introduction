package com.hillel.classwork.lesson12;

public class CatController {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.age = 3;
        cat1.weight = 7;
        cat1.strength = 3;

        Cat cat2 = new Cat();
        cat2.age = 2;
        cat2.weight = 5;
        cat2.strength = 5;

        cat2.fight(cat1);




    }

}
