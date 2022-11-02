package suleHaniminClasslari;

import java.util.Scanner;

public class Dikdortgenmi {

    //Kullanicidan dikdortgenin kenar uzunluklarini isteyin
//ve dikdortgenin kare olup  olmadigini yazdirin

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen 1. kenar uzunlugunu giriniz");
        int kenar1 = input.nextInt();

        System.out.println(" Lutfen ikinci kenar uzunlugunu giriniz");
        int kenar2 = input.nextInt();

        System.out.println(" Lutfen ucuncu kenar uzunlugunu giriniz");
        int kenar3 = input.nextInt();

        System.out.println(" Lutfen dorduncu kenar uzunlugunu giriniz");
        int kenar4 = input.nextInt();

        if (kenar3 == kenar2 && kenar2 == kenar4 && kenar4 == kenar1) {
            System.out.println("Verdiginiz degerlere gore bu ya  bir karedir yada ikizkenar dortgendir. " +
                    "Lutfen kose acilarina bakiniz. Eger 90 derece ise kare; degilse eskenar dortgendir");
        } else {
            System.out.println("Bu bir kare degildir.");


        }
    }
}