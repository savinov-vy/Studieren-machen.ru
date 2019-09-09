package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/


import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        FileInputStream fr = new FileInputStream(fileName1);

        byte[] fileByte = new byte[fr.available()];
        fr.read(fileByte);
        fr.close();

        String str = new String(fileByte);

        String[] doubleMas = str.split(" ");
        FileWriter ops = new FileWriter(fileName2);
        for (String num : doubleMas) {
            ops.write(Math.round(Double.parseDouble(num)) + " ");
        }
        ops.close();

    }
}
