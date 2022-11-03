package assignments.ArrayExercise;

import java.util.Arrays;

public class ArrayStringREverse {


    public static void main(String[] args) {

        int[] brr = {1, 2, 3, 4, 5, 6};

        for (int k = brr.length - 1; k >= 0; k--)  // ==>print array starting from last element
            System.out.print(brr[k] + "  ");       //6  5  4  3  2  1

        System.out.println();

        int[] crr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int i = crr.length - 1; i >= 0; i--)
        System.out.print(crr[i] + " ");            // 0 9 8 7 6 5 4 3 2 1


        System.out.println();


        int [] drr = {12,14,5,56,45,96};
        Arrays.sort(drr);
        for(int f= drr.length-1; f>=0; f--)
        System.out.print(drr[f]+" "); //  96 56 45 14 12 5

        int [] array= { 9,5,4,67,23,12,-45,-3,75};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        for(int b=array.length-1; b>=0; b--)
        System.out.print(array[b]+" ");    //  75 67 23 12 9 5 4 -3 -45
        }
    }


