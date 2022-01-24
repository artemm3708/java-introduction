package com.hillel.homework.hw11.createHundredPeople;

import java.util.Random;

public class Person {

    private String name;
    private String surname;
    private int age;
    private int weight;
    private int height;
    static Person[] people = new Person[100];
    static String[] testName = {"Artem", "Vitaliy", "Valeria", "Nastya", "Oleg", "Maria", "Valeriy"};
    static String[] testSurname = {"Ivanov", "Petrenko", "Petrov", "Gusev", "Yarmolenko", "Konoplyanka", "Yaremchuk"};

    public Person() {
        this.name = returnName();
        this.surname = returnSurname();
        this.age = randomAge();
        this.weight = randomWeight();
        this.height = randomHeight();
    }

    private static String returnName() {
        Random r = new Random();
        int random = r.nextInt(7);
        return testName[random];
    }

    private static String returnSurname() {
        Random r = new Random();
        int random = r.nextInt(7);
        return testSurname[random];
    }

    static int randomAge() {
        return (int) (Math.random() * (70 - 10) + 10);
    }

    int randomWeight() {
        if (this.age > 16) {
            return (int) (Math.random() * (100 - 50) + 50);
        } else {
            return (int) (Math.random() * (60 - 25) + 25);
        }
    }

    int randomHeight() {
        if (this.age < 16 && this.weight < 40) {
            return (int) (Math.random() * (145 - 120) + 120);
        } else if (this.age < 16 && this.weight > 40) {
            return (int) (Math.random() * (170 - 140) + 140);
        } else if (this.age > 16 && this.age < 25) {
            return (int) (Math.random() * (200 - 160) + 160);
        } else if (this.age >= 25 && this.weight > 70) {
            return (int) (Math.random() * (200 - 170) + 170);
        } else if (this.age >= 25 && this.weight < 70) {
            return (int) (Math.random() * (180 - 150) + 150);
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", surname: " + surname + ", age: " + age + ", weight: " + weight + ", height: " + height;
    }
}
