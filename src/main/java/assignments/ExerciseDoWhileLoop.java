package assignments;

import java.util.Scanner;

public class ExerciseDoWhileLoop {

    public static void main(String[] args) {

        // Kullanicidan bir sayi giriniz. eger 100 den kucukse kazandiniz, yazsin ve tekrar bir sayi
        // girmesini istesin. aksi takdirde kaybettiniz yazdiriniz.

        Scanner input = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Bir sayi giriniz");
            num = input.nextInt();

            if (num < 100) {
                System.out.println("Kazandiniz");
            }
        }
        while (num < 100);

        System.out.println("Kaybettiniz");


        // Kullanicidan bir sayi giriniz. eger 100 den
        // kucukse kazandiniz, aksi takdirde kaybettiniz yazdiriniz.

        System.out.println(" Bir sayi giriniz");
        int sayi1= input.nextInt();

        if(sayi1<100){
            System.out.println("Kazandiniz. Bir sayi daha giriniz");
            int sayi2= input.nextInt();

            if(sayi2<100){
                System.out.println("Kazandiniz. Bir sayi daha giriniz");
                int sayi3= input.nextInt();
                if(sayi3<100){
                    System.out.println("Kazandiniz. Sayi girme limitine gelmis" +
                            " oldugunuz icin oyunu burada sonlandiriyorum. Iyi gunler dilerim");
                }
            }
        }else {
            System.out.println("Maalesef kaybettiniz. Yapacak bir sey yok.");
        }

    }

}


