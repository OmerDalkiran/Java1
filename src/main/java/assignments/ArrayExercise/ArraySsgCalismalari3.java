package assignments.ArrayExercise;

import java.util.Scanner;

public class ArraySsgCalismalari3 {
    public static void main(String[] args) {


        // Verilen array'de istenen bir elementin var olup olmadigini true/false yazdirarak
        // gosteren bir method olusturun
        int[] arr = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        System.out.println("Dizide merak ettiginiz sayiyi giriniz");
        Scanner input= new Scanner(System.in);

        int istenenSayi =input.nextInt();
        istenenElemanVarMi(arr, istenenSayi);
    }
    private static void istenenElemanVarMi(int[] arr, int istenenSayi) {
        boolean sonuc = false;

        for (int i : arr) {                 // can be replaced with (int i = 0; i <arr.length ; i++)
            if (i == istenenSayi) {         // can be replaced with (arr[i]==istenenSayi)
                sonuc = true;
                System.out.println("dizide vardir.");
                break;


            } else {

                System.out.println("maalesef yoktur.");
            }
        }
        System.out.println(sonuc);


    }
}
