package practiceAdvanced.practice06;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class KarePrizma extends Geometri {

    public static void main(String[] args) {


        KarePrizma karePrizma = new KarePrizma();
        double karePrizmaHacmi = karePrizma.hacimHesapla(5, 6);
        System.out.println(karePrizmaHacmi);


        Koni koni = new Koni();
         double koniHacmi = koni.hacimHesapla(3,5);
        System.out.println("koni hacmi "+ koniHacmi);    //  47.099999999999994

        NumberFormat obj = new DecimalFormat(".00");
        System.out.println("koni hacmi "+obj.format(koniHacmi)); //  47.10


        Silindir silindir = new Silindir();
        double silindirHacmi = silindir.hacimHesapla(1,5);
        System.out.println("silindir hacmi = "+obj.format(silindirHacmi)); // 15.70



    }


}
