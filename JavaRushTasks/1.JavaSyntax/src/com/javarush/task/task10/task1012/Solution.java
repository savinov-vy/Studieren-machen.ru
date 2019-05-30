package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        TreeMap<Character, Integer> mapAbcCount = new TreeMap<>();

        for (int i = 0; i < 33; i++) {
            char putX = alphabet.get(i);
            mapAbcCount.put(putX, 0);
        }
        for (int i = 0; i < 10; i++) {
            String inSystemString = list.get(i);
            char[] stringBrokenLetters = inSystemString.toCharArray();
            ArrayList<Character> StringBrokenLettersArrayList = new ArrayList<>();
            for (int j = 0; j < stringBrokenLetters.length; j++) {
                StringBrokenLettersArrayList.add(stringBrokenLetters[i]);
            }
            for (char x : StringBrokenLettersArrayList) {
                int putValueMapAbcCount = mapAbcCount.get(x) + 1;
                mapAbcCount.put(x, putValueMapAbcCount);
            }
        }
        ArrayList<Integer> abcCotingReplaceE = new ArrayList<>();
        for (Map.Entry<Character, Integer> pair : mapAbcCount.entrySet()) {
            int xGetValue = pair.getValue();
            abcCotingReplaceE.add(xGetValue);
        }
        abcCotingReplaceE.add(6, abcCotingReplaceE.get(32));
        abcCotingReplaceE.remove(33);
        for (int i = 0; i < 33; i++) {
            System.out.println(abcArray[i] + " " + abcCotingReplaceE.get(i));
        }
        }
    }