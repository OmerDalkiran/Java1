package practiceAdvanced.practice02;

import java.util.Arrays;

public class Q03_EuroDolarToplami {
    public static void main(String[] args) {

        /*
      Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamların bulan bir kod yazınız.
      Ornek:
       String str = "$1 $12 €34 €56 $45 €78";
        dolarToplami: 58
        euroToplami: 168
       */

        String str = "$1 $12 €34 €56 $45 €78";
        String[] arr = str.split(" ");

        System.out.println(Arrays.toString(arr));

        int dollarTolami= 0;
        int euroToplami=0;

        for(String w : arr){

            if(w.contains("$")){
                dollarTolami+=Integer.parseInt(w.replace("$",""));

            }else {
                euroToplami+=Integer.parseInt(w.replace("€",""));
            }
        }

        System.out.println("dollar toplami = " +dollarTolami);
        System.out.println("Euro toplami = " +euroToplami);


    }
}
