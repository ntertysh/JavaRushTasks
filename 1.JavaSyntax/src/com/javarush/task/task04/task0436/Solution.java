package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        int m = Integer.parseInt(a);
        int n = Integer.parseInt(b);

        for (int i = 1; i <= m; i++) {
            System.out.println(" ");
            for (int j = 1; j <= n; j++)
                System.out.print(8);
        }

    }
}
