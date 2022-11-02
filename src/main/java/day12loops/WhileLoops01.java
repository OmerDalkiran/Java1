package day12loops;

import java.util.Scanner;

public class WhileLoops01 {

    public static void main(String[] args) {


        // Ex. 3ten 10 a kadar tam sayilari ayni satirda ekrana yazdiran kodu yazdirin

        for (int i = 3; i < 11; i++) {  // butun looplarda baslangic, hangi sartlarda calisacagi ve arttirma azalma vardir.

            System.out.print(i + "  ");

        }
        System.out.println();


        // 2.yol  : WHILE - LOOP  Ayni bilgileri farkli yerlere yaziyoruz.
        int i = 3;
        while (i < 11) {
            System.out.print(i + " ");

            i++;
        }

        // 17 den dorte kadar tum cift sayilari ayni satirda yazdiran kodu yazdirin
        {
            System.out.println();
        }
        int k = 17;
        while (k > 3) {
            if (k % 2 == 0) {
                System.out.print(k + " ");
            }

            k--;
        }
        System.out.println();

        // Ex 3 12 den 14e kadar olan sayilarin toplamini veren kodu yazini

        int sum = 0;
        int m = 12;

        while(m<15) {
            sum = sum+m;

            m++;
        }
        System.out.println(sum); // 39


        //Ex 4 Size verilen bir tamsayinin rakamlari toplamini ekrana yazdiran kodu yaziniz.

        System.out.println(" Bir sayi giriniz");

        // 385 mesela : bir le basamagindaki sayiyi almak icin mod 10 alinir 10 a bolunur .
        // tekrak mod 10 alinir tekrar 10a bolunur.

                       // siralama
     int sonuc = 0 ;    //1
     int sayi = 385;    // 2

     while (sayi>0 ) {  // 3


         sonuc = sonuc + sayi%10;   // 5
         sayi= sayi/10;   //4      sayi/10 u sayi'nin icine assign ediyorum.
     }

        System.out.println(sonuc); // 6


        // Ex 5 : Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz.
        // 3 ==> 3x1=3  3x2=6  3x3=9 ...

        Scanner input= new Scanner(System.in);
        System.out.println(" Bir sayi giriniz");


        int s = input.nextInt();

         int n = 1; // neyle baslayacak

        while (n<11) {


            System.out.print(s+"x" + n+ "=" + s*n+ "  ");

            n++;
        }


    }
}


