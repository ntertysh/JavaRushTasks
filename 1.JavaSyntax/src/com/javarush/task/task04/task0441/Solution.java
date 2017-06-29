package com.javarush.task.task04.task0441;


/* 
Как-то средненько
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
        String z = bufferedReader.readLine();
        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        int c = Integer.parseInt(z);

        if (a >= b && a >= c && b >= c) {
            System.out.println(b);
        }
        else if (a >= b && a >= c && c >= b) {
            System.out.println(c);
        }
        else if (b >= a && b >= c && a >= c) {
            System.out.println(a);
        }
        else if (b >= a && b >= c && c >= a) {
            System.out.println(c);
        }
        else if (c >= a && c >= b && a >= b) {
            System.out.println(a);
        }
        else if (c >= a && c >= b && b >= a) {
            System.out.println(b);
        }
        else if (a==b && a==c) {
            System.out.println(a);
        }

    }
}
