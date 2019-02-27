package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(dogs, cats);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> resultCat = new HashSet<Cat>();
        //напишите тут ваш код
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        resultCat.add(cat1);
        resultCat.add(cat2);
        resultCat.add(cat3);
        resultCat.add(cat4);
        return resultCat;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        HashSet<Dog> resultDog = new HashSet<Dog>();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        resultDog.add(dog1);
        resultDog.add(dog2);
        resultDog.add(dog3);
        return resultDog;
    }

    public static Set<Object> join(Set<Dog> dogs, Set<Cat> cats) {
        //напишите тут ваш код
        Set<Cat> cat = cats;
        Set<Dog> dog = dogs;
        Set<Object> dogAndCat = new HashSet<>();
        dogAndCat.addAll(dog);
        dogAndCat.addAll(cat);

        return dogAndCat;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        for (Cat cat: cats){
            pets.remove(cat);
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object dogAndCat : pets) {
            System.out.println(dogAndCat);
        }
    }

    //напишите тут ваш код
    public static class Dog{}
    public static class Cat{}
}
