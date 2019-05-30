package com.javarush.task.task12.task1207;

/* 
Int и Integer
*/
/* Написать два метода: print(int) и print(Integer).
   Написать такой код в методе main, чтобы вызвались они оба.*/

public class Solution {
    public static void main(String[] args) {
        int a = 10;
        //Напишите тут ваши методы


        print(a);
        Integer b = new Integer(20);
        print(b);

    }

    public static void print(int a) {
        System.out.println(a);
    }

    public static void print(Object b) {
        System.out.print(b);
    }

}
