package com.javarush.task.task04.task0428;

/* 
Положительное число
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
        String c = bufferedReader.readLine();
        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int z = Integer.parseInt(c);

        int t = 0;
        if (x > 0) {
            t = t + 1;
        } if (y > 0) {
            t = t + 1;
        } if (z > 0) {
            t = t + 1;
        }
        System.out.println(t);
        }

        //if (x<0 && y<0 && z<0) {
           //System.out.println(0);
        }

