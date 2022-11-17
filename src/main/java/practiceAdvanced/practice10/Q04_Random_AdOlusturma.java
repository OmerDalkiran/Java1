package practiceAdvanced.practice10;

public class Q04_Random_AdOlusturma {
    //Rastgele alınan harfleri bir Stringe ekleyerek adınızı oluşturan ve bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.


    public static void main(String[] args) {

        String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
// rastgele harf nasil alinir

        int maxInx = alfabe.length();

        String isim = "Omer";

        String yeniIsim = ""; // bos bir stringe ihtiyacim var , yukaridakileri eklmek icin. bir de sayaca saymak icin
        int sayac = 0;


        for (int i = 0; i < isim.length(); i++) {

            while (true) {

                char rastgeleKarakter = alfabe.charAt((int) (Math.random() * maxInx));  // burada rastgele bir karakter uretiliyor. sayaci simdi artiriyoruz
                sayac++;  // once burasi "O" yu bulana kadar   calisacak

                if (isim.charAt(i) == rastgeleKarakter) { // eger rastgele aldigim karakter benim karaktere esitse demek
                    yeniIsim += rastgeleKarakter; // yeni isme bu karakteri ekle ve durdur demek
                    System.out.println("yeniisim = " + yeniIsim);
                    break;
                }
            }
        }
        System.out.println("sayac = "+ sayac);
    }
}

