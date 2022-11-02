package assignments.ArrayExercise;

import java.util.Arrays;

public class ArraySsgCalismasi1 {
    public static void main(String[] args) {


        String[] arr1 = {"Ali", "Veli", "Ayse"};
        System.out.println(arr1);//[Ljava.lang.String;@58ceff1  Arrayler boyle yazdirilmaz.
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));//  [Ali, Ayse, Veli]  "Sortlama yaptiktan sonraki hali

        System.out.println(Arrays.toString(arr1)); // boyle yazidrilir.

        // 4 elemani olan bir Array yazdiralim ve icine iki tane eleman yerlestirelim.
        int[] arr2 = new int[4];
        arr2[1] = 11;
        arr2[3] = 12;
        System.out.println(Arrays.toString(arr2));//[0, 11, 0, 12]
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2)); // [0, 0, 11, 12] sortlama yaptiktan sonra ki hali
        System.out.println(arr1[0]);//Ali


        // length methodu
        System.out.println(arr1.length); // 3 bu bize Array'in icindeki eleman sayisini verir.

        // Ali Veli yazdirmak icin :
        System.out.println(arr1[0] + " " + arr1[2]);
        System.out.println(arr1[0] + " " + arr1[arr1.length - 1]);


        int[] array = new int[]{90, 23, 5, 109, 12, 22, 67, 34};
        Arrays.sort(array); // 5 12 22 23 34 67 90 109  sortladiktan sonraki hali

        for (int w : array) {
            System.out.print(w + " ");
        }
        System.out.println("=========");
        for (int j : array) {    // replaced with enhanced "for"  (int i=0; i<array.length; i++)
            System.out.print(j + " ");   // array[i] di, j oldu.
        }

        // Bir eleman in dizide olup olmadigini nasil kontrol ederiz.
        int[] crr = {32, 14, 2, 11, 8};  // Bu Arrayde 45 in olup olmadigini nasil kontrol ederiz.

        for (int w : crr) {
            if (w == 45) {
                System.out.println("45 bu Array de vardir.");
                break;
            } else {
                System.out.println("45 bu Arrayde yoktur");
            }


        }
        Arrays.sort(crr);
        System.out.println(Arrays.toString(crr));  //   [2, 8, 11, 14, 32]
        System.out.println(Arrays.binarySearch(crr,66)); //  -6  : yani su demek. - bu dizide olmadigini gosteriyor
                                                              // 6 da olsaydi kacinci elemani olurdu dizinin.

        System.out.println(Arrays.binarySearch(crr,4));  //  -2 + anlami bu Arrayde yok, olsaydi ikinci sirada olurdu.

        //Ex. = Asagidaki Arrayin ciktisi [A, M, S, T] olacak sekilde gerekli degisiklikleri yapiniz.
        String[] arr ={"a","M","b","T"};
        arr[0]="S";
        arr[2]="A";

        System.out.println(Arrays.toString(arr));//[S, M, A, T]
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[A, M, S, T]

        //Ex. verilen bir array'de en kucuk ve en buyuk degerleri yazdirin

        int arr3[]= {3,5,6,1,9,45,25,4,9,0};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3)); // [0, 1, 3, 4, 5, 6, 9, 9, 25, 45]
        System.out.println("en kucuk deger= " + arr3[0]);
        System.out.println("en buyuk deger= " + arr3[arr3.length-1]);

        System.out.println(arr3[0]+ arr3[arr3.length-1]); //  45
        System.out.println(arr3[2]+ arr3[arr3.length-2]); //  28

        int sum=0;
        for(int w: arr3){
            sum=sum+w;

            System.out.print(sum+" "); // 0 1 4 8 13 19 28 37 62 107  Bu Arrayin adim adim toplanmasini gosterir.
        }
        System.out.println(sum); // 107


    }
}
