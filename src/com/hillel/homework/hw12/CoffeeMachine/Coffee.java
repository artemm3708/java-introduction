package com.hillel.homework.hw12.CoffeeMachine;

public abstract class Coffee {

    int price;

    public int price() {
        return this.price;
    }

    public abstract void cook();
}
