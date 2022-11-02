package practiceAdvanced.practice03;

import java.util.Arrays;

public class Q01_Arrays_IsaretDegistir {


    /*
    Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
    input : 1,2,-3,4,-5,-6
    output :-1,-2,3,-4,5,6

     */
    public static void main(String[] args) {


        int arr[] = {1, 2, -3, 4, -5, -6};

        int brr[] = new int[arr.length];

        int index = 0;

        for (int w : arr) {

            brr[index]= w*-1;
            index++;

        }
        System.out.println(Arrays.toString(brr));
    }
}
