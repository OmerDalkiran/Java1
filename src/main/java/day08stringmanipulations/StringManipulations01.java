package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

// Ex. Kullanicinin ismini ilk ve son harfi yana yana gelecek sekilde yazdiriniz.

        //  Scanner input = new Scanner(System.in)

        //  System.out.println("Lutfen isminizi giriniz");

        //  char ilkHarf =

        // Ben Stringle toplama yapamam ki . stringler icin ASCii value da olmadigi icin o zaman birlestirimek
        // lazim diye dusunecek. o yuzden " " isleminde birlestrme yapilacak. o yuzden RN gorunuyor.

        //Example 1: Kullanıcıdan aldığınız ismin ilk ve son harfini ekrana yazdırınız
        //           Ramazan ==> Rn

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz...");
        String isim = input.next();
        char ilkHarf = isim.charAt(0);
        char sonHarf = isim.charAt(isim.length() - 1);//Yazdığınız code sadece bazı durumlar için çalışırsa o code'a "Hard Coding" denir.
        //Yazdığınız code sadece her durum için çalışırsa o code'a "Dynamic Coding" denir.
        System.out.println("" + ilkHarf + sonHarf);


        //2. Yol :
        String ilk = isim.substring(0, 1);

        String son = isim.substring(isim.length() - 1);

        System.out.println(ilk + son);      // Stringlerin SCII value si olmadigi icin java direk birlestirme isi yapiyor.
        // Congatination


        // Ex. 2
        // Asagidaki Stringte sadece hayvan isimlerini ekrana yazdiriniz.
        // "Ben kedi esim tavuk oglum inek sever"

        String str = "Ben kedi, esim tavuk, oglum sever inek";
        //  012345678910111213141516171181920212223242526272829303132333435363738 karakterli
        String kedi = str.substring(4, 8);

        String tavuk = str.substring(15, 20);

        String inek = str.substring(34);

        System.out.println(kedi + tavuk + inek);
        // Substring in iki tane kullanimi vardir.
        // i) substring(baslangis indexi, bitis indexi) Stringin ortasindan bir parca almaya yarar.
        // ii) substring ( baslangic indexi) stringin verilen indexten sonuna kadar almaya yarar.

//
         // Ali okula gitti . okula / string 1  (ortadan alindigi icin
//         okula gitti --- String 2 (bastan sona oldugu icin
//
//
//
// Ex 3 : ilk isim ve soy isim iceren isimlerden bas harflerini ekrana yazdiriniz.
//         Ali Can -- AC  Tahsin Yurdakul-- TY gibi


        System.out.println("ilk ve soy isminizi giriniz");

        String tamIsim = input.nextLine(); // next line i kullaniyorum cunku hepsini almam lazim
        String a = tamIsim.substring(0,1); // her zaman ilk harfi verir/ ezberle bu kodu

        //regex =

        String b = tamIsim.split("")[1].substring(0,1);

        System.out.println(a+b);



    }
}


