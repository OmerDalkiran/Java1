package practiceAdvanced.practice09;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q06_KelimeleriSay {

     /*

 Bir String içerisindeki kelimelerin kaç kez tekrar ettiğini bulan bir method yazınız.

 input: "      Ali,    okula  ...,,,    geldi    ve         Ayse    de    okula    geldi."
 output: Ali = 1, okula = 2, geldi = 2, ve = 1, Ayse= 1, de = 1

*/

    public static void main(String[] args) {
        String str = "   Ali,   okula   ....,,,   geldi    ve Ayse    de okula    geldi.    ";
        kelimeleriSay(str);

    }

    public static void kelimeleriSay(String str){
        String yeniString = str.replaceAll("\\p{Punct}","").replaceAll("\\s+"," ").trim();
        System.out.println("str = " + yeniString);

        String[] arr =yeniString.split(" ");
        System.out.println(Arrays.toString(arr));//[Ali, okula, geldi, ve, Ayse, de, okula, geldi]


        Map<String,Integer> map = new HashMap<>();

        for(String w:arr){

            if(!map.containsKey(w)){

                map.put(w,1);

            }else {
                map.put(w,map.get(w)+1);
            }
        }
        System.out.println("map = " + map);  // str = Ali okula geldi ve Ayse de okula geldi
                                            // [Ali, okula, geldi, ve, Ayse, de, okula, geldi]
                                            //  map = {okula=2, de=1, Ayse=1, geldi=2, Ali=1, ve=1}

    }
}