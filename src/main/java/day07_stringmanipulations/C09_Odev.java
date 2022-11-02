package day07_stringmanipulations;

import java.util.Scanner;

public class C09_Odev {

    public static void main(String[] args) {

//        // Soru 2 :
//        //        Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
////        islemi bitirmek icin 0'a basmasini soyleyin.
////        Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve
////        "Negatif sayi giremezsiniz" yazdirip basa donun
////        Kullanici 0'a bastiginda toplam kac pozitif sayi girdigini,
////        yanlislikla kac negative sayi girdigini ve
////        girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin
//
//
//        Scanner input = new Scanner(System.in);
//        int sayi = 0;
//        int sum = 0;
//        int dongup = 0;
//        int dongun = 0;
//        do {
//            System.out.println("Toplanmasini istediginiz tam sayiyi giriniz " +
//                    "\nBitirmek istediginizde 0'a basiniz");
//            sayi = input.nextInt();
//            if (sayi > 0) {
//                sum = sum + sayi;
//                dongup++;
//            } else if (sayi < 0) {
//                System.out.println("Negatif sayi giremezsiniz \nLutfen pozitif tamsayi giriniz");
//                dongun++;
//            }
//        } while (sayi != 0);
//        System.out.println(dongun + " kere negatif sayi girdiniz");
//        System.out.println(dongup + " kere pozitif sayı girdiniz");
//        System.out.println("Girdiginiz pozitif sayilarin toplami " + sum);

/*
       Soru 1 - Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.
                   i)En az 8 character icermeli
                   ii)Space characteri icermemeli
                   iii)Buyuk harf icermemeli
                   iv)Son characteri "." olmali



*/

        String passw = "asdfghj.";

        boolean first  = passw.length() > 7;
        boolean second = passw.contains("[^ ]");
        boolean third  = passw.contains("[^A-Z]");
        boolean fourth = passw.lastIndexOf(passw.length() - 1) == '.';

        boolean gecerli = first && second && third && fourth;

        if (gecerli) {
            System.out.println("Passwordunuz gecerlidir");


            }else{
            System.out.println("Passwordunuz gecersizdir");



        }
    }
}