package assignments.ArrayExercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NumberOfSameLettersInSentence {
    public static void main(String[] args) {
        /*
        Frind out the number of same letters in a sentence.
        Ex: I go to school1234.
        OutPut : i=1, g=1,o=4, t=1,s=1,c=1,h=1,l=1
         */

     String str = "I go to school. ";
             String newStr = str.replaceAll("\\p{Punct}"," ");

        String arr = newStr.replaceAll("\\s+","");
        System.out.println(arr); // Igotoschool
        String [] brr = arr.split("");
        System.out.println(Arrays.toString(brr)); // [I, g, o, t, o, s, c, h, o, o, l]

        Map<String,Integer> map =new HashMap<>();

        for(String w: brr){
            if(!map.containsKey(w)) {

                map.put(w,1);
            }else {
                map.put(w,map.get(w)+1);
            }
        }
        System.out.println(map);
    }
}

