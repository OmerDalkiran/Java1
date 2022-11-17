package assignments.withabdullah;

import java.util.Scanner;

public class FaktoryelFormulu{

        public static void main(String[] args) {
     /* Kullanicidan 10'dan kucuk bir tamsayi isteyiniz ve
        girilen sayinin faktoryel'ini bulun.
        (5!=5*4*3*2*1) */


            Scanner input= new Scanner(System.in);

            System.out.println("Lutfen 10'dan kucuk bir tam sayi giriniz");

            int sayi = input.nextInt();

            int fakt = 1;

            for (int i = sayi; i > 0; i--) {

                if (sayi > 10) {
                    System.out.println("Lutfen gecerli bir sayi giriniz");
                    break;

                } else if (sayi < 10) {

                    fakt = fakt * i;
                }

            }

            System.out.println(fakt);

        }
}
