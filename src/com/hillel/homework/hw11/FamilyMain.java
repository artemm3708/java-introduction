package com.hillel.homework.hw11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FamilyMain {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Family son = new Family();
        System.out.println("Введите имя");
        son.name = READER.readLine();
        System.out.println("Введите фамилию");
        son.surname = READER.readLine();

        Family father = new Family();
        System.out.println("Введите имя");
        father.name = READER.readLine();

        Family mother = new Family();
        System.out.println("Введите имя");
        mother.name = READER.readLine();

        father.parent(son);
        mother.parent(son);

        System.out.println(son);
        System.out.println(father);
        father.printParent(son);
        System.out.println(mother);
        mother.printParent(son);
    }

}
