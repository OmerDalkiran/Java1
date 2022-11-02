package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedMap;

public class Arrays01 {

    // Arrays lerin icin sadece primitiv data tipleri ve referenselar (=adres) yerlestirilebilir.

    public static void main(String[] args) {

        String str[] = new String[3];
        str[0] = "Java";
        str[1] = "did";
        str[2] = "surprised you";


        System.out.println(Arrays.toString(str));

        //String bir Array olusturunuz ve "Tom ve tom"dan onceki tum elemanlari ekrana yazdiriniz.

        String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w : arr) {

            System.out.println(w + " ");

            if (w.equals("Tom")) {     // break in altina konulursa Tomu yazdirmaz. dikkat et.
                break;             // Loop kirilmazsa java ikinci elemana gelir. loop kirilana kadar devam eder.
                // nezaman Tom equals Tom olur, Tom yazilir ve loop kirilir. Ali ve Rojda yazilmadi.
            }


        }
        System.out.println();

        //String bir Array olusturunuz ve "Tom ve Jane haric tum elemanlari yazdiriniz

        String arr2[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};
        for (String w : arr2) {

            System.out.println(w + " ");

            if (w.equals("Tom") || w.equals("Jane")) {     //   || yapmamizin sebebi ikiside ve olunca continue calismaz

                continue;

            }
            System.out.println(w + " ");
        }


        // Ex. 3 Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz.
        // (Bir ogretmenin sinifindaki ogrencilerin isimlerini applicatona yuklemesini saglayan kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen kac ogrenci ismi gireceksiniz"); // Array olusturmak icin bize ilk lazim olan
                                                                    // sey kac tane sorusudur.

        int numOfStd = input.nextInt();
        String[] names = new String[numOfStd];  // == Bu ifade "1 den basliyor musterinin verdigi sayiya kadar
                                                    // devam ediyor demek"

        for (int i = 1; i <= numOfStd; i++) {
            System.out.println(" Lutfen  " + i + " . ogrencinin ismini giriniz.");
            String stdName = input.next(); // kullanicidan datayi aliyorum konteynir stdName ye koydum, ordan aliyorum names'in icin koyuyorum .buna gerek yok
                                             // yada boylesi daha iyi==>  names[i - 1] = input.next()
            names[i - 1] = stdName;

            System.out.println("Girisi sonlandirmak icin Q harfine basiniz");

            char exit= input.next().charAt(0);
            if(exit=='q' || exit=='Q') {

                break;
            }
        }
        System.out.println(Arrays.toString(names));
    }
}






