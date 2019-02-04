package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        int sum = a+b;
        return sum;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        int diff = a-b;
        return diff;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        int mult = a*b;
        return mult;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        double div = (double)a/b;
        return div;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        double a1 = a;
        double b1 = b;
        double pers =a1*b1/100;
        return pers;
    }

    public static void main(String[] args) {

    }
}