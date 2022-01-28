package com.hillel.homework.hw13;

public class Farengeit extends Degrees {

    public Farengeit(int degrees) {
        this.degrees = degrees;
    }

    @Override
    public void convert() {
        double c = (this.degrees * 1.8 + 32);
        System.out.println("Температура по Фаренгейту равна: " + c);
    }

}
