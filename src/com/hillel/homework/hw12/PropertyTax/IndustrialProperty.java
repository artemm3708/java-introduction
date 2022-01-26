package com.hillel.homework.hw12.PropertyTax;

public class IndustrialProperty extends Property{

    public IndustrialProperty(int s) {
        super(s);
    }

    @Override
    public String toString () {
        return "Налог на производственную недвижимость составляет: " + calculateTax();
    }
}
