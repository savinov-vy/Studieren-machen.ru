package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));

        //напишите тут ваш код
        map.put("Ivanov", df.parse("JULY 1 1985"));
        map.put("Petrov", df.parse("AUGUST 4 1980"));
        map.put("Sidorov", df.parse("SEPTEMBER 25 1986"));
        map.put("Popov", df.parse("OCTOBER 14 1990"));
        map.put("Mashinkin", df.parse("NOVEMBER 16 1984"));
        map.put("Kolokolchikov", df.parse("DECEMBER 17 1960"));
        map.put("Migunov", df.parse("MARCH 3 1980"));
        map.put("Kodov", df.parse("MARCH 5 1970"));
        map.put("Sistemnik", df.parse("MARCH 9 1975"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();

            Date date = pair.getValue();
            int dateInt = date.getMonth();
            boolean b = (dateInt == 5 )|| (dateInt == 6 )|| (dateInt == 7);
            if (b) {
                iterator.remove();
            }

        }
    }
    public static void main(String[] args) {

    }
}
