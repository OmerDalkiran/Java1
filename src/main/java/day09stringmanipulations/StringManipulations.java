package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations {
    public static void main(String[] args) {


        String str = "Java is easy";  // ilk a nin indexi birdir.
                   // 01234567891011


        str.indexOf("a");   //  a lardan ilk olaninnin indexini verir.
        int idxA = str.indexOf("a");

        System.out.println(idxA); // 1  verir


        // LastIndexOf() methodu
        str.lastIndexOf("a");

        //herhangi bir karakterin ilk nerede gorundugunu gormek istiyorsanin indexOf() u kullanin
        // herhangi bir karakterin son olarak nerde gorundugunu istiyorsaniz lastIndexOf u kullanin.

        int idxA2 = str.lastIndexOf("a");
        System.out.println(idxA2);             // 9 gorunur

        // index of un icinde coklu karakter kullanirsaniz sunu anlarsiniz "kara index 5 ten basliyor.
        // lastindexof

        String str1 = "Kara kara dusunme Ankara";

        int idxA1 = str1.indexOf("kara");

        System.out.println(idxA1); //5 verir yani bu su demek kara 5.indexte yazilmaya baslaniyor.

        int idxA3 = str1.lastIndexOf("kara");
        System.out.println(idxA3); // LastIndexOf() oldugu icin cumle yada paragraftaki "kara" nin en son hangi
        // indexte basladigini gosterir.***buradaki Ankaranin icindeki kara. 20ci indexte basliyor

        //Stringe git ilk i karakterinin indexini bana ver demek

        String s = "Mississippi";
        //012345678910

        int idxI = s.indexOf("i");
        System.out.println(idxI); // ilk i nin indexini veriyor.


        int idxIss1 = s.indexOf("iss");  // ilk gorunumun ilk karakterinin indexini verir.
        int idxIsss = s.lastIndexOf("iss");   //son gorunumun ilk karakteriin  idex 456 ikinci iss teki ---> 4 alinacak

        System.out.println(idxIsss);
        System.out.println(idxIss1);
        // char da kullanilabilir fakat tekli karakterler icin.


        // Ex 1 Bir Stringteki bir karakterin tekrarli veya tekrarsiz olp olmadigini gosteren kodu yaziniz
        //  String "Helloooo"   H--> tekrarsiz
        //                      e--> tekrarsiz  l --> tekrarli  o--> tekrarli

        // eger indexOf() ile lastIndexOf() esit ise tekrarli ; esit degil ise tekrarsiz demektir. word notuna ve resme bak.


        String t = "Helloooo";
        char c = 'H';    // bir konteyner koyup disarida degistirmek formulun icinde , yada kodun icinde degistirmekten
        // daha iyidir.

        if (t.indexOf("c") == t.lastIndexOf("c")) {
            System.out.println("Tekrarsiz");
        } else {
            System.out.println("Tekrarli");
        }
        // ben index of ve last index of methodlarini kullanirim . Eger indexOf() ve lastIndexOf() methodlari kullaniminda
        // bir harfin yada kelimenin indexOf() ve lastIndexOf() degerleri birbirine esitse bu tekrarlanmayan
        // harfi gosterir, eger bu degerler birbirinden farkli ise  tekrarli demektir ve tekrar eden harfleri gosterir.


        String u = "Learn Java, earn money";

        int sonuc = u.indexOf("a", 6);
        System.out.println(sonuc); // 7 cikti. // ilk 6 karaktere bakma , ondan sonrakilerin icindeki ilk a nin indexini bana ver.

        String m = "Learn Java earn money";

        int sonuc2 = m.indexOf("n", 5);
        System.out.println(sonuc2); // ilk 5 ini sil demek.


        String x = "Learn Java earn money";

        int sonuc3 = x.indexOf("e", 4); // ilk dort karakteri sil demek.
        System.out.println(sonuc3); // 11 aliriz cikti olarak



        // NOTE : indefOf() iki parametreli kullanilirsa,, ikinci parametrede verilen sayi kadar characteri gectikten sonra istenen
        // karakterin gorunumunun indexini return eder..

        // last indexOf iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi index kabula edip en
        // bastan bu indexe kadar olan karakterleri bu kutu icine aliniz ve last index
        // metodunu sadece bu kutu icindeki String icin kullaniniz
        
        String n = "Hello everyone";

        int e = n.lastIndexOf("e",7);
        System.out.println(e);


        int son = u.lastIndexOf("a", 5);
        System.out.println(son); // 2


        // isEmpty Methodu bir Stringin bos olup olmadigini kontrol eder. Eger Stringte hic karakter yoksa true doner;
        // herhangi bir karakter varsa false return eder.
        // length() = 0 demek isEmpty() true ayni anlama gelir.  Peki nicin java bunu olusturdu?
        // length() ==0 icin demek iki isEmpty() true verir.

        // Bir Stringin bos olup olmadigini anlamak icin length()==0 kullanmayin; isEmpty() kullanin. Biz java bir kod olusturmussa
        // direk onu kullaniriz. Java da method yoksa kendi mantigimizi kullaniriz.

        String l = "";

        boolean bosmu = l.isEmpty();
        System.out.println(bosmu);


        String p = "";
        boolean blankMi = p.isBlank();
        System.out.println(blankMi);
        // isBlank() methodu hem bos String icin hem de sadece space yada spaceler " iceren Stringler icin kullanilir
        // kullanici hic girmezse yada kullanici hep space girerese isim yerine hata vermesi icin bunu kullaniyoruz.


        // Ex 2 : Kullanicidan alinan isim space ten farkli en az bir karakter icermektedir.

        Scanner input = new Scanner(System.in);
        System.out.println("Ilk isminizi giriniz");
        String ilk = input.nextLine();

        if (ilk.isBlank()) {
            System.out.println("Sana ilk ismini gir dedim");
        } else {
            System.out.println(ilk); // Kullanicinin space girerek beni aldatmasini engellemek icin bu code kullanilir.
        }


    }


}
