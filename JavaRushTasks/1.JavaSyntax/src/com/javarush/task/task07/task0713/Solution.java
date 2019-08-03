package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> listMain = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            int n = Integer.parseInt(reader.readLine());
            listMain.add(n);

        }
        for (Integer a : listMain) {

            if (a % 3 == 0) list3.add(a);
            if (a % 2 == 0) list2.add(a);
            if ((a % 3 != 0) && (a % 2 != 0)) list.add(a);


            printList(list3);

            printList(list2);

            printList(list);
        }
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i : list) {
            System.out.println(i);
        }
    }
}
