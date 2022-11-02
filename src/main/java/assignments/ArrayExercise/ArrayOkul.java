package assignments.ArrayExercise;

public class ArrayOkul {
    public static void main(String[] args) {
        // daha cozemedim.
        // Bir ilkokulda her sinifta ogrenci sayilari asagida verilen 3 adet sinif vardir. toplan ogrenci sayisini bulunuz. *Ilk okul 2. sinifa kadardir.
        //             3 Sube var.
        //              A B C
        //  1.siniflar: 14,15,16
        //  2.siniflar: 15,18,22
        //     toplam : 100 ogrenci var


        int okul[][][]= {{{14},{15},{16}},{{15},{18},{22}}};
       // int carpim=1;  carpim islemi us almak icin uygulanabilir
        int toplam=0;

        for (int i=0; i< okul.length; i++)
        for(int k=0; k<okul[i].length; k++) {

          //  carpim= carpim*okul[i][k][0];
            toplam= toplam+okul[i][k][0];


//        for (int [][] w : okul) {
//            for (int [] k : w)
//                sum = sum + okul.length;
            {

             //   System.out.println(carpim);  //  19958400     5 uzeri 6 yi verdi  :))

            }
            System.out.println(toplam);  // 100

        }
    }
}

