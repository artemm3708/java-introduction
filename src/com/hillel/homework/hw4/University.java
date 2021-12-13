package com.hillel.homework.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class University {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите оценку по математике: ");
        int gradeMath = Integer.parseInt(reader.readLine());
        System.out.println("Введите оценку по английскому: ");
        int gradeEnglish = Integer.parseInt(reader.readLine());
        System.out.println("Введите оценку по украинскому: ");
        int gradeUkrainian = Integer.parseInt(reader.readLine());
        System.out.println("Введите оценку по физике: ");
        int gradePhysics = Integer.parseInt(reader.readLine());
        System.out.println("Введите оценку по биологии: ");
        int gradeBiology = Integer.parseInt(reader.readLine());
        System.out.println("Ваш средний балл: " + gradeStudent(gradeMath, gradeEnglish, gradeUkrainian, gradePhysics, gradeBiology));

        falseInput(gradeMath, gradeEnglish, gradeUkrainian, gradePhysics, gradeBiology);

        float averageGrade = gradeStudent(gradeMath, gradeEnglish, gradeUkrainian, gradePhysics, gradeBiology);

        studentProgress(averageGrade);

    }

    public static float gradeStudent(int gradeMath, int gradeEnglish, int gradeUkrainian, int gradePhysics, int gradeBiology) {

        float averageGrade = (gradeMath + gradeEnglish + gradeUkrainian + gradePhysics + gradeBiology) / 5;
        return averageGrade;

    }

    public static void falseInput(int gradeMath, int gradeEnglish, int gradeUkrainian, int gradePhysics, int gradeBiology) {

        if (gradeMath > 12 || gradeMath < 1) {
            System.out.println("Проверьте правильность введенных данных");
        }
        if (gradeEnglish > 12 || gradeEnglish < 1) {
            System.out.println("Проверьте правильность введенных данных");
        }
        if (gradeUkrainian > 12 || gradeUkrainian < 1) {
            System.out.println("Проверьте правильность введенных данных");
        }
        if (gradePhysics > 12 || gradePhysics < 1) {
            System.out.println("Проверьте правильность введенных данных");
        }
        if (gradeBiology > 12 || gradeBiology < 1) {
            System.out.println("Проверьте правильность введенных данных");
        }
    }


    public static void studentProgress(double averageGrade) {
        if (averageGrade >= 10 && averageGrade <= 12) {
            System.out.println("Поздравляем, Вы получаете повышенную стипендию!");
        } else if (averageGrade >= 8 && averageGrade < 10) {
            System.out.println("Поздравляем, Вы получаете обычную стипендию!");
        } else if (averageGrade < 8 && averageGrade >= 1) {
            System.out.println("К сожалению, Вы не получаете стипендию");
        }


    }

}
