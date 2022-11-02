package farkliProjeler.odevVeAlistirmalar;

import java.util.Scanner;

public class Miletokm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Type mile value you want to convert to km");
        Double s= input.nextDouble();
        System.out.println("Your Kilometer= " + s * 1.6);


    }
}
