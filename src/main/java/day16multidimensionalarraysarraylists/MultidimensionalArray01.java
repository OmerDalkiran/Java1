package day16multidimensionalarraysarraylists;

public class MultidimensionalArray01 {
    public static void main(String[] args) {

        //birtane integer multidimentional array oluşturunuz
        //bu arraydeki tüm sayıların toplamını veren kodu yazınız


        /*
        Array veya Collection varsa "for-each-loop" kullanmak ilk tercihiniz olsun
Array veya Collection var ama "index" kullanmak zorundasiniz o zaman "for-each-loop" calismaz, "for-loop" veya "while-loop" veya "do-while-loop" kullanmalisiniz
         */
        int arr[][] = {{2, 5, 1}, {32, 75}, {13, 21, 43, 56}};
        int sum = 0;
        for (int[] w : arr) {
            for (int k : w) {
                sum = sum + k;
            }
        }
        System.out.println(sum);

// Bir multidimentional ARRAy i normal ARRAY e ceviren kodu yaziniz.
        // {{2,5,1},{32,75}}  ==> {2,5,1,32,75}

        int brr[][] = {{2, 5, 1}, {32, 75}};


        //Bir multidimensional array'i normal array'e ceviren kodu yaziniz
        //{ {2, 5, 1}, {32, 75} } ==> { 2, 5, 1, 32, 75}
        //int brr[][] = { {2, 5, 1}, {32, 75} };

        int toplam = 0;

        for(int[] w : brr){
            toplam = toplam + w.length;
        }
        System.out.println(toplam);

        int idx = 0;
        int crr[] = new int[toplam];

        for(int[] w : brr){
            for(int k : w){
                crr[idx] = k;
                idx++;
            }
        }
      //  System.out.println(Arrays.toString(crr));

            }
    }







