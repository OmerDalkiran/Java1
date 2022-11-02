package practiceAdvanced.practice06;

import java.util.Scanner;

public class Q01_Rastgele_Sayi_MAtriksi {

/*

Kullanıcıdan aldığınız bir sayi kadar satır ve sütun sayısına sahip alttaki rastgele 0 ve 1'lerden oluşan matriksi yazdırın.

Input: 10

Output:
1 0 0 1 1 0 0 0 1 1
0 0 1 0 1 0 1 0 0 0
0 1 0 1 0 0 0 0 0 1
1 1 1 0 0 0 0 1 1 1
1 1 0 1 1 1 0 1 0 0
1 0 0 0 1 1 0 0 0 0
0 0 1 0 0 0 0 1 1 1
1 1 0 1 0 1 0 0 1 0
0 0 1 0 0 0 0 1 1 0
1 1 1 0 0 1 1 1 1 0

*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("bir sayi giriniz");
      int sayi=  input.nextInt();

      for(int i=0; i<sayi; i++){

          for(int j=0; j< sayi; j++){
              System.out.print((int) (Math.random() * 2 )); // buradan ya 0 yada 1 elde ederiz surekli olarak.
          }                                                 // int  in gorevi ondalik kesmi atmak.randomda cunku alinacak sayilar
          System.out.println();                            // surekli 0 ve 1 arasindadir. onun icin ilk once 2 ile carpilip sonra int a cevriliyor.
      }

    }
}
