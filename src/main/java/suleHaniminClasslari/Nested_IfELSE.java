package suleHaniminClasslari;

import java.util.Scanner;

public class Nested_IfELSE {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        byte yas = input.nextByte();

        if (yas >= 0) {
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println("Emekli olamazsin");
            System.out.println("65-yas + sene daha calismalisin");  // 20 yas icin 17. satirdaki code calisir.

        }
     //   } else {
            System.out.println("Lutfen 0 dan buyuk bir sayi giriniz");

        }
    }


