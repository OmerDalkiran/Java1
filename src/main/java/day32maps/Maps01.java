package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps01 {
    public static void main(String[] args) {

        // size verilen bir cumledeki her kelimenin kac kere kullanildigini gosteren code u yaziniz.
        // I like to move, it move it." ==>  I = 1, like=1, to = 1 , move=2, it=2
        // yani   key, value key value olunca Map i hatirlamak lazim.

        // ilk hamle noktalama isaretlerini silmek olmali. cunku it, ile it. ayni sey degildir

        String str = "I like to move, it move it.";

        str = str.replaceAll("\\p{Punct}", "");

        System.out.println(str); //  I like to move it move it

        // Kelimeleri almak icin split() kullanmak lazim

        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [I, like, to, move, it, move, it]

        HashMap<String, Integer> gorunum = new HashMap<>();


        for (String w : kelimeler) {


            Integer gorunumSayisi = gorunum.get(w);

            if(gorunumSayisi==null){
                gorunum.put(w, 1);
            }else{
                gorunum.put(w, gorunumSayisi+1);
            }
        }
        System.out.println(gorunum);// { I=1, like=1, to=1, move=2, it=2 }
    }
}
