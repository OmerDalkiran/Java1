package day07;

public class Ternary01 {
    public static void main(String[] args) {

        // Ex 1 Bir sayinin pozitif olup olmadigini ekrana yazdiran kodu yaziniz

        // 1. yol : if else ile

        int a = 12;
        if (a > 0) {
            System.out.println("Pozitif");

        } else {
            System.out.println("positif degil");


        }
        //2. yol Ternary
        // a>0 ? "Pozitif" : "Positive degil";    //

        // Condition   ? Condition dogru ise  uygulanacak kod : condition yanlis ise uygulanacak kod
        String sonuc = a > 0 ? "Pozitif" : "Positive degil";
        System.out.println(sonuc);             //Ternary bize String verecek


        // Ex 2 iki sayidan kucuk olani secen kodu yaziniz.

        int b = 12;
        int c = 23;

        int sonuc2 = b < c ? b : c;
        System.out.println(sonuc2);  // atama operatoru bunu alip sonuc2 nin icine koyacak .
        // bende javaya print dedigimde sonuc2 yi calistiracak


        //Ex. 3 Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz

        int d = 10;
        ;   // pozitif ve sifirin mutlak degeri kendileridir
        // Negatif sayilarin mutlak degeri -1 ile carpilmis halleridir

        int abs = d >= 0 ? d : d * (-1);

        System.out.println(abs);

        // yada d<0 ? -1*d : d;

        //Ex 4 : iki tane sayi ayni isaretli ise bu sayilari carpiniz, farkli isaretli ise
        // islem yapamam mesaji veriniz.

        int f = -5;
        int g = 8;

        Object sonuc4 = (f > 0 && g > 0) || (f < g && f < 0) ? (f * g) : "islem yapamam";
        System.out.println(sonuc4);  // yazdirilacak nesneyi " " icine almamak lazim



        // Object class butun classlarin babasidir. onun icin int ve string olan.
        // JAvada her classin en az bir tane paretn class i vardir
        // Java da parent i olmayan tek class Object class tir.






         /*
            Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
                i)Yil 100 e bolunurse 400 e de bolunmelidir ==> 1600+    1800-
                ii)Yil 100'e bolunmezse 4 e bolunmelidir ==> 1996+    2001-
         */
        int year = 2001;

        String leap = year % 100 == 0 ? (year % 400 == 0 ? "Leap year" : "Leap year degil") : (year % 4 == 0 ? "Leap year" : "Leap year degil");
        //

        System.out.println(leap);


                /*
                Asagidaki kurallara gore passwordun gecerli olup olmadigini kontrol ede kod yaziniz
                 1. kural :  8 karakterden fazla karakter varsa ilk harfi "i " olmali;
                 2. sekiz karakterden az karakter varsa ilk harfi K olmali

                 */

        String pwd = "K2a3";

        String gecerli = pwd.length() < 8 ? (pwd.charAt(0) == 'K' ? "Gecerli" : "Gecersiz") : (pwd.charAt(0) == 'i' ? "Gecerli" : "Gecersiz");
        // length methodu gidiyor karakterleri sayiyor, size veriyor.
        System.out.println(gecerli);


        // Daha guzeli ise : iki ekmek al sepete koy dedim. tekrar tekrar bakkala gitme

        String pwd2 = "K2a3";

        char ilkHarf = pwd2.charAt(0);
        String gecerli2 = pwd2.length() < 8 ? (pwd2.charAt(0) == 'K' ? "Gecerli" : "Gecersiz") : (pwd2.charAt(0) == 'i' ? "Gecerli" : "Gecersiz");
        // length methodu gidiyor karakterleri sayiyor, size veriyor.2
        System.out.println(gecerli2); // tek tirnak char demek. char larda = isareti kullanilir

    }

}


