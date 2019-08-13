package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Марья");
        map.put("Сидоров", "Кирилл");
        map.put("Никитин", "Евгений");
        map.put("Пугачев", "Александ");
        map.put("Пушкин", "Иван");
        map.put("Григорьев", "Марья");
        map.put("Леонтьев", "Леонид");
        map.put("Смирнов", "Александр");
        map.put("Перепечкин", "Иван");
        return map;


    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        ArrayList<String> listName = new ArrayList<>();
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();

            String familyKey = pair.getKey();
            String nameValue = pair.getValue();
            listName.add(nameValue);
        }
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator2 = map.entrySet().iterator();

        while (iterator2.hasNext()) {
            Map.Entry<String, String> pair = iterator2.next();

            String nameValue = pair.getValue();
            for (String str : listName) {
                if (nameValue.equals(str)) count++;

                if (count == 1) {
                    removeItemFromMapByValue(map, nameValue);
                    count = 0;
                }

            }

        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());

    }
}
