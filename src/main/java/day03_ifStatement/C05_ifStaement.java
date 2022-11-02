package day03_ifStatement;

import java.util.Scanner;

public class C05_ifStaement {
    public static void main(String[] args) {

        // Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz 4 islemden biri ile
        // isleme koyup sonucu yazdiriniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen \n toplama islemi icin 1 \n cikarma islemi icin 2 \n bolme islemi icin 3 \n carpma islemi icin 4 giriniz");

        int islem = input.nextInt(); // ilk once bu kodla kullanicinin islem tercihi icin bir variable olusturduk
        System.out.println("Lutfen iki tamsayi giriniz."); // kullaniciya bildirimde bulundum.

        double num1 = input.nextDouble(); //1. sayiyi assign etmis olduk yani atamis olduk.

        double num2 = input.nextDouble(); // 2. sayi assign edildi.

        if(islem==1) { // Eger islem 1 ise diye okunur
            System.out.println("Toplama islemi sonucu : " + num1 + "+" + num2 + "+" + (num1 + num2));

        } else if (islem==2) {
            System.out.println("Cikarma isleminin sonucu :" + num1 + "-" + num2 + "=" + (num1 - num2));
        } else if (islem==3) {
            System.out.println("Bolme isleminin sonucu : " + num1 + "/" + num2 + "=" + (num1 / num2));
        } else if (islem==4) {
            System.out.println("Carpma isleminin sonucu : " + num1+ "*" +num2+ "=" + (num1*num2));

        }


    }

    }




