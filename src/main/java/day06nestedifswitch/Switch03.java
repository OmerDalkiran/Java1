package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {

        public static void main(String[] args) {

            //Note: Switch de sadece int, byte, short, char, String data tipleri kullanilabilir
            //Note: Eger 3 den fazla durum varsa switch() tercih ederim

            //Kullanicidan islem ve iki tane sayi alarak islemin sonucunu ekrana yazdiran basit bir hesap makinasi yapiniz
            Scanner input = new Scanner(System.in);
            System.out.println("Islemi giriniz: +, -, *, /, %");
            char islem = input.next().charAt(0);

            System.out.println("Ilk sayiyi giriniz");
            double ilk = input.nextDouble();

            System.out.println("Ikinci sayiyi giriniz");
            double ikinci = input.nextDouble();

            switch(islem){

                case '+':
                    System.out.println(ilk + ikinci);
                    break;
                case '-':
                    System.out.println(ilk - ikinci);
                    break;
                case '*':
                    System.out.println(ilk * ikinci);
                    break;
                case '/':
                    System.out.println(ilk / ikinci);
                    break;
                case '%':
                    System.out.println((ilk * ikinci)/100);
                    break;
                default:
                    System.out.println("Bu islem tanimlanmamistir...");

            }

        }

    }



