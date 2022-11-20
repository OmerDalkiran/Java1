package farkliProjeler.biletHesapla;

import java.util.Scanner;

public class Runner {
/*
       A şehrinden uçmak isteyen bir yolcu
       B şehrine 500km
       C şehrine  700km
       D şehrine  900 km mesafededir.

       Bilet tarifesi:km birim fiyati : 0.10$ ==> normal fiyat=0.10x500=50

       1-Yolcu 12  yasindan kucukse toplam fiyat %50 indirim,
       2-12 (dahil)  ve 24 yas arasindaysa 10% indirim,
       3-65 ve 65 yasindan buyukse 30% indirim,
       4-Bilet gidis donus alinirsa 20% indirim uygulayan bir app create ediniz */

    public static void main(String[] args) {

        System.out.println("Lutfen gideceginiz Sehri giriniz");
        Scanner input = new Scanner(System.in);

        String sehir = input.next();


        System.out.println(" Lutfen yasinizi giriniz ");
        int yas = input.nextInt();

        System.out.println("Lutfen tek yonlu ucuslar icin T'ye; cift yonlu ucuslar icin C'ye basiniz");
        String yon = input.next();

        NetBiletFiyati Yasin = new NetBiletFiyati();
        double yasininBileti = Yasin.cocukYasIndirimi(10);

    }


    }

