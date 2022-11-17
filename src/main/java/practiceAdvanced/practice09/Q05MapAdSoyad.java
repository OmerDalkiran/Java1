package practiceAdvanced.practice09;

import java.util.HashMap;
import java.util.Map;

public class Q05MapAdSoyad {
/*
      İki farklı Array'de aynı indekste barındırılan ad ve soyadları örnekteki gibi yazdıran bir kod yazınız.


          input : {"John", "Mark", "Ali"}; {"Doe", "Twain", "Can"};

          output : {John=Doe, Mark=Twain, Ali=Can};
       */

    public static void main(String[] args) {

        String arrName [] = {"John", "Mark", "Ali"};
        String brrSurname [] = {"Doe", "Twain", "Can"};

        Map<String,String> mapNameSurname=new HashMap<String,String>();

        for (int i=0; i<arrName.length; i++){

            mapNameSurname.put(arrName[i],brrSurname[i]);

        }

        System.out.println(mapNameSurname);  // {John=Doe, Mark=Twain, Ali=Can}
    }

}
