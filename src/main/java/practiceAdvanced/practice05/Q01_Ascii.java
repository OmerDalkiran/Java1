package practiceAdvanced.practice05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q01_Ascii {

    //Kullanıcıdan aldığınız iki karakterin arasında bulunan tüm karakterleri yazdıran bir kod yazınız.


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ilk karakteri giriniz");
        char ch1 = input.next().charAt(0);
        System.out.println("Ikınci karakteri giriniz");
        char ch2 = input.next().charAt(0);

        int ilk =Math.min(ch1,ch2);
        int ikinci = Math.max(ch1,ch2);

        for(int i=ilk+1; i<ikinci; i++){

            System.out.print((char)i+" ");
        }
    }
}