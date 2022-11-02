package day03typecastingwrapperscanner;

public class Wrapperclass01 {

    public static void main(String[] args) {

/* Note : Java primitive lere methodlar ekleyerek yeni bir yapi olusturdu , bu yapiya 'Wrapper Class' dedik
           Primitive      Wrapper
             byte   ===>  Byte
             short        Short
             int           Integer
             long          Long
             float         Float
             double        Double
             boolean       Boolean
             char          Character
              */

        byte primitiveByte = 12; // primitiveByte yazp . koyarsak hic method göremeyiz.
        Byte wrapperByte = 12; // primitiveByte dan sonra noktakoyarsak bir sürü metod gelir.

        // Example 1 byte data type'in en kücük ve en büyük degerlerini ekrana yazdiriniz

        System.out.println(Byte.MIN_VALUE);


        //  short, int , lon data tiplerinin en b ve en k deegerlerini yaudir

        //     Short.MIN_VALUE;

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);



        // " Primitiveler nasil Wrapperlara cevrilir?
        float f1 = 13.99F;
        Float wrapperF1 = f1;     // Autoboxing otomatik kutulama yapiliyor.

        // Wrapperlar primitivelere nasil cevrilir? Unboxing

        Character w1 = 's';
        char primitiveW1 = w1;  // Unboxing , autoboxing ing tersi. Java tarafindan otomatik yapilir ,
        // extra kod yazmaya gerek yok.

    }

}