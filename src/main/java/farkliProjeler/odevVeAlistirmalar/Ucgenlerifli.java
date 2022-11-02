package farkliProjeler.odevVeAlistirmalar;

import java.util.Scanner;

public class Ucgenlerifli {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ucgen cesitlerini ogrenelim");
        System.out.println("0'dan buyuk uc kenar uzunlugu giriniz");
        System.out.println("a kenarini, b kenarini ve c kenarini giriniz");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

// Not : eksi sayilar ve 0 degerini girmeyi deneyenlere bir uyari yazdiramadim.
        if (a==0 || b==0 || (c==0) || a<0 || b<0 || c<0); {
            System.out.println("Girdiginiz deger 0'd)an büyük bir deger olmali");
        }
        if (a == b && b == c) {
            System.out.println("Eskenar Ucgen");
        } else if (a == b && b!=c || a == c && b!= c || b == c && b != c) {
            System.out.println("Ikizkenar Ucgen ");
        } else {
            System.out.println("Cesit Kenar Ucgen ");
        }
    }
}
