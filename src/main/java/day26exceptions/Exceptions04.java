package day26exceptions;

public class Exceptions04 {

    public static void main(String[] args) {

        yasiniGir(-25);  // ama ya -25 girerse



    }

    // Yasi ekrana yazdiran bir method olusturunuz.



    public static void yasiniGir (int age){

//        if(age>0){
//            System.out.println(age);
//        }else {
//            System.out.println("Yas negatif olmaz"); Boyle genelde cozmeyiz.

        if(age<0){
            throw new IllegalArgumentException("Yas negaif olamaz");  // 25 inci satirdan sonraki kodlar calismaz
                                                         // App'in trafik isiklaridir bunlar.
            // yas negatifse, app duracak, exception atilacak kardesim.
//            Exception in thread "main" java.lang.IllegalArgumentException: Yas negaif olamaz
//            at day26exceptions.Exceptions04.yasiniGir(Exceptions04.java:25)
//            at day26exceptions.Exceptions04.main(Exceptions04.java:7)

        }
        System.out.println(age);



    }
}
