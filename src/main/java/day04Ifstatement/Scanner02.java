package day04Ifstatement;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        // Kullanicidan ilk ve soyismini aliniz ilk ve soy isminin ilk harflarini ekrana yazdiriniz.
        // Ali Can alinacak ====> AC yazilacak ekrana

        Scanner input = new Scanner(System.in);

//        System.out.println("Ilk isminizi yaziniz");
//        char ilk = input.next().charAt(0);

//        System.out.println("soy isminizi giriniz");
//        char son= input.next().charAt(0); // Char bir karakter icindi.  next() yazilirsa tamami alinir,
        // next(0).charAt olursa o ismin ilk harfini verir next.charAt(1) ismin ikinci harfidirAl
        //  System.out.println(ilk + son);
        //  Ilk isminizi yaziniz
        //Ali
        //soy isminizi giriniz
        //Can
        //132   sonucunu verir onun icin alttaki gibi yazmak lazim


       /* System.out.println("" + ilk + son);
         Ilk isminizi yaziniz
        Ali
        soy isminizi giriniz
        Can
        AC

        */

 //" " Javada + isaretinin iki anlami var = biri toplama digeri birlestirmedir
       //  Java ilk once toplamaya calisir. Toplama yapamazsa birlestirmeye calisir. Ilk olayada Stringlerle toplama
         //yapilamaz. Stringlerde her zaman birlestirme olur.


        //2. Yol
        System.out.println("Tam isminizi giriniz");

        String tamIsim = input.nextLine(); // Ali Can
        char ilkHarf = tamIsim.charAt(0);

        System.out.print(ilkHarf);


        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);




    }
}
