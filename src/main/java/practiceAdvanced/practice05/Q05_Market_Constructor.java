package practiceAdvanced.practice05;

public class Q05_Market_Constructor {

    //Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız..

    public static void main(String[] args) {


        Market urunObjesi= new Market("Ekmek",5,1);  // boyle yapmakla bir costructor olusturdum
        System.out.println(urunObjesi.urunFiyati);

        System.out.println("Urunun Adi: "+urunObjesi.urunAdi+ " Urun fiyati: " +urunObjesi.urunFiyati+ "son Kul.Tarihi: "+urunObjesi.sonKullanmaTarihi);

        Market nutellaObjesi = new Market("Nutella",45,20);
        System.out.println("Urunun Adi: "+nutellaObjesi.urunAdi+" Urun Fiyati: "+nutellaObjesi.urunFiyati+" Son Kullanma Tarihi: "+ nutellaObjesi.sonKullanmaTarihi);

        Market bardakObjesi = new Market("Bardak",50);
        System.out.println("Urunun Adi: "+bardakObjesi.urunAdi+" Urun Fiyati: "+bardakObjesi.urunFiyati+" Son Kullanma Tarihi: "+ bardakObjesi.sonKullanmaTarihi);



    }

}
