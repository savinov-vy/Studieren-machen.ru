package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] Street = new int[15];
        int sumNeg=0;
        int sumPos=0;
        for (int i = 0; i<15; i++){
            String s = reader.readLine();
            Street [i] = Integer.parseInt(s);
            if (i==0) sumPos +=  Street [i];
            else if (i%2 ==0) sumPos +=  Street [i];
            else if (i%2 !=0) sumNeg +=  Street [i];
        }
        if (sumNeg>sumPos) System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else System.out.println("В домах с четными номерами проживает больше жителей.");
    }
}
