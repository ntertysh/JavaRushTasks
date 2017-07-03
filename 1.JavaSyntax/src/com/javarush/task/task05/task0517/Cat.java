package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name)
    {
        this.name = name;
        this.age = 1;
        this.weight = 2;
        this.color = "black";
    }

    public Cat(String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "white";
    }

    public Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = 4;
        this.color = "white";
    }

    public Cat(int weight, String color)
    {
        this.weight = weight;
        this.color = color;
        this.age = 4;
    }

    public Cat(int weight, String color, String address)
    {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 6;
    }

    public static void main(String[] args) {

    }
}
