package com.javarush.task.task09.task0922;

import com.sun.corba.se.spi.orb.ParserData;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        SimpleDateFormat dateFormatOutSystem = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        SimpleDateFormat dateFormatInSystem = new SimpleDateFormat("yyyy-MM-d", Locale.ENGLISH);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        Date inputDate = dateFormatInSystem.parse(s);
        System.out.println(dateFormatOutSystem.format(inputDate).toUpperCase());

    }
}
//http://www.seostella.com/ru/article/2012/02/05/formatirovanie-daty-v-java.html