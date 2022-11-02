package farkliProjeler.odevVeAlistirmalar;

import java.util.Scanner;

public class Sdet {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        /*
        Kullanicidan SDET harflerinden birisini girmesini isteyin.
        S icin software; D icin Developer; E icin Engineer; T icin Tester yazdirin
         */

        System.out.println("Lutfen SDET kelimesinin harflerinden birini giriniz");

        char harf= input.next().toUpperCase().charAt(0);

        switch (harf){
            case 'S':
                System.out.println("Software ile istigal edeceksiniz");
                break;
            case 'D':
                System.out.println("Developer'liga gecis yapacaksiniz");
                break;
            case 'E':
                System.out.println("Engineer olacaksiniz insallah");
                break;
            case 'T':
                System.out.println("Tester olduktan sonra ins cok para kazanacaksiniz.Bu sadece baslangic.");
            default:
                System.out.println("Lutfen S,D,E,T harflarinden birini giriniz. Girdiginiz harf maalesef bu " +
                        "harflarden biri degil");



        }
    }
}
