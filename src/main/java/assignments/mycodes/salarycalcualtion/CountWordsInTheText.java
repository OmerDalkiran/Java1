package assignments.mycodes.salarycalcualtion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountWordsInTheText {
    public static void main(String[] args) {
        /*
        Plese count the repeating words in the text given:
        "   Gel gel diye diye dilimde tuy bitti, gel artik  ! "
        Output : gel=3, diye=2, dilimde=1, tuy=1, bitti=1, artik=1
        Dikkat : ilk once noktalama isaretleri, sayilar vs den kurtulmamiz lazim, sonra split yapip array durumuna sokmamiz lazim.
        ondan sonra hashmap olarak ( word , integer ) olacak sekilde koyup onu da for loop la integer olarak kelimeleri saydirmamiz lazim.
         */
        String str = "   Gel gel diye diye dilimde tuy bitti, gel artik  ! ";
        String newStr = str.replaceAll("\\p{Punct}", "").replaceAll("\\s+", " ").toLowerCase().trim();
        System.out.println(newStr);                  // Gel gel diye diye dilimde tuy bitti gel artik
        String arr[] = newStr.split(" ");

        System.out.println(Arrays.toString(arr));  //  [Gel, gel, diye, diye, dilimde, tuy, bitti, gel, artik]

        Map<String, Integer> map = new HashMap<>();
        for (String w : arr) {
            if( !map.containsKey(w)){
                map.put(w,1);
            }else {
                map.put(w,map.get(w)+1);
            }
        }
        System.out.println(map); //     {dilimde=1, bitti=1, tuy=1, artik=1, diye=2, gel=3}
    }
}
