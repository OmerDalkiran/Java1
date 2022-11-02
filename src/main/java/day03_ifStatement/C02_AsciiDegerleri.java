package day03_ifStatement;


public class C02_AsciiDegerleri {

    public static void main(String[] args) {
// klavyedeki harf ve sembollerin bir karsiligi bir degeri var.

        char harf1 = 'a'; // char ifadeleri tek tirnakla yazilir
        char harf2 = 'A';
        System.out.println("harf1>harf2 ==> " + (harf1 > harf2)); //true karsilastirma islemlerinin sonucunu  boolean
        // true yada false döner. Buyuk harflerin ASCII degerleri kucuk harflerin ASCII degerlerinden daha kucuktur.

        // Ex 1 Herhangi bir char variable degerini code yazarak bulunuz.

        char j = 'j';
        System.out.println("Jnin asci degeri = " + (j + 0));

        //2. yol
        char m = 'm';
        System.out.println("m= " + m);   // char da buislem m= m cikiyor
        // int (yani integer degerini ögrenmek icin ise ayni ifadeyi int ile
        // yazdirmak lazim. Yani soyle ;
        int n = 'n';
        System.out.println("n=" + n);  // 110 veriyor ASCII n = 110

        byte b1 = 12;
        byte b2 = -125;

        System.out.println("b1>b2 ==> "+ (b1>b2)); // true veriyor b1 b2 den buyukmudur?

        float f1 = 2.34f;
        float f2 = 3.45f;
        System.out.println("f1>f2 ==> "+ (f1>f2)); // false verdi

        System.out.println("f1>b1==> "+(f1>b1)); // False yani 2.34 > 12 false demek

        long g1 = 456789L;
        byte g2 = 43;
        System.out.println("g2>g1==> " +(g2>g1)); // false  kiyaslamalar her zaman true yada false( boolean ) sonuc verir




    }
}
