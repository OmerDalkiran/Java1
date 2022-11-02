package suleHaniminClasslari;

import java.util.Scanner;

public class Oguzhandan {
    // Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
    //a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
    //b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullanmayınız"
    //c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"
    //Not: Çözümdeki koşulların sıralarına dikkat ediniz

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Sifre = "a1b2c3d4";
        if (Sifre.replaceAll("\\S", "").length() > 0) {

            System.out.println("Sifrede bosluk kullanmayiniz");

        } else if (Sifre.replaceAll("\\s", "").length() >= 8) {
            System.out.println("Gecerli Sifre");

        } else
            System.out.println("Çözümdeki koşulların sıralarına dikkat ediniz");

      //  Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //           i)Space haric en az sekiz karakter olmali
        //           ii)En az 1 sembol icermeli
        //           iii)En az 1 rakam icermeli
        //           iv)En az 1 buyuk harf icermeli
        //           v)En az 1 kucuk harf icermeli

        String pwd = "B78c ?K!";

        //i)Space haric en az sekiz karakter olmali
        boolean first = pwd.replace(" ", "").length()>7;

        //ii)En az 1 sembol icermeli
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]", "").length()>0;

        //iii)En az 1 rakam icermeli
        boolean third = pwd.replaceAll("[^0-9]", "").length()>0;

        //iv)En az 1 buyuk harf icermeli
        boolean fourth = pwd.replaceAll("[^A-Z]", "").length()>0;

        //v)En az 1 kucuk harf icermeli
        boolean fifth = pwd.replaceAll("[^a-z]", "").length()>0;

        boolean pwdGecerli = first && second && third && fourth && fifth;

        if(pwdGecerli){
            System.out.println("Password'unuz gecerlidir...");
        }else{
            System.out.println("Password'unuz gecerli degildir...");
        }

    }
}

