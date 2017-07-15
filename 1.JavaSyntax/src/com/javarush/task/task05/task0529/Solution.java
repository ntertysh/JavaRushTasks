package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.Reader;



/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int sum = 0;

        while (true) {
            String a = bufferedReader.readLine();
            if (a.matches("сумма")) {
                System.out.println(sum);
                break;
            } else {
                int x = Integer.parseInt(a);
                sum = sum + x;

            }
        }
    }
}
