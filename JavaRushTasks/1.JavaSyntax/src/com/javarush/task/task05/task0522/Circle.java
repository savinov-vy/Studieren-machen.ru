package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код
    public Circle(){
        this.x=0;
        this.y=0;
        this.radius=0;
            }
    public Circle(int x,int y,int radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public Circle(int x,int y){
        this.x=x;
        this.y=y;
        this.radius=5;
    }
    public Circle(int radius){
        this.x=0;
        this.y=0;
        this.radius=radius;
    }

    public static void main(String[] args) {

    }
}