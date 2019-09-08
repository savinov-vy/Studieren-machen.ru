package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1Name = reader.readLine();
        String file2Name = reader.readLine();
        reader.close();
        FileInputStream file1Input = new FileInputStream(file1Name);
        byte[] bufFile1 = new byte[file1Input.available()];
        file1Input.read(bufFile1);
        file1Input.close();

        FileInputStream file2Input = new FileInputStream(file2Name);
        byte[] bufFile2 = new byte[file2Input.available()];
        file2Input.read(bufFile2);
        file2Input.close();
        //объединяем 2 массива байт в 1 массив
        byte[] result = Arrays.copyOf(bufFile2, bufFile2.length + bufFile1.length);
        System.arraycopy(bufFile1, 0, result, bufFile2.length, bufFile1.length);

        //записываем оба файла в раз
        FileOutputStream file2Output = new FileOutputStream(file1Name);
        file2Output.write(result);
        file2Output.close();




    }


}

