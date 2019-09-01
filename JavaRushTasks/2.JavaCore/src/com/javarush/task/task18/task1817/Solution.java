package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.File;
import java.io.FileInputStream;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream inputStream = new FileInputStream(new File(args[0]));
        int chCount = 0;
        int spaceCount =0;
        while (inputStream.available()>0){
        char ch = (char)inputStream.read();
        chCount++;
            String chToStr = Character.toString(ch);
        if (chToStr.equals(" ")) spaceCount++;
        }
        inputStream.close();
        double answer = ((double) spaceCount/chCount)*100;
        System.out.printf("% .2f %n",answer);

    }
}
