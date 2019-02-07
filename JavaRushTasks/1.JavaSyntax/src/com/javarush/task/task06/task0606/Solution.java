package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);

        while (a>0){

        if (a%2==0) {
            Solution.even++;
         }
        else {
            Solution.odd++;
        }
        a=a/10;
        }
        System.out.println("Even: "+Solution.even +" Odd: "+Solution.odd);

        }

    }


