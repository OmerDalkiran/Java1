package assignments.GroupQuestions;
import java.util.ArrayList;
import java.util.List;

public class Q06SumBetweenTheBiggestAndThesmallest {

    //verilen bir tam sayi dizisinin en buyuk ve en kucuk elemanlari arasindaki sayilari bulunuz

    //input={10, 13, 56, 45, 40, 60,100,56, 32,90}
    //output=[13, 56, 45, 40, 60]

    public static void main(String[] args) {

        int[] arr = {10, 13, 56, 45, 40, 60,100,56, 32,90};
        int max = arr[0];

        for (int w : arr) {
            if (w > max) {
                max = w;
            }
        }
        List<Integer> arr2 = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == max) {
                break;
            }
            arr2.add(arr[i]);
        }
        System.out.println(arr2);   // [13, 56, 45, 40, 60]


    }
}
