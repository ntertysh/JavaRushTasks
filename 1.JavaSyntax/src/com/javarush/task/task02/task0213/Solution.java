package com.javarush.task.task02.task0213;

/* 
Питомцам нужны люди
*/
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat Moska = new Cat();
        Dog Sharhan = new Dog();
        Fish Lupic = new Fish();
        Woman woman = new Woman();
        Moska.owner = new Woman();
        Sharhan.owner = new Woman();
        Lupic.owner = new Woman();

    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
