package com.javarush.task.task06.task0609;

/* 
Расстояние между двумя точками
*/

import static java.lang.StrictMath.sqrt;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
       double d =  Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
       return d;
    }

    public static void main(String[] args) {

    }
}
