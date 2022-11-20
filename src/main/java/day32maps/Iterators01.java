package day32maps;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        // for loop kullanarak her elemanin sonuna "! " isareti ekleyiniz.

        for (String w : myList) {
            w = w + "!";

        }
        System.out.println(myList);  // loop lar kendi baslarina collectionlari update edemiyorlar !!! [Z, K, A, J, M]
        // Loop larin bu eksigini gidermek icin java itiratorlari olusturdu
        // itiratorlar collectionlari update etmek icin kullanilir.
        // Listi update etmek icin ListIterator kullanilir.
        ListIterator<String> itr = myList.listIterator();  // baska bir yontemle yeni obje olusturuyorum.

        while (itr.hasNext()) {  // bak bakalim baska bir next eleman varmi deriz javaya
            String el = itr.next();
            itr.set(el + "!");
        }
        System.out.println(myList);  // [Z!, K!, A!, J!, M!]
    }
}
