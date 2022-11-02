package farkliProjeler.odevVeAlistirmalar;

import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;

public class ArtikYil {

    // Aciklamasi:  Eger bir yili yuze boldugumuzde kalan 0 ise , 400 e bolmeyi deneriz. eger 400 e de bolundugunde kalan 0 ise Leap year.
    // eger yil yuze bolunmezse , 4e bolunmelidir. 4e bolunurse Leap year; bolunmezse Leap year degildir.
    public static void main(String[] args) {

        int ArtikYil = 2008;

        String leapYear = ArtikYil % 100 == 0 ? (ArtikYil % 400 == 0 ? "Leap Year" : "Not Leap year") : (ArtikYil % 4 == 0 ? "Leap Year" : "Not Leap Year");
        System.out.println(leapYear);
        //case1 : (leapYear%400==0 ? "Leap year" : "Leap year degil") (sayi>=100 && sayi<=200 ? "10 puan kazandiniz : "10 puan kaybettiniz")
        //case2 : (leapYear%4==0 ? "Leap year" : "Leap year degil");  (sayi>=400 && <==500 ? "10 puan kazandiniz" : "10 puan kaybettiniz");

        //  String leap = leapYear%100==0 ?  (case1)   : (case2)      ;
        //                (    Kosul    ) ? "


        // toUpperCase()
        String isim = "tEchpRo eduCation";
        System.out.println(isim.toUpperCase()); // Output : TECHPRO EDUCATION

        // toLowerCase()
        String ad = "techPRO EDUCation";     //  Output :  techpro education
        System.out.println(ad.toLowerCase());


        String isim1 = "Techpro Education School";
        System.out.println(isim1.charAt(0)); // Output :  E  index 8 = E oldugu icin. 0'dan basliyor boslukta sayiliyor.


        String yazi = "ÖnCEki YILBASINDA KISKANDILAR ÖKÜZÜ";
        System.out.println(yazi.toLowerCase(Locale.forLanguageTag("tr"))); //Output :  önceki yılbasında kıskandılar öküzü


        // equals
        String hal = "Yarimhali";
        String bal = "YarimhalI";
        System.out.println(hal.equals(bal));  //  Output :  true

        // equalsIgnoreCase

        String sinif = "Matematik";
        String sinif1 = "aTEMAtik";
        String sinif2 = "MATEmatiK";

        System.out.println(sinif.equalsIgnoreCase(sinif1)); //  Output : true

        // lnegth()  : verilen String teki character sayisini döndürür.

        String cevre = "jejrjnlgjnfifnfjnonfofjfjffjfjfjfjfjjjfjjfjfjjjfjhgiufoijefobogboeg";
        System.out.println(cevre.length());           // Output : 25  her zaman integer verir.(döndürür)


        // 2 ""
        String bosluk = "";
        System.out.println(bosluk);


        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adinizi soyadinizi girermisiniz?");
        System.out.println("Ilk once adinizi giriniz");
        String adi = input.next();

        System.out.println("Simdi soyadinizi giriniz");
        String soyadi1 = input.next();

        System.out.println("Lutfen Adresinizi girermisiniz?");
        String adresi1 = input.next();

        System.out.println("Simdi ornekteki gibi 10 haneli telefon numaranizi giriniz. Ornek  : 0532 434 654 43 gibi");
        String tel = input.next();

        System.out.println("Sistemde kaydiniza rastlanmamistir. Tesekkur eder iyi gunler dileriz");


        int artikYil = 2000;

        if (artikYil % 100 == 0) {
            if (artikYil % 400 == 0) {
                System.out.println("Artik yil");
            } else {
                System.out.println("Artik yil degil");
            }
        } else if (artikYil % 4 == 0) {
            System.out.println("Artik yil");
        } else {
            System.out.println("Artik yil degil");
        }


        int artikYil1 = 1990;

        String sonuc = artikYil1 % 100 == 0 ? (artikYil1 % 400 == 0 ? "Artik yil" : "Artik yil degil") : (artikYil1 % 4 == 0 ? "Artik yil " : "Artik yil degil");


        System.out.println(sonuc);


        //Example 6:
        //Kullanicidan gun ismini yazmasini isteyin.
        //Girilen isim gecerli bir gun ise gun isminin 1.,2.ve3.harflerini
        //ilk harf buyuk diger harflerini kucuk olarak yazdirin,
        //gun ismi gecerli degilse "Gecerli gun ismi giriniz" yazdirin.

        System.out.println("Gun ismi giriniz");
        String gunNo= input.nextLine();

        if (gunNo.equalsIgnoreCase( "pazar")) {
            System.out.println("PAZar");
        } else if (gunNo.equalsIgnoreCase("pazartesi")) {
            System.out.println("PAZartesi");
        } else if (gunNo.equalsIgnoreCase("sali")) {
            System.out.println("SALi");
        } else if (gunNo.equalsIgnoreCase("carsamba")) {
            System.out.println("CARsamba");
        } else if (gunNo.equalsIgnoreCase("persembe")) {
            System.out.println("PERsembe");
        } else if (gunNo.equalsIgnoreCase("Cuma")) {
            System.out.println("CUMa");
        } else if (gunNo.equalsIgnoreCase("cumartesi")) {
            System.out.println("CUMartesi");
        } else {
            System.out.println("Lutfen gecerli gun ismi giriniz");
        }


    }
}
