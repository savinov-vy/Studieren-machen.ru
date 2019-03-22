package com.javarush.task.task12.task1215;

/* 
Кошки не должны быть абстрактными!
*/
/*Кошки не должны быть абстрактными!
        Унаследуй классы Cat и Dog от Pet.
        Реализуй недостающие методы.
        Классы Cat и Dog не должны быть абстрактными.*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet{
        Cat cat = new Cat();
        @Override
        public String getName() {
            return "Мурка";
        }

        @Override
        public Pet getChild() {

            return cat;
        }
    }

    public static class Dog extends Pet {
        Dog dog = new Dog();
        @Override
        public String getName() {
            return "Бобик";
        }

        @Override
        public Pet getChild() {
            return dog;
        }
    }

}
