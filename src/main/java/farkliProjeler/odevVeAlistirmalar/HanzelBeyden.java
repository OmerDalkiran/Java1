package farkliProjeler.odevVeAlistirmalar;

import java.util.Scanner;

public class HanzelBeyden {

     /*Example 1: Kullanicidan alinan sayinin tek mi cift mi oldugunu ekrana yazan kodu yaziniz.
       Example 2: Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin.
                  Teklif 80.000'in uzerinde ise "Kabul ediyorum",
                  60000-80.000 arasinda ise "Konusabiliriz".
                  60.000'in altinda ise "Maalesef Kabul edemem" yazdirin.

      Example 3: Bir sifre giriniz
                 Eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin.Ilk harf A ise "Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin.
                 Eger ilk harf kucuk harf ise "z" olup olmadigini kontrol edin.Ilk harf z ise "Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin.


      Example 4: Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
                 i)Yil 100 e bolunursa 400 e de bolunmelidir. ==> 1600+ (artik yil) 1800-(artik yil degil)
                 ii)Yil 100 e bolunmezse 4 e bolunmelidir. ==> 1996+ (artik yil)  2001-(artik yil degil)

    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Tek mi cift mi oldugunu gormek istediginiz bir tam sayi giriniz");

        int sayi = input.nextInt();

        String sonuc = (sayi % 2 == 0) ? ("cift") : ("tek");
      //  if()
        // [0-9a-zA-Z]&& [ ]&& \\p{Punct})

        System.out.println(sonuc);


         /*Example 1: Kullanicidan alinan sayinin tek mi cift mi oldugunu ekrana yazan kodu yaziniz.
         Egr kullanici tamsayinin dusunda herhangi bir sey girerse " Uyari verin.
          */

        System.out.println(" Tek mi cift mi oldugunu gormek istediginiz bir tam sayi daha giriniz");

        int rakam = input.nextInt();
        String result = (rakam % 2 == 0 ? ("Girdiginiz rakam cifttir") : ("Girdiginiz rakam tektir"));
        System.out.println(result);


        System.out.println("Lutfen bir sayi giriniz. Bakalim sayiniz tek mi yoksa cift mi?");
        int sayi1 = input.nextInt();
        if (sayi1 % 2 == 0) {
            System.out.println("Bu sayiniz cifttir");
        } else {
            System.out.println("Sayiniz Tek sayidir.");
        }


        //Kullancidan yas degerini alan kodu yaziniz ve yasin hangi evrede oldugunu asagidaki tabloya göre yazdiriniz.

        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //Tanimlanmamis evre

        System.out.println(" Lutfen yasinizi giriniz");

        int yas = input.nextInt();

        if (yas < 0) {
            System.out.println("GEcerli bir yas giriniz");

        } else if (yas < 5) {
            System.out.println("Siz Bebeksiniz");

        } else if (yas < 13) {
            System.out.println("Siz Cocuksunuz");
        } else if (yas < 21) {
            System.out.println("Gencsiniz");

        } else if (yas < 31) {
            System.out.println("Delikanlisiniz");


        } else {
            System.out.println("Tanimlanmamis yas");
        }
    }

}

