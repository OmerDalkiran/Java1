package assignments.mycodes;
public class MinValueOfArray {
    public static void main(String[] args) {

        int[] arr = {43, -3, 65, 10, 13};
        int min = arr[0];

        for (int w : arr) {
            min = Math.min(min, w);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                System.out.println("The min Value of this ARRAY is = "+ min);
                System.out.println("The index of the Min value is = "+i);

            }
        }
    }
}


