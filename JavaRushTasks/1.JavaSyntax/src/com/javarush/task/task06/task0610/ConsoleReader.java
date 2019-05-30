package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return  s;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader readerInt = new BufferedReader(new InputStreamReader(System.in));
        String s = readerInt.readLine();
        int a = Integer.parseInt(s);
        return  a;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader readerDouble = new BufferedReader(new InputStreamReader(System.in));
        String s = readerDouble.readLine();
        Double a = Double.parseDouble(s);
        return  a;

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader readerBoolean = new BufferedReader(new InputStreamReader(System.in));
        String s = readerBoolean.readLine();
        Boolean a = Boolean.parseBoolean(s);
        return  a;
    }

    public static void main(String[] args) {

    }
}
