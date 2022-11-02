package assignments.ArrayExercise;

import java.util.Arrays;
import java.util.Comparator;

public class Array10harftenBuyukKelimeler {
    public static void main(String[] args) {


        //Example 3: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz
        //           "Java kolaydir calisana, ne kolay ki calismayana." ==> calismayana
        String sentence = "Java kolaydir calisana, ne kolay ki calismayana.";
        System.out.println(sentence);

        sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println(sentence);

        String words[] = sentence.split(" ");

        Arrays.sort(words, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(words));//[ne, ki, Java, kolay, kolaydir, calisana, calismayana]
        System.out.println(words[words.length-1]);//calismayana



        //Example 3: Size verilen bir cumledeki 6 harften uzun kelimeleri bulan kodu yaziniz
        //           "Java kolaydir calisana, ne kolay ki calismayana." ==> calismayana

        System.out.println( );

        String sentence1 ="Icerisindeki alti harften buyuk kelimeleri bulan kodu yaziyorum";
        System.out.println(sentence1);
        sentence1 = sentence1.replaceAll("\\p{Punct}", "");
        String words1[] = sentence1.split(" ");

        Arrays.sort(words1, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words1));

        String word2[] = new String[words1.length];

        for(int i=0; i<words1.length; i++){
          if(words1[i].length()>6) {


              word2[i]=words1[i];

          }


      }
        System.out.println(Arrays.toString(word2));

    }

}
