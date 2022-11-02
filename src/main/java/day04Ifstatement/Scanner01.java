package day04Ifstatement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ilk isminizi girermisiniz");
        String ilkIsim = input.next();

        System.out.println("Orta ismminizi girermisiniz");
String ortaIsim = input.next();

        System.out.println("Son isminizi girermisiniz");
        String soyisim = input.next();

        System.out.println("TC numarinizi giriniz");
        //int tcNo = input.nextInt();  bu da olabilir ama Stringle alinirsa daha iyi cünku
        // kullanabilen cok güzel metholar var Stringle kullanilan cok güzel methodlar var. Int i biz
        // matematiksel islemlerde tercih ederiz. kimse tc nosuyla toplama cikarma yapmaz

        String kimlikNo = input.next();

        System.out.println(ilkIsim + " " + ortaIsim +" " + soyisim);
        System.out.println(kimlikNo);


        // 2. Yol :
        System.out.println("ilk, orta, soy isminizi ve kimlik numaranizi giriniz.");
        String ilk = input.next();
        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();

        System.out.println(ilkIsim + " " + ortaIsim +" " + soyisim + " " + kimlik);
        System.out.println(kimlik);

  // 3. Yol
        System.out.println("Ilk, orta ve soy isminizi giriniz");
        String tamIsim = input.nextLine();
// eger tek kelime icerirse next; birden fazla kelime kullanilacaksa next line

        System.out.println(tamIsim);

        System.out.println("Kimlik numaranizi giriniz");
        String kimlikNumaraniz = input.next();
        System.out.println(kimlikNumaraniz);

        //ilk iki adimi secip ctrl + / yaparak kapatirsaniz sadece ucuncu adim calisir
        //Ust kismi yorum haline getirdi forward slash ile  Windows  ctrl + /
    }
}
