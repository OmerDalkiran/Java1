package assignments.ArrayExercise;

import java.util.Arrays;

public class ArraysTrials1 {
    public static void main(String[] args) {

        int[] arr = new int[9];

        arr[0] = 20;
        arr[1] = 24;
        arr[2] = 30;
        arr[3] = 3;
        arr[4] = 7;
        arr[5] = -30;
        arr[6] = -5;
        arr[7] = 100;
        arr[8] = 77;

        System.out.println(Arrays.toString(arr)); //  [20, 24, 30, 3, 7, -30, -5, 100, 77]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [-30, -5, 3, 7, 20, 24, 30, 77, 100]

        // ilk ve son elemanin toplami:
        int ilk = arr[0];
        int son = arr[arr.length - 1];

        System.out.println(ilk + son); //  70  yani ==>(-30+100=70)

        {
            System.out.println();
        }
        // Arrayin butun elemanlarinin toplami for-each Loop ile boyle bulunur:

        int t = 0;           // int[] arr = [-30, -5, 3, 7, 20, 24, 30, 77, 100]
        for (int w : arr) {  // w = demek whole hepsini sirayla koy demek.
            t = t + w;

            //  System.out.print(t+" "); //  egr bu loop un icinde yazdirilirsa her adimdaki toplamayi gosteren
            // soyle bir sonuc alinir :-30 -35 -32 -25 -5 19 49 126 226
        }
        System.out.println(t + " "); // 226 ==>  Eger suslu parantezin disinda yazdirilirsa bu sonuc alinir

        // 2. yol:  DO-WHILE LOOP
        int k = 0;
        int sum = 0;

        do {
            sum = sum + arr[k];
            k++;

        } while (k < arr.length);
        System.out.println(sum);

        // Arraydeki butun isimlerdeki karakterlerin toplamini yazdiriniz.
        String names[] = new String[3]; // [3] demek 3 tane elemani var demek. index degil yani.
        names[0] = "Ali";
        names[1] = "Veli";
        names[2] = "Guner";
        // names[3]= "Omer"; // Array index is out of bounds uyari mesaji veriyor.
        // 3 eleman olacak dedin , 4.yu koymaya calisiyorsun diyor.

        int characters = 0;
        for (String w : names) {              // "names" dizisinin icindeki butun elemanlarin harf uzunlugunu tek tek "character"
            // classinda topla ve sonrada bunu yazdir"  diye okunur
            characters = characters + w.length(); // w.length demek  kelimenin uzunluguna tekabul ediyor.
            System.out.println(characters);
        }

        // Char bir array olusturunuz va sadece buyuk harfleri yazdiriniz.
        char[] letters = new char[5];
        letters[0] = 'a';
        letters[1] = 'B';
        letters[2] = 'c';
        letters[3] = 'D';
        letters[4] = 'Z';

        for (char w : letters) { // "Letters dizisinin icindeki butun elemanlari temsil eden w icin gecerlidir. " diye okunur
            if (w <= 'Z') {     // Eger  Letters dizisinin icindeki butun elemanlari temsil eden w'nun ASCII degeri
                // 'Z' nin degerinden kucukse , o zaman w'yu yazdir .
                System.out.print(w + " ");
            }
        }
        System.out.println();

        //Example 1: String bir Array olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz
        String crr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};
        for (String w : crr) {

            System.out.print(w + " "); // eger if i kaldirirsak asagida sonuc bu= Jane Mark Christopher Tom Ali Rojda
            if (w.equals("Tom")) {
                break; // Jane Mark Christopher Tom
            }
        }
        System.out.println();

        //Example 2: String bir Array olusturunuz "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz
        String brr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for(String w : brr){
            if(w.equals("Jane") || w.equals("Tom")){
                continue;            // Eger diziden w ya atanan degerler Jane ve Tom ise, es gec, yazdirmadan devam et demek
            }
            System.out.print(w + " ");  // Mark Christopher Ali Rojda
        }

        System.out.println();

    }
}



