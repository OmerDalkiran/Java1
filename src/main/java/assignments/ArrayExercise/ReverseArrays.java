package assignments.ArrayExercise;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrays {
    public static void main(String[] args) {


        String[] myArray1 = {"one", "Two", "Three", "Four", "Five", "Six", "Seven"};
        {
            /*function reverses the elements of the array*/
            Collections.reverse(Arrays.asList(myArray1));
            System.out.println("Reversed Array:" + Arrays.toString(myArray1)); // Reversed Array:[Seven, Six, Five, Four, Three, Two, one]

            Integer[] myArray2 = {1, 3, 5, 7, 9};
            System.out.println("Original Array:" + Arrays.toString(myArray2)); // Original Array:[1, 3, 5, 7, 9]


            //reverse my Array
            String[] arr = {"Tom", "Mary", "Yura"};
            Collections.reverse(Arrays.asList(arr));
            System.out.println(Arrays.toString(arr)); // [Yura, Mary, Tom]
        }


        int[] brr = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(brr)); //[1, 2, 3, 4, 5, 6]
        for (int j : brr)                 // ==>print array starting from first element
            System.out.print(j + "  ");  //1  2  3  4  5  6 

        System.out.println();

        for (int k = brr.length - 1; k >= 0; k--)  // ==>print array starting from last element
            System.out.print(brr[k] + "  "); //6  5  4  3  2  1


    }


}
