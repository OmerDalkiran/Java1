package day03_ifStatement;

public class C04_MantikOperatorleri {

    public static void main(String[] args) {

        System.out.println(5+2==8); // Boolean da bu false verir. Java burayi ne dondurur?

        boolean sonuc1 = 5>4 && 7<9 && 6+3==9 && 5+2!=8; // Sonuc 1 ne dondurur arkadaslar? yazdiralim ve gorelim.
        System.out.println("sonuc1 ==> "+ sonuc1); // sonuc1 ==> true

        boolean sonuc2= 5>4 && 7>9 && 6+3==9 && 5+2!=8; // != "esit degildir" demek
        System.out.println("sonuc2 ==> "+ sonuc2);

        boolean sonuc3= 5>4 & 7>9 & 6+3==9 & 5+2!=8;
        System.out.println("sonuc3==> "+ sonuc3);


        int sayi1=15;
        // Sayi 1 in 10 ile 20 arasinda olup olmadigini söyle buluyoruz.

        System.out.println("10<sayi1 && sayi1<20");

        int sayi2=5;
        // sayi 2 nin 10 ile 20 arasinda olmadigini true diyerek donduren bir code yaziniz.

        System.out.println(sayi2<10 || sayi2<20); // ||  iki duz cizgi demek . sonucu true gostererek verin dedigi icin veyayi kullandik.
        System.out.println(sayi2<10 || sayi2>20); // veya da 2 10 dan kucuktur veya 2 20den buyuktur de 'veya' oldugu
        // icin sonuc true cikar. yani bir tanesini saglamasi yeterli.


    }


}
