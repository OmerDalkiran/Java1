package assignments.ArrayExercise;

import java.util.Arrays;

public class ArraySsgCalismasi2 {
    public static void main(String[] args) {

// verilen bir arrayi buyukten kucuge siralayip yazdiran bir method olusturun

        int[] arr = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[0, 1, 3, 4, 5, 6, 9, 9, 25, 45]


        int[] revArr = new int[arr.length];  // ilk once ters cevirip elemanlari yerlestirecegimiz ilk Arrayin buyuklugunde yeni bir array olustururuz.
        // onun icin eleman sayisini arr.length olarak ayarlariz.
        System.out.println(Arrays.toString(revArr));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]


        for (int i = 0; i < arr.length; i++) {

            revArr[i] = arr[arr.length - 1 - i];
        }

        System.out.println(Arrays.toString(revArr)); // [45, 25, 9, 9, 6, 5, 4, 3, 1, 0]

        System.out.println(arr[0]); // 0    en buyuk sayiyi yazdir

        // Ex. Asagidaki araayi tersten yazdiriniz  (buna sonra bak.)

        String[] arr4 = {"Ali", "Cem", "Veli", "Yasemin"};

        String[] revArr4 = new String[revArr.length];

        for (String w : arr4) {

            System.out.println(Arrays.toString(revArr4));

        }
        // Ex. Asagidaki Arrayi ters yazdiriniz  yani ; 20,-4, 9, 3
        int[] arr5 = {3, 9, -4, 20};
        int[] revArr5 = new int[arr5.length];
        for (int i = 0; i < revArr4.length; i++) {
            revArr5[i] = arr5[arr5.length - 1 - i];
            System.out.println();

            System.out.print(Arrays.toString(revArr5));  // [20, -4, 9, 3]
        }
    }
}

