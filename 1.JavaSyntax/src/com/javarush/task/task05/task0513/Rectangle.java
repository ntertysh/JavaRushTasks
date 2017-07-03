package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    int top = 2;
    int left = 4;
    int width = 3;
    int height = 3;

    public void initialize(int top)
    {
        this.top = top;
        this.left = 3;
        this.width = 5;
        this.height = 6;
    }

    public void initialize(int top, int left)
    {
        this.top = top;
        this.left = left;
        this.width = 4;
        this.height = 5;
    }

    public void initialize(int top, int left, int width)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = 4;
    }

    public void initialize(int top, int left, int width, int height)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }


    public static void main(String[] args) {

    }
}
