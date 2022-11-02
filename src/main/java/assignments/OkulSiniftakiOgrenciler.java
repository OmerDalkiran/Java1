package assignments;

import java.util.Arrays;

public class OkulSiniftakiOgrenciler {
    public static void main(String[] args) {


        // Bir okuldaki 3 farkli sinifta bulunan ogrencilerin yaslarinin toplamini bulunuz.

        int stdAges[][] = {{12, 13, 15}, {14, 11}, {12, 13, 16, 17}};

        // System.out.println(Arrays.deepToString((stdAges)));

        int sum = 0;

        for (int[] w : stdAges) {

            for (int k : w) {

                sum = sum + k;

            }
        }
        System.out.println(sum);  // 123


// Bir ilkokulda her sinifta ogrenci sayilari 5 olan 3 adet sinif vardir. toplan ogrenci sayisini bulunuz. *Ilk okul 2. sinifa kadardir.
//             3 Sube var.
//              A B C
//  1.siniflar: 5,5,5
//  2.siniflar: 5,5,5
//     toplam : 30 ogrenci var

            int arr[][] = {{5, 5, 5}, {5, 5, 5}};

            int toplamOgr = 0;

            for (int[] w : arr)
                for (int k : w)
                    toplamOgr += k;

            System.out.println(toplamOgr);

        String brr [] = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};

        int uzunluk = Integer.MAX_VALUE;

        String uzunluguKucukEleman = "";

        for (String w : brr){

            uzunluk = Math.min(uzunluk, w.length());

            if (w.length()==uzunluk){

                uzunluguKucukEleman = uzunluguKucukEleman + w + " ";
            }
        }
        System.out.println(uzunluguKucukEleman);
        System.out.println(uzunluk);
        }
    }









