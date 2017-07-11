package com.javarush.task.task05.task0525;

/* 
И целой утки мало
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        Cat Pushok = new Cat();
        Cat Vasya = new Cat();
        System.out.println(Pushok);
        System.out.println(Vasya);

        Dog Zozo = new Dog();
        Dog Kuku = new Dog();
        System.out.println(Zozo);
        System.out.println(Kuku);

        //напишите тут ваш код
    }

    public static class Duck {
        public String toString() {

            return "Duck";
        }
    }

    //напишите тут ваш код
    public static class Cat {
        public String toString() {

            return "Cat";
        }
    }

    public static class Dog {
        public String toString() {

            return "Dog";
        }
    }
}
