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

        String namePlane2 = "Airbus";
        System.out.println("Введите модель самолета Airbus чтобы узнать доп. информацию: ");
        String typePlane2 = reader.readLine();
        int economyClass = 100;

        String namePlane3 = "Boeing";
        System.out.println("Введите модель самолета Boeing чтобы узнать доп. информацию: ");
        String typePlane3 = reader.readLine();
        int economyClass2 = 130;
        int businessClass = 30;

        System.out.println(printAirplaneInfo("Тип самолета: " + namePlane1, ", модель самолета: " + typePlane1));
        System.out.println(printAirplaneInfo("Тип самолета: " + namePlane2, ", модель самолета: " + typePlane2 + ", кол-во мест эконом класса: " + economyClass2));
        System.out.println(printAirplaneInfo("Тип самолета: " + namePlane3, ", модель самолета: " + typePlane3 + ", кол-во мест эконом класса: " + economyClass2 + ", кол-во мест бизнесс класса: " + businessClass));
    }

    public static String printAirplaneInfo(String namePlane, String typePlane) {
        String plane1 = namePlane + typePlane;
        return plane1;
    }

    public static String printAirplaneInfo(String namePlane, String typePlane, int economyClass) {
        String plane2 = namePlane + typePlane + economyClass;
        return plane2;
    }

    public static String printAirplaneInfo(String namePlane, String typePlane, int economyClass, int businessClass) {
        String plane3 = namePlane + typePlane + economyClass + businessClass;
        return plane3;
    }


}
