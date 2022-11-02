package farkliProjeler.methodsAndShortforms;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        // (if (condition) {
        // block of code to be executed if the condition is true
        // })

//        if (20 > 19) {
//            System.out.println("Seni yemege goturecegim");
//
//        }
//// ya da su sekilde yazilabilir.
//        int x = 34;
//        int y = 30;
//        if (x > y) {
//            System.out.println("Seni yemege goturecegim");
//            {
//
//            }
//        }

       //  LEAPYEAR Hesaplatma :

        Scanner input = new Scanner(System.in);
        System.out.println("Akliniza gelen bir yilin artik yil olup olmadigini ogrenmek icin lutfen giriniz ");


        int yil1 = input.nextInt();

        String leapyear = yil1 % 100 == 0 ? (yil1 % 400 == 0 ? "Yes it is a leapyear" : "No it is not a leapyear") : (yil1 % 4 == 0 ? "Yes it is a leapyear" : "No it isnot a leapyear");

        System.out.println(leapyear);


        // Kullanicidan istediginiz bir rakamin 100 ile 200 arasinda ise kullaniciya 10 puan ver.

        System.out.println("Lutfen bir sayi giriniz. Bakalim ozel sayilarimizi bulabilecekmisiniz?");

        int sayi = input.nextInt();


        if (sayi >= 100  ) ;
        {
            System.out.println("10 puan kazandiniz");{

        } if (sayi < 100 ) ;

        } System.out.println("Kaybettiniz");

        }

        }

