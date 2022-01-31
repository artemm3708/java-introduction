package com.hillel.homework.hw12.CoffeeMachine;

public class Tea extends Coffee {

    private int price = 25;

    @Override
    public int price() {
        return this.price;
    }

    @Override
    public void cook() {
        System.out.println("Чай готовится");
    }

    @Override
    public String toString() {
        return "Tea " + price;
    }
}
