package com.javarush.task.task12.task1206;

/* 
Выполняем перегрузку!
*/
//Написать два метода: print(int) и print(String).


public class Solution {
    public static void main(String[] args) {

    }
        //Напишите тут ваши методы
        public static void print(Object a){
            System.out.println(a);
        }

        public static void print (String s){
            System.out.println(s);
        }

}
