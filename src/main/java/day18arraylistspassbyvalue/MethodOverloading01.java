package day18arraylistspassbyvalue;

public class MethodOverloading01 {

    public static void main(String[] args) {


        add(3,5);   //once isme bakacak java. java kendi basina secim yapmaz. cunku farkli secimler farkli sonuclari dogurur.
                           // coklu opsiyon oldugunda secim yapmaz. java parametrelere bakiyor. java 3 luyu eledi.
                           // java data tiplerine bakar sonra. 3 integer, 5 te integer. java bunu sevdi. tam uyumu sever.
                           //
                            //  Metodun ismi ve metodun parametreleri metodun imzasidir
                            // metodun imzasi o metodu ozellestren seydir. o yuzden isim ve parametreler disinda ne degistirirsen degistir
                            // o metodlari farkli kabul etmez.

                            /*
                            /*
    Method Overloading nasıl yapılır?
    1)Method isimleri aynı olmalıdır.
    2)Method parametreleri farklı olmalıdır.
        i)Parametre sayıları değiştirilebilir.
        ii)Parametrelerin data tiplerini değiştirebilirsiniz.
        iii)Parametrelerin yerlerini değiştirebilirsiniz fakat ancak data tipleri farklı ise.
    3)Method ismi + Parametreler = Method Signature
    Method Signature dışında ne değiştirirseniz değiştirin Java o methodları farklı kabul etmez.
 */

    }

    public static void add(int a, int b) {
        System.out.println(a + b);

    }


    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);

    }

    public static void add(int a, double b) {     // AW auto widening otomatik olarak 5 i double koyar. ama tam uyum yok
        System.out.println(a + b);

    }

    public static void add(double a, int b) {    // 3 int, ama double a da konulabilir. ama java cok mutlu olmaz. 3 tane opsiyon var ama
                                                 // java kendisini en mutlu edeni secer. yani int a int b yi . ihtimalleri degerlendirir
        System.out.println(a + b);

    }

}

