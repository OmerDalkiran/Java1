package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //binarySearch() Method: Bu method'u kullanarak bir elemanin Array'de olup olmadigini anlariz.
        //                       binarySearch() Method'unu kullanmadan once mutlaka "Arrays.sort()" kullanilmalidir.
        //                       binarySearch() Method'u aradiginiz eleman Array'de varsa o elemanin indexini return eder.

        //                       binarySearch() Method'u aradiginiz eleman Array'de yoksa "- a" seklinde bir negatif sayi alirsiniz.
        //                       Bu sayidaki "-" isaretinin anlami bu eleman Array'de yok demektir, "a" nin anlami:
        //                       "Eger o element array'de olsaydi kacinci sirada olurdu demektir."

        //                       binarySearch() Method'u tekrarlayan elemanlar icin kullanilmaz.
        int arr[] = {12, 31, 43, 14 };

        int sayi1 = 43;

        Arrays.sort(arr);// [ 12, 14, 31, 43 ]
        int idx1 = Arrays.binarySearch(arr, sayi1);
        System.out.println(idx1);//3


        int sayi2 = 17;
        int sonuc = Arrays.binarySearch(arr, sayi2);
        System.out.println(sonuc);//-3

        int brr [] = {5, 76, 34, 52, 8, 60 };
        Arrays.sort(brr);
      //  System.out.println(Arrays.toString(brr));  // [5, 8, 34, 52, 60, 76]
        int sayi3 = 52;
        int index = Arrays.binarySearch(brr,sayi3);
        System.out.println(index);  // 3 (0,1,2,3=52 indexi 3 element 52 yani)

        int sayi4 = 8;
        int index1 = Arrays.binarySearch(brr,sayi4);
        System.out.println(index1);  // 8  [5, 8, 34, 52, 60, 76]  (0,1=8 indexi 1 element 8 yani)

        int sayi5 =76;
        int index2=Arrays.binarySearch(brr,sayi5);
        System.out.println(index2); // 5         [5, 8, 34, 52, 60, 76]
                                               // 0  1  2   3   4    5

    }


}