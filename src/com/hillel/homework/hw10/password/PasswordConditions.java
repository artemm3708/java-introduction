package com.hillel.homework.hw10.password;

import java.util.Random;

public class PasswordConditions {

    char ch = '_';
    int length;
    Random r = new Random();

    public PasswordConditions() {
        System.out.println("Your password: ");
    }

    public char smallLetter() {
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        char lowLetter = smallLetters.charAt(r.nextInt(smallLetters.length()));
        return lowLetter;
    }

    public char bigLetter() {
        String bigLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char bigLetter = bigLetters.charAt(r.nextInt(bigLetters.length()));
        return bigLetter;
    }

    public char number() {
        String numbers = "0123456789";
        char number = numbers.charAt(r.nextInt(numbers.length()));
        return number;
    }

    public char whatSymbol() {
        int i = (int) (Math.random() * (5 - 1) + 1);

        if (i == 1) {
           return smallLetter();
        } else if (i == 2) {
            return bigLetter();
        } else if (i == 3) {
            return number();
        } else if (i == 4) {
            return ch;
        }
        return whatSymbol();
    }




}
