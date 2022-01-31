package com.hillel.homework.hw12.CoffeeMachine;

public class Latte extends Coffee {

    private int price = 35;

    @Override
    public int price() {
        return this.price;
    }

    @Override
    public void cook() {
        System.out.println("Латте готовится");
    }

    @Override
    public String toString() {
        return "Latte " + price;
    }
}
