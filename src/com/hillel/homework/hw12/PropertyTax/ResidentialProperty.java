package com.hillel.homework.hw12.PropertyTax;

public class ResidentialProperty extends Property {

    private int sub;

    public ResidentialProperty(int s, int sub) {
        super(s);
        this.sub = sub;
    }

    public int calculateTax() {
        return super.calculateTax() + subsidies(this.sub);
    }

    public int subsidies (int sub) {
        int subsidies = (super.calculateTax() / 100) * sub;
        return subsidies;
    }

    @Override
    public String toString () {
        return "Налог на жилую недвижимость составляет: " + calculateTax();
    }
}
