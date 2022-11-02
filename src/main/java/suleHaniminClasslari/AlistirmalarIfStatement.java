package suleHaniminClasslari;

import java.util.Scanner;

public class AlistirmalarIfStatement {

    /*Soru 6) Kullanicidan iki sayi isteyin,
 sayilarin ikisi de pozitif ise "sayilarin toplamini "yazdirin,
 sayilarin ikisi de negative ise "sayilarin carpimini" yazdirin,
 sayilarin ikisi farkli isaretlere sahipse "farkli isaretlerde sayilarla islem yapamazsin" yazdirin,
 sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.*/


//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println(" Iki tane sayi veriniz");
//
//        double sayi1 = input.nextDouble();
//
//        System.out.println(" Simdi ikinci sayiyi veriniz");
//
//        double sayi2 = input.nextDouble();
//
//        double sonuc1 = (sayi1+sayi2);
//
//        double sonuc2 = (sayi1*sayi2);
//
//
//
//        if(sayi1>0 && sayi2>0);
//        System.out.println(sonuc1);
//
//        if (sayi1<0 && sayi2<0 );
//        System.out.println(sonuc2);
//
//        if (sayi1<0 && sayi2>0);
//        System.out.println("Farkli isaretlerde sayilarle islem yapamazsin");

        public static void main(String[] args) {

            Scanner input=new Scanner(System.in);
            System.out.println("Lutfen ilk sayiyi giriniz...");
            double sayi1=input.nextDouble();

            System.out.println("Lutfen ikinci sayiyi giriniz...");
            double sayi2=input.nextDouble();

            if(sayi1>0 && sayi2>0){
                System.out.println("sayilarin toplamini"+ (sayi1+sayi2));//ikiside pozitif ise

            }else if(sayi1<0 && sayi2<0){

                System.out.println("sayilarin carpimini " + (sayi1*sayi2)); //ikiside negatif ise

            }else if (sayi1*sayi2<0){//(sayi1<0 && sayi2> 0

                System.out.println("farkli isaretlerde sayilarla islem yapamazsin ");

            }else
                System.out.println("sifir carpmaya gore yutan elemandir...");//tum ihtimaller denendi bir tanesi sifirsa yutan elemandir
    }
}
