package day17arraylists;

import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        List<String> names = new java.util.ArrayList<>();
        names.add("Tom");
        names.add("Thomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");

        System.out.println(names);

        List<String> cities = new java.util.ArrayList<>();

        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");


        names.removeAll(cities);
        System.out.println(names);
        System.out.println(cities);


        List<String> myNames = new java.util.ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsin");


        boolean sonuc1 = names.containsAll(myNames);
        myNames.containsAll(myNames);
        System.out.println(sonuc1);
        // containsAll  : Bir Listin icindeki coklu elemanlarin var olup olmadigini kontrol eder.
        // Hepsi varsa true, en az biri yoksa false verir.

        // Ex . 1 a listesinde "Shoes" elemanini ilk gorunumunu siliniz.  remove kullanacagiz
        List<String> a = new java.util.ArrayList<>();

        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        a.remove("Shoes");
        System.out.println(a);   // [TV, Radio, Laptop, Shoes, Book, Shoes]

        // Ex 2  a listesinden butun "shoes" elemanlarinin tum gorunumleirni siliniz
        // RemoveAll kullanmak icin yeni bir liste mutlaka olusturulmali.

        List<String> silinecekler = new java.util.ArrayList<>();
        silinecekler.add("Shoes");

        a.removeAll(silinecekler);
        System.out.println(silinecekler);

        // Example 3 : Bir tane salary listi olusturun. Eger Salary 10000 den az ise %20, 10000 ve 10000 den cok ise %10 zam apiniz.

        List<Double> salary = new java.util.ArrayList<>();  // %20 zam demek 1.2 ile carpmak demektir.


        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);


        // Iki Araay listiin esit olup olmadigini karsilastiran kodu yaziniz
        List<Character> m = new java.util.ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
        //m.add('t');

        List<Character> n = new java.util.ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');


        //1. Yol:
        int counter = 0;//Flag

        for (int i = 0; i < m.size(); i++) {
            if (m.size() != n.size()) {
                System.out.println("Listler eşit değildir.");
                break;
            } else if (m.get(i) != n.get(i)) {
                counter++;
                System.out.println("Listler eşit değildir.");
                break;
            }
        }
        if (counter == 0) {
            System.out.println("Listler eşittir.");
        }

        // 2. Yol
         //  m.equals(n);  // bu yuzden birr tane boolean olusturuyoruz. Eger
        boolean esitmi = m.equals(n);

        if (esitmi){
            System.out.println("Listeler esittir");

        }else {
            System.out.println("Listeler esit degildir");
        }

    }
}