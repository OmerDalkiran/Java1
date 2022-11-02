package farkliProjeler.odevVeAlistirmalar;

import java.util.Scanner;

public class Circle {
    // Calculating a circle's area and perimeter.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the circle's Radius whose perimeter and area you want to calculate");
        float radius = input.nextFloat();

        System.out.println("Area= " + 3.14159 * radius * radius);
        System.out.println("Perimeter= " + 2 * 3.14159 * radius );


    }

    // Dikdörtgenin cevre ve alan hesabi
    public static class Rectengular {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Alanini ve cevresini hesaplamak istediginiz dikdörtgenin kenar uzunluklarini giriniz");
            System.out.println("Dikdörtgenin enini giriniz");
            double en = input.nextDouble();

            System.out.println("Dikdörtgenin boyunu giriniz");
            double boy = input.nextDouble();

            System.out.println("Dikdörtgeninizin Cevresi= " + 2 * (en + boy));
            System.out.println("Dikdörtgeninizin Alani= " + en * boy);


        }
    }
}
