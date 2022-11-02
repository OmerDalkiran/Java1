package assignments.Loops;

import java.util.Scanner;

public class ForEachLoopEx {
    public static void main(String[] args) {


        // Tom ve Tom dan onceki elemanlari yazdiriniz

        String[] str = {"Ahmet", "Mahmut", "Gurel", "Tom", "Serap", "Kemal"};

        for (String w : str) {
            // System.out.print(w + " "); // Ahmet Mahmut Gurel Tom  NOTE ! Eger bunu alt tarafa koyarsaniz Tom'u yazdirmaz.

            if (w.equals("Tom")) {  //
                break;

            }
            System.out.print(w + ", ");  //Ahmet, Mahmut, Gurel,  !!! Soruya gore biz karar veririz altami konacak ustemi konacak diye.
        }



       // Ahmet , Tom ve Kemal haric butun elemanlari yazdirin.

        String[] btr = {"Jane", "Ahmet", "Mahmut", "Gurel", "Tom", "Serap", "Kemal"};

        for( String w: btr){

            if(w.equals("Ahmet") || w.equals("Kemal") || w.equals("Tom")){
                continue;
                // yani es gec, yazdirma demek.

            }
            System.out.print (w+ " ");
        }













    }
}

