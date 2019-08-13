package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ox = reader.readLine();
        String oy = reader.readLine();
        int x = Integer.parseInt(ox);
        int y = Integer.parseInt(oy);
        if ((x>0)&&(y>0)) System.out.println("1");// квадранты
        if ((x>0)&&(y<0)) System.out.println("4");
        if ((x<0)&&(y>0)) System.out.println("2");
        if ((x<0)&&(y<0)) System.out.println("3");

    }
}
