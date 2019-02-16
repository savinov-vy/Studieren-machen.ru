package com.javarush.task.task07.task0723;

/* 
Обратный отсчёт
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);

            //напишите тут ваш код
            Thread.sleep(1000);
        }

        System.out.println("Оля Привет!!!! ПЫДЫДЫЩЩЩЩ!!!!");
    }
}
