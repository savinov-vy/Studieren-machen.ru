package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы CanRun, CanSwim
*/
//Напиши public класс Human(человек) и public интерфейсы CanRun(бежать/ездить), CanSwim(плавать).
//        Добавь в каждый интерфейс по oдному методу.
//        Добавь эти интерфейсы классу Human, но не реализуй методы.
//        Объяви класс Human абстрактным.

public class Solution {
    public static void main(String[] args) {

    }
    public static abstract class Human implements CanSwim, CanRun{


    }
    public interface CanSwim{
       abstract void Rabbit();

    }
    public interface CanRun{
        abstract void Speed();


    }

    //add public interfaces and a public class here - добавь public интерфейсы и public класс тут
}
