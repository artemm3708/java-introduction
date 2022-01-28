package com.hillel.homework.hw13;

public abstract class Degrees implements Converter {

    protected int degrees;

    public Degrees() {

    }

    @Override
    public String toString() {
        return "температура равна: " + degrees;
    }
}
