package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        int lengMax = 0;
        for (int i = 0; i < 5; i++) {
           String s = reader.readLine();
           int leng = s.length();
           if (lengMax < leng) lengMax = leng;
            strings.add(s);
        }

        for (int i = 0; i<strings.size(); i++){

            if (lengMax == strings.get(i).length()) System.out.println(strings.get(i));
        }
    }
}
