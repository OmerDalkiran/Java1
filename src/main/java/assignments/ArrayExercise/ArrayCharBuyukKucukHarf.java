package assignments.ArrayExercise;

import java.util.Arrays;

public class ArrayCharBuyukKucukHarf {
    /*
    Bir Char Arrayinnin icindeki sadece buyk ve kucuk harfleri yazdirin.
     */

    public static void main(String[] args) {


        char[] ch = {'A', 'b', 'C', 'd'};

        for (char w : ch) {

            if (w < 'Z') {
                //  System.out.println("Bu Arrayin icindeki Buyuk Harfler sunlardir: " );
                System.out.println(w);

//            } else {
//                System.out.println("Bu Arrayin icindeki kucuk harfler sunlardir: " + w);
            }


        }
        String[] str1 = {"Ali", "Veli", "Tom", "Birol"};

        for (String w : str1) {

            System.out.print(w+", "); // AliVeliTom yazdirir

            if (w.equalsIgnoreCase("tom")) {
                break;


                //   }System.out.println(w); // Burada sadece Ali, Veli yazdirir.
            }
        }
        System.out.println();



        String [] sss = {"Said", "Ibrahim", "Murat", "Ahmet" };

            Arrays.sort(sss);
            System.out.println(Arrays.toString(sss));

            for (String w: sss){
                if(w.equalsIgnoreCase("murat"));

                System.out.print(w+ ", ");
            }
        }
    }

