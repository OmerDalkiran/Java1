package assignments.Loops.DoWhileLoops;


import java.util.Scanner;

public class DoWhileLoopSoru1 {
    public static void main(String[] args) {


        // Ex.1 Kullanicidan bir sayi giriniz. eger 100 den kucukse kazandiniz, yazsin ve tekrar bir sayi
        // girmesini istesin. aksi takdirde kaybettiniz yazdiriniz.

        Scanner input= new Scanner(System.in);
        int sayi= 0;
        int counter=0;
        counter=sayi+1;
        do {
            System.out.println("Lutfen bir sayi giriniz");
             sayi = input.nextInt();


            if (sayi< 100 && counter<3) {
                System.out.println("Kazandiniz");

            }

        }while ( sayi<100);
        System.out.println("Kaybettiniz");

        //Ex. 260 tan 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
        //ardışık tam sayı arasında boşluk bırakarak yazınız.

        int a=60;
        do {
            if (a%4==0 && a%6==0){
                System.out.print(a + " ");
            }
            a--;

        } while (a>10);
    }
}