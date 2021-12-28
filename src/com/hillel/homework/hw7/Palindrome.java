package com.hillel.homework.hw7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Напишите предложение: ");
        String str = READER.readLine();
        str = str.replaceAll("\\s+", "");
        System.out.println(str);

        System.out.println(reverseString(str));
        isArrayPalindrome(str, reverseString(str));


    }

    public static String reverseString(String str) {
        char[] array = str.toCharArray();
        String reverse = "";
        for (int i = array.length - 1; i >= 0; i--) {
            reverse += array[i];
        }
        return reverse = reverse.replaceAll("\\s+", "");
    }

    public static void isArrayPalindrome(String str, String reverse) throws IOException {
        if (str.equalsIgnoreCase(reverse)) {
            System.out.println("Ваша строка палиндром");
        } else {
            System.out.println("Ваша строка не является палиндромом");
        }

    }

}
