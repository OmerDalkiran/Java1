package assignments.Loops.ForLoops;

import java.util.Arrays;
import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {
//        //Ex.1 :  28 den 157 kadar tum tek sayilari ekrana yazdirin
//
//      for (int i = 28; i < 157; i++) {
//
//          if((i%2) == 1) {
//
//               System.out.print(i + " ");
//           }
//
//       }
//        //  Ex.2:  28 den 157 kadar tum tek sayilarin "TOPLAMINI" ekrana yazdirin.
//
//        int i, sum = 0;
//
//        for(i = 28; i <= 158; i++){
//            if((i%2) == 1){
//                sum += i;
//            }
//        }
//        System.out.print("\n"+ sum+"\n");
//
//
//        // Ex 3: 10 dan 20 ye10 kadar olan cift sayilari yazdirin.
//
//        for(int k=10; k<21; k++)
//        {
//        if((k%2==0)){
//
//
//        }
//
//            System.out.print(k +" ");
//        }
//
//        // Ex.4 : 10 dan 20ye kadar olan cift sayilarin toplamini yazdiriniz.
//        int i2, sum2=0;
//        for(i2=10; i2<21; i2++)
//        {
//        if((i2%2==0))
//        {
//            sum2+=i2;
//        }
//        }
//        System.out.print("\n"+sum2);
//
//        //
//        System.out.println();
//        // Ex: 5 : 1den 100 e kadar olan saylari yazdiriniz.
//
//        for(int s=1; s<101; s++) {
//
//            System.out.print(s+" ");
//        }
//        // Ex: 5 : 1den 100 e kadar olan sayilarin toplamini yazdiriniz.
//
//        int a, sum3=0;
//        for(a=1; a<101; a++){
//
//            sum3+=a;
//        }
//        System.out.println("\n"+sum3);
//
//        // 1 den 50ye kadar olan rakamlarin toplamini yaziniz
//
//        int rkm, sum4=0;
//
//        for(rkm=1; rkm<51; rkm++){
//
//            sum4+=rkm;
//
//        }
//        System.out.println("\n"+sum4);

        //
//  Example 3: Bir ogretmenin sinifindaki ogrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz.
        //( Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz )

        Scanner input = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz?");

        int ogrSayisi = input.nextInt();
        String[] isimler = new String[ogrSayisi];

        for (int j=1; j<=ogrSayisi; j++){
            System.out.println(" Lutfen " + j + ". ogrencinin ilk ismini giriniz");
            String stdIsim= input.next();

            isimler[j-1]=stdIsim;

            System.out.println("(Not : Ogrenci isimlerinin girisini sonlandirmak icin Q harfine basiniz)");

            char exit= input.next().charAt(0);
            if(exit=='q' || exit=='Q') {
                break;
            }
        }
        System.out.println(Arrays.toString(isimler));
    }
}




