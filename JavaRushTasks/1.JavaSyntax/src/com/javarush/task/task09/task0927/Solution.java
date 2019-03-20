package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Cat cat1 = new Cat("Vaska");
        Cat cat2 = new Cat("Murzik");
        Cat cat3 = new Cat("Barsik");
        Cat cat4 = new Cat("Pushek");
        Cat cat5 = new Cat("Grom");
        Cat cat6 = new Cat("Oguretz");
        Cat cat7 = new Cat("Kilka");
        Cat cat8 = new Cat("Hvost");
        Cat cat9 = new Cat("Petro");
        Cat cat10 = new Cat("Baks");
        HashMap<String, Cat> catsMap = new HashMap<>();
        catsMap.put("Vaska", cat1);
        catsMap.put("Murzik", cat2);
        catsMap.put("Barsik", cat3);
        catsMap.put("Pushek", cat4);
        catsMap.put("Grom", cat5);
        catsMap.put("Oguretz", cat6);
        catsMap.put("Kilka", cat7);
        catsMap.put("Hvost", cat8);
        catsMap.put("Petro", cat9);
        catsMap.put("Baks", cat10);
        return catsMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet<Cat> catsSet = new HashSet<>();
        for (Cat cat : map.values()) {
            catsSet.add(cat);
        }
        return catsSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
