package practiceAdvanced.practice09.Q04_MaasHesaplama_Interface;

public class Runner {
/*
    Net maaş hesaplayan bir kod yazınız.(Interface kullanınız)
    Maaş kriterleri: Brüt maaş belirle.
                     Çalışanın toplam çalışma yılına göre her yıl için maaşı 100 dolar  artır.
                     Çalışanın aylık çalışma saatine göre 160 saat üstü  her saat için maaşı 10 dolar artır.
                     10 yıl ve üstü çalışma yılı bulunan çalışanların maaşlarından %30, diğerlerinden %20 vergi kesintisi yap.
     */

    public static void main(String[] args) {


MaasHesapla Ali = new MaasHesapla();                         // Ali objesi olusturdumm, onu hesapliyorum simdi
          double AlininMaasi = Ali.netMaas(10000, 20, 170);
        System.out.println("Alinin Maasi = " + AlininMaasi);    // Yillik ekstra = 2000
                                                                // Alinin Maasi = 9100.0



    }

}
