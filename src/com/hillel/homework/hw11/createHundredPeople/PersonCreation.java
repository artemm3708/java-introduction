package com.hillel.homework.hw11.createHundredPeople;

import static com.hillel.homework.hw11.createHundredPeople.Person.*;

public class PersonCreation {

    public static void main(String[] args) {

        testPeople[0] = new Person("Artem", "Ivanov");
        testPeople[1] = new Person("Vitaliy", "Petrenko");
        testPeople[2] = new Person("Valeria", "Petrov");
        testPeople[3] = new Person("Nastya", "Gusev");
        testPeople[4] = new Person("Oleg", "Yarmolenko");
        testPeople[5] = new Person("Maria", "Konoplyanka");
        testPeople[6] = new Person("Valeriy", "Yaremchuk");

        createMember(people);
        randomAge();
        randomWeight();
        randomWeight();
        randomHeight();

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }


    }

}
