package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;


/*Работа с датой Date*/


public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) throws ParseException {

        SimpleDateFormat dateFormatInSystem = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);
        Date inputDate = dateFormatInSystem.parse(date);
        int inputStartYear = inputDate.getYear();

        Calendar calendar = new GregorianCalendar(inputStartYear, 0, 1, 0, 0, 0);
        Date yearStartTime = calendar.getTime();
        long msDelay = inputDate.getTime() - yearStartTime.getTime();
        long msDay = 1000 * 60 * 60 * 24;
        int dayCount = (int) (msDelay / msDay);

        return (dayCount) % 2 == 0;
    }
}