package day18arraylistspassbyvalue;

public class PostPreIncrementDecrement {

    public static void main(String[] args) {

        // Post Increment
        int a = 5 ;
        int b = a++;   // Java anlamli bir cumle duydugunda hemen uygular .
                       // a nin degerini b nin icine hemen koyar , ama java artirma kismina gelmeden once cumlenin manasini anladi

        System.out.println(b); // 5
        System.out.println(a); // 6  java bu satir bittiginda a nin alti oldugunu anladi. ama a artmadan once b ye koydugu icin degeri 5 oluyor.
                                 // biz javanin nasil calistigini anlamaya calisiyoruz. int b=a kismi anlamli bir cumle java icin.

        //Pre Increment

        int c = 10;
        int d =++c;  // c nin artirilmis halini d nin icine koyar onun icin 11 goruruz.

        System.out.println(d); // 11
        System.out.println(c); // 11


        // Post Decrement
        int e = 20;
        int f = e--;  // Java soldan geliyor int f = e ; enin degeri olan 20 yi fnin icine koyar ve biz 20 goruruz.

        System.out.println(f); // 20
        System.out.println(e); // 19

       // Pre Decrement

        int h = 30;    //
        int i = --h;  //  integermis,

        System.out.println(h);  // 29
        System.out.println(i);  // 29


    }
}
