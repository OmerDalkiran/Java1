package assignments.SaturdayLessons;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

            int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};// 90,23,5,.....
            // 1 yontem
            for (int i=0; i<array.length; i++){
                System.out.print(array[i]+" ");
            }
            // 2 yontem
            System.out.println();

            for (int w:array){
                System.out.print(w+ " ");
            }

            //Bir eleman dizide olup olmadığı nasıl kontrol edilir
            for (int x:array){
                if (x==90){
                    System.out.println(x+ " var");//90 var
                    break;
                }
            }
            Arrays.sort(array);
            System.out.println(Arrays.toString(array));//[5, 12, 22, 23, 34, 67, 90, 109]
            System.out.println(Arrays.binarySearch(array,120));//-9  ==> bu arrayin icinde yok, olsaydi 9. eleman olurdu demek

        }
    }

