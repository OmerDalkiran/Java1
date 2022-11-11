package assignments.abdullahla;

import java.util.Scanner;

public class SuleHaniminDersSorulari {

    public static void main(String[] args) {

        //      //Asagidaki sekli yazdiran kodu yaziniz
        //
        ////        1 2 3 4 5 6
        ////         2 3 4 5 6
        ////          3 4 5 6
        ////           4 5 6
        ////            5 6
        ////             6

        for (int satir = 1; satir <= 6; satir++) {//satır kontrolü

            for (int bosluk = 1; bosluk < satir; bosluk++) {// boşluk yazdırma

                System.out.print(" ");
            }
            for (int rakam = satir; rakam <= 6; rakam++) {//sutun kontrolu

                System.out.print(rakam + " ");
            }
            System.out.println();

        }

        for (int i = 1; i < 7; i++) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = i; j < 7; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }

         /*
            Kullanicidan toplanmak uzere sayilar isteyin.
            Sayi adedi 10'u gecerse yada toplami 500'u gecerse
            " Bu kadar sayi yeter ...adet sayi girdiniz toplami..." yazdirin
         */

        Scanner input = new Scanner(System.in);

        int sayi = 0;
        int sum = 0;
        int counter = 0;


        while (counter < 11 && sum < 500) {
            System.out.println(" Lufen toplanmak uzere sayi girmeye devam ediniz");

            sayi = input.nextInt();
            sum += sayi;
            counter++;

        }

        if (sum > 500) {
            System.out.println(counter + " adet  sayi girdiniz" + "Toplam miktariniz= " + sum + "Girdiginiz miktar yeterlidir.Tesekkurler");
        } else System.out.println("Bu kadar sayi yeter." + counter + "adet sayi girdiniz. Toplami   " + sum);

    }
}






