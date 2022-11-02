package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Multidimensionalarrays01 {
    public static void main(String[] args) {


        int arr[][] = new int[3][2];
        System.out.println(Arrays.deepToString(arr));   // [[0, 0], [0, 0], [0, 0]]


        // Multidimensionalarray lere Eleman ekleme nasil yapilir?


        arr[0][1] = -4;
        arr[0][0] = 3;
        arr[1][0] = 6;
        arr[1][1] = 18;
        arr[2][0] = -7;
        arr[2][1] = 0;

        // Multidimensionalarray leri konsola yazdirma  nasil yapilir?

        System.out.println(Arrays.deepToString(arr)); // [[3, -4], [6, 18], [-7, 0]]

        // Multidimensionalarray lere d Elemanlardan sadece birisi nasil yazdirlir?

        System.out.println(Arrays.toString(arr[1])); //  [6, 18]


// Multidimensionalarray lerde ic Arraylerdeki Elemanlardan sadece birisi nasil yazdirlir?
        System.out.println(arr[1][0]);// 6


        String brr[][] = new String[4][3];

        brr[0][0] = "A";
        brr[0][1] = "B";
        brr[0][2] = "C";
        brr[1][0] = "D";
        brr[1][1] = "E";
        brr[1][2] = "F";
        brr[2][0] = "G";
        brr[2][1] = "H";
        brr[2][2] = "I";
        brr[3][0] = "J";
        brr[3][1] = "K";
        brr[3][2] = "L";

        System.out.println(Arrays.deepToString(brr));


        //Toplam eleman sayisini ekrana yazdiran kodu yaziniz
        int sum = 0;
        // [ [A, B, C], [D, E, F], [G, H, I], [J, K, L] ]
        for (String[] w : brr) {
            sum = sum + w.length;
        }
        System.out.println(sum);

        // //MultiDimensionalArray kisa yoldan nasil olusturulur?

        char brd[][] = {{'a', 'b'}, {'C', 'D', 'E'}, {'?'}};
        System.out.println(Arrays.deepToString(brd));// [ [a, b], [C, D, E], [?] ]


        // Bir String Multidimensional Arrayde icinde a olan elemanlari concole'a yazdiriniz.

        String ddr[][] = {{"learn", "java", "it"}, {"is", "easy"}};

        for (String[] w : ddr) {

            for (String k : w) {


                if (k.contains("a")) {
                    System.out.println(k + " kelimesinde a var");
                }
            }
            System.out.println();


                    }
                }

            }








