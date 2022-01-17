package com.hillel.homework.hw10.password;

public class GeneratePassword {

    public static String newPassword(PasswordConditions password) {
        String newPassword = "";
        for (int i = 0; i < password.length; i++) {
            newPassword += password.whatSymbol();
        }
        return newPassword;
    }

    public static boolean isHaveSmallLetters(PasswordConditions password, char[] ch) {
        boolean haveSmallLetters = false;
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        char[] c = smallLetters.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (ch[i] == c[j]) {
                    haveSmallLetters = true;
                }
            }
        }
        return haveSmallLetters;
    }

    public static boolean isHaveBigLetters(PasswordConditions password, char[] ch) {
        boolean haveBigLetters = false;
        String bigLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] c = bigLetters.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (ch[i] == c[j]) {
                    haveBigLetters = true;
                }
            }
        }
        return haveBigLetters;
    }

    public static boolean isHaveNUmber(PasswordConditions password, char[] ch) {
        boolean haveNUmber = false;
        String numbers = "0123456789";
        char[] c = numbers.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < numbers.length(); j++) {
                if (ch[i] == c[j]) {
                    haveNUmber = true;
                }
            }
        }
        return haveNUmber;
    }

}
