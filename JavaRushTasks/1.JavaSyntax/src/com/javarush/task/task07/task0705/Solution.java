
package com.javarush.task.task07.task0705;

        import java.io.BufferedReader;
        import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] listBig = new int[20];
        int[] list1 = new int[10];
        int[] list2 = new int[10];


        for (int i = 0; i < listBig.length; i++) {
            String s = reader.readLine();
            listBig [i] = Integer.parseInt(s);
        }
        int a1 = 0;
        for (int i = 0 ; i < listBig.length/2; i++) {

            list1 [a1] = listBig[i];
            a1++;
        }
        int a2 = 0;
        for (int i = listBig.length/2; i < listBig.length; i++) {

            list2 [a2] = listBig[i];
            a2++;
        }




        //вывод на экран
        for (int i = 0; i < 10; i++) {
            System.out.println(list2[i]);
        }
    }
}