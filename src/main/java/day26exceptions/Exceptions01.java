package day26exceptions;

public class Exceptions01 {

    public static void main(String[] args) {


        String str = "123";
        // convertStringToInteger(str);
        int sonuc = convertStringToInteger(str);

        System.out.println(sonuc + 5); // 128    eger cevirmisse, toplayip 128 yazar.


        String st = "1a2b";

        //  convertStringToInteger(st);        // NumberFormatException  Exceptions01.java:20 da basliyor hata
        int r = convertStringToInteger(st); // Exception in thread "main" java.lang.NumberFormatException: For input string: "1a2b"
        System.out.println(r + 10);
           // Eger icinde rakamdan farkli characte barindiran bir Stringi valuOf() kullanarak Integera cevirmek isterseniz
           // "NumberFormatException i alirsiniz.

    }

    public static int convertStringToInteger(String str) {


        int i = 0;

        try {
            i = Integer.valueOf(str);
            System.out.println("Burasi try bolumu");

        } catch (NumberFormatException e) {

            System.out.println("Rakam olmayan karakter iceren Stringler integera cevrilmez");
        }
        return i;
    }
}
