package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q02_Substring_Adsoyad {

    public static void main(String[] args) {


        // Substring iki turlu calisiyor.

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adinizi soyadinizi aralarinda bir bosluk olacak sekilde giriniz");

        String adSoyad = input.nextLine();

        String ad = adSoyad.substring(0,adSoyad.indexOf(" ")); // 0 index indexinden space indexine kadar bana ad i ver demek

        String soyad = adSoyad.substring(adSoyad.indexOf(" "+1)); // spaceten sonraki indexi almak icin +1 dedik. sonuna kadar alacak demek.

        System.out.println("Ad:  "+ad);
        System.out.println("Soyad:  "+ soyad);


    }
}
