package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        int numMaxS=0, numMinS=0, strLengthMax = 0, strLengthMin = 0;
        for (int i = 0; i < 10; i++) {

            String s = reader.readLine();
            if (strLengthMax < s.length()) {
                strLengthMax = s.length();
                numMaxS = i;
            }

            list.add(s);
        }
        strLengthMin = strLengthMax;
        for (int i = 0; i<list.size();i++){

            if (strLengthMin > list.get(i).length()) {
                strLengthMin = list.get(i).length();
                numMinS = i;
            }
        }
        if (numMaxS>numMinS) System.out.println(list.get(numMinS));
        else System.out.println(list.get(numMaxS));
    }
}
