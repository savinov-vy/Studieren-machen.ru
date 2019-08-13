package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    int a;
    String s;

    public Solution(int a, String s) {
        this.a = a;
        this.s = s;
    }

    private Solution() {
    }


    Solution(String s) {
        this.s = s;
    }

    protected Solution(int a) {
        this.a = a;
    }

    public static void main(String[] args) {

    }

}

