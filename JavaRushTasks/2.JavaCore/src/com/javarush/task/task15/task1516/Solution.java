package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
    int intVar;
    double doubleVar;
    Double DoubleVar;
    boolean booleanVar;
    Object ObjectVar;
    Exception ExceptionVar;
    String StringVar;

    void qwer() {

        System.out.println(intVar);
        System.out.println(doubleVar);
        System.out.println(DoubleVar);
        System.out.println(booleanVar);
        System.out.println(ObjectVar);
        System.out.println(ExceptionVar);
        System.out.println(StringVar);
    }

    public static void main(String[] args) {
        Solution adf = new Solution();
        adf.qwer();

    }
}
