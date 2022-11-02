package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        // Ex 1 : Kullanicidan alinan sayinin tek mi cift mi oldugunu ekrana yazan kodu yaziniz.
        //sayi tekse tek, ciftse cift yazacak

        Scanner input = new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz.");
        int s = input.nextInt();

        if(s%2==0) {
            System.out.println("Ciftsayi..");
        }
            if(s%2!=0) {
                System.out.println("Tek sayi ..");

                // 2.yol else }else{  diger bütün ihtimaller demek. islemleri azaltir.

                if (s % 2!= 0) {
                    System.out.println("Tek sayi...");
                } else {
                    System.out.println("Ciftsayi..");
                }

            }

        // Ex 2 bir sayinin negativ , positif yada nötr oldugunu söyleyen kodu yaziniz

        System.out.println("Bir sayi giriniz");
        double d = input.nextDouble();
        if(d>0) {
            System.out.println("Pozitif");
        }else if (d==0) {
            System.out.println("Notr");
        }else{
            System.out.println("Negatif");
        }
    }
}
