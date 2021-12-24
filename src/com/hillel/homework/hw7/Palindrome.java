package com.hillel.homework.hw7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {


        String[] sentence = new String[6];

        fillArray(sentence);

        isArrayPalindrome(sentence);


    }

    private static void fillArray(String[] sentence) throws IOException {
        for (int i = 0; i < sentence.length; i++) {
             sentence[i] = READER.readLine();
         }
    }

    private static void isArrayPalindrome(String[] sentence) {
        if (sentence[0].equals(sentence[5]) && sentence[1].equals(sentence[4]) && sentence[2].equals(sentence[3])) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

}
