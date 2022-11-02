package day07_stringmanipulations;

import java.util.Scanner;

public class C06_StringManipulationsLength {

    public static void main(String[] args) {

        /**
         * Length()
         * length() method'u girilen String'in uzunlugunu verir
         * butun karakterlerin adedi (bosluklar da birer karakterdir)
         */


        String cumle = "Bugun hava yagmurlu";
        System.out.println(cumle.length());   //19

        String str1 = "";
        System.out.println(str1.length());  //  0

        String str2 = " ";
        System.out.println(str2.length()); // 1

        Scanner input = new Scanner(System.in);

//        System.out.println("isminizi giriniz.");
////
////        String ad = input.next();
////
////        System.out.println("soyisminizi giriniz ");
////        String soyad = input.next();
////
////        if (ad.length() > soyad.length()) ;
////        System.out.println(ad);
////    }else if()
////    {
       // if(soyad.length()>ad.length());
        //System.out.println(soyad);

        System.out.println("Lutfen isminizi ve soyisminizi giriniz: \n isim :");
        String isim=input.next();
        System.out.println("Soyisim");
        String soyIsim=input.next();


        if(isim.length()>soyIsim.length()){
            System.out.println("isminiz soyisminizde uzun");
        }else if(isim.length()==soyIsim.length()){
            System.out.println("Isminiz soyisminizle ayni uzunlukta");
        }else System.out.println("Soyisminiz isminizden uzun");


    }

}


