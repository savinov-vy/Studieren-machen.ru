package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

       int eur = 10;
       double course = 0.8;
        convertEurToUsd (eur, course);// зададим курс 1 для конвертации в методе convertEurToUsd (eur, course)
        System.out.println(convertEurToUsd(eur, course));
        eur = 20;
        course = 0.9;
        convertEurToUsd (eur, course);// зададим курс 2 для конвертации в методе convertEurToUsd (eur, course)

        System.out.print(convertEurToUsd(eur, course));

    }


    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        double USD = eur*course;   //вычисляем курc USD

        return USD;

    }
}
