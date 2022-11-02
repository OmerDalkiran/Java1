package day08stringmanipulations;

import java.util.Scanner;

public class MusteriKrediKartlimi {

    //     Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
    //     * musteri karti olup olmadigini sorun
    //     * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
    //     * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
    //     * alirsa %10 indirim yapan code create ediniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen aldiginiz urunun adedini giriniz");
        double urunadedi = input.nextDouble();

        System.out.println("Lutfen aldiginiz urunun  liste fiyatini giriniz");
        double urunFiyat = input.nextDouble();

        System.out.println("Kredi kartiniz varsa E yoksa H giriniz");

        char cevap = input.next().toUpperCase().charAt(0);

        //String indirim =

// String sonuc = yas>= emeklilikyas ? ("Emekli olabilirsin" ): ("Emekli olamazsin.Emekli olman icin "+ (65-yas)+ "sene calisman lazim");


    }


}
