package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Cat Cat1 = new Cat("Vasya", 1,12,13);
        Cat Cat2 = new Cat("Pushok", 2, 12, 15);
        Cat Cat3 = new Cat("Tushka", 3, 23, 15);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}