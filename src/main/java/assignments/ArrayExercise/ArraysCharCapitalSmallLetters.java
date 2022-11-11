package assignments.ArrayExercise;

import java.util.Arrays;

public class ArraysCharCapitalSmallLetters {

    public static void main(String[] args) {

        char[] ch = {'A', 'a', 'd', 'D', 'v', 'V', 't', 's'};

        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch)); // [A, D, V, a, d, s, t, v]

        System.out.println(Arrays.binarySearch(ch, 'c')); // -5 ==> not inside.if there were, it'd be 5th element

        System.out.println(Arrays.binarySearch(ch, 'g')); // -6 ==>not inside.if there were, it'd be 6th element

        System.out.println(Arrays.binarySearch(ch, 'z')); // -9 ==>not inside.if there were, it'd be 9th element

        System.out.println(Arrays.binarySearch(ch, 'd')); // 4 ==> There is. 4th index. element

        System.out.println(Arrays.binarySearch(ch, 'A')); // 0 ==> There is. index =0

        System.out.println();

        for (char w : ch) {
            if (w >= 'A' && w <= 'Z') {
                System.out.print(w);

            }

        }
    }
}
