package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String t = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        String c = bufferedReader.readLine();
        int x = Integer.parseInt(t);
        int y = Integer.parseInt(b);
        int z = Integer.parseInt(c);

        int а = 0;
        int б = 0;
        if (x>0) {
            б ++;
        } if (y>0) {
            б ++;
        } if (z>0) {
            б ++;}

        if (x<0) {
            а ++;
        } if (y<0) {
            а ++;
        } if (z<0) {
            а ++;
        }
        System.out.println("количество отрицательных чисел: "+а);
        System.out.println("количество положительных чисел: "+б);
    }
}
