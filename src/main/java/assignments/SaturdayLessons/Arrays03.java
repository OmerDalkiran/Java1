package assignments.SaturdayLessons;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

                int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
                // verilen bir array'de en kucuk ve en buyuk degerleri  toplamini yazdirin

                Arrays.sort(array);

                System.out.println(array[0]+ array[array.length-1]);//114


                String str="Java gun gectikce guzellesiyor";

                String kelimeler[]=str.split(" ");
                System.out.println(Arrays.toString(kelimeler));//[Java, gun, gectikce, guzellesiyor]
                String kelimeler2[]=str.split("");
                System.out.println(Arrays.toString(kelimeler2));

                String kelimer3[]=str.split("gectikce"); // guzellestikce kelimesini cikarmak icin kullanilir
                System.out.println(Arrays.toString(kelimer3));//[Java gun ,  guzellesiyor]
            }
        }


