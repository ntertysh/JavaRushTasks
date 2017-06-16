package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String x = bufferedReader.readLine();
        int a = Integer.parseInt(x);
        int length = x.length();
        int b = a % 2;

        if (b == 0 && length == 1 && a >= 1 && a <= 999) {
            System.out.println("четное однозначное число");
        } else if (b != 0 && length == 1 && a >= 1 && a <= 999) {
            System.out.println("нечетное однозначное число");
        } else if (b == 0 && length == 2 && a >= 1 && a <= 999) {
            System.out.println("четное двузначное число");
        } else if (b != 0 && length == 2 && a >= 1 && a <= 999) {
            System.out.println("нечетное двузначное число");
        } else if (b == 0 && length == 3 && a >= 1 && a <= 999) {
            System.out.println("четное трехзначное число");
        } else if (b != 0 && length == 3 && a >= 1 && a <= 999) {
            System.out.println("нечетное трехзначное число");

        }
    }
}
