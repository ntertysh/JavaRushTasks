package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String x = bufferedReader.readLine(); //читаем строку с клавиатуры
        String y = bufferedReader.readLine();
        String z = bufferedReader.readLine();
        String f = bufferedReader.readLine();
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        int c = Integer.parseInt(z);
        int d = Integer.parseInt(f);

        if (a > b && a > c && a > d) {
            System.out.println(a);
        }
        else if (b > a && b > c && b > d) {
            System.out.println(b);
        }
        else if (c > a && c > b && c > d) {
            System.out.println(c);
        }
        else if (d >a && d >b && d > c) {
            System.out.println(d);
        }
        else if (a == b || b == c || c == d) {
            System.out.println(a);
        }
        }
    }
