package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {



       /*
    ArrayList'ler ayni data tipine sahip birden fazla data'yi depolamak icin kullanilir.
    Array ile ArrayList'in farki nedir?
    1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz
      Array'ler eleman sayisinda "fixed" dirler. Yani sonradan eleman sayisi degistirilemez
      ArrayList'leri olustururken eleman sayisi soylemeye gerek yok, cunku ArrayList'ler eleman sayisinda "flexible"

    2)Array'lerin icine "primitive" ve "reference" lar konabilir
      ArrayList'lerin icine ise sadece "non-Primitive"ler konulur.

    3)Array'ler super fast, cok hizli. Array'ler memory'i cok az kullanir.
    Note: Eleman sayisi belli olan coklu datalari depolamak icin Array kullaniriz, ama
          eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin.
          ay, gun sayisinda ARRAY ; okuldaki ogrenci sayisinda ARRAYLIST


 */
        public static void main(String[] args) {


            // ArrayList nasil olusturulur?

            // 1. yol

            ArrayList<Integer>  ages = new ArrayList<Integer>();     // 1/ yol
            // 2. yol
            ArrayList<Integer>  heights= new ArrayList<Integer>();  // Kirmizi ayakkabi gibi ozel bir tanimlamadir.

            //3. Yol :
            List<Integer> nums= new ArrayList<>();  // Ayakkabi gibi. Adem oglu gibi...

            // ArrayListlerin yazdirilmasi :
            System.out.println(nums); // []

            // Arraylistlere nasil eleman eklenir?
            nums.add(21);

            System.out.println(nums);
            nums.add(18);
            nums.add(20);

            System.out.println(nums); //  [21, 18, 20]  add methodu elemani her zaman en sona ekler.
            // insertion order==> eger yerlestirme sirasina gore diziyorsa denir.

            nums.add(1,50); // index 1 e 50 eklemek icin boyle yapilir. Data tipi void oldugu icin hicbirsey return etmez.
            System.out.println(nums);   // [21, 50, 18, 20]

            // add metodu boolean verir. true demek gorev tamamdir. false demek yerlestrilemedi demektir.



            List<Integer> prices = new ArrayList<>();
            prices.add(23);
            prices.add(185);

            nums.addAll(prices); // addAll u kullandigimizda ilk liste degisir. eklenilen liste degismez
            System.out.println(nums); // [21, 50, 18, 20, 23, 185]

            System.out.println(prices); // [23, 185]

            nums.addAll(2,prices); // 2. indexe 23 ve 185 i koy demek.
            System.out.println(nums);   // [21, 50, 23, 185, 18, 20, 23, 185]

          //ArrayList lerin eleman sayisi nasil bulunur.
           //  nums.size() ;  methodu ile.  integerlarda length metodu, ArrayList te size metodu verir.

          int elemanSAyisi = nums.size();
            System.out.println(elemanSAyisi); //  Listin size 8 tir.


// get metodu : istenen bir indexteki elemani verir.
           nums.get(3);
           int elem1= nums.get(3);
            System.out.println(elem1);  // 185

            nums.isEmpty(); // bos oldugu zaman true verir.  bos olmadigi zaman true verir.

            boolean bos1= nums.isEmpty();
            System.out.println(bos1);

            boolean bos2 = ages.isEmpty();
            System.out.println(bos2);  //true

            // ArrayList' te bir eleman nasil degistirilir?

            nums.set(3,200); // nums listine gidip index 3 teki elemani 200 e cevir dedim.
            System.out.println(nums);


            // ex. 1 nums ArrayListindeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz.

            for (int w : nums){          // List kullanmamizda loop kullanacaksak for each kullan

                if(w%2!=0){

                    nums.set(nums.indexOf(w), w+11);

            System.out.println(nums);    // [21, 50, 23, 200, 18, 20, 23, 185]
                                         // [32, 50, 34, 200, 18, 20, 34, 196]


            System.out.println(nums.get(nums.indexOf(w+11)));  // sadece update olanlari yazdirmak icin
                }
            }

            nums.remove(3);
            // remove metodunu icin tamsayi koyarsaniz java onu index olarak kabul eder.
            nums.remove(new Integer(200)); // ustu cizili olan bi komut yakinda kalkacak demek.


            Integer sayi = 200; // primitivi wrapper classa koyunca artik non primitive oldu. o yuzden gider onu bulur ve siler.
            nums.remove(sayi);
            System.out.println(nums);

            // Application lari  en son versiyona update yapmak lazim.
            // NOT: 1- Tum tam sayilar JAva icin aksi soylenmedikce primitive dir yani "int" dir
            //      2- "Primitive" ler ArrayList lerin elemani olamazlar. Listler non primitive depolar.
            //      3- Primitive i wrapper class a cevirirseniz non-primitive olur. ve non primitive ler ArrayListlerin elemani olur, index olamaz.
        }

}
