package com.hillel.classwork.lesson5;

public class Truck {
    public static void main(String[] args) {

        int lenght = 10;
        int width = 20;
        int height = 30;
        int cargo = 58;
        System.out.println(calculateVolume(lenght, width, height));
        int volume = calculateVolume(lenght, width, height);
        System.out.println(totalWeight(cargo, volume));

    }

    public static int calculateVolume(int lenght, int width, int height) {
        int volume = lenght * width * height;
        return volume;
    }

    public static int totalWeight(int volume, int cargo) {
        int totalWeight = volume * cargo;
        return totalWeight;

    }


}
