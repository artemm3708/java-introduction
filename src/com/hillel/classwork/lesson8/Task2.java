package com.hillel.classwork.lesson8;

import javax.print.DocFlavor;
import java.io.Reader;

public class Task2 {

    public static void main(String[] args) {

        int[] men = {20, 50, 34, 24, 89, 23, 25, 76, 67, 10};

        int index = 0;
        int max = men[index];
        for (int i = 1; i< men.length; i++) {
            if (men[i] > max) {
                max = men[i];
                index = i;
            }
        }

        System.out.println(index + " murder " + max);

    }

}
