package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        HashMap<String, String> monthsMap = new HashMap<>();
        monthsMap.put("January", "January is the 1 month");
        monthsMap.put("February", "February is the 2 month");
        monthsMap.put("March", "March is the 3 month");
        monthsMap.put("April", "April is the 4 month");
        monthsMap.put("May", "May is the 5 month");
        monthsMap.put("June", "June is the 6 month");
        monthsMap.put("July", "July is the 7 month");
        monthsMap.put("August", "August is the 8 month");
        monthsMap.put("September", "September is the 9 month");
        monthsMap.put("October", "October is the 10 month");
        monthsMap.put("November", "November is the 11 month");
        monthsMap.put("December", "December is the 12 month");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(monthsMap.get(reader.readLine()));
    }
}