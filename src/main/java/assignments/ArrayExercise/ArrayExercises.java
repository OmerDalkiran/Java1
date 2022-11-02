package assignments.ArrayExercise;

import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args) {

        int arr[][] = new int[4][3];


        arr[0][0] = 2;
        arr[0][1] = 3;
        arr[0][2] = 7;

        arr[1][0] = 12;
        arr[1][1] = 13;
        arr[1][2] = 17;

        arr[2][0] = 22;
        arr[2][1] = 26;
        arr[2][2] = 27;

        arr[3][0] = 42;
        arr[3][1] = 43;
        arr[3][2] = 47;


        System.out.println(Arrays.deepToString(arr));  // [[2, 3, 7], [12, 13, 17], [22, 26, 27], [42, 43, 47]]

        // Arrayin icinde butun elementlerin miktari = Array uzunlugu * icerdeki elemanlr= 4*3=12 adettir.Not= duzgun Arraylerde.

        // mesela 12 yi yazdirmak istiyorum : o zaman direk array ve indexlerini koyuyorum.
        System.out.println(arr[1][0]);  // 12
        // mesela ucuncu arrayi yazdirmak istiyorum, o zaman ucuncu arry'in indexi 2. yi yazdiriyorum.
        System.out.println(Arrays.toString(arr[2]));  // [22, 26, 27]

        System.out.println(Arrays.toString(arr[3]));  // [42, 43, 47]
        System.out.println(Arrays.toString(arr[1]));   // [12, 13, 17]
        System.out.println(Arrays.toString(arr[0]));   // [2, 3, 7]


        for (int[] w : arr) {
            System.out.println(Arrays.deepToString(arr));  // 4 defa alta alta yazilmis [[2, 3, 7], [12, 13, 17], [22, 26, 27], [42, 43, 47]]  goruruz.


            int sum = 0;
            for (int[] w1 : arr) {  // Array'in toplam eleman sayisini bulmak icin  int=sum=0; olusturup basina yazmak lazim

                //    w.length  // w nin icine Arrayin icindeki birinci array;i koyuyor ve onun uzunlugunu hesaplatiyor. bunu sum a ekle
                //  sum + w.length       sonrada buldugun sonucu sum kutusunun icine koy.
                // sum = sum + w.length;
                sum = sum + w1.length;  // ilk loop ta 2,3,7 yani 3 eleman sayis suma eklenecek. 2. loopta 12,13,17 yani 3 eleman sayisi daha eklenece, ucuncu loop ta bir uc daha
                // 4.loop ta bir 3 eleman sayisi daha eklenecek.  boylece butun elementler eklenince sum 12 verecek. onunda soyle yazdiriyoruz.

                // System.out.println(sum);  // sum dan hemen sonra yazdirirsak her asamadaki eklenmeyi goruyoruz.  3,6,9,12 yazdiriyor.  Ama yazdirma isini loop'un disinda yaparsak direkt 12 veriyor.

            }
            System.out.println(sum); // 12


        }

    }
}