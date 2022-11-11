package day29abstractioncollections;

import java.util.LinkedList;

public class LinkedList01 {

/*
1)LinkedList'deki her eleman iki bölümden oluşur. i)Data ii)Pointer
2)LinkedList'deki her bir eleman "Node" olarak adlandırılır.
3)LinkedList'ler eleman ekleme ve eleman silme işlemlerinde çok başarılıdırlar.
4)LinkedList'ler eleman arama işlemlerinde başarısızdırlar.
5)3. ve 4. maddelerden dolayı eleman ekleme ve eleman silme işlemlerinin çok yapılacağı durumlarda LinkedList kullanılmalıdır.
6)ArrayList'ler index kullanır LinkedList'ler index kullanmaz.
7)index kullanmak eleman bulma işlemlerinde çok başarılıdır, bu yüzden eleman bulma işlemlerini çok yapacaksanız ArrayList kullanmalısınız.
 */

    public static void main(String[] args) {


        LinkedList<String> visitors = new LinkedList<>();

        visitors.add("Tom");
        visitors.add("Hanks");
        visitors.add("Tom Hanks");
        visitors.add("Brat");
        visitors.add("Pitt");
        visitors.add("Brad Pitt");
        visitors.add(2, "Angelina Julie");
        visitors.add("Tom Hanks");
        visitors.add("Brad Pitt");


        System.out.println(visitors); // [Tom, Hanks, Tom Hanks, Brat, Pitt, Brad Pitt]
        // [Tom, Hanks, Angelina Julie, Tom Hanks, Brat, Pitt, Brad Pitt]


        visitors.addLast("Cuneyt Arkin");
        visitors.addFirst("Ajda Pekkan");
        System.out.println(visitors);  // [Ajda Pekkan, Tom, Hanks, Angelina Julie, Tom Hanks, Brat, Pitt, Brad Pitt, Cuneyt Arkin]


        visitors.removeFirst();
        System.out.println(visitors); // [Tom, Hanks, Angelina Julie, Tom Hanks, Brat, Pitt, Brad Pitt, Cuneyt Arkin]

        visitors.removeLast();
        System.out.println(visitors); // [Tom, Hanks, Angelina Julie, Tom Hanks, Brat, Pitt, Brad Pitt]


        System.out.println(visitors);  // [Tom, Hanks, Angelina Julie, Tom Hanks, Brat, Pitt, Brad Pitt, Tom Hanks, Brad Pitt]
        visitors.removeFirstOccurrence("Tom Hanks");
        System.out.println(visitors);  // [Tom, Hanks, Angelina Julie, Brat, Pitt, Brad Pitt, Tom Hanks, Brad Pitt]

        visitors.removeLastOccurrence("Brad Pitt");

        System.out.println(visitors);  // [Tom, Hanks, Angelina Julie, Brat, Pitt, Brad Pitt, Tom Hanks]


        // visitors.pop(); // removefirst ile ayni
        /*
        Pops an element from the stack represented by this list. In other words, removes and returns the first element of this list.
        This method is equivalent to removeFirst().
        Specified by:         pop in interface Deque
        Returns:  the element at the front of this list (which is the top of the stack represented by this list)
        Throws:  NoSuchElementException – if this list is empty
         */
        String firstElement = visitors.pop();   // cut+paste yapiyor LinkedList ten
        System.out.println(firstElement); // Tom

        LinkedList<String> myList = new LinkedList<>();
        // myList.pop(); // NoSuchElementException atti cunku LinkedList bos.

    }

}
