package com.hillel.homework.hw12.CoffeeMachine;

public class Cappuccino extends Coffee {

    private final int price = 28;

    @Override
    public int price() {
        return this.price;
    }

    @Override
    public void cook() {
        System.out.println("Капучино готовится");
    }
    @Override
    public String toString() {
        return "Cappuccino " + price;
    }

}
