package com.hillel.classwork.lesson5;

import org.w3c.dom.DOMImplementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromConsole {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str = reader.readLine();
        System.out.println("as string: " + str);

        Integer d = Integer.parseInt(str);
        System.out.println("as int: " + d);





    }


}
