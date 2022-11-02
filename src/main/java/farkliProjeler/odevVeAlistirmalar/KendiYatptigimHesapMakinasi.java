package farkliProjeler.odevVeAlistirmalar;

import java.util.Scanner;

public class KendiYatptigimHesapMakinasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen hesaplamak istediginiz iki sayi giriniz");
        System.out.println("Ilk sayinizi alalim");

        double sayi1 = input.nextDouble();

        System.out.println("Simdi ikinci sayinizi giriniz");
        double sayi2 = input.nextDouble();

        System.out.println("Yapmak istediginiz islemi secermisiniz? +, -, *, /, % ");
        char islem = input.next().charAt(0);
        switch (islem) {

            case '+':
                System.out.println(sayi1+sayi2);
                break;
            case '-':
                System.out.println(sayi1-sayi2);
                break;
            case '*':
                System.out.println(sayi1*sayi2);
                break;
            case '/':
                System.out.println(sayi1/sayi2);
                break;
            case '%':
                System.out.println(sayi1*sayi2/100);
                break;
            default:
                System.out.println("Yapmak istediginiz islem maalesef bu surumde yoktur.Insallah" +
                        "bu surumu gelistirince ileride onuda yababileceksiniz." +
                        "Iyi gunler dilerim. Hersey gonlunuzce olsun");



        }
    }
}
