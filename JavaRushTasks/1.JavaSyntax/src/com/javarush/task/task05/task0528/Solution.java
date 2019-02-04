package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        int a = 0;

        int b = 5;
        b = b + 1;

        int c = getZ(a, b);

        String str;

        System.out.println(c);
        //напишите тут ваш код

        int z = getZ(a, 5);

    }

    private static int getZ(int a, int i) {
        a = getA(a, 1);
        return getA(a, i);
    }

    private static int getA(int a, int i) {
        return a + i;
    }



}
