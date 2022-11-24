package practiceAdvanced.practice01;

public class Q03_RegexQuantifiers {
    public static void main(String[] args) {

        //Bir String değerin belirli sayıda karakter içerip belirli bir karakter
        // ile bitip bitmediğini kontrol eden bir kod yazınız.

        String str = "as";
        str.matches("..");     // matches metodu regex le calisip String bir degeri regexle karsilastirmasini yapar ve
                                     // boolean verir yani bu eslesiyormu eslesmiyormu, uyuyormu uymuyormu?
                                     // .. demek iki karakter olup olmadigini kontrol eder.

        System.out.println(str.matches("..")); // true verdi . yani iki karakterlidir demek.
        System.out.println(str.matches(".s")); // true verdi . herhangi bir karakter ile baslayip s ile bitiyor demek
        System.out.println(str.matches("..s")); //  false verir . cunku 3 karakter yok


        // Bir String değerin ikinci karakterinin belirli bir karakter olup olmadığını kontrol eden bir kod yazınız.
           // +\ . ? regex te farkli degerlere denk gelir.


        String strr = "Alti";
        System.out.println(strr.matches(".l.."));

        String sss = "gEgggggjjjjjllllllll";
        System.out.println(sss.matches(".E.*")); // ==> true  .*  koyarsak * su anlama gelir: sonra ne kadar karakter olursa olsun demek
                                                                   //. demek herhangi bir deger demek.
        System.out.println(sss.matches(".r")); // FALSE ==> cunku ikinci  karakter r olmadigi icin uyusmuyor.  // .* flexible sayida karakter demek.



       //Bir String değerin sadece harf içerip içermediğini kontol eden bir kod yazınız.


        System.out.println("asdfeggggggasd".matches("[a-zA-Z]*"));   // true verdi
        System.out.println("asdfeggggggasd09".matches("[a-zA-Z]*"));  // false verdi


        //Bir String değerin belirli bir sayıda belirli karakterleri içerdiğini kontrol eden bir kod yazınız.

        System.out.println("abCde.".matches("[a-zA-Z]{5}"));  // true ==> 5 karakterli ve hepside harf olacak.
        System.out.println("abCDFde.".matches("[a-zA-Z]{5}")); // False ==> 5 ten fazla karakter iceriyor. Regex i kac kere kullanabiliriz o anlama geliyor 5.

        System.out.println("1erdt".matches("a-zA-Z]{5}")); // false ==> harf disinda karakter icerdigi icin false verdi.
                                                                              // ? nin anlami 1 yada 0 dir

        //Bir String değerin belirli karakterleri en az belirli sayıda içerip içermediğini kontrol eden bir kod yazınız.
        System.out.println("12345".matches("[0-9]{6,}"));  //  false ==>  6 dan az karakter icerdigi icin  "," ' un anlami 6 ve daha daha fazlasi demek 6, = en az 6 demek
        System.out.println("12345554335".matches("[0-9]{6,}"));  // true
        System.out.println("A2345554335".matches("[0-9]{6,}")); // false ==> rakam disi karakter iceriyor.

        System.out.println("Abcd123".matches("\\w{7,10}")); //true ==>   en az 7 en fazla 10 karakter icermis olsun demek .
        //     \\w = [a-zA-Z0-9_] underscore da var.
        System.out.println("Abcd?123".matches("\\w{7,10}")); // false ==>  soru isareti oldugu icin



        // ilk karakter 1, ikinci karekter noktalama işareti ve kalan 8 karakter rakam toplam 10 karakter olmali,

        System.out.println("1?12345678".matches("'1'\\p{Punct}' [0-9]{8}")); // false  koseli parantez ilk karakter demek , ikinci butun noktalam isaretlerinin regex i  ; 0-9

        System.out.println("1?!.12345678".matches("'1'['p{Punct}]{3}[0-9]*")); // true





    }
}
