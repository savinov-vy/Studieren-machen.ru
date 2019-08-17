package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeSet;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        TreeSet<Integer> set = new TreeSet<>();
        while (fileInputStream.available() > 0) {
            set.add(fileInputStream.read());
        }
        System.out.println(set.first());
        fileInputStream.close();
    }

}

