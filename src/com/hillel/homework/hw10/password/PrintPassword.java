package com.hillel.homework.hw10.password;

public class PrintPassword {

    public static void main(String[] args) {

        PasswordConditions password = new PasswordConditions();
        password.length = 8;

        String finalPassword = GeneratePassword.newPassword(password);

        char[] arrayPassword = finalPassword.toCharArray();
        boolean haveSmallLetters = GeneratePassword.isHaveSmallLetters(password, arrayPassword);
        boolean haveBigLetters = GeneratePassword.isHaveBigLetters(password, arrayPassword);
        boolean haveNUmber = GeneratePassword.isHaveNUmber(password, arrayPassword);

        if (haveSmallLetters == true && haveBigLetters == true && haveNUmber == true) {
            System.out.println(finalPassword);
        } else {
            System.out.println("Try again: " + finalPassword);;
        }
    }
}
