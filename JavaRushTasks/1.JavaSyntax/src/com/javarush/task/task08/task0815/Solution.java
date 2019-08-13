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
        ArrayList<String> valueFirstName = new ArrayList<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String s = pair.getValue();
            valueFirstName.add(s);
        }
        int countEqualFirstName = 1;
        for (int i = 0; i < valueFirstName.size(); i++) {
            for (int j = i + 1; j < valueFirstName.size(); j++) {

                if (valueFirstName.get(i).equals(valueFirstName.get(j))) countEqualFirstName++;
            }
        }
        return countEqualFirstName;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        ArrayList<String> valueLastName = new ArrayList<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String s = pair.getValue();
            valueLastName.add(s);
        }
        int countEqualLastName = 1;
        for (int i = 0; i < valueLastName.size(); i++) {
            for (int j = i + 1; j < valueLastName.size(); j++) {

                if (valueLastName.get(i).equals(valueLastName.get(j))) countEqualLastName++;

            }
        }
        return countEqualLastName;
    }
    public static void main(String[] args) {

    }
}
