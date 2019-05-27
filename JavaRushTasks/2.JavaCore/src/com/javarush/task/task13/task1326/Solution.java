package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import javafx.print.Collation;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
        ArrayList<Integer> list = new ArrayList<>();
        while (inputStream.ready()) {
            String strFile = inputStream.readLine();
            int numberStr = Integer.parseInt(strFile);
            list.add(numberStr);
        }
        Collections.sort(list);
        for (int e : list) {
            if (e % 2 == 0) System.out.println(e);
        }
        inputStream.close();

    }

}

