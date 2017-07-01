package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String x = bufferedReader.readLine();
        String y = bufferedReader.readLine();
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        int c = a+b;

        while (a!=-1 || b!=-1) {
            if (a == -1 || b == -1) {
                System.out.println(c);
                break;
            }
            System.out.println();
        }

    }
}
