package farkliProjeler.odevVeAlistirmalar;

import java.util.Scanner;

public class Birsayi101001000 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz.Bakalim ozel sayilarimizi bulabilecekmisiniz?");

        int sayi = input.nextInt();

        switch (sayi){
            case 10:
                System.out.println("Tebrikler. Birinci ozel sayimizi buldunuz. Bu buldugunuz sayi " +
                        "iki basmakli en kucuk sayidir. 10 puan kazandiniz");
                break;
            case 100:
                System.out.println("Tebrikler. Ikinci ozel sayimizi buldunuz. Bu buldugunuz sayi" +
                        "uc basmakli en kucuk sayidir. 100 puan kazandiniz");
                break;
            case 1000:
                System.out.println("Tebrikler. Ucuncu ozel sayimizi buldunuz. Bu buldugunuz sayi" +
                        "dort basmakli en kucuk sayidir. 1000 puan kazandiniz");
                break;

            default:
                System.out.println("Maalesef ozel sayimizi bulamadiniz.Bir daha denemek istermisiniz_");


        }


    }


}
