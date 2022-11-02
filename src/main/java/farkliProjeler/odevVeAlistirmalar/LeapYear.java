package farkliProjeler.odevVeAlistirmalar;

public class LeapYear {

    public static void main(String[] args) {

         /*
            Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
                i)Yil 100 e bolunurse 400 e de bolunmelidir ==> 1600+    1800-
                ii)Yil 100'e bolunmezse 4 e bolunmelidir ==> 1996+    2001-
         */
        int year = 2022;

        String leap = year%100==0 ? (year%400==0 ? "Leap year" : "Leap year degil") : (year%4==0 ? "Leap year" : "Leap year degil");
        // Aciklamasi:  Eger bir yili yuze boldugumuzde kalan 0 ise , 400 e bolmeyi deneriz. eger 400 e de bolundugunde kalan 0 ise Leap year.
        // eger yil yuze bolunmezse , 4e bolunmelidir. 4e bolunurse Leap year; bolunmezse Leap year degildir.

        System.out.println(leap);


        int year1 = 2020;

        String leapYear = year1%100== 0 ? (year1%400==0 ? "Leap Year" : "Leap year degil") : (year1%4==0 ? "Leap Year" : "Leap year degil");
        System.out.println(leapYear);


        int yil = 2012 ;

        String artikYil = yil%100==0 ? (yil%400==0 ? "Bu bir Artik yildir" : " Bu bir Artik yil degildir") : (yil%4==0 ? "bu bir Artik yildir" : "bu bir Artik yil degildir");

        System.out.println(artikYil);
    }

}

