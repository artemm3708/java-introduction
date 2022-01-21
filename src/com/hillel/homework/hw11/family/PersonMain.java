package com.hillel.homework.hw11.family;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonMain {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введите имя и фамилию отца: ");
        Person father = new Person(READER.readLine(), READER.readLine());
        System.out.println("Введите имя и фамилию мамы: ");
        Person mother = new Person(READER.readLine(), READER.readLine());
        Person son = new Person("Artem", father, mother);

        System.out.println(son);

        System.out.println("Введите имя и фамилию мамы: ");
        Person mother2 = new Person(READER.readLine(), READER.readLine());
        System.out.println("Введите имя и фамилию ребенка: ");
        Person son2 = new Person(READER.readLine(), READER.readLine());
        son2.mother = mother2;

        System.out.println(son2);

    }

}
