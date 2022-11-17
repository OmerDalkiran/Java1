package assignments.withabdullah;

import java.util.Arrays;

public class Abdullahla {
    public static void main(String[] args) {

        int[] arr = {12, 3, 9, -23, 5, 60, 8};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));  // [-23, 3, 5, 8, 9, 12, 60]

        int ilk = arr[0];
        int son = arr[arr.length - 1];

        System.out.println("ilk " + ilk + "son " + son); // -23

        System.out.println(arr[arr.length - 1]); // 60


        // Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı bulunuz.
        // Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2


        int[] a = {23, 18, -5, -12, -2};



        int maxNegatif = a[0];
        System.out.println(maxNegatif);

        int minPozitif = a[a.length - 1];

        for (int w : a) {

            if (w<0) {

                maxNegatif = Math.min(maxNegatif, w);
            }
            if (w>0) {
                minPozitif = Math.min(minPozitif, w);
            }


        }
        System.out.println(maxNegatif + "  " + minPozitif);
    }
}

