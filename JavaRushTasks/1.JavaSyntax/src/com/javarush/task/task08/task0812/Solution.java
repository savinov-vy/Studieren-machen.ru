package com.javarush.task.task08.task0812;

import javafx.print.Collation;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();

            list.add(Integer.parseInt(s));

        }
        ArrayList<Integer> listCounts = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;
                listCounts.add(count);
            } else {
                listCounts.add(count);
                count = 1;
            }
        }
        int listCountMaxNumber = Collections.max(listCounts);
        System.out.println(listCountMaxNumber);
    }


}