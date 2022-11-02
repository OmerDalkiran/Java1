package day17arraylists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {


        // Ex 1 Bir listedeki elemanlardan birbirine en yakin olan iki elemani bulunuz.
        //   [12,19,15,30,21]   ===> 19 ve 21 en yakin  ekrana bunu yazdirmamiz lazim

        List<Integer> a = new ArrayList();

        a.add(12);
        a.add(19);
        a.add(15);
        a.add(30);
        a.add(21);

    // once sort yapacagiz.
        Collections.sort(a);      // Listteki elemanlari kucukten buyuge dizebilmek icin Collections.sort(a); kullanilir

        System.out.println(a);  // [12, 15, 19, 21, 30]


        int minFark = Integer.MAX_VALUE;  // bunu ogren

        for(int i=1; i<a.size(); i++){

            minFark = Math.min(minFark, a.get(i)-a.get(i-1));

        }
        System.out.println(minFark);



        //EX:Size verilen ArrayListte 8 (inclusive-dahil) ve 8 den onceki tum elemanlari 2 katina cikariniz

            List<Integer> nums = new ArrayList<>();
            nums.add(1);
            nums.add(2);
            nums.add(3);
            nums.add(4);
            nums.add(5);
            nums.add(6);
            nums.add(7);
            nums.add(8);
            nums.add(9);
            nums.add(10);
            System.out.println("Listenin ilk hali "+nums);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
            //[2, 4, 6, 8, 10, 12, 17, 16, 9, 10]
            for (int i = 0; i <nums.size() ; i++) {
                if(nums.get(i) ==8){
                    nums.set(i,nums.get(i)*2);;//bu kod sadece ==8 icin calisiyor 8'i dahil edebilmek
                    // ve sonrasini loop disina atabilmek icin
                    break;
                }
                nums.set(i,nums.get(i)*2);//8'i gormediyse bu kod calissin
            }
            System.out.println("degistirilmis hali "+nums);//[2, 4, 6, 8, 10, 12, 14, 16, 9, 10]
        }
    }


