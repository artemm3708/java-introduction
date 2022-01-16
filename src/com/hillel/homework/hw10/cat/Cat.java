package com.hillel.homework.hw10.cat;

public class Cat {

    String name;
    String breed;
    int age;
    double weight;

    public Cat() {
        System.out.println("Cat has been created");
    }

    public Cat(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Cat: " +
                "name = " + name +
                ", breed = " + breed +
                ", age = " + age +
                ", weight = " + weight +
                " kgs.";
    }

    public boolean equals(Object obj) {

        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;

            if (this.weight == cat.weight && this.age == cat.age) {
                return true;
            }
        }
        return false;
    }

}
