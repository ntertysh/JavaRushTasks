package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Dog Puppy = new Dog( "Puppy", 2, "black");
        Cat Kisa = new Cat( "Kisa", 3, "white");

        //напишите тут ваш код
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //напишите тут ваш код

    public static class Dog {
        String name;
        int age;
        String color;

        public Dog(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }
    }

    public static class Cat {
        String name;
        int age;
        String color;

        public Cat( String name, int age, String color){
            this.name = name;
            this.age = age;
            this.color = color;
        }
    }
}
