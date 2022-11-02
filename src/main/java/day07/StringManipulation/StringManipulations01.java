package day07.StringManipulation;

public class StringManipulations01 {

    public static void main(String[] args) {

        // String class methodlari
        /*                Ne zaman kullanilir? VE bu method bize ne verir?

        1- equals() : i) iki tane Stringin ayni olup olmadigini anlamamiza yarar.  ( yani yazi ve harf olan seyler
                      ii) equals methodu "boolean" return eder (sonucunu verir, size doner demek)

                      2) equalsIgnoreCase() : i) iki tane Stringin ayni olup olmadigini buyuk harf , kucuk harfe
                      dikkat etmeden anlamamiza yarar. yine "boolean" return verir.

                      3) toLowerCase() :i) Bir Stringteki tum harflari kucuk harfe cevirmek icin kullanilir.
                                        ii) toLowerCase () methodu String return eder.

                      4( toUpperCase() :i) Bir Stringteki tum harflari buyuk harfe cevirmek icin kullanilir.
                                        ii) toUperCase () methodu String return eder.

                      5) charAt() : i) Bir Stringten belli bir indexteki characteri almak icin kullanilir.
                                     ii) charAt() methodu "char" return eder.

                      6) lnegth() : i)  Bir Stringte kac tane karakter kullanildigini ogrenmek icin kullanilir
                                    ii) length() methodu "int" return eder.

                      7) contains() :i) Bir Stringte belli bir characterin var olup olmadigini anlamak icin kullanilir.
                                     ii) contains() methodu "boolean" return eder.

                      8) split() : i) bir stringi istedigiiz karakterden parcalamya yarar.

                      Ali Baba  split("b")   demek Ali  a a olur. b' ler dies. Ali_ a  a
                                           ii) ne dondurur ( ARRAY return eder. ( coklu yapida)

         */


        /*
        Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.


          1 en az 8 karakter icermeli
          2 Space characteri icermemeli
          3 ilk harfi "M" ya da "m" olmali
          4 son karakteri ? olmali



         */
        String pwd = "manisa12?";
        boolean first = pwd.length()>7; // en az 8 karakter icermeli oldugu icin pwd.lentgh()> 7 yi ilk once yaziyoruz
                                      // sonra bunun ne verdigine bakiyoruz. 8>7 bize fals zani boolean verir . o yuzden
                                      // buolean num yaziyoruz . iki seyi karsilasinca mutlaka boolean verir

        //ii Space characteri icermemeli
        boolean second = !pwd.contains(" ");  // " " space demek


        //ilk harfi "M" ya da "m" olmali
        boolean third = pwd.charAt(0)=='M' || pwd.charAt(0)=='m';

        //  son karakteri ? olmali
        boolean fourth = pwd.charAt(pwd.length()-1)=='?';

        System.out.println(first && second && third && fourth);


           // Ex
    }
}
