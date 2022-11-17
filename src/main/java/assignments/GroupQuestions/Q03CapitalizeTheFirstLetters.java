package assignments.GroupQuestions;

import java.util.Arrays;

public class Q03CapitalizeTheFirstLetters {


    public static void main(String[] args) {
         /*Arrays-3.soru
            verilen bir metnin tum kelimelerinin ilk harflerini buyuk
             digerleri kucuk olacak sekilde duzenleyin
             ornek input=>
             "buGUn hEr sEy cOK yORuCu ve bUNaLtIciYdI"
         */
        String str = "buGUn hEr sEy cOK yORuCu ve bUNaLtIciYdI";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            String a = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + " ";

            System.out.print(a);
        }
    }
}

