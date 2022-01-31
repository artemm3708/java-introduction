package com.hillel.homework.hw12.CoffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainCook {

    final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        List<Coffee> coffeeChoice = new ArrayList<>();

        System.out.println("Выберите напитки:");
        System.out.println("americano, cappuccino, latte, tea");

        clientInput(coffeeChoice);

        int totalPrice = 0;
        for (Coffee drinks : coffeeChoice) {
            System.out.println(drinks);
            totalPrice += drinks.price();
        }

        System.out.println("1- подтвердить выбор, 2- вернуться к началу заказа");
        int finish = Integer.parseInt(READER.readLine());
        if (finish == 1) {
            for (Coffee drinks : coffeeChoice) {
                drinks.cook();
            }
        } else {
            clientInput(coffeeChoice);
        }

        System.out.println("Общая сумма: " + totalPrice);

    }

    private static void clientInput(List<Coffee> coffeeChoice) throws IOException {
        String input;
        while (!(input = READER.readLine()).equals("stop")) {
            coffeeChoice.add(clientChoice(input));
        }
    }

    private static Coffee clientChoice(String choice) throws IOException {

        switch (choice) {
            case "americano":
                return new Americano();
            case "cappuccino":
                return new Cappuccino();
            case "latte":
                return new Latte();
            case "tea":
                return new Tea();
            default:
                return clientChoice(choice);
        }
    }

}
