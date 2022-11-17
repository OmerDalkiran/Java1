package assignments.mycodes;

public class MaxValueOfArray {

        /*
    Verilen bir array in en buyuk elemanini ve en kucuk elemanini ve bu elemanlarin kacinci sirada oldugunu bulunuz, bu Array'in ortalamasini aliniz.
    input={43,-3,65,10,13,56,875,20,40,60,56,32,-900}
    output ; max=875, min=-900 , Avarage=28
     */

    public static void main(String[] args) {

        int[] arr = {43, -3, 65, 10, 13, 56, 875, 20, 40, 60, 56, 32, -900};
        int max = arr[0];

        for (int w : arr) {
            max = Math.max(max, w);
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {

                System.out.println("max Value of this Array is =" + max);
                System.out.println("the index of Max Value is = " + i);
            }
        }
    }
}



