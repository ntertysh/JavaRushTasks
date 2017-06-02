package com.javarush.task.task02.task0202;

/* 
Откуда берутся Person?
*/
public class Solution {
    public static void main(String[] args) {
        Person person = new Person();
    }

    public static class Person {
        String name = "1";
        int age = 2;
        int weight = 3;
        int money = 4;

    }
}
