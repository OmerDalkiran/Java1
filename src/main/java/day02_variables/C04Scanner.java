package day02_variables;

import java.util.Scanner;

public class C04Scanner {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println(" dort basamakli bir sayi giriniz");
        int sayi = scanner1.nextInt();

        // bir sayinin birler basamagini %10(macylys 10 ile hesaplaabiliriz.
        int sonRakami=sayi%10; // sayiyi ona bölüyoruz kalaini macylys 10 %10 ile buluyoruz.
        int ilkRakam=sayi/1000;// sayiyi bine bölersek sayinin ilk rakami kalan olur onu da macyly 1000 ile yapiyoruz.
        System.out.println("ilk rakam + son rakam "+ (ilkRakam+sonRakami));

// /* Ornek : Inputs : 853
//    Output : Girdiginiz sayinin birler basamagi : 3
//             Girdiginiz sayinin onlar basamagi : 5
//             Girdiginiz sayinin yuzler basamagi : 8

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi2 = scanner2.nextInt();
        int birlerbasamagi = sayi2%10;

        int yenisayi =sayi%10; // 10 lar basamagini bulduk
        int onlar= sayi2%10;
        System.out.println("Girdiginiz sayinin onlar basamagi "+ onlar);

        // 100 ler basamagi
        int yuzler = sayi2/=10; // bölmenin kisa yöntemi sayi ikiyi 10a böl demek.
        System.out.println("Yuzler bas. "+ yuzler);

    }
}
