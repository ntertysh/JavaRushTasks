package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String t = bufferedReader.readLine();
        double x = Double.valueOf(t);

        double y = x % 5;

        if (y >= 0 && y <= 3) {
            System.out.println("зелёный");
        }
            else if( y > 3 && y <= 4) {
            System.out.println("желтый");
        }
            else if ( y > 4 && y <= 5) {
            System.out.println("красный");
        }
        }
    }