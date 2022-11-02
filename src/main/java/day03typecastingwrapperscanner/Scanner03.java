package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        // Kullanicidan bir dikdörtgenin en ve boyunu alip alan ve cevresini hesaplayan kodunu yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdörtgenin enini giriniz...");
        double en = input.nextDouble(); // int en input.nextint () data tipi neyse int se nextint, doule sa nextdouble

        System.out.println("Dikdörtgenin boyunu giriniz...");
        double boy = input.nextDouble();

        System.out.println("Alan " + en*boy);

        System.out.println("Cevre " + 2*(en+boy));


    }
}
