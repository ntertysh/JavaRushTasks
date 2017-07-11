package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Data newData = new Data("11", "07", "2017");
        System.out.println(newData.day +" "+ newData.month +" "+ newData.year);
    }

    public static class Data {
        String day;
        String month;
        String year;

        public Data (String day, String month, String year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
    }


}
