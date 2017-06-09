package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String a = bufferedReader.readLine();
        int b = Integer.parseInt(a);

        if ( b > 0 && b < 2 ){
            System.out.println("понедельник");
        }
            else if ( b >1 && b < 3){
            System.out.println("вторник");
            }
            else if ( b > 2 && b <4 ){
            System.out.println("среда");
            }
            else if ( b > 3 && b < 5){
            System.out.println("четверг");
            }
            else if ( b > 4 && b <6 ){
            System.out.println("пятница");
            }
            else if ( b > 5 && b < 7) {
            System.out.println("суббота");
            }
            else if ( b >6 && b < 8) {
            System.out.println("воскресенье");
            }
        else {
            System.out.println("такого дня недели не существует");
            }

        }
    }