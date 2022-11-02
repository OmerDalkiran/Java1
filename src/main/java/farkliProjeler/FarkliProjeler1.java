package farkliProjeler;

import java.util.Scanner;

public class FarkliProjeler1 {

    // Kullanicidan yasini isteyin
    // 65 veya daha buyukse "emekli olabilirsin"
    // 65'den kucukse emekli olamazsin "? sene daha calisman lazim " yazdirin

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Lutfen yasinizi girermisiniz");


        int yas = input.nextInt();

        int emeklilikyas =65;

       // if(yas<0 && yas>120) { }


        String sonuc = yas>= emeklilikyas ? ("Emekli olabilirsin" ): ("Emekli olamazsin.Emekli olman icin "+ (65-yas)+ "sene calisman lazim");
        System.out.println(sonuc);


        /* int artikYil = 1990;
          String sonuc = artikYil%100==0 ? (artikYil%400==0 ? "Artik yil" : "Artik yil degil") : (artikYil%4==0 ? "Artik yil " : "Artik yil degil");*/

        }
    }





