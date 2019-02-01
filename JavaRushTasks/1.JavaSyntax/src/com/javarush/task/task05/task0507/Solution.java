package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i = 0;
        double sum=0;
        while(true){

            String s = reader.readLine();
            double x = Double.parseDouble(s);
            if (x==-1) break;
            sum = sum+x;
            i++;
           }

        System.out.println(sum/i);
            
            
        }
        }



