package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код

        ArrayList<String>[] masListStrings = new ArrayList[2];

        ArrayList<String> listString1 = new ArrayList<>();
        ArrayList<String> listString2 = new ArrayList<>();
        listString1.add("мама мыла раму");
        listString1.add("мама собиралась гулять");
        listString2.add("мама пошла в магазин");
        listString2.add("мама пошла едет на машине");
        masListStrings[0] = listString1;
        masListStrings[1] = listString2;
        return masListStrings;


    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}