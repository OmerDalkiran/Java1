package assignments.ArrayExercise;

import java.util.Arrays;
import java.util.Collections;


public class ReverseOfArray {
    public static void main(String[] args) {

        Integer[] intArray = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        //print array starting from first element
        System.out.println("Original Array:");
        for (Integer integer : intArray)

            System.out.print(integer + "  ");

        System.out.println();

        //print array starting from last element
        System.out.println("Original Array printed in reverse order:");

        for (int i = intArray.length - 1; i >= 0; i--)
            System.out.print(intArray[i] + "  ");


        System.out.println();

        String[] array = {"Ey" , "guzel" , "kasli", "dilber"};
        Collections.reverse(Arrays.asList(array));//[dilber, kasli, guzel, Ey]
        Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.toString(array)); // [Ey, guzel, kasli, dilber] Tersinin tersini alinca aynisi oldu.


        // char Array
        char [] char_array = {'H','E','L','L','O'};
        System.out.println("Original array: ");
        for (int k = 0; k <char_array.length; k++) {
            System.out.print(char_array[k] + " ");
            System.out.println();
            reverse_array(char_array, char_array.length);

        }

    }

    private static void reverse_array(char[] char_array, int length) {



    }
}





