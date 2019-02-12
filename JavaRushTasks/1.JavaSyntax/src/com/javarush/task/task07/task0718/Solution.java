package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        int i=0;
        while ( true) {
            String s = reader.readLine();
           if(s.isEmpty()) break;
            list.add(s);

                   }
        for (int j = 1; j < list.size(); j++) {

            if (list.get(j-1).length()>=list.get(j).length()) {
                System.out.print(j);
                break;}

        }
    }


}

