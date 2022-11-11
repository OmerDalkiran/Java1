package assignments.abdullahla;

import java.util.Scanner;

public class UcgenOlmaDurumu {

    /*  TASK :
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz.
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

	    INFO :
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c
	     b+c>a>b-c
		a=b=c ise es kenar ucgen

	 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen ucgenin uc kenar uzunlugnu giriniz");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a + b > c && c > a - b && a + c > b && b > a - c && b + c > a && a > b - c) {

            if (a == b && b == c) {
                System.out.println("Ucgeniniz eskenar ucgendir");

            } else {

                System.out.println("Ucgen fakat eskenar ucgen degildir");
            }
        } else {
            System.out.println("ucgen degildir");
        }
    }
}

