package com.javarush.task.task02.task0204;

/* 
О семейных отношениях
*/
public class Solution {
    public static void main(String[] args) {
       Man vitya = new Man();
       Woman dusya = new Woman();{
       //new Woman()= man.wife();
       //new Man() = woman.husband();
            vitya.wife = dusya;
            dusya.husband = vitya;
            vitya.age = 77;
            System.out.println(vitya.wife);
       }

    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
}
