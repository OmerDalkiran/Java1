package farkliProjeler.odevVeAlistirmalar;

import java.util.Scanner;

public class Increment {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int a = 12;                //29
        int b = 15;
        a *= 2;                // a' yi ikiyle carp demek  a*2=24
        b /= 3;                 // b'yi 3 e bol demek      b/3= 5
        System.out.println(a + b);     // 24+5 = 29 demek

        int num = 11;      //      Sayin 11.
        num = num - 2;      //    11 den iki cikar demek = yani 11-2 = 9
        num += 3;             //    sonra 9 a 3 ilave et demek = 12
        num++;             //     sonra 12 ye 1 ilave et demek
        System.out.println(num);               //   yani sonuc 13


        int num1 = 11;
        num1++;             // sade + demek sayiyi 1 arttir demek yada sayiya bir ekle demek.
        System.out.println(num1);  // sonuc 12


        int num3 = 11;
        num3 = num3 + 2;
        num3--;                    //  iki eksi demek sayidan 1 cikar demek
        num3--;
        System.out.println(num3); // 11


        System.out.println('A' > 'a' && 'c' < 'f');

        System.out.println(4 > 3 && 2 != 3 && 5 >= 7);


        System.out.println(2 != 3 || 4 >= 4);            // 2 esit degildir 3 veya 4 buyuk esittir 4   True
        System.out.println('A' > 'a' || 'c' < 'f');      // Buyuk A'nin ASCII degeri kucuk a'nin ASCII degerinden buyukur veya fnin c'den buyuktur  TRUE
                                                         // yukaridakinde sadece 1 tanesinin dogru olmasi sonucu 'veya' islemi oldugu icin dogru yapiyor
        System.out.println('A' > 23 || 'A' < 'z');       // True
        System.out.println(4 < 3 || 2 == 3 || 5 >= 7);   // False


        System.out.println(5/2);  // 2.5   False 2 verir
        //Prints 2.5 on the console
        System.out.println(5/2.0); // 2.5   True
        //Prints 2.5 on the console
        double result1 = 12/3 + 1; // 5     False 5.0
        System.out.println(result1);
        //Prints 5 on the console
        //int result3 = 10/2.5 + 1;           // False islem hata verir  double olmasi lazim
        // System.out.println(result3);   // 5


      /*
        System.out.println("Enter date of birth to calculate age");
        int dob = input1.nextInt();
        int age = calculateAge(dob);
        System.out.println(age);
    }
    public static int calculateAge(int dateOfBirth){
        return LocalDate.now().getYear() - dateOfBirth; */

      /*static int age = 12;
        char initial = 'J';
        public static void main(String[] args) {
            System.out.println(age + initial);*/  //gves error*/
    }
}
