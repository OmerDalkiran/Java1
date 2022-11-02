package day03_ifStatement;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir isci bir isi kac gunde bitirmektedir");
        double bitirmesuresi = input.nextDouble();
        System.out.println("Toplam kac isci calisacak?");
        double iscisayisi = input.nextDouble();

        double birliktebitirmesuresi = bitirmesuresi/iscisayisi;
        System.out.println("birliktebitirmesuresi = "+ birliktebitirmesuresi);


        System.out.println("Bir otobüs yilda kac km yol gider");
        System.out.println("Lutfen otobusun gunluk gittigi yol miktarini yaziniz");

        double gunlukYol = input.nextDouble();

        System.out.println("Yillik aldigi mesafe  = "+ "="+ (gunlukYol*365));


       // Verilen bir sayi cift sayi ise ekrana cift sayi yazdiriniz.
        System.out.println("Lutfen bir tamsayi giriniz");
        double sayi1 = input.nextDouble();

        if (sayi1 % 2!= 0) {

            System.out.println("Tek sayi...");
        } else {
            System.out.println("Ciftsayi..");


        }

        }


    }

