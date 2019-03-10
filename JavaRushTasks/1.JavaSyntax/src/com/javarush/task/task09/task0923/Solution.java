package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] stringToChars = s.toCharArray();
        StringBuilder builderVowelLetters = new StringBuilder();
        StringBuilder builderConsonantLetters = new StringBuilder();

        for (Character ch1 : stringToChars) {
            if (isVowel(ch1)) {
                builderVowelLetters.append(ch1);
                builderVowelLetters.append(' ');
            } else if (ch1 != ' ') {
                builderConsonantLetters.append(ch1);
                builderConsonantLetters.append(" ");
            }
        }
        System.out.println(builderVowelLetters.toString());
        System.out.println(builderConsonantLetters);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
// http://study-java.ru/uroki-java/rabota-so-strokami-v-java-osnovnye-metody-klassa-string/