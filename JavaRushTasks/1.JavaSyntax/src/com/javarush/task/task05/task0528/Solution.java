package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.SimpleDateFormat;
import java.text.spi.DateFormatSymbolsProvider;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");  //  http://www.seostella.com/ru/article/2012/02/05/formatirovanie-daty-v-java.html
        System.out.println(dateFormat.format(currentDate));

    }
}
