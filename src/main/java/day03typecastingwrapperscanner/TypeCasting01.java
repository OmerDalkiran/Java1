package day03typecastingwrapperscanner;

public class TypeCasting01 {
    // Type CAsting : Bir numeric data type' ini diger numeric data type'ine cevirmek demektir.
    // byte < short < int < long < float < double
    // kücük data tipini büyüge cevirmeye Auto widening denir.  otomatik genisletme yani
    // Büyügü kücüge cevirmeye  de Explicit narrowing denir. acikca daraltma yani


    public static void main(String[] args) {

        byte age = 23;

        int newAge = age;
        //Yani Auto wideninigte hangi isim olursa olsun önüne new yazip kendisine esitleyecegiz

        long population = 1234;
        int newPopulation = (int)population;
        // Java ya diyoruz ki (int) e cevir diye emir veriyoruz yani.

        // Example 1 : short' u double ceviren kodu yaziniz

        short distance = 1000;
                double newDistance = distance;

                // Example 2 : floati byte yapan

        float earthPopulation = 12.99f;
        byte newEarthPopulation = (byte)earthPopulation;

        System.out.println(earthPopulation); // Java ondalik kismini siler.

        int number = 515;
                byte newNumber = (byte)number;

        System.out.println(newNumber); // 3 Java 515i 256 ya böldü kalani return etti. -128 +127 arasinda 256 sayi var

        int num = 510;
        byte newNum = (byte)num;

        System.out.println(newNum);
        // modüler aritmetikte 254 = -2 (mod256)
    }
}
