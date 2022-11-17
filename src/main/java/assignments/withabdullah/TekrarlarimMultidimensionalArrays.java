package assignments.withabdullah;

import java.util.Arrays;

public class TekrarlarimMultidimensionalArrays {

    public static void main(String[] args) {

        //binarySearch() Method: Bu method'u kullanarak bir elemanin Array'de olup olmadigini anlariz.
        //                       binarySearch() Method'unu kullanmadan once mutlaka "Arrays.sort()" kullanilmalidir.
        //                       binarySearch() Method'u aradiginiz eleman Array'de varsa o elemanin indexini return eder.

        //                       binarySearch() Method'u aradiginiz eleman Array'de yoksa "- a" seklinde bir negatif sayi alirsiniz.
        //                       Bu sayidaki "-" isaretinin anlami bu eleman Array'de yok dmeektir, "a" nin anlami:
        //                       "Eger o element array'de olsaydi kacinci sirada olurdu demektir."

        //                       binarySearch() Method'u tekrarlayan elemanlar icin kullanilmaz.

        int arr[] = {12, 31, 43, 14};

        int sayi = 12;


        // bir de olmayan bir sayiya bakalim mesela
        int sayi2 = 58;
        int sayi3 = 17;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  // [12, 14, 31, 43]

        int index1 = Arrays.binarySearch(arr, sayi);
        int index2 = Arrays.binarySearch(arr, sayi2);

        System.out.println(index2); // -5 cikti . Bunun anlami : - nin anlami bu ARRAY de yok demek.
        // 5 in anlami eger olsaydi , hangi sirada olurdu. yani 5. sirada olurdu.

        int index3 = Arrays.binarySearch(arr, sayi3);
        System.out.println(index3);  // -3  Anlami : yani Array de yok. Olsaydi 3. sirada olurdu. Yani 12,14,17 olurdu.


        int brr[] = {2, 1, 7, 6};
        Arrays.sort(brr);
        System.out.println(Arrays.toString(brr));  //   [1, 2, 6, 7]


        String str[] = {"A", "C", "B", "D"};  // ARRAY lerde [] unutma.
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));  // [A, B, C, D]

        //Example 1: Size verilen pozitif ve negatif sayilar iceren bir integer array'deki "en buyuk negatif"
        // ve "en kucuk pozitif" elemani bulunuz.

        int asd[] = {-12, 3, 5, -4, 0, 34, 12}; // 1

        Arrays.sort(asd);    // 2- bu sort islemiyle asagidaki gibi siraladik
        // System.out.println(Arrays.toString(asd));  //[-12, -4, 0, 3, 5, 12, 34]
        // Simdi sira donguye geldi. for each loop'u (dongusu) nasil kurlur?



        int maxNegative= asd[0]; // 4
        int minPositive = asd[asd.length-1]; // 8

        for (int w : asd) {  // 3       // simdi bu for each loop ne yapacak? 1. yi alip yani -23 u alip w 'nun icine koyacak.
                                    // sonra ikinciyi alip w 'nun icine koyacak vs
                                //  Ben Javaya diyorum ki : int maxNegative= asd[0]; diyorum. Cunku sort yaptiktan sonra
                                    //   negatifler basa gelecek ve [0] her zaman negatif deger olacak.

                               // Sonra sunu diyecegim Javaya : Eger if(w <0) {  w negatifse
            // Math classina gidiyorum max. methodunu seciyorum. bakiyorum ki iki sayiyla calisiyor. bir tanesine  maxNegatifi koyuyorum
            // ikincisi de w olsun.

            if(w<0) {  // 5
                maxNegative = Math.max(maxNegative, w);  // 6-7  Arrayden geleni w nun icine koyacak, ilk elemani da maxNegative in icine koyacak .
                // MAx metodu napacak? Bu ikisinden buyugunu sececek. diyecegimki o ikisinden buyugunu sectikten sonra sonucu maxNegative in icine koy.
                // maxNegative = Math.max(maxNegative,w);

                // ilk loop ta Java -12 yi  alacak w ' nun icine koyacak. w=-12 oldu. -12<0 bu ifade dogru oldugu icin maxNegative =Math.max(maxNegative, w) kodu calisacak demektir.
                // Peki bu kod ne yapiyor? en buyugu seciyor max metodunu kullaniyor. w de -12 , maxNegative de -12 oldugu icin bunlardan birini seciyor ve esitligin solundaki maxNegative in icine koyuyor.
                // Peki en kucuk positifi nasil bulacagiz ? int minPositive = asd[asd.length-1];  olusturup onu da ust tarafa ekliyoruz. length-1 yapmamizin sebebi pozitif en sagda bulunur.
                // sonra if (w>0) { Math.min(   ,    )  classindan min i aliyoruz.  Math.min(minPositive, w) yapiyoruz. sonra onuda minPositive e esitliyoruz. minPositive= Math.min(minPositive, w)
            }
            if(w>0){

                minPositive= Math.min(minPositive, w);  // sonrada yazdiririz.
            }
        }
             System.out.println(maxNegative+ "  +  " + minPositive);  //
    }
}