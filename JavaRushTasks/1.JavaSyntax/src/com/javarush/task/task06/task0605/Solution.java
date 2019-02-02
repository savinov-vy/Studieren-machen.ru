package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
                                                                // Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)

            double indexMas;
            indexMas = weight/(height*height);                  // идекс массы тела

              if(indexMas<18.5) System.out.println("Недовес: меньше чем 18.5");      //"Недовес: меньше чем 18.5" - если индекс массы тела меньше 18.5,
              else if ((indexMas>=18.5)&&(indexMas<=24.9))System.out.println("Нормальный: между 18.5 и 24.9");     //"Нормальный: между 18.5 и 24.9" - если индекс массы тела между 18.5 и 24.9,
              else if ((indexMas>=25)&&(indexMas<=29.9))System.out.println("Избыточный вес: между 25 и 29.9");     // "Избыточный вес: между 25 и 29.9" - если индекс массы тела между 25 и 29.9,
              else if(indexMas>=30) System.out.println("Ожирение: 30 или больше");                           // "Ожирение: 30 или больше" - если индекс массы тела 30 или больше.

        }
    }
}
