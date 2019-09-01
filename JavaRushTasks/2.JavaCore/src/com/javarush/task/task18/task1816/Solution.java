package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {

        FileInputStream inputStream = new FileInputStream(new File(args[0]));
        String abc = "qwertyuiopasdfghjklzxcvbnm";
        int count = 0;
        while (inputStream.available() > 0) {
        char ch = (char)inputStream.read();
        String str = Character.toString(ch);
        if (abc.contains(str.toLowerCase())) count++;

        }
        inputStream.close();
        System.out.println(count);
    }
}