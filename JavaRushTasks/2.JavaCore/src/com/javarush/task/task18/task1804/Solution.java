package com.javarush.task.task18.task1804;

import javafx.print.Collation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();
        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }
        fileInputStream.close();
        int count = Collections.frequency(list, list.get(0));
        for (int i = 0; i < list.size(); i++) {
            if (Collections.frequency(list, list.get(i)) < count) {
                count = Collections.frequency((list), list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if ((count == Collections.frequency(list, list.get(i))) && (!list2.contains(list.get(i)))) {
                System.out.print(list.get(i)+" ");
                list2.add(list.get(i));
            }
        }
    }
}
