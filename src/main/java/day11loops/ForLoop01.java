package day11loops;

public class ForLoop01 {
    public static void main(String[] args) {

        //Example 1: 3 den 6 ya kadar tam sayilarin toplamini bulan kodu yaziniz.

        int sum = 0;
        for (int i = 3; i < 7; i++) {
            sum = sum + i;
            System.out.println(sum);
        }

        System.out.println(sum);


        //Note : System.out.println(); loopun dışına yazılırsa "sum"in sadece son degerini yazdirir
        //Note   System.out.println(); loopun icine yazilirsa her bir loop icin "sum" in hangi degerleri aldigini yazdirir.


        //Example 2: 6 den 3 e kadar tam sayilarin carpimini bulan kodu yaziniz.
        int multiply = 1;
        for (int a = 6; a > 2; a--) {
            multiply = multiply * a;
        }

        System.out.println(multiply);

        //Ex:  size verilen bir tam sayinin toplamini bulunuz.     ex. 385  --> 3+8+5 = gibi
        // bir sayiin son rakamini almak isterseniz mod 10 %10 islemi yapiniz
        //  385 i 38 e dondurebilirsem islem biter. 385 / 10  = 38 dir javada . int oldugu icin ondalik kismi iptal eder java.
        // 38,5 olmaz. ondalik kismi java siler ve yuvarlama islemi yapmaz.
        //  38 mod 10 = 38%10 =8 dir. Sonra da
        //  38/10 = 3 olur. 3,8 degil.  3 mod 10 = 3 tur.
        //  3/10 = 0 dir.


        //Example 3: Size verilen bir tamsayinin rakamlari toplamini bulunuz
        int num = -385;
        num = Math.abs(num);
        int sonuc = 0;

        for(int i=num; i>0; i=i/10){
            sonuc = sonuc + i%10;
        }
        System.out.println(sonuc);


        // Ex: 4 :  Size verilen bir Stringi ters ceviren kodu yaziniz.
        // "Kaba" ==> "abak" olacak yani

        String str = "Kaba";      //Concatenation yapacaksaniz "" kullanin

        String ters = "";         // (Concatination yapacaksak bos String konur. Yan yana yazdirma demek.

        for(int i=str.length()-1; i>=0; i--){  // son harften basliyoruz str.length()-1 ile 0 da bitiriyoruz
                                               // i-- bir harf sola kayarak yani
            char c = str.charAt(i);  // str.charAt(i) i bir char container in icine koyuyoruz.

            ters = ters + c;

        }

        System.out.println(ters);

    }


}