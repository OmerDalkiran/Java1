package suleHaniminClasslari;

import java.util.Scanner;

public class YasSorusu {

    // Kullanicidan yasini isteyin
// 65 veya daha buyukse emekli olabilirsin
// 65'den kucukse emekli olamazsin "? sene daha calisman lazim" yazdirin

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen yasinizi positif sayi olarak giriniz");

        byte yas = input.nextByte();

        if (yas >= 65) {
            System.out.println("Emekli olabilirsin");
        } else {
            System.out.println("Emekli olamazsin");
            System.out.println(65 - yas + "sene kadar calismalisin");
        }
    }
}


