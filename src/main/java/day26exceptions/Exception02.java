package day26exceptions;

public class Exception02 {
    public static void main(String[] args) {

       // getCharFromString("Java", 2); bunu ekranda gormek icin bir conteynir olusturuyorum
      char ch1=  getCharFromString("Java", 2);
        System.out.println(ch1); // v

        char ch2 = getCharFromString("Seleinium", 8);
        System.out.println(ch2);  // StringIndexOutOfBoundsException

        // StringIndexOutOfBoundsException  ne demek? Bir STringte karakter yada karakterler alinirken olmayan bir index kullanilirsa alinir.

    }
    public static  char getCharFromString(String str, int idx){ // 1. ilk once metod olusturuyoruz
                                                                  // Method olustururken bize ne lazimsa hepsini buraya yaziyoruz
        char c= ' ';

        try{
                c=str.charAt(idx);

        }catch (StringIndexOutOfBoundsException e){

                System.out.println("Index ile ilgili bir problem olustu" + e.getMessage());

                e.printStackTrace(); //Detayli LOG  gormek icin.// Bir hata olustugunda ne yaparsiniz?
                                     // Cevap : Loglara bakarim. Oradan anlamaya calisirim.

        }
        return c;
    }
}
