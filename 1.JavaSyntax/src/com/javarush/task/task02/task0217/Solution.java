package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        int m;
        if (min(a, b) < c)
            m = min (a,b);
        else if (c < d)
                m = c;
        else m = d;
        return m;

    }

    public static int min(int a, int b) {
        //напишите тут ваш код
        int l;
        if (a < b)
            l = a;
        else
            l = b;
        return l;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
    }
}