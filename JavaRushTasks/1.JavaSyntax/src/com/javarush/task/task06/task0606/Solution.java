package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        int n = 0;
        for (int i=0; i<s.length();i++){

        if ((((a/10^n) - ((a/10^n)%1))%2)==0) {
            Solution.even++;
            n++;
        }
        else {
            Solution.odd++;
        }

        }
        System.out.println("Even: "+Solution.even +" Odd: "+Solution.odd);
    }

}
