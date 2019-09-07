package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;
import java.nio.Buffer;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileWriter writer1 = new FileWriter(fileName1);
        FileInputStream inputStream1 = new FileInputStream(fileName2);
        FileInputStream inputStream2 = new FileInputStream(fileName3);

        FileOutputStream outputCh1 = new FileOutputStream(fileName1);
        FileOutputStream outputCh2 = new FileOutputStream(fileName1, true);

       byte[] buf1 = new byte[inputStream1.available()];
       byte[] buf2 = new byte[inputStream2.available()];

        while (inputStream1.available() > 0) {
            inputStream1.read(buf1);
            outputCh1.write(buf1);
        }
        while (inputStream2.available() > 0) {
            inputStream2.read(buf2);
            outputCh2.write(buf2);
        }
        writer1.close();
        inputStream1.close();
        inputStream2.close();
        outputCh1.close();
        outputCh2.close();
        reader.close();
    }
}
