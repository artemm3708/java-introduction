package com.hillel.homework.hw11.createHundredPeople;

import static com.hillel.homework.hw11.createHundredPeople.Person.people;

public class PersonCreation {

    public static void main(String[] args) {

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person();
        }

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}
