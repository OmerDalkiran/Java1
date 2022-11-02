package day06nestedifswitch;

import java.util.Scanner;

public class Switch01 {

    public static void main(String[] args) {

     /*
        Kullanicidan gün sayisini aliniz ve gün ismini ekrana yazdiriniz
        1 ==> Pazar         2 ==> Pazartesş   ...
     */

        Scanner input = new Scanner(System.in);
        System.out.println("Gun numaranizi giriniz..");
        byte gunNo = input.nextByte();

        //1.Yol : if ile cozunuz

        if(gunNo == 1) {
            System.out.println("Pazar");
        } else if (gunNo == 2) {
            System.out.println("Pazartesi");
        } else if (gunNo == 3) {
            System.out.println("Sali");
        } else if (gunNo == 4) {
            System.out.println("Çarşamba");
        } else if (gunNo == 5) {
            System.out.println("Perşembe");
        } else if (gunNo == 6) {
            System.out.println("Cuma");
        } else if (gunNo == 7) {
            System.out.println("Cumartesi");
        } else {
            System.out.println("Düzgün sayi gir moruk");
        }
        //2.Yol : switch ile byte, String, char, int, koyabilirsiniz.
        // if  long doble boolean degerleri if le kullanilir
        switch (gunNo) {

            case 1:
                System.out.println("Pazar");
                break;    // Break statement sizi alir dongunun disina atar.
            case 2:
                System.out.println("Pazartesi");
                break;
            case 3:
                System.out.println("Sali");
                break;
            case 4:
                System.out.println("Çarşamba");
                break;
            case 5:
                System.out.println("Perşembe");
                break;
            case 6:
                System.out.println("Cuma");
                break;
            case 7:
                System.out.println("Cumartesi");
                break;
            default: // bunlarin disindaki her durum demek
                System.out.println("Kanka Düzgün yaz LAAN ");


        }

    }
}
