package com.hillel.homework.hw12.CoffeeMachine;

public class Americano extends Coffee {

    private final int price = 30;

    @Override
    public int price() {
        return this.price;
    }

    @Override
    public void cook() {
        System.out.println("Американо готовится");
    }

    @Override
    public String toString() {
        return "Americano " + price;
    }
}
