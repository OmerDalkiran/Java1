package assignments.mycodes;

import java.time.LocalDateTime;

public class MultiDimensionalArrayElementNo {

    public static void main(String[] args) {

    int arr[][] = new int[4][3];
     int sum =0;
     for (int[] w : arr){

       sum = sum + w.length;
        }
          System.out.println(sum);  // 12

       LocalDateTime myTime =LocalDateTime.now();
        System.out.println(myTime); // 2022-11-17T08:24:32.018633500

           }

 }


