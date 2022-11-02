package suleHaniminClasslari;

import java.util.Scanner;

public class MaasTeklifi {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Lutfen maas icin bir teklif veriniz");

        int maas = input.nextInt();

        if (maas>=20000) {
            System.out.println("KAbul ediyorum");

        }else if (maas >=10000 && maas<20000) {
            System.out.println( " Konusabiliriz");

        } else if (maas<10000) {
            System.out.println("Maalesef kabul edemiyorum");

        }

    }
}
