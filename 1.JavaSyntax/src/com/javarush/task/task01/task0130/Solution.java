package com.javarush.task.task01.task0130;

/* 
Наш первый конвертер!
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(convertCelsiumToFahrenheit(40));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        //int celsium = (double x -32)* 5/9;

        ///40 = (x – 32) * 5/9;
        //0= (x – 32) * 5/9 - 40;
        //0= x*5/9 - 32*5/9 -40;
        ///-x*5 = -32*5/9 -40;

        //-x= (-32*5/9 -40)/5*9;
        double x = - ((-32*5/(double)9 -celsium)/5*9);
        return x;
    }
}