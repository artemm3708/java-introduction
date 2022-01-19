package com.hillel.classwork.lesson12;

public class Cat {

    int age;
    int weight;
    int strength;


    public void fight(Cat cat) {

        if (this.age > cat.age && this.weight > cat.weight) {
            System.out.println("Првый кот выиграл");
        } else if (this.strength > cat.strength) {
            System.out.println("Второй кот выиграл");
        } else {
            System.out.println("Ничья");
        }

    }



}
