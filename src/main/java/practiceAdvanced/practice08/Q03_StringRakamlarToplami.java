package practiceAdvanced.practice08;

import java.util.Scanner;

public class Q03_StringRakamlarToplami {


    public static void main(String[] args) {


        /*
     Kullanıcıdan alınan bir String içerisindeki rakamların toplamını hesaplayan bir method yazınız.
     Örn:
     input : J4\/4 1$ 34$¥
     output : 16
     İpucu:
     Character.isDigit()
     Integer.valueOf()
    */

        Scanner input =new Scanner(System.in);
        System.out.println("Bir string giriniz");
        String str = input.nextLine();

        rakamlarToplami(str);
    }

     static void rakamlarToplami (String str) {
        int toplam=0;

        for( int i=0; i< str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                toplam += Integer.valueOf(""+str.charAt(i));  // ""+ eklemekle string yaptik .
            }
        }
         System.out.println("Rakamlar toplami "+ toplam);
     }
}
