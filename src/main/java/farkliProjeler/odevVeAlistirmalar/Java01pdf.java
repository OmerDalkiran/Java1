package farkliProjeler.odevVeAlistirmalar;

import java.util.Scanner;

public class Java01pdf {
    public static void main(String[] args) {

        // 1) Type a program which calculates the area and the perimeter of a square
        //whose side length is entered by user.
        //Hint 1: Area of a square is length x length
        //Hint 2: Perimeter of a square is 4x length

        Scanner input = new Scanner(System.in);
               System.out.println("Alanini ve cevresini hesaplamak istediginiz karenin kenarini girermisiniz? Could you please enter the side " +
                "length of the square whose area and perimeter you want to calculate?");

        double kenar = input.nextDouble();

        System.out.println("Area= " + kenar * kenar);

        System.out.println("Perimeter " + 4*kenar);

             // 2) Type a program which calculates the cube of a number which is entered by user.
             //Hint 1: Cube of a number is a x a x a

        System.out.println("Hacmini hesaplamak istediginiz kübün kenar uzunlugunu giriniz.");

     double kenarUzunlugu = input.nextDouble();
        System.out.println("Kübünüzün hacmi " + kenarUzunlugu * kenarUzunlugu * kenarUzunlugu);

           //3) Type a program which calculates the area and the perimeter of a rectangle
        //whose length and with are entered by user.
        //Hint 1: Area of a rectangle is width x length
        //Hint 2: Perimeter of a rectangle is 2x (width + length)

        System.out.println("Alanini ve cevresini hesaplamak istediginiz dikdörtgenin kisa ve uzun kenar uzunluklarini giriniz");

        double kisaKenar = input.nextDouble();
        double uzunKenar = input.nextDouble();

        System.out.println("Dikdörtgeninizin alani= " + kisaKenar * uzunKenar);
        System.out.println("Dikdörtgeninizin cevresi= " + 2 * (kisaKenar + uzunKenar));


    }
}
