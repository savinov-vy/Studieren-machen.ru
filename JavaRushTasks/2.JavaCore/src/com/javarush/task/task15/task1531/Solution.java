package com.javarush.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        String res = null;
        if (n > 0) {
            BigInteger result = BigInteger.valueOf(1);

            for (int i = n; i > 1; i--) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            res = result.toString();
        } else if (n == 0) {
            res = "1";
        } else if (n < 0) {
            res = "0";
        }
        return res;
    }
}
