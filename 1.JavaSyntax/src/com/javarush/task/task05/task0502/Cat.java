package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {

    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        //Cat Pushok = anotherCat;
        if (this.strength>anotherCat.strength) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        cat1.strength = 10;
        cat2.strength = 5;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));

    }
}
