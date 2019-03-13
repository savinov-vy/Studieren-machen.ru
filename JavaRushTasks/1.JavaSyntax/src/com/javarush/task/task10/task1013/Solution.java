package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name, sityOfResidence, pet, edukation;
        private int age;
        private boolean sex;

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;

        }

        public Human(String name, int age, boolean sex, String sityOfResidence) {
            this.name = name;
            this.age = age;
            this.sex = sex;

        }

        public Human(String name, String sityOfResidence, String pet, String edukation, int age, boolean sex) {
            this.name = name;
            this.sityOfResidence = sityOfResidence;
            this.pet = pet;
            this.edukation = edukation;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String sityOfResidence, String pet, int age) {
            this.name = name;
            this.sityOfResidence = sityOfResidence;
            this.pet = pet;
            this.age = age;
        }

        public Human(String name, String edukation, int age, boolean sex) {
            this.name = name;
            this.edukation = edukation;
            this.age = age;
            this.sex = sex;
        }

        public Human(String sityOfResidence, String edukation, int age) {
            this.sityOfResidence = sityOfResidence;
            this.edukation = edukation;
            this.age = age;
        }

        public Human(boolean sex) {
            this.sex = sex;
        }

        public Human(String sityOfResidence, String pet, String edukation, int age, boolean sex) {
            this.sityOfResidence = sityOfResidence;
            this.pet = pet;
            this.edukation = edukation;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, String sityOfResidence, String pet, String edukation) {
            this.name = name;
            this.sityOfResidence = sityOfResidence;
            this.pet = pet;
            this.edukation = edukation;
        }
    }
}
