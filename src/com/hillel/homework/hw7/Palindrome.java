package com.hillel.homework.hw7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String str = READER.readLine();
        String reverse = new StringBuffer(str).reverse().toString();

        isArrayPalindrome(str, reverse);


    }

    private static String reverseString(String str) throws IOException {
        char[] array = str.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result += array[i];
        }
        return result;
    }

    public static void isArrayPalindrome(String str, String reverse) throws IOException {
        if (str.equalsIgnoreCase(reverse)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }



    }

}
