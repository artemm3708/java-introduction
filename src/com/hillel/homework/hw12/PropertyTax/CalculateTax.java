package com.hillel.homework.hw12.PropertyTax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class CalculateTax {

    final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Введите тип вашей недвижимости:");
        System.out.println("1 - жилая; 2 - торговая; 3 - производственная");

        int decision = Integer.parseInt(READER.readLine());

        switch (decision) {
            case 1:
                calculateResidentialTax();
                break;
            case 2:
                calculateCommercialTax();
                break;
            case 3:
                calculateIndustrialTax();
                break;

        }
    }

    public static void calculateResidentialTax() throws IOException {
        System.out.println("Введите площадь вашей недвижимости");
        int s = Integer.parseInt(READER.readLine());
        System.out.println("Введите ваши субсидии");
        int sub = Integer.parseInt(READER.readLine());
        Property residential = new ResidentialProperty(s, sub);
        residential.calculateTax();
        System.out.println(residential);
    }

    public static void calculateCommercialTax() throws IOException {
        System.out.println("Введите площадь вашей недвижимости");
        int s = Integer.parseInt(READER.readLine());
        System.out.println("Введите вашу выручку");
        int earning = Integer.parseInt(READER.readLine());
        Property commercial = new CommercialProperty(s, earning);
        commercial.calculateTax();
        System.out.println(commercial);
    }

    public static void calculateIndustrialTax() throws IOException {
        System.out.println("Введите площадь вашей недвижимости");
        int s = Integer.parseInt(READER.readLine());
        Property industrial = new IndustrialProperty(s);
        industrial.calculateTax();
        System.out.println(industrial);
    }

}
