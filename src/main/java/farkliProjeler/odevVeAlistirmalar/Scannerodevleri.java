package farkliProjeler.odevVeAlistirmalar;

import java.util.Scanner;

public class Scannerodevleri {
    public static void main(String[] args) {

// Kullanicidan bir dairenin capini alan ve onun cevresini ve alanini hesaplayan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Alanini ve cevresini hesaplamak istediginiz dairenin capini girermisiniz?");

        double cap = input.nextDouble();

        System.out.println("Dairenizin Alani= " + (cap * 3.14 / 2));

        System.out.println("Dairenizin cevresi ise= " + 6.28 * cap);

        System.out.println("Hesaplamami istediginiz baska birsey var mi?");




    }

}
