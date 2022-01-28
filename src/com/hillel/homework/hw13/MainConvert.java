package com.hillel.homework.hw13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainConvert {

    final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("input degrees");
        int userInput = Integer.parseInt(READER.readLine());

        System.out.println("В какую систему хотите преобразовать: ");
        String userType = READER.readLine();

        convert(defineDegrees(userInput, userType));
    }

    private static void convert(Converter converter) {
        converter.convert();
    }

    private static Degrees defineDegrees(int userInput, String userType) {
        switch (userType) {
            case "фаренгейт":
                return new Farengeit(userInput);
            case "кельвин":
                return new Kelvin(userInput);
            default:
                throw new IllegalArgumentException("Unknown degrees name" + userType);
        }
    }
}
