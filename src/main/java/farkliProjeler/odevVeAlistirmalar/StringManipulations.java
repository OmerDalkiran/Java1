package farkliProjeler.odevVeAlistirmalar;

public class StringManipulations {

    public static void main(String[] args) {
       /* Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        yazdırınız.
                Örnek: mIAMI - Miami
        miami - Miami
        MIAMI - Miami
        mIaMi - Miami vb.
        System.out.println("Sadece tek bir kelimeden olusan bir sehir ismi giriniz");
        Scanner input = new Scanner(System.in);*/

        String sehirIsim = "    mIaMI";
        String konsoldakiSehirIsim = sehirIsim.trim().toLowerCase();
        konsoldakiSehirIsim = konsoldakiSehirIsim.substring(0,1).toUpperCase() + konsoldakiSehirIsim.substring(1);
        System.out.println(konsoldakiSehirIsim);

        // cikti  Miami

        // Eger trim() i cikartirsak  cikti soyle oluyor :        miami
        //  String sehirIsim = "    mIaMI";
        //        String konsoldakiSehirIsim = sehirIsim.toLowerCase();  (
        //        konsoldakiSehirIsim = konsoldakiSehirIsim.substring(0,1).toUpperCase() + konsoldakiSehirIsim.substring(1);
        //        System.out.println(konsoldakiSehirIsim);


        String isim1 = "Ali Can";
        String isim2 = "Merve Star";
        String isim3 = "Mark Tom";
        String isim4 = "Mahmut Hoca";
        String isim5 = "Inek Saban;";
        Integer c1 = isim1.replaceAll("\\s","").length();
        Integer c2 = isim2.replaceAll("\\s","").length();
        Integer c3 = isim3.replaceAll("\\s","").length();
        Integer c4 = isim4.replaceAll("\\s","").length();
        Integer c5 = isim5.replaceAll("\\s","").length();

        System.out.println("Bosluk karakteri olmadan 5 ismin toplam karakter sayisi: " + (c1 + c2 + c3+ c4 + c5));

        String s = "1a3Bcf4!";
        System.out.println(s);
    }



}
