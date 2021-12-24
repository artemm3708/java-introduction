package com.hillel.homework.hw7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rugby {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int[] firsTeam = new int[25];
        int[] secondTeam = new int[25];

        System.out.print("Возраст игроков первой команды: ");
        fillArray(firsTeam);

        System.out.println();
        System.out.print("Возраст игроков второй команды: ");
        fillArray(secondTeam);

        double team1 = averageAge(firsTeam);
        double team2 = averageAge(secondTeam);

        System.out.println();
        System.out.println("Средний возраст первой команды: " + averageAge(firsTeam));
        System.out.println("Средний возраст второй команды: " + averageAge(secondTeam));

        whichIsBigger(team1, team2);


    }

    public static void fillArray(int[] age) throws IOException {
        for (int i = 0; i < age.length; i++) {
            age[i] = (int) (20 + (Math.random() * 20));
            System.out.print(age[i] + ", ");
        }
    }

    public static double averageAge(int[] age) {
        int sum = 0;
        for (int i = 1; i < age.length; i++) {
            sum += age[i];
        }
        double average = (double) sum / age.length;
        return average;

    }

    public static void whichIsBigger(double team1, double team2) {
        if (team1 > team2) {
            System.out.println("Средний возраст первой команды выше");
        } else if (team2 > team1) {
            System.out.println("Средний возраст второй команды выше");
        } else {
            System.out.println("Средний возраст команд равен");
        }
    }

}
