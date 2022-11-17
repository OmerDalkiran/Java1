package day30collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    /*
    LinkedHashSet'ler elemanlari ekleme sirasina gore "insertionOrder" a gore yerlestirirler.
     */


    public static void main(String[] args) {


        LinkedHashSet<String> emails = new LinkedHashSet<>();

        emails.add("abc@gmail.com");
        emails.add("bca@gmail.com");
        emails.add("asc@gmail.com");
        emails.add("bde@gmail.com");
        emails.add("axy@gmail.com");

        System.out.println(emails);   // [abc@gmail.com, bca@gmail.com, asc@gmail.com, bde@gmail.com, axy@gmail.com]
        // LinkedHashSet elemanlari siralamada zaman harcadigi icin(cunku 1.verileni 1.siraya koyacak, ikinciyi ikinci siraya koyacak vs)
        // eger siralama cok onemliyse hizdan fedakarlik yapip LinkedHashSet kullanilacak.


    }
}
