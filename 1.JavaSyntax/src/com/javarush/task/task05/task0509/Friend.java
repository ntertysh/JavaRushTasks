package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

public class Friend {
    //напишите тут ваш код
    String name;
    int age;
    char sex = 'F';


    public void initialize(String name)
    {
        this.name = name;
        this.age = this.age;
        this.sex = sex;
    }


    public void initialize(String name, int age, char sex)
    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

        Friend a = new Friend();
        //a.age++;
        System.out.println(a.name);
    }
}
