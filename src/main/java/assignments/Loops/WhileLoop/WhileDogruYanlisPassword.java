package assignments.Loops.WhileLoop;

import java.util.Scanner;

public class WhileDogruYanlisPassword {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Passwordunuzu giriniz");
        String passw = input.nextLine();

        while (!(passw.equals("AliCan"))){  // "While"B metodun burasinda "equals dogru" diye baslayamiyoruz. Cunku
            System.out.println("Yanlis");
            System.out.println("Passwordunuzu bir daha giriniz");
            passw=input.nextLine();
        }
        System.out.println("Passwordunuz Dogrudur");
    }
}
