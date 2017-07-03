package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int count = 0;
        int sum = 0;

        while (true) {
            String a = bufferedReader.readLine();
            int shit = Integer.parseInt(a);
            if (shit != -1) {
                count = count + 1;
                sum = sum + shit;
            } else break;
        }
            System.out.println((float)sum / count);

        }
    }

