package day06_nestedifswitch;

import java.util.Scanner;

public class C04_SwitchCase {

    // Kullanıcının yasadıgı güne  göre;
// Kullanicinin verecegi gun kadar sonraki günun  hangi gün olduğunu yazdırınız.
// pazartesi hafta başlangıcı
//BulunanGun = (kacGunSonrasi + kacıncıGun) % 7;



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pazaartesi : 1 \t Sali : 2 \t Carsamba : 3\t Persembe : 4 \t Cuma : 5\t Cumartesi : 6\t Pazar :7 \n" +
                "Haftanin kacinci gunude oldugunuzu  giriniz");
        int kacinciGun= input.nextInt();

        if(kacinciGun<=0 || kacinciGun>7){
            System.out.println( "Hatali veri girdiniz");

        }else{

            System.out.println("Kac gun sonrasini bilmek istiyorsunuz");
            int kacGunSonrasi=input.nextInt();
            int bulunanGun = (kacGunSonrasi + kacinciGun) % 7;

            switch (bulunanGun){
                case 1:
                    System.out.println(kacGunSonrasi+ " gun sonra gunlerden Pazartesi ");
                    break;
                case 2:
                    System.out.println(kacGunSonrasi+ " gun sonra gunlerden Sali");
                    break;
                case 3:
                    System.out.println(kacGunSonrasi+ " gun sonra gunlerden Carsamba");
                    break;
                case 4:
                    System.out.println(kacGunSonrasi+" gun sonra gunlerden Persembe");
                    break;
                case 5:
                    System.out.println(kacGunSonrasi+ " gun sonra gunlerden Cuma");
                    break;
                case 6:
                    System.out.println(kacGunSonrasi+" gun sonra gunlerden Cumartesi");
                    break;
                case 0:
                    System.out.println(kacGunSonrasi+" gun sonra gunlerden Pazar");
                    break;
                default:
                    System.out.println("Lutfen gecerli bir deger giriniz");


            }

        }

    }
}