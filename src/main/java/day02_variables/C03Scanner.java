package day02_variables;

import java.util.Scanner;

public class C03Scanner {
    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        // ya da
        // Scanner input = new Scanner(System.in);

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz");
        double r = input.nextDouble();
        System.out.println("Cemberin cevresi = " + 2 * 314 * r / 100);
        System.out.println("Dairenin alani= " + 3.14 * r * r);


        //Soru 2 Dikdortnenin alanni ve cevresi
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Lütfen kisa kenar uzunlugu giriniz");
        double kisa = scan2.nextDouble();

        System.out.println("Lutfen uzun kenar uzunlugunu giriniz");
        double uzun = scan2.nextDouble();
        System.out.println("Dikdortgenin cevresi : " + (2 * kisa + 2 * uzun));
        System.out.println("Dikdortgenin alani= " + kisa * uzun);


        // 3 Ucegenin cevresi

        Scanner scan3 = new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarini giriniz");
        byte a = scan3.nextByte();
        byte b = scan3.nextByte();
        byte c = scan3.nextByte();

        int cevre = a + b + c;
        System.out.println("Ucgenin Alani= " + cevre);

        // 4 /*


        Scanner scan4 = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char ch=scan4.next().charAt(0); // indexler 0 dan basladigi icin
        System.out.println("    "+ch+"   "); // String bir ifade de mutlaka + kullanilmasi lazim.
        System.out.println("  "+ch+"  "+ch); //ch kullanicidan aldigimiz sembol yada karakter
        System.out.println(""+ch+"   "+ch+"   "+ch+""); // char da char1 , char2 yazilmaz zaten tek bir karakter bulundurur.
                                                    // 1. indexte ve 2 indexte karakter yoktur.

        // 853 ün birlerbasamagindaki 3 ü bulmak icin %10 yapariz.
        // 853
        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();
// 1) 1 ler basamagindaki sayiyi bulun
        int birler = sayi % 10;
        System.out.println("girdiginiz sayinin birler basamagi " + birler);
        sayi /= 10;
// 2) 10 lar basamagindaki sayiyi bulun
        int onlar = sayi % 10;
        System.out.println("girdiginiz sayinin onlar basamagi " + onlar);
// 3) 100 ler basamagindaki sayiyi bulun
        int yuzler = sayi /= 10;
        System.out.println("girdiginiz sayinin yuzler basamagi " + yuzler);
    }
}
