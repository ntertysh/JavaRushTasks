package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        for (int b = 0; b < 10; b++) {
            int c = b + 1;

            for (int i = 1; i < 11; i++) {
                int a = i * c;
                System.out.print(a + " ");

            }
            System.out.println();
        }

    }
}