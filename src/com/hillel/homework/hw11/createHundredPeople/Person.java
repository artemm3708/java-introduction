package com.hillel.homework.hw11.createHundredPeople;

import static com.hillel.homework.hw11.createHundredPeople.DefineName.returnName;
import static com.hillel.homework.hw11.createHundredPeople.DefineName.returnSurname;

public class Person {

    String name;
    String surname;
    int age;
    int weight;
    int height;
    static Person[] testPeople = new Person[7];
    static Person[] people = new Person[100];

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static void createMember(Person[] people) {
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person(returnName(), returnSurname());
        }
    }



    public static void randomAge() {
        for (int i = 0; i < people.length; i++) {
            people[i].age = (int) (Math.random() * (70 - 10) + 10);
        }
    }

    public static void randomWeight() {
        for (int i = 0; i < people.length; i++) {
            if (people[i].age > 16) {
                people[i].weight = (int) (Math.random() * (100 - 50) + 50);
            } else if (people[i].age <= 16) {
                people[i].weight = (int) (Math.random() * (60 - 25) + 25);
            }
        }
    }

    public static void randomHeight() {
        for (int i = 0; i < people.length; i++) {
            if (people[i].age < 16 && people[i].weight < 40) {
                people[i].height = (int) (Math.random() * (145 - 120) + 120);
            } else if (people[i].age < 16 && people[i].weight > 40) {
                people[i].height = (int) (Math.random() * (170 - 140) + 140);
            } else if (people[i].age > 16 && people[i].age < 25) {
                people[i].height = (int) (Math.random() * (200 - 160) + 160);
            } else if (people[i].age >= 25 && people[i].weight > 70) {
                people[i].height = (int) (Math.random() * (200 - 170) + 170);
            } else if (people[i].age >= 25 && people[i].weight < 70) {
                people[i].height = (int) (Math.random() * (180 - 150) + 150);
            }
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", surname: " + surname + ", age: " + age + ", weight: " + weight + ", height: " + height;
    }


}
