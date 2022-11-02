package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        // Ex. 1 Bir  Integer ArrayListteki 7 haric tum elemanlari 2 artiriniz.

        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for(Integer w : ages){

            if(w==7){
                continue;  // 7 yi gorursen es gec dedim.
            }
                           //  w=w+2;  // listteki elemanlari degistimrke icin set kullanilir. boyle update edilemezler
                            // w bu elemanlari , integerlari degistirmek icindir.
            ages.set(ages.indexOf(w),w+2 ); // ages listine git w nun indexini bul, onu da iki artir diyorum.
        }
        System.out.println(ages);   // [14, 7, 23, 80, 11]

        // Ex2 Size verilen Array listte 8 ve 8 den onceki tum elemanlari iki katina cikariniz.
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(7);
        nums.add(8);
        nums.add(21);
        nums.add(9);


        for (Integer w : nums) {

            nums.set(nums.indexOf(w), w*2);    // inclusive  dahil demek 8 dahil oldugu icin. Bu kodu kontrolun oncesine koymak gerekir.
            if( w==8){
                break;
            }
            // nums.set(nums.indexOf(w), w*2);  // eger loop u kiran sayiyi udate etmemiz gerekirse loopun ustune koyun.
                                             // eger loopu kiran sayiyi update etmemiz gerekmezse loopun altina koyun.
        }
        System.out.println(nums);    // [24, 14, 16, 21, 9]  siralamada soldan 8 den onceklerin degerleri iki katina cikti
    }
}
