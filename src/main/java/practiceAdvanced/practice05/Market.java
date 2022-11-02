package practiceAdvanced.practice05;

import java.time.LocalDate;

public class Market {

    String urunAdi;
    double urunFiyati;
    String sonKullanmaTarihi;

    static int toplamUrun;

    Market(String urunIsmi, double Fiyat, int aySonra) {

        urunAdi = urunIsmi;
        urunFiyati = 5;
        sonKullanmaTarihi = "12.02.2023";
        sonKullanmaTarihi= LocalDate.now().plusMonths(aySonra).toString();
        toplamUrun++;

    }

    Market(String urunIsmi, double Fiyat) {

        urunAdi = urunIsmi;
        urunFiyati = 5;
        sonKullanmaTarihi = "Bu urunun son kullanma tarihi yoktur";
        toplamUrun++;
    }
}
