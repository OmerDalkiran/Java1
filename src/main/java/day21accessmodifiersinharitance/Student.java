package day21accessmodifiersinharitance;

public class Student {

        /*
        Access Modifiers :
        1 Public      Herkes kullanabilir
        2 Protected   Korumali
        3 Default     Sadece bir grup kullanir.  Bir firmanin calisanlarina ait mesela
        4 Private     Kim olursa olsun benim ehliyetimi kullanamaz gibi

        Access modifierlari genisten dara dogru sayiniz.
        public> protected > default > private

        Aciklayiniz.
        1- Public olanlar her klasstan kullanilabilir. ve asagidaki notlar...

        2- Protected ile default un farkini soyleyiniz.
        Protected olana baska bir package ten kullanilamaz ancak
         "child class" icinden kullanilabilir. ama  default access modifier basina yazilmaz.
          default olanlar baska package ten kullanilamazlar..

          Note : class lar icin public ve default kullanilabilir fakat protected ve private kullanilamaz.


         */

    public    String stdName = "Tom Hanks";

    protected String address = "Miami";  // protected olanlar baska bir package ten kullanilamaz ancak
                                   // "child class" icinden kullanilabilir.

              String email   = "th@gmail.com";  // default access modifier basina yazilmaz.
            // default olanlar baska package ten kullanilamazlar.. diger adi package private tir. dikkat et interview da

    private  String stdId    = "2020651704"; // 2020 ylinda kodu 65 olan univ. matema bolumune 4.olarak kaydolmus.

    // Private sadece bu classtan ulasilabilir. digerleri ne ulasilabilinir.

    }

