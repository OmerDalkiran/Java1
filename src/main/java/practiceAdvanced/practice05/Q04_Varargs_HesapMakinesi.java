package practiceAdvanced.practice05;

public class Q04_Varargs_HesapMakinesi {
    //Temel 4 matematik işlemi yapan bir kod yazınız.

    public static void main(String[] args) {

        HesapMakinesi hesapMakinesi = new HesapMakinesi();

        hesapMakinesi.toplama(1);
        hesapMakinesi.toplama(3,-3);

        hesapMakinesi.toplama(3,100,23,34);

hesapMakinesi.cikarma(10,10);
hesapMakinesi.cikarma(4,5);

hesapMakinesi.carpma(10,12);
hesapMakinesi.carpma(3,34);

hesapMakinesi.bolme(34,43);
hesapMakinesi.bolme(10,0);
hesapMakinesi.bolme(23.5,34.9);  // System.out.println("Bölüm = "+new DecimalFormat("##.##").format(a/b));


    }
}
