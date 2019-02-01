package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
        df.setLenient(true);
        Date date = df.parse(request.getParameter("date_parameter"));
        String formattedDate = df.format(date);
    }
}
