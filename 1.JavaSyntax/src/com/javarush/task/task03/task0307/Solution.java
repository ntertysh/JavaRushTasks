package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        //Zerg zerg = new Zerg[10];
        for (int i=0; i<10; i++)
        {
            Zerg zerg  = new Zerg();
            zerg.name = "Zerg"+(1+i);}

            //Protoss protoss = new Protoss[5];
        for (int i=0; i<5; i++)
        {
            Protoss protoss = new Protoss();
            protoss.name = "Protoss"+(1+i) ;}

        //Terran terran = new Terran[12];
        for (int i=0; i<12; i++)
        {
            Terran terran = new Terran();
            terran.name = "Terran"+(1+i) ;
        }
        //System.out.println(name + i);

    }


    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }

}
