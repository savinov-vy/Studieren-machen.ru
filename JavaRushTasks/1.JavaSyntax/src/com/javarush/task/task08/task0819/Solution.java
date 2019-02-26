package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код. step 3 - пункт 3
        Set setCat2 = createCats();
        Iterator<Cat> iterator = setCat2.iterator();
        {
            while (iterator.hasNext()) {
                Cat cat = iterator.next();
                iterator.remove();
                break;
            }
        }

        printCats(setCat2);

    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> setCat = new HashSet<>();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        setCat.add(cat1);
        setCat.add(cat2);
        setCat.add(cat3);
        return setCat;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    // step 1 - пункт 1

    public static class Cat {
        public Cat() {
        }
    }
}