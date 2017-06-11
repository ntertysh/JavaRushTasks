package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String a = bufferedReader.readLine();
        int y = Integer.parseInt(a);

        if (y%400 != 0 && y%100 == 0 || y%4 != 0) {
            int x = 365;
            System.out.println("количество дней в году: " + x);
        }
        else {
            int x = 366;
            System.out.println("количество дней в году: " + x);
        }
        }
    }
