package farkliProjeler.odevVeAlistirmalar;

import java.util.Scanner;

public class Hourstoseconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the hours  and minutes you want to convert to seconds");
        long h = input.nextLong();
        long m = input.nextLong();

        System.out.println("Seconds = " + (h * 3600) + (m*60));


    }
}
