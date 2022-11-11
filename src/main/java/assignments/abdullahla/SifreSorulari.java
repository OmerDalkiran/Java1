package assignments.abdullahla;

import java.util.Scanner;

public class SifreSorulari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        //a) Şifre boşluk karakterinden farklı en az 10 karakter içeriyorsa "Geçerli Şifre"
        //b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
        //c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
        //d) en az bir sayi, bir kucuk karakter ve bir de punctuation mark icermeli
        //Not: Çözümdeki koşulların sıralarına dikkat ediniz

        /*replace()
     Metin icerisindeki karakter ya da karakterlerin, istenilen karakter ya da metinle degistirilmesini saglar.
     Sonuc String'dir..
         */
          /* /*
            Bir grup data'yi ifade eden kod'lara "Regex" denir.
            "Regex" Regular Expressions in kisaltilmis halidir.

            1)Tum rakamlar ==> [0-9]
            2)Tum kucuk harfler ==> [a-z]
            3)Tum buyuk harfler ==> [A-Z]
            4)Tum harfler ==> [a-zA-Z]
            5)Sesli harfler ==> [aeiouAEIOU]
            6)Space ==> [ ]
            7)Tum rakamlar ve tum harfler ==> [0-9a-zA-Z]
            8)Tum noktalama isaretleri ==> \\p{Punct}

            1)Rakamlar haric tum karakterler ==> [^0-9]
            2)Kucuk harfler haric tim karakterler ==> [^a-z]
            3)Buyuk harfler haric tum karakterler ==> [^A-Z]
            4)Tum harfler haric tum karakterler ==> [^a-zA-Z]
            5)Space haric ==> [^ ]
         */

        System.out.println(" Kurallara uyan bir sifre giriniz");

        String Passw = input.nextLine();
        String A = Passw.replaceAll(("[a-z]"), ".");
        System.out.println(A);

        String B = Passw.replaceAll(("[A-Z]"),".");
        System.out.println(B);

        if (Passw.replaceAll("\\S", "").length() > 0) {

            System.out.println("Lutfen Sifrede bosluk kullanmayiniz");

        } else if (Passw.replaceAll("[^0-9a-zA-Z ]", "").length() > 0) {
                     System.out.println("Sifreniz gecerli bir sifre degildir");

        } else {
            System.out.println("Sifrenizde, verilen talimatlarin en az biri olmadigi icin gecersiz sifredir");


        }

       //  Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
         //
        //           i)Space icermemeli
        //           ii)En az 1 sembol icermeli
        //           iii)En az 1 rakam icermeli
        //           iv)En az 1 buyuk harf icermeli
        //           v)En az 1 kucuk harf icermeli
         //          vi) ve En az 8 karakter olmali

        String password = "Zxcas3b.";
        boolean space = password.replaceAll("\\S","").length()>0;
        boolean symbol = password.replaceAll("\\p{Punct}","").length()>0;
        boolean num = password.replaceAll("[^0-9]","").length()>0;
        boolean smallLetter =password.replaceAll("[^a-z]","").length()>0;
        boolean capitalLetter =password.replaceAll("[^A-Z]","").length()>0;
        boolean numOfCharacter =password.replaceAll("[0-9a-zA-Z\\p{Punct}]","").length()>7;

        boolean passwordValid= space && symbol && smallLetter && capitalLetter && numOfCharacter & num ;
        if(passwordValid) {
            System.out.println("Passwordunuz gecerlidir");
        }else {
            System.out.println("Passwordunuz gecerli degildir");

        }
    }
}

