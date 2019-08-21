package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());

        byte[] buf = new byte[inputStream.available()];
        while (inputStream.available() > 0) {
            inputStream.read(buf);
        }
        inputStream.close();
        for (int i = 0; i < buf.length / 2+buf.length%2; i++) {
            outputStream.write(buf[i]);
        }
        for (int i = buf.length / 2+buf.length%2; i < buf.length; i++) {
            outputStream2.write(buf[i]);
        }
        outputStream.close();
        outputStream2.close();
    }
}




