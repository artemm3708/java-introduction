package com.hillel.homework.hw12.PropertyTax;

public class CommercialProperty extends Property {

    private int earnings;

    public CommercialProperty(int s, int earnings) {
        super(s);
        this.earnings = earnings;
    }

    public int calculateTax() {
        return super.calculateTax() + tax(this.earnings);
    }

    public static int tax (int earnings) {
        int tax;
        if (earnings <= 100) {
            tax = 0;
        } else if (earnings > 101 && earnings <= 1000) {
            tax = (earnings / 100) * 8;
        } else {
            tax = (earnings / 100) * 15;
        }
        return tax;
    }

    @Override
    public String toString () {
        return "Налог на торговую недвижимость составляет: " + calculateTax();
    }
}
