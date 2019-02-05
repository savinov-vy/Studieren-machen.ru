package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //напишите тут ваш код
        int[] list = new int[5];

        for (int i = 0; i < list.length; i++) {
        String s = reader.readLine();
            list [i] = Integer.parseInt(s);
        }

        for (int i = list.length - 1; i>0;i--){
            for (int j = 0; j<i; j++){
                if (list[j]>list[j+1]) {
                    int tmp = list [j];
                    list[j] = list[j+1];
                    list[j+1] = tmp;
                }
            }
        }
        for (int n = 0; n<list.length; n++){
            System.out.println(list[n]);
        }
    }

}