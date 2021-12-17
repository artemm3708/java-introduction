package com.hillel.classwork.lesson6;

public class Task1 {

    public static void main(String[] args) {

        String str1 = "text ";
        String str2 = "message ";
        String str3 = "one";
        int aa = 100;

        example(str1, str2);
        example(str1, str2, str3);
        example(str1, aa);

    }

    public static void example(String str1, String str2) {

        String str = str1 + str2;
        System.out.println(str);
    }

    public static void example(String str1, String str2, String str3) {

        String str = str1 + str2 + str3;
        System.out.println(str);
    }

    public static void example(String str1, int aa) {

        String str = str1 + aa;
        System.out.println(str);
    }

}
