package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {

    public static void main(String[] args) {
        // Bu ornekte "replace" methodunu ogrenecegiz
        // Ex Bir Stringteki space haric kac tane character kullanildigini gosteren kodu yaziniz
        // Ali okula gitti. ====> 14
        // 123 45678 91011121314

        //Spesicik bir karakteri silmek istiyorsaniz, relpace methodunu kullanin.
        // ilk once silmek istediginiz karakteri yazin sonrada yerine koymak istediginiz karakteri koyunuz
        // length method bize sayi dondurur.
        Scanner input =new Scanner(System.in);


        String str = "Ali okula gitti.";

        int num = str.replace(" ","").length();
        System.out.println(num);


        // Ex. bir stringteki tum a harflerini A ya ceviriniz.

        String s = "Ankara'nin tasina gozlerimin yasina bak.";

                String yeniS =s.replace("a","A");
        System.out.println(yeniS);


        //Ex 3 BirStringteki tum kara kelimelerinin yerine "*" koyunuz

//        String t = "Kara kara dusunme Ankara";
//        String yeniT = t.replace("kara", "*");
//        System.out.println(yeniT); // Kara * dusunme An*  ----- bunu verdi niye ? cunku ...
//
//
//        //Bir Stringteki tum sayilari "*" a ceviriniz
//
//
//        String stdId =  "AC202117004";
//// bunu mesela su hale getirecegiz AC******** gibi
//
//
//
//        String yeniStdId = stdId.replaceAll("[0-9]", "*");
//        System.out.println(yeniStdId);
        // bir grup data yi ifade eden code lara regular expression denir = regex. = regular expressions)

        // Bir gorup data demek mesela  ==> [0-9]
        // tum kucuk harfler ==> [a-z]
        // tum buyuk harfler ===> [A-Z]
        // Tum harfler [a-zA-Z]  Buna dikkat et araya hicbirsey yazmadan yazmak lazim
        // sesli harfler ====> [aeiouAEIOU]
        // Space ==> [ ] spaci araya koy
        //   7) Tum rakamlar ve tum harfler ==> [0-9a-zA-Z]
        // 8) Tum noktalama isaretleri ==> (backword slash " \\p{Punct} "  bunu ezberle   unutursan Google
        // noktalama isaretleri icin regex deyip arastir.


        //Ex 5 : verilen bir Stringte kullanilan noktalama isareti ve rakamlar ve space karakteri haric
        // tum karakterlrin sayisini bulan kodu yaziniz

        String u = "Ali 13 yasinda, dersem inanma!...";

        // rakamlari silcem, spacei silcem, noktalama isaretlerini silcem, geri kalanlari saycam. mantik bu

        int sonuc = u.
                replaceAll("[0-9]", "").
                replace(" ", "").
                replaceAll("\\p{Punct}", "").
                length();
        System.out.println(sonuc);

// [^0-9]  rakamlar haric demek  ^ haric demek.
        // Rakamlar haric tum karakterler ===> demek [^0-9]
        // Kucuk harfer haric tum karakterler ===> [^a-z]
        // Buyuyk harflar haric tum karakterler ===> [^A-Z] --buyuk harfler haric
        // tum harfler haric tum karakterler ===> [^a-zA-Z]
        // space haric ==> [^ ]  = space gorunmuyor,


        // Ex 6 : Bir password un gecerli olup olmadigini asagidaki kurallara gore test eden kodu yaziniz.
        //Kurallar
        //1- space haric en az 8 karakter olmali
        //2- En az bir sembol icermeli
        //3- en az bir buyuk harf icermeli
        //4- en az bir kucuk harf icermeli


        String pwd = "B78c? K!m";  // gecerli bir code yazmaya calis , onu veriyoruz

        //  pwd.replace(" ","").length()>7;   ==> bu bize boolean verir onun icin basina boolean yaziyoruz

        // 1- Space haric en az 8 karakter olmali
        boolean first = pwd.replace(" ", "").length() > 7;

        // 2- En az 1 sembol icermeliyim

        // pwd.replaceAll("[0-9a-zA-Z ]", "").length()>0;   ===> bu da bize boolean verir.


        boolean second = pwd.replaceAll("[0-9a-zA-Z ]", "").length() > 0;
        // Sembol demek : rakam , harfler ve space disindakiler demek.
        // Sembol var ne demek : sembollerin sayisi 0 dan buyuk demek. o sayi sifirdan buykse sembol var demek


        // 3-En az bir rakam icermeli
        boolean third = pwd.replaceAll("[^0-9]", "").length() > 0;

        // 4- en az 1 buyk harf icermeli

        boolean fourth = pwd.replaceAll("[^A-Z]", "").length()>0;

        boolean pwdGecerli = first && second  && third  && fourth ;

        if (pwdGecerli){
            System.out.println("Password unuz gecerli");
        }else {
            System.out.println("Passwordunuz gecerli degildir"); // Bunu yukaridaki passwordu degistirerek test etmek lazim
        }

        // Ex 7 Bir Stringteki noktalama isaretleri haric karakter sayisini gosteren kodu yaziniz

        String cumle = "Sen yapmazsan, ben ?...";

        int a = cumle.replaceAll("[^\\p{Punct}]", "").length();
        System.out.println(a);




        // Ex. 8 : Verilen bir String "Al ile basliyor ve x ile bitiyorsa ekrana harika yazdirin,
        // aksi halde normal yazdirin.


       // v.startsWith("Al"); // String Al ile baslarsa  diye okunur
        String v = "Kalex";
        boolean baslangic = v.startsWith("Al");
        boolean bitis = v.endsWith("x");
        String result = baslangic && bitis ? "Harika" : "Normal";
        System.out.println(result);



        /*package serbestcalisma1;

import java.util.Scanner;

public class GecerliSifreKodu {
    public static void main(String[] args) {
//        String pwd= "123adgtt?b  /%$)";
//        if ((pwd.replace(" ","").length()>7)){
//            System.out.println("Gecerli sifre");
//
//        } else if ((pwd.length()>pwd.replaceAll(" \\S","").length())) {
//            System.out.println("sifrede bosluk karakteri kullanmayiniz");
//        }


//        String sifre = "a1c3d4f56";
//
//        boolean bv = sifre.length() > sifre.replace(" ","").length(); // bosluk varmi?
//
//        boolean uy = sifre.replace(" ","").length()>7;       //  bosluksuz 8 basamakli mi?
//
//        String s = (bv) ? ("Sifrede bosluk kullanmayin" ):(uy ? "Gecerli Sifre": "Gecersiz Sifre");
//        System.out.println("s = " + s);

        /*
		 1)  \\d    Tum rakamlar
		 	 \\D 	Tum rakam disi karakterler

		 2) \\w  ==>  A->Z    a->z    0->9 _   karakterlerinin tamamini icerir.
		 	\\W  ==>  A->Z    a->z    0->9 _   bunlarin disidaki karakterlerinin tamamini icerir.

		 3) \\s  ==>  space
		 	\\S  ==>  space disindaki her sey
		 */
  //      String s4 = "Code1 yazarak2 ogrenilir3!!!";
   //     System.out.println(s4.replaceAll("\\d", "*")); //Code* yazarak* ogrenilir*
  //      System.out.println(s4.replaceAll("\\D", "*")); //****1********2**********3
  //      System.out.println(s4.replaceAll("\\w", "*")); //***** ******** **********
  //      System.out.println(s4.replaceAll("\\W", "*")); //Code1*yazarak2*ogrenilir3
  //      System.out.println(s4.replaceAll("\\s", "*")); //Code1*yazarak2*ogrenilir3
   //     System.out.println(s4.replaceAll("\\S", "*")); //***** ******** **********

        // 2. Soru:Kullanicidan ismini ,soy ismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
//        A********  B********
//        **** **** **** 1234
//

        System.out.println("Isminizi giriniz");
        String isim = input.nextLine();
        System.out.println("soyisminizi giriniz");
        String soyisim = input.nextLine();
        System.out.println("Kredi Karti Numaranizi giriniz");
        String Kkn = input.nextLine();


        String EkranI = isim.substring(0, 1) + isim.substring(1).replaceAll("\\w", "*");
        String EkranSi = soyisim.substring(0, 1) + soyisim.substring(1).replaceAll("\\w", "*");
        String EkranKkn = Kkn.substring(0,5).replaceAll("\\w", "*")+" " +Kkn.substring(5,10).replaceAll("\\w","*")+" "+
                Kkn.substring(10,14).replaceAll("\\w","*")+" "+Kkn.substring(Kkn.length()-4);



        System.out.println("EkranI = " + EkranI);
        System.out.println("EkranSi = " + EkranSi);
        System.out.println("EkranKkn = " + EkranKkn);

    }
}





