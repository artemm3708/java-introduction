package com.hillel.homework.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Airlines {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите название самолета: ");
        String namePlane1 = reader.readLine();
        System.out.println("Введите тип самолета: ");
        String typePlane1 = reader.readLine();
        System.out.println(printAirplaneInfo(namePlane1, typePlane1));

        String namePlane2 = "Airbus";
        System.out.println("Введите модель самолета Airbus чтобы узнать доп. информацию: ");
        String typePlane2 = reader.readLine();
        int economyClass = 100;
        System.out.println(printAirplaneInfo(namePlane2, typePlane2, economyClass));

        String namePlane3 = "Boeing";
        System.out.println("Введите модель самолета Boeing чтобы узнать доп. информацию: ");
        String typePlane3 = reader.readLine();
        int economyClass2 = 130;
        int businessClass = 30;
        System.out.println(printAirplaneInfo(namePlane3, typePlane3, economyClass2, businessClass));
    }

    public static String printAirplaneInfo(String namePlane, String typePlane) {
        String plane1 = "Тип самолета: " +  namePlane + ", модель самолета: " + typePlane;
        return plane1;
    }

    public static String printAirplaneInfo(String namePlane, String typePlane, int economyClass) {
        String plane2 = "Тип самолета: " +  namePlane + ", модель самолета: " + typePlane + ", кол-во мест эконом класса: " + economyClass;
        return plane2;
    }

    public static String printAirplaneInfo(String namePlane, String typePlane, int economyClass, int businessClass) {
        String plane3 = "Тип самолета: " +  namePlane + ", модель самолета: " + typePlane + ", кол-во мест эконом класса: " + economyClass + ", кол-во мест бизнесс класса: " + businessClass ;
        return plane3;
    }


}
