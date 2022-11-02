package practiceAdvanced.practice02;

import java.util.Scanner;

public class Q02_For_Continue {
    /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
          int toplam =0;

        for (int i = 0; i < 5; i++) {

                                               // bu 5 defa tekrarlayacagi anlamina gelir
   System.out.println(" Bir sayi giriniz");   // bunu 5 defa tekrar edecek
            int sayi = input.nextInt();                // su an birinci dongudeyiz.


            if (sayi > 5 && sayi < 10) {
                continue;

            }
            toplam += sayi; // toplam= toplam + sayi;
        }


        System.out.println("Toplam= "  + toplam);
        }
    }

