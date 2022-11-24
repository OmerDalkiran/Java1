package assignments.ArrayExercise;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RepeatedLetters {
    /*
    in a given word, find out the repeated words and how many times they have been repeated.
    Ex " Apple " Output =  A=1, p=2, l=1, e=1
     */


    public static void main(String[] args) {

        String str = "Apple";
        String newStr[] = str.split("");
        System.out.println(Arrays.toString(newStr));  // ==>  [A, p, p, l, e]

        Map<String,Integer> map = new HashMap<>();

        for (String w: newStr){

            if(!map.containsKey(w)) {
                map.put(w, 1);
            }else {
                map.put(w,map.get(w)+1);
            }
        }
        System.out.println(map); // {p=2, A=1, e=1, l=1}
    }
}
