package com.javarush.task.task09.task0921;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numberList = new ArrayList<>();
        while (true) {
            try {


                int a = Integer.parseInt(reader.readLine());
                numberList.add(a);
            } catch (IOException e) {
                for (Integer a : numberList) {
                    System.out.println(a);
                }
                break;
            } catch (NumberFormatException e) {
                for (Integer a : numberList) {
                    System.out.println(a);
                }
                break;
            }
        }

    }
}
