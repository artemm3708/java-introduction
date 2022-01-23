package com.hillel.homework.hw11.createHundredPeople;

import java.util.Random;

import static com.hillel.homework.hw11.createHundredPeople.Person.testPeople;

public class DefineName {

    static String returnName() {
        Random r = new Random();
        int random = r.nextInt(7);
        return testPeople[random].name;
    }

    static String returnSurname() {
        Random r = new Random();
        int random = r.nextInt(7);
        return testPeople[random].surname;
    }




}
