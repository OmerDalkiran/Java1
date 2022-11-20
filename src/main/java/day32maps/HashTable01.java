package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    public static void main(String[] args) {

/*
1- HashTabel bir MAp'tir.
2- HashTAble EntrySet leri datayi siralamaya tabi tutmaz. HashTable mashmaplerden daha yavastir.
   cunku hashtable lar thread safe * ayni anda birden fazla is yapma becerisi demektir. )
   ve syncronised ( coklu isleri zaman save etmek icin siralanabilmesi demektir.) dir.   corba piserken salata yapabilmektir.

            3)HashTable, HashMap'lerden daha yavastir. Cunku HashTable'lar thread-safe ve synchronized'dir.
            4)HashTable'larda key null olamaz. Key'i null yaparsaniz NullPointerException atar.
            5)HashTable'larda value null olamaz. Value'yu null yaparsaniz NullPointerException atar.

 INTERWIEW QUESTIONS
                  MAP'LER ARASINDAKI FARKLAR
1) HashMap ve TreeMap ve LinkedHashMap  synchronized ve thread-safe degildir.
    HashTable synchronized ve thread-safe dir.

    2) Treemap'ler natürel order yapar.
     LinkedHashMap giriş sırasına göre listeler.
     HashMap ve Hashtable sıralama yapmaz,rastgele sıralar.

    3) HashMap ve LinkedHashMap'lerde hem key hemde value için null değeri kullanılabilir.
     TreeMap'lerde key'ler icin "null" kullanılmaz.
     HashTable larda ikisi içinde null kullanılmaz.
     */


        Hashtable<String,Integer> countryPopulations = new Hashtable<>();

        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 83000000);
        countryPopulations.put("Turkey ", 80000000);
       // countryPopulations.put("France", null);  NullPointerException atar
        System.out.println(countryPopulations);

       //countryPopulations.put(null,90000000);  // HashTable larda key null olamaz. NullPointerException atar.
      //

Hashtable<String,Students> myStudents = new Hashtable<>();

myStudents.put("Math", new Students("Tom Hanks","th@gmail.com", 21, true));
        myStudents.put("Science", new Students("Silvia","s@gmail.com", 23, true));
        System.out.println(myStudents);

      Students name =  myStudents.get("name");
        System.out.println(name);  // null  cunku get metodu key ile calisir.
                            // benim burada Math i kullanip nokta koyup String olarak cagirmamalazim.

        String name1 = myStudents.get("Math").name;
        System.out.println(name1);

        int age = myStudents.get("Math").age;
        System.out.println(age);



    }



}
