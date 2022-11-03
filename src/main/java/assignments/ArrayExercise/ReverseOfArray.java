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

    }


}




