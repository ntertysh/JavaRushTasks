package com.javarush.task.task01.task0129;

/* 
Считаем длину окружности
*/

public class Solution {
    public static void main(String[] args) {
        double t = circleLength(5);
        printThisShitOut(t);

    }




















    private static void printThisShitOut(double input) {
        System.out.println(input);
    }

    public static double circleLength(int radius) {
        double Pi = 3.14; //crt pi
        double L = 2 * Pi* radius; //crt l
        //System.out.println(L);
        return  L;


    }
}