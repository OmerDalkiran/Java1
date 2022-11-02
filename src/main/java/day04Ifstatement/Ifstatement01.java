package day04Ifstatement;

public class Ifstatement01 {
    public static void main(String[] args) {


        // if it rains, I will cancel the picnic.
        // 1. bölüm Shart  2. Bölüm Sonuc
        // Shart true olursa sonuc active olacak.
        //Shart false ise , sonuc Deactive olacak.

        // Example 1 : Sayi positif ise ekrana "positif" yazilsin.
// if statement belli kodlari belli sartlara bagli olarak calistirmaya yarar,
        int s = 12;
        if (s > 0) {
            System.out.println("Positive");
        }
        // Verilen karakter büyük ise ekrana büyük harf yazdirin
// Ex 2
        char ch = 'V';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk harf");


            // Example 3 : Verilen bir sayi uc basamakli ise ekrana "uc basamakli " yazdiriniz.


            int n = 123;
            n = Math.abs(n);

            // int s = 99;
            // int b = 1000;
            if (n > 99 && n < 1000) ;

            System.out.println("Uc basamakli");



            // Verilen sayi cift sayi ise ekrana cift sayi yazdiriniz,
            //Yani sayinin iki ye bölünmesi lazim. kalanin sifir olmayi lazim.

            int p = 14;
            if (p % 2 == 0) {  // Javada tek =  isareti atama operatörüdür. == olursa esittir demek java dilinde.
                System.out.println("Ciftsayi");
            }

//Ex 4 : Verilen bir sayi cift ise ekrana cift sayi yazdir.
            int r = 18; // abs absolute value demek yani -2 , -34 gib cifta sayilarda var..
            r = Math.abs(r);
            System.out.println("Cift sayi");

// Ex 5 Verilen sayi 300 den kucuk veya 1200 den buyuk ise ekrana "harika sayi" yazdirin.
            int t = 250;
            if (t< 300 || t > 1200) {  // || javaca da veya demek   ve sadece boolean lar ile kullanilir.
                System.out.println("Harika sayi");


            }

        }
    }
}