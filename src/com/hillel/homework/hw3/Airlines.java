package com.hillel.homework.hw3;

public class Airlines {

    public static void main(String[] args) {


        System.out.println(printAirplaneInfo());
        System.out.println(printAirplaneInfo("Airbus", " A320 ", 110));


    }

    public static String printAirplaneInfo() {
        String typePlane = "Тип самолета: Jet, ";
        String modelPlane = "модель: CY-57 ";

        return typePlane + modelPlane;

    }

    public static String printAirplaneInfo(String typePlane, String modelPlane, int economyClass) {
        return typePlane + modelPlane + economyClass;


    }


}
