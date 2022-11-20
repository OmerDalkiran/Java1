package farkliProjeler.biletHesapla;

import java.util.Scanner;

public class NetBiletFiyati implements yasIndirimi,GidisDonusIndirimi {





          int B=500;
          int C=700;
          int D=900;
          double fiyatB= B*0.1;

    double biletFiyatiB = B*0.1;
    double biletFiyatiC = C*0.1;

    double biletFiyatiD = D*0.1;



    @Override
    public double gidisDonus(boolean gidisDonus) {
         if (gidisDonus);

         return biletFiyatiC;
    }


    @Override
    public int cocukYasIndirimi(int cocukYas) {
      int yas = 0;
       if(yas<12){
           return (int) (biletFiyatiC/2);

       }

            return 0;


    }



    @Override
    public int gencYasIndirimi(int gencYas) {
        int yas = 0;
        if (yas>=12 && yas<24){
            return (int) (biletFiyatiC/2);
        }
        return 0;



    }



    @Override
    public int yasliYasIndirimi(int yasliYas) {
        return 0;


    }

public double biletFiyati(int Sehir, int yas, boolean yon){

        return biletFiyatiB;

}



}
