package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код

    public Circle( double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle ()
    {

    }

    public Circle (double x, double y)
    {
        this.x = x;
        this.y = y;
        this.radius = 5;
    }

    public Circle (double radius)
    {
        this.x = 1;
        this.y = 2;
        this.radius = radius;
    }



    public static void main(String[] args) {

    }
}