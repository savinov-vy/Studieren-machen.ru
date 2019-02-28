package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List of directory
        Map<String, String> directory = new HashMap<>();
        while (true) {
            String sity = reader.readLine();
            if (sity.isEmpty()) break;
            String family = reader.readLine();
            if (family.isEmpty()) break;
            directory.put(sity, family);
        }

        // Read the house Sity
        String houseSity = reader.readLine();
        String familyName = directory.get(houseSity);
        System.out.println(familyName);

    }
}
