package com.hillel.homework.hw13;

public class Kelvin extends Degrees {

    public Kelvin(int degrees) {
        this.degrees = degrees;
    }

    @Override
    public void convert() {
        double c = this.degrees + 273.15;
        System.out.println("Температура по Кельвину равна: " + c);
    }
}
