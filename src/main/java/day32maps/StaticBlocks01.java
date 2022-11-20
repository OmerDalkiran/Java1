package day32maps;

import assignments.withabdullah.Sorularim;

public class StaticBlocks01 {

    public static Double pi;

 static {
     System.out.println("Static Block 2");
 }

    public static void main(String[] args) {


        System.out.println("main metod");
        // Static blocklar ihtiyacimiz olan variablelarin class olusturma safhasinda elimizde olmasini saglar ve
        // static bolocklar icindeki hersey main metod ve diger tum metodlardan once calistirilir.
        // static blocklar icinde sadece static variable lara deger atanabilir.
    }
        static {       // static olmayani calistirmaz

            pi=3.14;

            System.out.println("Static block 1");
        }
            /*
            Static Block 2   yani ilk once static blocklar calisiyor onlarin arasinda da en ustte olandan baslaniyor , sonra main metod calisiyor.
            Static block 1
                main metod
             */

    }


