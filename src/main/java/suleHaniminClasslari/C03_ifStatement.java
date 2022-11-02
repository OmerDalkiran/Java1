package suleHaniminClasslari;

import java.util.Scanner;

public class C03_ifStatement {

    //Kullanicidan bir gun alin
    // eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal  gun” yazdirin.
    // “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
    // “Pazar”  ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //   String cuma= input.nextLine("Muslumanlar icin kutsal gun");   // Stringlerde = = kullanilmaz equals kullanilir.
        //   String cumartesi = input.nextLine("Yahudiler icin kutsal gun”);
        //   String pazar = input.nextLine("Hiristiyanlar icin kutsal gun”);


        System.out.println("Lutfen bir gun giriniz");  // Stringlerde = = kullanilmaz equals kullanilir.

        //  = = te referanslari ayni olmadigi icin kullanilmaz. Cunku Javada iki tane memory var. Heap ve Steak memory
        // String te referans degerine de bakildigi icin == yerine equal kullanilir.

        //1.YOL
      String gun=input.next().toLowerCase();//toLowerCase==kucuk harf yapar

        if (gun.equals("cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }
       if(gun.equals("cumartesi")){
           System.out.println("Yahudiler icin kutsal gun");
       }
       if (gun.equals("pazar")){
           System.out.println("Hristiyanlar icin kutsal gun");
       }
       if (!gun.equals("cuma") && !gun.equals("cumartesi")&& !gun.equals("pazar")){
           System.out.println("Kutsal gun degil");
       }

        //2.YOL
       String gun1 = input.next();
        if (gun.equalsIgnoreCase("cuma")){
            System.out.println("Muslumanlar icin kutsal gun");
        }
        if (gun1.equalsIgnoreCase("cumartesi")){
            System.out.println("Yahudiler icin kutsal gun");
        }
        if(gun1.equalsIgnoreCase("pazar")){
            System.out.println("Hristiyanlar icin Kutsal Gun");
        }
        if (!gun1.equalsIgnoreCase("cuma")&& !gun1.equalsIgnoreCase("cumartesi")&& !gun1.equalsIgnoreCase("pazar")){
            System.out.println("Kutsal Gun Degil");
        }

        //3.YOL
        String gun2 = input.next().toLowerCase();


        if (gun2.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (gun2.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        } else if (gun2.equals("pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");

        } else  System.out.println("Kutsal Gun degil");


    }


}




