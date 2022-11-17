package day30collections;

import java.util.HashSet;

public class HashSet01 {
/*
    Hash bir tekniktir,birbirine benzemeyen code'lar üretir bu code'lar data'yı unique yapar.
    Set'lere,çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız.(öğrenci numaraları gibi)
 */

        public static void main(String[] args) {

            HashSet<String> emails = new HashSet<>();

            emails.add("Apple");
            emails.add("Mango");
            emails.add("Orange");
            emails.add("Apricot");
            emails.add("Fig");



            System.out.println(emails); // random orderla siraladi ==>  [Apple, Fig, Mango, Apricot, Orange]
          emails.add("Mango");

            System.out.println(emails); // [Apple, Fig, Mango, Apricot, Orange]

            emails.add(null);
            emails.add(null);
            emails.add(null);

            System.out.println(emails); // [null, Apple, Fig, Mango, Apricot, Orange]
            // niye null basta? MAP lerde nasil hashcode uretilir, nasil depolanir, konusacagiz.

            //hashsetler eklediginiz elemanlari herhangi bir siralamaya tabi tutmaz.
            //normalde siralamk iyi bir seydir arkadaslar . ama zaman alir.ben size desem ki ,
            // su 20 kitabi kitabliga koy desem ,siralamayi onemsemezseniz o kitaplari
            //elinize alir iki dakka da kitaplaiga yerlestirrisiniz.
            //HashSetler:
           // 1)tekrarsiz elemanlarda
           // 2)sıralama onemli degilse
           // 3)hız cok önemliyse
            //4)İndeks kullanmazlar


        }

    }


