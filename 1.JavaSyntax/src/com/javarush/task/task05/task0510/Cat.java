package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int weight = 1;
    int age = 2;
    String color = "red";
    String address;

    public void initialize(String name)
    {
        this.name = name;
        this.weight = 2;
        this.age = 2;
        this.color = "yellow";
    }

    public void initialize(String name,int weight, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "black";
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.weight = 2;
        this.color = "green";

    }

    public void initialize(int weight, String color)
    {
        this.weight = weight;
        this.color = color;
        this.age = 6;

    }

    public void initialize(int weight, String color, String address)
    {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 10;
    }

    public static void main(String[] args) {

    }
}
