package com.javarush.task.task01.task0127;

/* 
Число в квадрате
*/

public class Solution {
    public static void main(String[] args) {
       //int a = 5;
       //int b = sqr(5);
       System.out.println(sqr(5));
       System.out.println(summ(5, 1));
    }

    public static int summ(int a, int b){
        int summ = a + b;
        return summ;
    }

    public static int sqr(int a) {
        return a * a;
    }
}


