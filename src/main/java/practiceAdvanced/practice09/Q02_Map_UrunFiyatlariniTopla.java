package practiceAdvanced.practice09;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q02_Map_UrunFiyatlariniTopla {

  /* Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
    Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95
    */

    public static void main(String[] args) {
           // Maplerde bilmemiz gereken bu. KEy ve value arasindaki iliskiyi cozebilmemiz. !!!

        // Keyler String, Value lar double olacak.
           // mecburen bunlari tek tek grimemiz lazi asagidaki gibi

        // 1. yol cozum :

        HashMap<String,Double> urunFiyati = new HashMap<>();
        urunFiyati.put("Kemer",19.99);
        urunFiyati.put("Gomlek",29.99);
        urunFiyati.put("Ayakkabi",89.99);
        urunFiyati.put("Kazak",24.99);
        urunFiyati.put("Kravat",19.99);

        Collection<Double> fiyat = urunFiyati.values();
        double toplam =0;

        for (Double w : fiyat){
            toplam+=w;
        }
        System.out.println("Toplam= "+ toplam);




    }
           // 2. yol cozum :

// public static double fiyatToplami(Map<String,Double> map){
//     System.out.println("Urunler ve fiyatlari : "+ map);        // Values halinde alirsam sadece value lari alacak
//
//
//     double sum = 0;
//
//     for(double w: map.values()){
//
//         sum += w;
//
//
//     }
//        return sum;

// }
//   public static double fiyatToplami (Map<String,Double>map){
//    System.out.println("Urunler ve Fiyatlari : " + map);
//
//    double toplam =0;
//    for (Map.Entry<String ,Double> w : map.entrySet()){
//        toplam += w.getValue();
//
//    }
//    return toplam;
//
//
}



