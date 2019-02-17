package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> listFix = list;
        int i = listFix.size()-1;
        while (i >= 0) {
                int conL;
                int conR;
                conL = list.get(i).indexOf("л");
                conR = list.get(i).indexOf("р");
                if (conL >= 0 && conR < 0) list.add(list.get(i));
                if (conR >= 0 && conL < 0) list.remove(i);
                i--;
        }
        return listFix;
    }
}
   /* можно было решить через contains следующим образом

    String str = "twinkle twinkle little star";
    boolean got = str.contains("little");
    System.out.println("String contains 'little' : " + got);
            got = str.contains("Java");
            System.out.println("String contains 'Java' : " + got);

            вывод
            String contains 'little' : true
            String contains 'Java' : false*/