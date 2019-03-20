package com.javarush.task.task12.task1205;

/* 
Определимся с животным
*/
/*
Написать метод, который определяет, объект какого класса ему
        передали,и возвращает результат - одно
        значение из: "Корова", "Кит", "Собака", "Неизвестное животное".
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //Напишите тут ваше решение
        String animal = null;
        if (o instanceof Cow) {
            animal = "Корова";
        }
        if (o instanceof Dog) {
            animal = "Собака";
        }
        if (o instanceof Whale) {
            animal = "Кит";
        }
        if (o instanceof Pig) {
            animal = "Неизвестное животное";
        }
        return animal;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
