package farkliProjeler.odevVeAlistirmalar;

public class StringExamples {
    public static void main(String[] args) {


        // Verilen bir String "Ne ile basliyor ve r ile bitiyorsa ekrana harika yazdirin,
        // aksi halde normal yazdirin.

        String a = "Ner guzel bir habe";

        boolean start = a.startsWith("N");
        boolean end = a.endsWith("r");
        String result = start && end ? "Harika" : "Normal";  // bir String ifade bir kelime veya vir cumle olabiir.

        System.out.println(result);    // arika cikti

        // (  String a = "Ner guzel bir habe";

        // boolean start = a.startsWith("N");
        // boolean end = a.endsWith("r");
        //  String result = start && end ?  "Harika" : "Normal";  // bir String ifade bir kelime veya vir cumle olabiir.

        //  System.out.println(result); // bunun sonucu normal cikti "Ner guzel bir habe" )


        // Ex 2 Bir password'un gecerli olup olmadigini asagidaki kurallara gore kontrol eden kodu yaziniz.


        // 1 en az 10 karakter icermeli
        // 2 Space characteri icermemeli
        // 3 ilk harfi "O" ya da "Z" olmali
        // 4 son karakteri 9 olmali
        // 5 en az bir tane kucuk harf
        // 6 en az bir tane buyuk harf olmali


        String pwd = "Z7ert.psGHJ9";

        boolean first = pwd.length() > 9;  // demek bu password en az 10 karakter icermeli demektir. 0-1-2-.....-9 = 10 yapar

        boolean second = !pwd.contains(" "); // demek space icermemeli demek

        boolean third = pwd.charAt(0) == 'O' || pwd.charAt(0) == 'Z'; //pwd.startsWith("O") || pwd.startsWith("Z"); //

        boolean fourth = pwd.charAt(pwd.length() - 1) == '9'; // demek "son karakteri 9 olmali demek
                                                             // charAt(pwd.length()-1 bize hep son karakteri verir

        boolean fifth =  pwd.replaceAll("[^a-z]", "").length() > 0; // !== pwd.contains("a-z"); bu olmaz

        boolean six = pwd.replaceAll("[^A-Z]", "").length() > 0; // !== pwd.contains("A-Z");

        System.out.println(first && second && third && fourth && fifth && six);


        // Ex :i) Passwordun ilk harfi buyuk harf ise gecerli aksi halde gecersiz;
        //      ii) Passwordun ilk harfi z ise gecerli , aksi halde gecersiz password yazdirin.







        //Example 6: Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //           i)Space haric en az sekiz karakter olmali
        //           ii)En az 1 sembol icermeli
        //           iii)En az 1 rakam icermeli
        //           iv)En az 1 buyuk harf icermeli
        //           v)En az 1 kucuk harf icermeli



        String pwd3 = "B78c? K!m";

        //i)Space haric en az sekiz karakter olmali
        boolean first3 = pwd3.replace(" ", "").length()>7;

        //ii)En az 1 sembol icermeli
        boolean second3 = pwd3.replaceAll("[0-9a-zA-Z ]", "").length()>0;

        //iii)En az 1 rakam icermeli
        boolean third3 = pwd3.replaceAll("[^0-9]", "").length()>0;

        //iv)En az 1 buyuk harf icermeli
        boolean fourth3 = pwd3.replaceAll("[^A-Z]", "").length()>0;

        //v)En az 1 kucuk harf icermeli
        boolean fifth3 = pwd3.replaceAll("[^a-z]", "").length()>0;  //
        boolean pwd3Gecerli = first3 && second3 && third3 && fourth3 && fifth3;

        if(pwd3Gecerli){
            System.out.println("Password'unuz gecerlidir...");
        }else{
            System.out.println("Password'unuz gecerli degildir...");


        }

        // Verilen bir ifade "O" ile basliyor "n" ile bitiyorsa ekrana harika yazdirin, aksi halde normal yazdirin

        String c = "Ogullarim Ibrahim ve Said Dalkiran";
        boolean ilk = c.startsWith("O");
        boolean son = c.endsWith("n");

        String sonuc = ilk && son ? "Harika" : "Normal";
        System.out.println(sonuc);


        // Bir Stringteki noktalama isaretlerinin sayisini gosteren code u yaziniz.

        String n = "Hayat seninle beraber ..... ancak !!! bu kadar 'enfes' olabilir.";
       // int num = n.replaceAll("[^\\p{Punct}], "."").length();






    }


}


