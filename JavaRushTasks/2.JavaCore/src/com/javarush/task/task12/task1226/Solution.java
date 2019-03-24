package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

/*Требования:
        1. Класс Solution должен содержать интерфейс CanFly с методом void fly().
        2. Класс Solution должен содержать интерфейс CanClimb с методом void climb().
        3. Класс Solution должен содержать интерфейс CanRun с методом void run().
        4. Объект класса Cat должен уметь бегать(поддерживать интерфейс CanRun) и лазить по деревьям(поддерживать интерфейс CanClimb).
        5. Объект класса Dog должен уметь бегать(поддерживать интерфейс CanRun).
        6. Класс Tiger должен быть котом.
        7. Объект класса Duck должен уметь бегать(поддерживать интерфейс CanRun) и летать(поддерживать интерфейс CanFly).*/

public class Solution {

    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanClimb {
        void climb();
    }

    public interface CanRun {
        void run();
    }

    public class Cat implements CanClimb, CanRun {
        @Override
        public void climb() {

        }

        @Override
        public void run() {

        }
    }

    public class Dog implements CanRun {
        @Override
        public void run() {

        }
    }

    public class Tiger extends Cat {
    }


    public class Duck implements CanRun, CanFly {
        @Override
        public void fly() {

        }

        @Override
        public void run() {

        }
    }
}
