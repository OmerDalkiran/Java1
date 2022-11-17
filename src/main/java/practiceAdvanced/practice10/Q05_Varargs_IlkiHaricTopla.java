package practiceAdvanced.practice10;

public class Q05_Varargs_IlkiHaricTopla {

    /*
Parametrelerinin ilki hariç  karakter sayılarını toplayan ve bu toplamı birinci
parametrenin karakter sayısıyla çarpan bir metod yazınız. (indeks ve if statement kullanmayınız)
   */

    public static void main(String[] args) {

        myMethod("Ali", "Veli","Sally", "Holly");  // cevap 3*14 = 42 olmali


    }
    public static void myMethod  (String a, String ... b){  // ucu acik oldugu icin Varargs kullaniyoruz cunku parametre sayisi belli degil.


        int toplam=0;
        for (String w : b){
            toplam+= w.length();
        }
        int sonuc = toplam*a.length();

        System.out.println("sonuc= "+ sonuc);   // sonuc= 42
    }
}
