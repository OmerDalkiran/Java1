package farkliProjeler.odevVeAlistirmalar;

public class SalihBeyden {

    public static void main(String[] args) {

        double gomlekfiyat = 12.99;
        double sapkafiyat = 4.59;
        System.out.println("gomlekfiyat+sapkafiyat");
        System.out.println("Toplam fiyat = "+(gomlekfiyat+sapkafiyat));

        float x=15.30F;
        long y = 13L;
        int z = 10;
        System.out.println("Degiskenlerin carpimi= "+x*y*z);

        int t= 50;
        float u = 40;
        byte i = 10;
        System.out.println("Ucegenin cevresi= "+ t+u+i);

        //Basit faiz formülü = anapara * oran * yılDegeri /100
        // 10000 liranin %6 dan 3 yillik basit faiz degerini hesaplayiniz
        int anapara = 10000, oran = 6, yilDegeri = 3;
        int basitFaiz = anapara * oran * yilDegeri /100;
        System.out.println("Basit faiz degeri:" + basitFaiz);

        //uzunlugu a ve b olan bir dikdortgen olabilir
        String e = "Sonuc";
        Long a = 345L;
        Long b = 567890L;
        System.out.println(e+":" + 2*(a+b));
        System.out.println(e+"=" + a*b);

    }
}
