package com.javarush.task.task12.task1225;

/* 
Посетители
*/
/*Напиши метод, который определяет, какой объект передали в него.
        Программа должна выводить на экран одну из надписей:
        "Кот", "Тигр", "Лев", "Бык", "Корова", "Животное".

        Замечание:
        постарайся определять тип животного как можно более точно.*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        //напишите тут ваш код
        String animalInObj = null;
        if ( o instanceof Animal) animalInObj = "Животное";
        if ( o instanceof Cat) animalInObj = "Кот";
        if ( o instanceof Tiger) animalInObj = "Тигр";
        if ( o instanceof Lion) animalInObj = "Лев";
        if ( o instanceof Bull) animalInObj = "Бык";
        if ( o instanceof Cow) animalInObj = "Корова";

        return animalInObj;
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
