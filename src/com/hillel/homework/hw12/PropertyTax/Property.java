package com.hillel.homework.hw12.PropertyTax;

public class Property {

    final static int TAX_K = 80;
    private int s;

    public Property(int s) {
        this.s = s;
    }

    public int calculateTax() {
        int tax = this.s * TAX_K;
        return tax;
    }

    @Override
    public String toString() {
        return "налог на недвижимость составляет: ";
    }
}
