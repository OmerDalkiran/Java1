package assignments.SaturdayLessons;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays01 {

    public static class Arryas01 {

        public static void main(String[] args) {

            String arr1[]={"Ali", "Veli","Ayse"};
            System.out.println(arr1);//[Ljava.lang.String;@58ceff1

            System.out.println(Arrays.toString(arr1));
            System.out.println(arr1.length);

            System.out.println(arr1[0]);//Ali
            System.out.println(arr1[arr1.length-1]);//Ayse



            ArrayList<Integer> list1= new ArrayList<>();
            list1.add(14);
            list1.add(15);
            list1.add(15);
            System.out.println(list1);

            System.out.println(list1.size());

            int arr2[]= new int[4];
            System.out.println(Arrays.toString(arr2));//[0, 15, 0, 16]

            arr2[1]=15;
            arr2[3]=16;
            System.out.println(Arrays.toString(arr2));//[0, 15, 0, 16]



        }
    }
}
