package day30collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

    public static void main(String[] args) {

        /*
        java da tree kelimesi tekrarsiz elemanlari alfabetik sira veya kucukten buyuge siralar.
        Kelimeyse alfabetik, sayisalsa kucukten buyuge gore dizer.  ==> "Naturalorder" yani .
        TreeSet diger setlere gore cok daha yavas calisir. Gercekten alfebetik siralama sartmi==> mesela sozluk mu yapacaksiniz.

         */

        // Ex. 1 Sekis tane unique String elemani alfebetik siralamada depolayiniz.

       // unique==> set
              //  alfebetik oldugu icinde ==> treeset kullanmaliyiz.


        //Example 1: Sekiz tane unique String elemanı alfabetik sırada depolayınız.
        TreeSet<String> emails = new TreeSet<>();

        Long start1 = LocalTime.now().toNanoOfDay();

        emails.add("a@gmail.com");
        emails.add("y@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("d@gmail.com");

        Long end1= LocalTime.now().toNanoOfDay();
        System.out.println(end1-start1);  // 5984800 nanosecond


        HashSet<String> myEmails = new HashSet<>();
        Long start2 = LocalTime.now().toNanoOfDay();
        myEmails.add("a@gmail.com");
        myEmails.add("y@gmail.com");
        myEmails.add("c@gmail.com");
        myEmails.add("m@gmail.com");
        myEmails.add("b@gmail.com");
        myEmails.add("z@gmail.com");
        myEmails.add("k@gmail.com");
        myEmails.add("d@gmail.com");

        Long end2 = LocalTime.now().toNanoOfDay();

        System.out.println(end2-start2) ;



        //2. Way:
        HashSet<String> myEmailss = new HashSet<>();
        myEmailss.add("a@gmail.com");
        myEmailss.add("y@gmail.com");
        myEmailss.add("c@gmail.com");
        myEmailss.add("m@gmail.com");
        myEmailss.add("b@gmail.com");
        myEmailss.add("z@gmail.com");
        myEmailss.add("k@gmail.com");
        myEmailss.add("d@gmail.com");
        TreeSet myEmailsSorted = new TreeSet(myEmailss);// HashSet'i TreeSet'e çevirmek için bu kodu yazdık.
        System.out.println(myEmailsSorted);
        Long end3 = LocalTime.now().toNanoOfDay();

        System.out.println(end3 - end2);
    }
}
