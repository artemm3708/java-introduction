package com.hillel.homework.hw11.family;

public class Person {

    String name;
    String surname;
    Person father;
    Person mother;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, Person father, Person mother) {
        this.name = name;
        this.surname = father.surname;
        this.father = father;
        this.mother = mother;
    }

    public String toString() {
        if (father == null && mother == null) {
            return "Имя: " + name + ", фамилия: " + surname + ", родителей нет";
        } else if (father == null) {
            return "Имя: " + name + ", фамилия: " + surname + ", мама: " + mother.name;
        } else if (mother == null) {
            return "Имя: " + name + ", фамилия: " + surname + ", папа: " + father.name;
        } else {
            return "Имя: " + name + ", фамилия: " + surname + ", родители: " + father.name + ", " + mother.name;
        }

    }

}
