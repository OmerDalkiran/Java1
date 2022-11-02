package practiceAdvanced.practice01;

import java.util.Scanner;

public class Q04_IfStatement_DikUcgen {

    public static void main(String[] args) {

        // Kullanıcıdan üç adet sayı alarak bu sayıların
        //        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplayan bir kod yazınız.
        //        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        //        bağlantısından yararlanabilirsiniz)
        //        Örnek Ekran Çıktısı:
        //        birinci kenarı giriniz: 3
        //        ikinci kenarı giriniz 4
        //        üçüncü kenarı giriniz: 5
        //        Bu bir dik üçgendir
        //        birinci kenarı giriniz: 2
        //        ikinci kenarı giriniz 15
        //        üçüncü kenarı giriniz: 7
        //        Bu bir dik üçgen değildir.

        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen kenar uzunluklarini giriniz . ilk kenarinizi alalim");

        int aKenari = input.nextInt();

        System.out.println(" ikinci kenarinizi alalim");
        int bKenari = input.nextInt();

        System.out.println(" ucuncu kenarinizi alalim");
        int cKenari = input.nextInt();

        if(aKenari*aKenari+bKenari*bKenari==cKenari*cKenari) {

            System.out.println("bu bir dik ucgendir");
        } else if (bKenari * bKenari + cKenari * cKenari == aKenari *aKenari) {
            System.out.println(" Bu bir dik ucgendir");

        } else if (aKenari*aKenari+cKenari*cKenari==bKenari*bKenari) {
            System.out.println(" Bu bir dik ucgendir");

        }else {
            System.out.println("bu bir dik ucgen degildir");
    }

    }
}
