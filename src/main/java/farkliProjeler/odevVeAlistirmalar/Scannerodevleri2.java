package farkliProjeler.odevVeAlistirmalar;

import java.util.Scanner;

public class Scannerodevleri2 {

    public static void main(String[] args) {

        // Kullanicinin evinin alanini hesaplayan kodlari yaziniz.

                Scanner input = new Scanner(System.in);
        System.out.println("Haydi simdi evinizin alanini hesaplayim");
        System.out.println("Evinizin salonunun enini giriniz");
        double salonEn = input.nextDouble(); // int en input.nextint () data tipi neyse int se nextint, doule sa nextdouble

        System.out.println("Evinizin salonunun boyunu giriniz");
        double salonBoy = input.nextDouble();

        System.out.println("Salonunuzun Alani= " + salonEn * salonBoy);

        System.out.println("Evinizin yatak odasinin enini giriniz");
        double yatakOdasiEn = input.nextDouble();

        System.out.println("Evinizin yatak odasinin boyunu giriniz");
        double yatakOdasiBoy = input.nextDouble();

        System.out.println("Yatak odanizin alani= " + yatakOdasiEn * yatakOdasiBoy);

        System.out.println("Evinizin mutfaginin enini giriniz");
        double mutfaginEni = input.nextDouble();

        System.out.println("Evinizin mutfaginin boyunu giriniz");
        double mutfaginBoyu = input.nextDouble();

        System.out.println("Mutfaginizin alani= " + mutfaginBoyu * mutfaginEni);

        System.out.println("Evinizin banyosunun enini giriniz");
        double banyonunEni = input.nextDouble();

        System.out.println("Evinizin banyosunun bayunu giriniz");
        double banyonunBoyu = input.nextDouble();

        System.out.println("Evinizin banyosunun alani= " + banyonunBoyu * banyonunEni);

        System.out.println("Yani evinizin toplam alani= " + salonBoy*salonEn + yatakOdasiBoy*yatakOdasiEn + mutfaginBoyu*mutfaginEni + banyonunBoyu*banyonunEni);




        }


}
