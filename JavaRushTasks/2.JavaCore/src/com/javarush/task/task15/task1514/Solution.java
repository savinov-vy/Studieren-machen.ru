package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }
    static {
        labels.put(1d, "Один");
        labels.put(2d, "Два");
        labels.put(3d, "Три");
        labels.put(4d, "Четыре");
        labels.put(5d, "Пять");

    }
}
