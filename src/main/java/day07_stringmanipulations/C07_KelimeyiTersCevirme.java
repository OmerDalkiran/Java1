package day07_stringmanipulations;

import java.util.Scanner;

public class C07_KelimeyiTersCevirme {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Lutfen 4 karakterli bir kelime giriniz");

        String kelime= input.nextLine();  // Er z yazanlar icin ...
        System.out.println(kelime.length());

        if(kelime.length()==4) {
            char bir = kelime.charAt(0);
            char iki = kelime.charAt(1);
            char uc = kelime.charAt(2);
            char dort = kelime.charAt(3);

            // tersten yazdirmak icin
            System.out.println("Tersten yazilmis hali: " + dort + uc + iki + bir);
        } else if (kelime.length()>4) {
            System.out.println("Girdiginiz kelime 4 karakterden fazladir");

        } else if (kelime.length()<4) {  // else le birakamayiz cunku parantezin icinde islem var. Eger olmasaydi else olurdu
            System.out.println("Girdiginiz kelime 4 karakterden kucuktur");


        }

    }
    }

