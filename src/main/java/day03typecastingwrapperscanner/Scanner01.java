package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        // Scanner ne yapar , disardaki datayi benim kodumun icine tasir. Kullanicidan data almaya ve
        // etkilesim kurmamizi saglar.
        // örnegin facebook : username sorar, siz verirsiniz,
        // Scanner bir JAVA CLASS idir. Bu Class i Javanin Util kütüphanesindedir
        // Util kütüphanesini kullanacagiz.

       // Scanner i yazip neter a basmak lazim
        // Scanner input = new Scanner(); constructor

        // Kullanicidan data almak icin yapilmasi gerekenler
        // 1. Adim Scanner Classindan object olustur
        // System.in JAva, sistemimin icine bir sey koymak istiyorum .


        Scanner input = new Scanner(System.in);
        //  2.Adim : Kullaniciya ne yapacagini söylemem lazim.
        System.out.println("Hey kullanici yasini gir...");

        // 3. Adim : Kullanicidan alinan datayi bir variablein icine koyun
        byte age = input.nextByte();

        System.out.println("Hey kullanici senin yasin " + age);



    }
}
