package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02 {
    // Size verilen bir kelimedeki kullanilan harflein kacar kere kullanildigini gosteren code u yaziniz.
    // abbcaa ==> a=3, b=2, c=1

    public static void main(String[] args) {

        String kelime = "abbcaa";
        HashMap<String, Integer> gorunum = new HashMap<>();  // {             } == gorunum Map i

        String[] harfler = kelime.split("");
        System.out.println(Arrays.toString(harfler));  //  [a, b, b, c, a, a]

        for (String w : harfler) {

            Integer gorunumSayisi = gorunum.get(w); // harfleri tek tek alip w nun icine koyuyoruz.

            // Gorunum sayisi 0=0 ise burasi calisacak ve alta gecip put ile ilk harfi 1 degeriyle gorunum mapin icine yazacak.
            if (gorunumSayisi == null) {   //  gorunum.merge(w, 1, Integer::sum); olarak degistirilir

                gorunum.put(w, 1);  // w icindeki harfi 1 degeriyle gorunum mapine koyuyor.

            } else {
                gorunum.put(w, gorunumSayisi + 1);  // ayni key i kullaninca ustune yazar, 1 ==2 olur, 2==3 olur.

            }
        }

    }
}
