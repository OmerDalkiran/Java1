package assignments.GroupQuestions;

import java.util.ArrayList;

public class Arrays04 {

    public static void main(String[] args) {
         /*
    verilen bir array in en buyuk elemanini ve bu elemanin kacinci sirada oldugunu bulunuz
    input={10,13,56,20,40,60,56,32}
    output=60, 5
    */
        int[] arr = {10, 13, 56, 20, 40, 60, 56, 32};
        int enBuyukSayi = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > enBuyukSayi) {

                enBuyukSayi = arr[i];
            }
        }
        System.out.println("en büyük sayı:" + enBuyukSayi);


//        int [] arr1= {10,13,56,20,40,60,56,32};
//
//        int  sirasi= ArrayUtils.indexOf(arr1,60);
//
//        System.out.println(arr1);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(13);
        list.add(56);
        list.add(20);
        list.add(40);
        list.add(60);
        list.add(32);

        // System.out.println(list);
        System.out.println(list.indexOf(60));


        //creating a generic function that converts the Array into List
      //   public static <T> List<T> ArrayToListConversion(T array[])
       // {
        //creating the constructor of the List class
            //    List<T> list = new ArrayList<>();
        //using for-each loop to iterate over the array
            //    for (T t : array)
            //    {
        //adding each element to the List
            //        list.add(t);
            //     }
        //returns the list converted into Array
            //   return list;
        }
    }


