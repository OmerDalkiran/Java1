package assignments.abdullahla;

import java.util.Arrays;

public class MaxNegativeVeMinPositifBulma {

    public static void main(String[] args) {

        //Example 1: Size verilen pozitif ve negatif sayilar iceren bir integer array'deki "en buyuk negatif"
        // ve "en kucuk pozitif" elemani bulunuz.

        int str [] = { -20, -13, 4, -40, 5, -60, 50};

        Arrays.sort(str); //
        System.out.println(Arrays.toString(str));   // [-60, -40, -20, -13, 4, 5, 50]


        int maxNegative = str[0];
        int minPositive = str[str.length-1];

        for(int w : str){

            if(w<0 ){
                maxNegative=Math.max(maxNegative, w);

            }
            if (w>0){
                minPositive=Math.min(minPositive,w);

            }
        }

        System.out.println(maxNegative + "  " + minPositive);
    }
}
