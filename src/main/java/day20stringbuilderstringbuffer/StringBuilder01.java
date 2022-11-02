package day20stringbuilderstringbuffer;

public class StringBuilder01 {
    public static void main(String[] args) {

  /*
      1 String Builder  Javada bir Class tir ve String olusturmaya yarar.
     2  String Class varken nicin String Builder' a ihtiyac duyulur?

     3  Cunku, String Class "immutable" dir. Fakat biz bazen "muatable Stringlere" ihtiyac duyariz.
       String Builder bize ""muatable String" verir. muatable = degisime acik
                                                    immutable = degisime kapali

 4)"Immutable Class"larda var olan bir deger degistirilemez. Siz var olan bir degeri degistirmek istediginizde
          i)Memory'de yeni bir variable yeni bir degerle olusturulur.
          ii)Eski variable'in pointer'i yeni variable'a dondurulur.
          iii)Bir variable'i hicbir pointer gostermiyorsa o variable silinir.(Garbage Collector)

          "Mutable Class" larda var olan deger degistirilebilir. Orjinal deger korunmaz.


5) "String Class" larin "immutable" yapisi "security" icin onemlidir.
    Ayni degere sahip birden fazla String oldugunda, Java bir tane container olusturur ve ayni deger sahip String'lerin
     bu container'i    kullanmasini temin eder. Bu memeory'i korumak icin iyidir ancak container'daki degeri bir variable
     icin degistirdigimizde tum variable'larin  etkilenmesi tehlikesi vardir. Bu tehlikeden kurtulmak icin Java,
     String'leri "immutable(degismez)" yapmistir. Fakat herhangi bir variablee'in   degerini degistirmek icin Java
     bir yol bulmustur. Degistirmek istediginiz variable icin yeni bir container olusturur ve variable'in pointer'ini bu
    yeni variable'a yonlendirir. Boylelikle hem degisim saglanmis hem de digerleri etkilenmemis olur.

   */
        String str = "java";  // immutable dir   = degistirilemez

        str = "Super Java";  //
        System.out.println(str);




        StringBuilder strb = new StringBuilder("Java");  // mutable  = degistirilebilir

                      strb = new StringBuilder("Super Java");

        System.out.println(strb); // Super Java

        String hesabSAhibi1 = "Tom Hanks";
        String hesabSAhibi2 = "Tom Hanks";
        String hesabSAhibi3 = "Brad Pitt";


        //    StringBuilder nasil olusturulur ?
        // 1.Yol
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);   //  Java


         // 2. yol
        StringBuilder strb2 = new StringBuilder();

        // Yol A
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append("!!!");   //  Java is easy!!!
                               // concet string te eklemek icin  ; string builderlarda ise append kullanilir

        System.out.println(strb2);  // Java

        // Yol B

        strb2.append("Learn").append("Java earn").append(" money");  // Java is easy!!!LearnJava earn money

        System.out.println(strb2);


        // StringBuilder da character nasil olusturulur?

        StringBuilder strb3 = new StringBuilder();
        strb3.append("Cat");

        int numOfChar = strb3.length();     // eger 16 yi asarsa
        System.out.println(numOfChar);  // 3   |C|a|t|x|x |x |x |x |x |x |x |x |x |x | x


        int capacity = strb3.capacity();
        System.out.println(capacity);     //16  Kapasite asimlarinda varolanin iki katinin iki fazlasi gelir.

        strb3.append("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        int capacity1 = strb3.capacity();
        System.out.println(capacity1);    // 50

        strb3.setCharAt(2,'r');  // == > index iki deki karakteri r ye cevirir. r ile yerini degistirir.
        System.out.println(strb3);

        strb3.delete(3,51);         // delete metodunda index baslangicindan  silinecek olan kismini +1 index i ne kadar yazilmali!!
        System.out.println(strb3); // Car

        strb3.deleteCharAt(1);
        System.out.println(strb3); //  Cr   ==> index 1 deki


        strb3.reverse();
        System.out.println(strb3);  // rC  ==> reverse metodu Ali yi ilA yapar.


        String abc = " Java";                       // yukarisi ve asagisi mutable ve immutable olmaya ornek.
        abc.replace("a","i");      // StringBuilder da metodun direk sonucunualiriz. Ama
        System.out.println(abc);  // Java              Stringte

        abc=abc.replace("a","i");
        System.out.println(abc);    // Jivi   == > immutable larda orjinal degeri degistirmek icin metodu kullanmak
                                                // yeterli olmaz. Bir de "atama islemi" yapmaliyiz abc=abc.replace..... gibi

        // toString metodu StringBuilder lari String e cevirir.
        // strb3=strb3.toString();   // artik data min degistirilemez olmasini istiyorum. String e bir data olusturmam lazim
        String stringStrb3 = strb3.toString();
        System.out.println(stringStrb3); // rC

       // String class ta olup StringBuilderda olmayan metodlar var. oraya gecip isini halledi tekrar StringBuildera donebilirsiniz

        StringBuilder strb4= new StringBuilder(stringStrb3);
        System.out.println(strb4);  // rC


        strb4.insert(1,"XXXX");  // offset bosver demek. insert yerlestirmek, araya koymak demek.
        System.out.println(strb4);    // rXXXXC   1. charakterden sonra XXXX leri koy demek

        strb4.insert(3,"KLMNOPQRSTU",5,8); // 3. karakterden sonra sana verilen karakterlerin
        System.out.println(strb4);   // index i 5 olandan 8 olanina kadar araya sok demek. 5,6,7 inci indexlerini koyar
                                     // rXXPQRXXC


        StringBuilder a = new StringBuilder("Java");
        StringBuilder b = new StringBuilder("Java");

        a.compareTo(b);
        int sonuc = a.compareTo(b);
        System.out.println(sonuc);  // 0  ==> yani aralarinda 0 fark var demek. fark yok yani.

        StringBuilder c = new StringBuilder("Kava");
        StringBuilder d = new StringBuilder("Java");
        StringBuilder e = new StringBuilder("Dava");

        c.compareTo(d);
        int sonuc1 = c.compareTo(d);
        System.out.println(sonuc1); // 1   Alfabetik sirada K,  J den sonra geldigi icin +1 verir.

        d.compareTo(e);
        int sonuc2 = d.compareTo(e);
        System.out.println(sonuc2);   // 6    = E F G H I J
    }
}
