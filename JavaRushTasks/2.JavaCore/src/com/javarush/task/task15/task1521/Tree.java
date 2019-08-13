package com.javarush.task.task15.task1521;

public class Tree {
    public static int globalNumber;
    public int number;

    public Tree() {
        this.number = ++globalNumber;
    }

    public void info(Object s) {
        System.out.println(String.format("Дерево № %d , метод Object, параметр %s", number, s.getClass().getSimpleName()));
    }

    public void info(Number s) {
        System.out.println(String.format("Дерево № %d , метод Number, параметр %s", number, s.getClass().getSimpleName()));
    }

    public void info(String s) {
        System.out.println(String.format("Дерево № %d , метод String, параметр %s", number, s.getClass().getSimpleName()));
    }
}
/*
4. Метод info(Number s) должен выводить на экран
        строку аналогичную строке из метода info(Object s),
        заменив лишь фразу("метод Object" на "метод Number").
5. Метод info(String s) должен выводить на экран строку
        аналогичную строке из метода info(Object s), заменив лишь
        фразу("метод Object" на "метод String").
*/
