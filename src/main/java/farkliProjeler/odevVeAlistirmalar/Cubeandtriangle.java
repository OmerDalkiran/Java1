package farkliProjeler.odevVeAlistirmalar;

import java.util.Scanner;

public class Cubeandtriangle {
    public static void main(String[] args) {
// Type a program which calculates the cube of a number which is entered
//by user.
//Hint 1: Cube of a number is a x a x a
        Scanner input = new Scanner(System.in);
        System.out.println("Hacmini hesaplamak istediginiz kübün kenar uzunlugunu giriniz.");

        double kenarUzunlugu = input.nextDouble();
        System.out.println("Kübünüzün hacmi " + kenarUzunlugu * kenarUzunlugu * kenarUzunlugu);

        //3) Type a program which calculates the area and the perimeter of a rectangle
        //whose length and with are entered by user.
        //Hint 1: Area of a rectangle is width x length
        //Hint 2: Perimeter of a rectangle is 2x (width + length)

    }

    public static class Triangle {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter please the side lengths 'a','b' and 'c'");
            byte a = input.nextByte();  byte b = input.nextByte();  byte c = input.nextByte();

            System.out.println("Perimeter= " + (a+b+c));

        }
    }
}
