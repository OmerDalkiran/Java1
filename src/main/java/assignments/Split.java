package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Split {

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
//
//        System.out.println("Lutfen tam isminizi giriniz.");
//        String tamIsim = input.nextLine().toUpperCase();
//
//        char ilkHarf = tamIsim.charAt(0);
//        System.out.println(ilkHarf);      // Buraya kadar sadece Ali Can da ==> A verir.
//
//        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
//        System.out.println(soyIsminIlkHarfi);  // A
//                                              // C   yan yana yazdirmak icin
                                              // "System.out.println()" yerine sadece "System.out.print() kullanilir.

//        {
//            System.out.println();
//        }
     // Ex : Soru peki uc isimlerde nasil olacak?
//
//        System.out.println("Lutfen tam isminizi giriniz.");
//        String tamIsim1 = input.nextLine().toUpperCase();
//
//        char ilkHarf1 = tamIsim1.charAt(0);
//        System.out.print(ilkHarf1+" ");      // Buraya kadar sadece Ali Can da ==> A verir.
//
//        char ortaIsminIlkHarfi1 = tamIsim1.split(" ")[1].charAt(0);
//        System.out.print(ortaIsminIlkHarfi1+ " ");
//
//        char sonIsminIlkHarfi = tamIsim1.split(" ")[2].charAt(0);
//        System.out.print(sonIsminIlkHarfi+" ");
//
//        char soyIsminIlkHarfi = tamIsim1.split(" ")[3].charAt(0);
//        System.out.print(soyIsminIlkHarfi);


        // ya da contenimation metoduyla isim tek tek girerse


      // Bir String teki sesli harflerin sayisini bulan kodu yaziniz.

      String str = " Baki kalan bu kubbede, hos bir seda imis";  //1

      str= str.toLowerCase(); //  7  butun harfleri lowercase e cevirip Stringi degistirdik.

      String harfler[] =str.split("");  // 2

      int counter = 0;  // 7 Bunu niye olusturuyoruz? a yi gorursem bir seyi artirmam lazim. var etmeden artiramazsin ki !!

      System.out.println(Arrays.toString(harfler)); // 3  [ , B, a, k, i,  , o, l, a, n,  , b, u,  , k, u, b, b, e, d, e, ,,  , h, o, s,  , b, i, r,  , s, e, d, a,  , i, m, i, s]

      for (String w : harfler){  // 4  switch olusturup icine w yu koymak lazim. Cunku yukaridaki harfler w'nun icine girecek.

        switch (w){            // 5

          case "a":  // 6   'a' olmaz, string degil cunku.
//            counter++;  // yani a durumunda counter i artir.
//            break;      // a yi gorursen counteri artir isibitir, e yi gorursen , counteri artit isi bitir vd...
          case "e":
//            counter++;
//            break;
          case "i":
//            counter++;
//            break;
          case "o":
//            counter++;            counter++ ve break te tekrar ettigi icin onlarida kaldiriyoruz.
//            break;
          case "u":
            counter++;
//            break;     bu break de kullanmaya gerek yok cunku son counter loop tan cikacagi icin ayni sonucu verir.
//          case "A":             buyuk harfleri toLowerCase ile kisaltabiliriz.
//            counter++;
//            break;
//          case "E":
//            counter++;
//            break;
//          case "I":
//            counter++;
//            break;
//          case "O":
//            counter++;
//            break;
//          case "U":
//            counter++;
//            break;
        }

      }
      System.out.println(counter);

    }
}
