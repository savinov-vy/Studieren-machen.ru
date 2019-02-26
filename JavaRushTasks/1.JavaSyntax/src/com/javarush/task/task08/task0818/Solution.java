package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Иванов", 100);
        map.put("Петров", 300);
        map.put("Сидоров", 400);
        map.put("Никитин", 500);
        map.put("Пугачев", 700);
        map.put("Пушкин", 800);
        map.put("Григорьев", 900);
        map.put("Леонтьев", 1000);
        map.put("Смирнов", 1100);
        map.put("Печкин", 1200);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            int salary = pair.getValue();
            if (salary<500) iterator.remove();

        }
    }

    public static void main(String[] args) {

    }
}