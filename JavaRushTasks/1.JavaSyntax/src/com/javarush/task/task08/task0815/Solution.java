package com.javarush.task.task08.task0815;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Иван");
        map.put("Сидоров", "Иван");
        map.put("Гоголь", "Пётр");
        map.put("Достоевский", "Пётр");
        map.put("Ахматова", "Анна");
        map.put("Толстой", "Миша");
        map.put("Леромонтов", "Миша");
        map.put("Чешкин", "Илья");
        map.put("Пушкин", "Александр");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int countEqualFirstName = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String s = pair.getValue();
            if (s.equals(name)) countEqualFirstName++;
        }
        return countEqualFirstName;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int countEqualLastName = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String s = pair.getKey();
            if (s.equals(lastName)) countEqualLastName++;
        }
        return countEqualLastName;
    }
    public static void main(String[] args) {

    }
}
