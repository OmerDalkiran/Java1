package assignments;

import java.util.Arrays;

public class MultDimArrElemanToplSayisi {

    public static void main(String[] args) {


        int arr[][] = new int[1][2]; // indexi o olan ve icinde iki tane eleman olan bir array demek.   bir oda var , icinde iki yatak var gibi.
                                      // topl eleman sayis = 1*2 = 2 dir.
        arr[0][0] = 3;
        arr[0][1] = 4;
//        arr[1][0] = 6;  bu 6 ve 8 i atayamazsini cunku arrayin uzunlugu 1 yani sadece 0 index var demek.
//        arr[1][1] = 8;
        System.out.println(Arrays.deepToString(arr));  // [[3, 4]]


        int sum =0;

        for(int[] w : arr){

            sum=sum+ w.length;

        }
        System.out.println(sum);
    }
}
