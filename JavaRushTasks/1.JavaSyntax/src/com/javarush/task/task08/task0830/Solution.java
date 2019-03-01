package com.javarush.task.task08.task0830;

import javafx.print.Collation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {

        //напишите тут ваш код

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
               if( isGreaterThan(array[j], array[j-1]) == false) {
                   String tmp = array[j-1];
                   array[j - 1] = array[j];
                   array [j] = tmp;

               }
            }

            }

    }




    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
// https://vertex-academy.com/tutorials/ru/sortirovka-puzyrkom-v-java/
//http://proglang.su/java/strings-compareto
//   https://javarush.ru/groups/posts/1885-metod-compareto