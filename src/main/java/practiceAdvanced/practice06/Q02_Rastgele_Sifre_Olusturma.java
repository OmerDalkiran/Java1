package practiceAdvanced.practice06;

import java.util.Scanner;

public class Q02_Rastgele_Sifre_Olusturma {


    //Kullanıcıdan aldığınız sayi kadar karakter uzunluğuna sahip rastgele şifre üreten bir kod yazınız.
    // buyuk harf, kucuk harf ve rakam olacak
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen sifreniz icin bir sayi giriniz");

        int karakterSayisi = input.nextInt();
        String sifre = "";
        int sayac =0;

        String karakterler = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; // rastgele indexle buradan karakter sececgiz.
        int maxIndex = karakterler.length();    // (-1 olmazsa A yi alamiyoruz)                                            // 9 un cikmasi icin bir bosluk birakiyoruz.
        while (sayac<karakterSayisi){                                                           // cunku hic 9 u yazdirmiyor
           int rastgeleIndex =(int) (Math.random()*maxIndex);  // rastgele index elde etmek icin.
           sifre += karakterler.charAt(rastgeleIndex);
           sayac++;

           if(karakterler.charAt(rastgeleIndex)==('A'))  {  // A yi verip vermedigini bulmak icin
               break;
           }
        }
        System.out.println("Sifre =" + sifre);


/* Generate a random character between ch1 and ch2
        public static char getRandomCharacter(char ch1, char ch2) {
            return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
        }

         Generate a random lowercase letter
        public static char getRandomLowerCaseLetter() {
            return getRandomCharacter('a', 'z');
        }

        /** Generate a random uppercase letter
        public static char getRandomUpperCaseLetter() {
            return getRandomCharacter('A', 'Z');
        }

        /** Generate a random digit character
        public static char getRandomDigitCharacter() {
            return getRandomCharacter('0', '9');            */
        }

    }

