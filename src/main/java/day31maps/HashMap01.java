package day31maps;

import java.util.*;

public class HashMap01 {

/*

            1)Map'ler key-value structure kullanir
            2)Key'ler unique'dir
            3)Value'lar tekrarli data icerebilir
            4)Map'lerde eleman degil EntrySet kullaniriz.
            5)Key'ler null kabul etmez
            6)Value'lar null kabul eder.
            7)HashMap'ler EntrySet'leri herhangibir siralamaya tabi tutmaz, rastgele siralar
            8)Siralama ile vakit jaybetmedigi icin HashMap'ler cok hizli calisirlar.

       1 Maplar key value srtuctor ini kullanirlar.
        metodun sol tarafina key, sag tarafina value denir.;Map ler key value kullanilir.

        Map lerde key kismi tekrarsiz data icerir(unique)
        value kismi unique olmak zorunda degildir.
        key lerde null tekrarsiz olarak kullanilir.
        value kisminda null kullanmak munkundur.
        Null bir cok kere kullanilabilir.
        coklu datalari depolarken ,bir tane deger depoluyorduk. Oysa burada iki deger var.(key,value)
        bu iki deger depolamaya entry set demisler
        maps hakkinda konusurken eleman demeyin,map in 2 tane entry var deriz

 */

    public static void main(String[] args) {


        HashMap<String, Integer> studentsAges = new HashMap<>();

        studentsAges.put("Ali", 13);
        studentsAges.put("Tom", 21);
        studentsAges.put("Brad", 12);
        studentsAges.put("Ajda", 76);
        studentsAges.put("Cuneyt", 75);
        studentsAges.put("Ali", 88);
        studentsAges.put(null, 55);
        studentsAges.put(null, 66);
        studentsAges.put("Ayhan Isik", null);
        studentsAges.put("Sadri Alisik", null);


        System.out.println(studentsAges); //   {Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=88} alinin degerini guncelledi
        // {null=66, Tom=21, Ajda=76, Brad=12, Cuneyt=75, Ali=88}
        // {null=66, Ayhan Isik=null, Tom=21, SAdri Bey=null, Ajda=76, Brad=12, Cuneyt=75, Ali=88}

        // 1-  Map ten sadece key ler nasil alinir?

        // bu keyleri sana Set in icine koyup verecegim. o zaman bir set data tipi olusturmam lazim. string yada int...
        Set<String> keys = studentsAges.keySet();

        System.out.println(keys); //  [null, Ayhan Isik, Tom, SAdri Bey, Ajda, Brad, Cuneyt, Ali]

        //  2-  Map ten sadece value lar nasil alinir?

        //  studentsAges.values();   collection data tipinde verir. onun icin bir collection dan Integer tipi olusturmak lazim

        Collection<Integer> values = studentsAges.values(); // Values aldigimizda en son guncellenmis degeri verir.
        System.out.println(values); //   [66, null, 21, null, 76, 12, 75, 88]

        // key leri SET olarak alacagiz  Value lari Collection olarak alacagiz.

        // Belli bir key ye ait valuee yu nasil alacagiz?
        // studentsAges.get("xxx"); kullanilir ve bunu bir Integer in icine koyariz.

        Integer cuneytAge = studentsAges.get("Cuneyt");
        System.out.println(cuneytAge); // 75


        //Ex 1  tum integer yaslarin ortalamasini hesaplayan kodu yaziniz

        Collection<Integer> valueall = studentsAges.values();


        System.out.println(valueall);   //  [66, null, 21, null, 76, 12, 75, 88]


        Integer sum = 0;  // 66
        int counter = 0;  // 1

        for (Integer w : valueall) {

            //66 null degildir. bu kod calisacak.
            if (w != null) {           // hey java toplama islemini null degilse yap demek.

                 //66 ==> toplam
                sum = sum + w;
                //    0 + 66 = 66

                counter++;

            }
        }

        // Ex 2 : A ile baslamayan isimlerin icerdigi toplam karakter sayisini bulan kodu yaziniz.

        Set<String> names = studentsAges.keySet();
        // for each loop kullanmak lazim

        int sum1 =0;
        for (String w : names){

            if (w!= null && !w.startsWith("A")) {
                sum1 = sum1 + w.length();


            }
        }

        System.out.println(sum1); // 25

   // iki tane remove metodu var :

        // studentsAges.remove("Ajda", 76);
        boolean result= studentsAges.remove("Ajda", 76);

        System.out.println(result); // true ==> yani silmis Ajdayi

        // key ' si Ajda ve Value si 76 olan Entry Set i siler ve size boolean return eder.


        Integer result1 = studentsAges.remove(null); // Bana kontrol etme imkani veriyor null'in degeri ni Integer verip gostererek.
        System.out.println(result1);  // 66

        // Key varsa  Value yu ver, key yoksa bir mesaj ver

        // studentsAges.getOrDefault("Brad",0);
        Integer result2 = studentsAges.getOrDefault("Brad",0);

        System.out.println(result2);  // 12  varsa var olan degeri verir

        Integer result3 = studentsAges.getOrDefault("Brandon",0);
        System.out.println(result3); // 0 verdi yani Brandon yok demektir.

        // Key yoksa MAp e ekleme yap, KEy varsa MAPe herhangi bir ekleme yapma

        Integer result4 = studentsAges.putIfAbsent("Ayhan Isik", 100) ;
        System.out.println(result4); // null ( Ayhan Isik in degerini biz vermistik.null di.

        // Value null ise ekleme yapar, value null degilse ekleme yapmaz.
        // Key yoksa ekleme yapar
        Integer result5 = studentsAges.putIfAbsent("Kayahan Isik", 100) ;
        System.out.println(result5);  // null
        System.out.println(studentsAges); //  {Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Kayahan Isik=100, Ali=88}


        // replace() metodu, value lari degistirmek icin kullanilir
        studentsAges.replace("Kayahan Isik", 49);

        System.out.println(studentsAges); // {Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Kayahan Isik=49, Ali=88}
        //Value lari update etmek icin replace kullanilir.


        // Eger Kayahanin yasi 49 ise onu dogru olan 53 e degistir.

        studentsAges.replace("Kayahan Isik", 49,53);

        System.out.println(studentsAges); // {Ayhan Isik=100, Sadri Alisik=null, Tom=21, Brad=12, Cuneyt=75, Kayahan Isik=49, Ali=88}
        // burada replace metodu hem key' i hem de value yu kontrol ettikten sonra degistirdi. Eger eski valueu su 49 olmasaydi degistirmezdi

        // Ex. 3 Map teki her bir Entry i ekrana farkli bir satirda olacak sekilde yazdiriniz.

        studentsAges.entrySet(); // bunu for each loop ta kullanacagiz

        Set<Map.Entry<String,Integer>> entries = studentsAges.entrySet();

        for(Map.Entry<String,Integer> w: entries) {   // Loop lar collectionlarda kullanilir, map te kullanilmaz. o yuzden boyl yapmak zorundayiz.

           //  entrySet in return type i = Map.Entry<String,Integer  oldugu icin  loop un icine  metod tipi olarak onu koyduk.
            // Map teki elemanlari Setin icine koyabildigimiz icin Loop ta kullanabiliriz, aksi takdirde kullanilmaz.
      // data tipi = Map.Entry<String,Integer

            System.out.println(w);
            /*
            Ayhan Isik=100
            Sadri Alisik=null
            Tom=21
            Brad=12
            Cuneyt=75
            Kayahan Isik=53
            Ali=88
             */


        }


    }
}


