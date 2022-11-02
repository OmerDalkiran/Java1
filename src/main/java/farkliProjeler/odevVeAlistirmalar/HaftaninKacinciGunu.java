package farkliProjeler.odevVeAlistirmalar;

import java.util.Scanner;

public class HaftaninKacinciGunu {


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Acaba sayisini soylediginiz gun haftanin kacinci gunudur, biliyormusunuz?" +
                "Ogrenmek icin hemen bir gun giriniz");
        String gun = input.next().toLowerCase();

        switch (gun){
            case ("pazar"):
                System.out.println("Pazar Haftanin 1 gunudur.Tebrikler");
                break;
            case ("pazartesi"):
                System.out.println("Pazartesi Haftanin 2.gunudur.Tebrikler");
                break;
            case ("sali"):
                System.out.println("Sali Haftanin 3. gunudur.Tebrikler");
                break;
            case ("carsamba"):
                System.out.println("Carsamba Haftanin 4. gunudur.Tebrikler");
                break;
            case ("persembe"):
                System.out.println("Persembe Haftanin 5. gunudur.Tebrikler");
                break;
            case ("cuma"):
                System.out.println("Cuma Haftanin 6 gunudur.Bu arada Cumaniz mubarek olsun. Tebrikler");
                break;
            case ("cumartesi"):
                System.out.println("Cumartesi Haftanin 7. gunudur.Tebrikler");
                break;
            default:
                System.out.println("Bu kelimeyi ya yanlis yazdiniz, ya da farkli bir kelime girdiniz." +
                        "Girmeniz gerekli olan kelimeler pazar, pazartesi, sali,carsamba, persembe, cuma ya da " +
                        "cumartesidir.Lutfen tekrar deneeyiniz.Tesekkurler");



        }
    }


}
