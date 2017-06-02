package com.javarush.task.task01.task0140;

import java.util.Scanner;

/* 
Выводим квадрат числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Введите число");
        if (sc.hasNextInt()){
            System.out.println("should be true");
        } else System.out.println("looks like false");
        int a = sc.nextInt();
        System.out.println(a*a);
    }
}