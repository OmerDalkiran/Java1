package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {

    public static void main(String[] args) {

        // Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz
        //            [2, 3, 12, 0,  0,  0]

        int original[] = { 0, 12, -3, 0 };
        int yeni[] = new int[original.length];

        int idx = 0;

        for(int i=0; i<original.length; i++){
            if(original[i] != 0){
                yeni[idx] = original[i];
                idx++;

            }
        }
        System.out.println(Arrays.toString(yeni));

        //Example 2: Bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz
        //           [ 2, 1, 2, -3, 2] ==> Kullanici 2'yi sordu ==> 2 elemani var ve 3 kere tekrarlandi
        //                             ==> Kullanici 6'yi sordu ==> 6 array'de yok
        int arr[] = {5, 1, 5, -3};
        int eleman = 7;
        int counter = 0;// "flag": Bazi durumlarin olup olmadigini kontrol etmek icin "flag" kullanilir.

        for(int w : arr){
            if(w==eleman){
                counter++;
            }
        }
        if(counter>0){
            System.out.println(eleman + " array'de " + counter + " defa var");
        }else{
            System.out.println(eleman + " array'de yok");
        }

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
    }
}