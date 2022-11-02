package day07_stringmanipulations;

import day04Ifstatement.Scanner01;

import java.util.Scanner;

public class C01_StringManipulationsConcat {


         /*

    ONEMLI NOT=JAVA YUKARIDAN ASAGI ; SOLDAN SAGA CALISIR.

     */

    public static void main(String[] args) {


        System.out.println(15 + 20 + "Merhaba");      //35Merhaba
        System.out.println("Merhaba" + 15 + 20);      //Merhaba1520
        System.out.println("Merhaba" + (15 + 20));    //Merhaba35
        System.out.println("Merhaba" + 15 * 20);     // Merhaba+300

        //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola kullanici nasil girerse girsin
        //tam isminin buyuk harfle yazilmasini saglayin.
        Scanner input = new Scanner(System.in);

        System.out.println("isminizi giriniz");

        String isim = input.nextLine().toUpperCase();
        System.out.println(isim);


    }

}

