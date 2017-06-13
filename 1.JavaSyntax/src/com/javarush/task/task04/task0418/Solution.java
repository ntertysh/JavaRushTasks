package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String a = bufferedReader.readLine(); //читаем строку с клавиатуры
        String b = bufferedReader.readLine(); //читаем строку с клавиатуры
        int c = Integer.parseInt(a);
        int f = Integer.parseInt(b);

        if (c <= f) {
            System.out.println(c);
        } else {
            System.out.println(f);
        }
    }
}