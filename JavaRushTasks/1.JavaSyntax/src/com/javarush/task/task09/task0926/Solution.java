package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        int[] mas1 = {1, 23, 3, 4, 5};
        int[] mas2 = {8, 9};
        int[] mas3 = {7, 8, 9, 0};
        int[] mas4 = {1, 2, 3, 4, 5, 6, 7};
        int[] mas5 = new int[0];
        ArrayList<int[]> listMas = new ArrayList<>();
        listMas.add(mas1);
        listMas.add(mas2);
        listMas.add(mas3);
        listMas.add(mas4);
        listMas.add(mas5);
        return listMas;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
