package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Александр");
        map.put("Иванов", "Иван");
        map.put("Сидоров", "Пётр");
        map.put("Никитин", "Олег");
        map.put("Пугачев", "Александр");
        map.put("Пугачев", "Артём");
        map.put("Григорьев", "Григорий");
        map.put("Леонтьев", "Иван");
        map.put("Пугачев", "Сергей");
        map.put("Печкин", "Николай");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
