package assignments.withabdullah;

import java.util.Scanner;

public class SsgLoopsEkDersNestedLoops {
    public static void main(String[] args) {

        int multiply = 1;
        for (int k = 1; k <= 5; k++) {

            multiply = multiply * k;
            System.out.print(" " + multiply);

        }
        System.out.println();


        int arr[] = {1, 2, 3, 4,};

        for (int w : arr) {

            System.out.print(w + " ");
            {

            }
            System.out.println();
        }

        int arr2[][] = {{1, 2, 3, 4}, {2, 6, 9}};
        for (int[] w : arr2) {
            for (int y : w) {
                System.out.print(y + " ");
            }
        }

        System.out.println("\n" + "Satir sayisini giriniz");
        Scanner input = new Scanner(System.in);
        int satir = input.nextInt();

        System.out.println("Sutun sayisini giriniz");
        int sutun = input.nextInt();

        // System.out.println(" Bir karakter seciniz");        tek karakterle bu code u; eger kelime
        //  char ch = input.next().charAt(0);                  yazdirmak istiyorsaniz asagidaki code kullanin

        System.out.println("Bir kelime yaziniz");
        String yazi= input.next();

        for (int i = 1; i <= satir; i++) {
            for (int k = 1; k <= sutun; k++) {
                System.out.print(yazi+" ");
            }
            System.out.println();
        }


        for(int i=1; i<6; i++){
            for (int k=1; k<=i; k++){   // 1         k degeri satir sayisina kadar gidp alta gectigi icin k<=i dedik.
                                        // 12       Yazdirirkende k surekli degistigi icin onu yazdirdik.
                System.out.print(k);    // 123
            }                           // 1234
            System.out.println();       // 12345
        }


        int row = 4;

         for(int i=1; i<=row; i++){
             for(int k=row; k>=i; k--){
                 System.out.print("*");
             }
             System.out.println();
         }
         // Ogrencilerin isimlerindeki harf;leri yazdiriniz
         String stdNames []= new String[3];
         stdNames [0]="Ali";
         stdNames [1]="Harun";
         stdNames [2]="Can";

        System.out.println(stdNames[0].length());

        int karakterToplam = 0;
        for(String w : stdNames){
            karakterToplam=karakterToplam+w.length();

            System.out.println(karakterToplam);

        }

    }
}