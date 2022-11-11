package assignments.abdullahla;

import java.util.Scanner;

public class MilSaniyeFahrenheit {
    /*
    Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için kod yazınız.
     Google'dan dönüşümler için formülleri bulunuz.
    a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
    b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
    kodunuz "2" yazmalıdır (sayı dinamik olacak)
    c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde,
    konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen Mil'i kilometreye donusturmek icin 1'e; Saati saniyeye donusturmek icin 2'e" +
                "Fahrenheit'i Santigrad'a donusturmek icin 3'e basiniz");

        int choice = input.nextInt();
        if(choice==1){
            System.out.println("Mil'i kilometreye donusturmek icin deger giriniz.");
            double mil = input.nextDouble();
            double milToKm =mil*1.6;
            System.out.println(" Girdiginiz mil degeri: " + milToKm+ " km.dir");

            } else if (choice==2) {

            System.out.println("Lutfen Saati saniyeye donusturmek icin bir saat degeri giriniz.");
            double saat = input.nextDouble();
            double saatToSn =saat*3600;
            System.out.println("Girdiginiz saat " +saatToSn+" 'sn.dir.");


        } else if (choice==3) {
            System.out.println("Santigrada donusturmek istediginiz Fahrenheit degerini giriniz");
            double fahrenheit= input.nextDouble();
            double fahrenheitToSantigr = (fahrenheit-32)/1.8;
            fahrenheitToSantigr = Math.round((fahrenheitToSantigr));
            System.out.println(" Girdiginiz Fahrenheit'in degeri : " + "fahrenheitToSantigr+" + "Santigrad'tir.");

        }else {
            System.out.println("Lutfen gecerli bir secim yapmak icin ya 1'e ya 2'ye ya da 3'e basiniz.");
        }
    }
    }

