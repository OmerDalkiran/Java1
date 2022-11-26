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

         /*
    Verilen bir array in en kucuk elemanini ve en kucuk elemaninin kacinci sirada oldugunu bulunuz, bu Array'in ortalamasini aliniz.
    input={43,-3,65,10,13,56,875,20,40,-60,56,32,900}
    output ;   min=-60
     */
        int[] arr1 = {43, -3, 65, 10, 13, 56, 875, 20, 40, -60, 56, 32, 900};


        int min = arr1[0];

        for (int w : arr1) {
            min = Math.min(min, w);
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == min) {
                System.out.println("minValue of this Array is =" + min); // -60
                System.out.println("the index of Min Value is = " + i);   // 9 

            }
        }
         /*
    Verilen bir bu Array'in ortalamasini aliniz.
    input={43,-3,65,10,13,56,875,20,40,-60,56,32,900}
    Avarage output ;   
     */

        int[] arr2 = {43, -3,65, 10, 13, 56, 875, 20, 40, -60, 56, 32, 900};


        double sum = 0;

        for (int w : arr2) {

            sum = sum + w;
            double avarage = sum / arr2.length;

            System.out.println("sum = " + sum);
            System.out.println("avarage = " + avarage);

        }
    }
}
