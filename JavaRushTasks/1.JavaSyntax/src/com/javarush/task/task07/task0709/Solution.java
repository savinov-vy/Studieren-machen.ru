package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>(5);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        int lengMin = list.get(0).length();
        int indexMinLeng = 0;
        for (int i = 1; i < 5; i++) {
            String s = list.get(i);
            int leng = s.length();
            if (lengMin > leng) {
                lengMin = leng;
                indexMinLeng = i;
            }
        }
        ArrayList<String> listMinStr = new ArrayList<>(5);
        for (String s : list) {
            if (s.length() == list.get(indexMinLeng).length()) listMinStr.add(s);
        }
        for (String s : listMinStr) {
            System.out.println(s);

        }
    }
}
