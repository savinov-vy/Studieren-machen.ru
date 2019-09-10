package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        FileInputStream isf = new FileInputStream(args[0]);  // run -> edit Configurations -> program arguments
        byte[] data = new byte[isf.available()];
        isf.read(data);
        int count = 0;

        Map<Character, Integer> mapAnswer = new TreeMap<>();
        for (byte datMas : data) {
            char ch = (char) datMas;
            mapAnswer.put(ch, count);
        }
        for (Map.Entry<Character, Integer> pair : mapAnswer.entrySet()) {
            count = 0;
            for (byte datMas : data) {
                char ch = (char) datMas;
                if (pair.getKey() == ch) count++;
            }
            mapAnswer.put(pair.getKey(), count);
        }
        for (Map.Entry<Character, Integer> entry: mapAnswer.entrySet())
        System.out.println(entry.getKey() + " " + entry.getValue());
        isf.close();
    }
}

