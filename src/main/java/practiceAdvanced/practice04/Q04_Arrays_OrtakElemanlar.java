package practiceAdvanced.practice04;

import java.util.ArrayList;
import java.util.List;

public class Q04_Arrays_OrtakElemanlar {

    /*
     * İki Array'de ortak bulunan elementleri yazdırınız.
     * (case sensitivity olmadan)

     * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}

     * Output : [brad,sofia,emily]        NESTE FOR LOOP yapilacak
     */
    public static void main(String[] args) {

        String [] arr = {"John,Brad,Angel,Sofia,Emily"};
        String [] brr = {"sofia,brad,grace,emily,hazel"};

        List <String>list= new ArrayList<>();


        for (String w:arr){
            for (String u:brr){
                if(w.equalsIgnoreCase(u)){
                    list.add(w);
                }
            }
        }
        System.out.println("Orta elementler:  "+list);

    }

}
