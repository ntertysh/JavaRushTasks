package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        if ( x > y && x > z && y >= z ) {
            System.out.println(x + " " + y + " " + z);
            }
            else if (x > y && x > z && y < z ){
            System.out.println(x + " " + z + " " + y);
            }
            else if ( y > x && y > z && x >= z ) {
            System.out.println(y + " " + x + " " + z);
            }
            else if ( y > x && y > z && x < z ) {
            System.out.println(y + " " + z + " " + x);
            }
             else if (z > x && z > y && x >= y) {
            System.out.println(z + " " + x + " " + y);
            }
            else if (z > x && z > y && x < y) {
            System.out.println(z + " " + y + " " + x);
            }
        }
    }

