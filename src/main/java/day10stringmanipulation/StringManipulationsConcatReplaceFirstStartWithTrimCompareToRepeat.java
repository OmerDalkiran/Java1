package day10stringmanipulation;

public class StringManipulationsConcatReplaceFirstStartWithTrimCompareToRepeat
{

    public static void main(String[] args) {

        String a = "Java kolaydir.";

        boolean b = a.startsWith("kola",5);  //startsWith("kola", 5) kodu ilk 5 karakter'den sonraki String'e
        // bakar ve o String'in "kola" ile baslayip baslamadigini kontrol eder.
        //"kola" ile basliyorsa "true", baslamiyorsa "false" return eder.


        System.out.println(b);


        //         a.replaceFirst("a", "*"); // ilk a nin yerine yildiz koy demek
        //         a.replace ("a", "*")  --> butun a lari yildiz yapar
        String c = a.replaceFirst("a", "*");

        // CONCATINATION  : islemi yani birlestirme islemi iki turlu yapilir 1- + islemi ile. 2 - concat ile

        //  Bazen biz eklemeler yapmak isteriz

      String d =   a.concat("Anladin mi?");   // concat metodu iki Stringi yapistirmaya yarar
        System.out.println(d);                    // Java kolaydir.Anladin mi ?

        // a +"Anladin mi?";  // Java herhangi bir konuda kod olusturmussa onu kullanmak evladir.
        // Concat methodu her zaman sona ekler.


         a.trim();  // bir seyi ucundan kesmek, kiriklari aldirmak. Bastaki ve sondaki duzeltmeleri yapar.
        String e = "    Tom Hanks     ";  // Trim methodu bas ve sondaki spaceleleri siler, ortadakine dokunmaz
        System.out.println(e);

        String f = e.trim();               //      Tom Hanks
                                          // Tom Hanks
        System.out.println(f);

        //   compareTo()   iki Stringi karsilastirir

        String h = "Java";
        String i = "Java";

        int k = h.compareTo(i);
        System.out.println(k);   // 0 i verir.


        String r = "Java";
        String t= "Kava";

        int g = r.compareTo(t);
        System.out.println(g);  // -1  eger Lava olsaydi -2 olurdu.

        // bu kod iki Stringi Lexicografic olarak (alfabetik yazilma sirasina gore karsilastirir.
        // Buyuk-kucuk harfe gore duyarlidir. Bunu istemezseniz compareToIgnoreCase() i kullanabilirsiniz.
        // buyuk harf kucuk harf degisiminde ASCII value larini kullanir.
        // Bu kodda "h'nin alfabetik sirasindan "i"nin alfabetik sirasi cikarilir.

        // repeat() methodu

        String l = a.repeat(3);
        System.out.println(l);   // Java kolaydir.Java kolaydir.Java kolaydir. a Stringini yan yana 3 defa yazar.
                                 // repeat in icine hangi sayiyi girerseniz o kadar tekrarlar

        //a.repeat(0)  bos bir String verir.  yani hicbirsey yazdirmaz



    }
}
