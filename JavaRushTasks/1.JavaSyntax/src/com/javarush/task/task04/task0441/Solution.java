package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int x;
        if (a>b&&a<c) System.out.println(a);
        else if (a>c&&a<b) System.out.println(a);

        else if (b>a&&b<c) System.out.println(b);
        else if (b>=c&&b<a) System.out.println(b);

        else if (c>b&&c<a) System.out.println(c);
        else if (c>a&&c<b) System.out.println(c);

        else if (c==a||c==b)System.out.println(c);
        else if (b==a||b==c)System.out.println(b);
        else if (a==b||a==c)System.out.println(a);
        else System.out.println(a);
    }
}
