package day02_variables;

import java.util.Scanner;

public class C05Odevler {
    // Kullanicidan alacaginiz 5 basamakli sayinin ilk iki ve son iki rakamlarinin toplamini bulunuz.

    // Ex
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz");
        int num = input.nextInt();
        int ilkikirakam=num/1000;
        System.out.println("ilkikirakam = " +ilkikirakam);
        int ilkikirakamtop=(ilkikirakam%10)+(ilkikirakam/10); // 12345 icin  2+1 i bulacak bu islem.

        //%10 macylys 10 demek kalan rakami bulmak icin

        System.out.println("ilkikirakamtop = "+ ilkikirakamtop);//3

        int sonIkirakam=num%100; // 100 bölünve son iki rakami veriyor.
        System.out.println("sonIkiRakam =" +sonIkirakam);
        int sonIkiTop=(sonIkirakam%10)+(sonIkirakam/10);//5+4
        System.out.println("sonIkiTop = " + sonIkiTop);
        System.out.println("Toplam= "+ilkikirakamtop+sonIkirakam);// Bunu 45678 de 978 diye yazdiriyor

        int toplam=ilkikirakamtop+sonIkiTop;
        System.out.println("toplam = " + toplam);



    }


}
