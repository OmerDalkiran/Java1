package practiceAdvanced.practice05;

import java.util.Scanner;

public class Q02_NestedFor_UcgenSorusu {
      /*
Kullanıcıdan aldığınız satır sayısına göre aşağıdaki şekli yazdıran bir kod yazınız.

           aaaa*
           aaa* *
           aa* * *
           a* * * *
           * * * * *
 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir = input.nextInt();

        for(int i=0; i<satir; i++){//Satır kontrolü

            for (int bosluk=satir-i; bosluk>2; bosluk--){

                System.out.print(" ");
            }
            for (int yildiz=0; yildiz<=i; yildiz++){
                System.out.print("A ");
            }
            System.out.println();
        }
    }
}
