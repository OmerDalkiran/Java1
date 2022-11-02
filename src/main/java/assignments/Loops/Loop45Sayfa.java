package assignments.Loops;

import java.util.Scanner;

public class Loop45Sayfa {
    public static void main(String[] args) {

        //20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk
        //bırakarak yazdırmak için gereken kodu yazınız.

        for (int i = 20; i > 2; i--) {
            if ((i % 2) == 1) {
                // 19 17 15 13 11 9 7 5 3 bu sonucu almak icin
                System.out.print(i + " ");          // System.out.print (i+" ") i hemem buraya koymak lazim. eger iki tane guzel
                // parantezin altina konulursa sonuc : 20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3
            }                                       // boyle oluyor.


        }

        Scanner input = new Scanner(System.in);


        //  Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
        //  3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

        int num = 3;
        for (int i2 = 1; i2<11; i2++) {
            System.out.print(num + "x" + i2 + "=" + num * i2);

        }

        // Size verilen bir sayinin rakamlari toplamini ekrana yazdiran kodu yaziniz.

        int result = 0;
        int sayi = 666;

        while (sayi > 0) {

            result = result + sayi % 10;
            sayi = sayi / 10;

        }                                  // 18
        System.out.println("\n" + result);  // bu islemin yeri cok onemli. eger guzgun { lerden sonra konulmazsa
        // bazen hic sonuc vermeyebilir.


        // Size verilen bir sayinin rakamlari toplamini ekrana yazdiran kodu yaziniz.

        int son = 0;
        int sayi1 = 786954;
        while ((sayi1 > 0)) {
            son = son + sayi1 % 10;
            sayi1 = sayi1 / 10;
        }
        System.out.println("\n" + son);  // 39

        // size verilen bir sayiin rakamlari toplamini yazdirin
        int rkmtopl = 0;
        int sayi2 = 2345678;
        while ((sayi2 > 0)) {
            rkmtopl = rkmtopl + sayi2 % 10;
            sayi2 = sayi2 / 10;
            //System.out.print(rkmtopl); //  System.out.print(rkmtopl) burdayken verdigi sonuc:8152126303335
        }
        System.out.print(rkmtopl); //  System.out.print(rkmtopl) burdayken verdigi sonuc: 35 *while scope unun icinde olmalali.

        {
            System.out.println();
        }

    }

}