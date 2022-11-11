package assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays04 {
        /*
    verilen bir array in en buyuk elemanini ve bu elemanin kacinci sirada oldugunu bulunuz
    input={10,13,56,20,40,60,56,32}
    output=60, 5
    */
        public static void main(String[] args) {

            int [] arr = {10,13,56,20,40,200,90, 60,56,500,32};
            int enBuyukEleman= arr[0];


            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));


            for(int i=0; i<arr.length; i++){

                if(arr[i]>enBuyukEleman){
                    enBuyukEleman=arr[i];
                }
            }
            System.out.println("en buyk sayi " + enBuyukEleman);

            ArrayList<Integer> list= new ArrayList<Integer>();

        }

}
