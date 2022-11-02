package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //Example 1 : sayilari kullanicidan alan ve toplama islemi yapan kodu yaziniz.

        // 1. Adim Scanner calasisndan obje olustur

        Scanner input = new Scanner(System.in);

        // 2. Adim kullaniciya ne yapacagini söyle

        System.out.println("Ilk sayiyi giriniz...");
        double sayi1 = input.nextDouble();

        System.out.println("Ikinci sayiyi giriniz...");
        double sayi2 = input.nextDouble();

        System.out.println(sayi1 + sayi2);



    }
}
