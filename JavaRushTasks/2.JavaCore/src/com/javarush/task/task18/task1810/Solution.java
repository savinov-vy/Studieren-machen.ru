package com.javarush.task.task18.task1810;

/* 
DownloadException
https://metanit.com/java/tutorial/4.3.php
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static boolean loopCount;

    public static void main(String[] args) throws DownloadException, Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            FileInputStream inputStream = new FileInputStream(reader.readLine());

            if (inputStream.available() < 1000) {
                Solution.loopCount = true;      // обратить внимание, что в блоке ошибка выбрасывается в последнюю очередь.
                inputStream.close();            // т.к. код дальше выполнятся не будет
                throw new DownloadException();

            }
        } while (!Solution.loopCount);
    }

    public static class DownloadException extends Exception {
    }
}
