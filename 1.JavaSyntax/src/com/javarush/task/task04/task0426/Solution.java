package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String x = bufferedReader.readLine();
        int a = Integer.parseInt(x);
        int b = a%2;

        if(a<0 && b==0 ) {
            System.out.println("отрицательное четное число");
        } else if ( a<0 && b!=0) {
            System.out.println("отрицательное нечетное число");
        } else if (a== 0) {
            System.out.println("ноль");
        } else if (a>0 && b==0) {
            System.out.println("положительное четное число");
        } else if (a>0 && b!=0) {
            System.out.println("положительное нечетное число");

        }
    }
}
