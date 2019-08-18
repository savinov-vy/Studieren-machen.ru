package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> listByte = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        while (fileInputStream.available() > 0) {
            listByte.add(fileInputStream.read());
        }
        fileInputStream.close();
        int countMax = 0;
        for (int i = 0; i < listByte.size(); i++) {
            int num = Collections.frequency(listByte, listByte.get(i));
            if (countMax<num) countMax = num;
        }
        for (int i = 0; i < listByte.size(); i++) {
            if (countMax == Collections.frequency(listByte, listByte.get(i))) {
                if (!list2.contains(listByte.get(i))){
                    System.out.print(listByte.get(i)+" ");
                    list2.add(listByte.get(i));
                }
            }
        }
        }
        }