package day10stringmanipulation;

import java.util.SortedMap;

public class ForLoop01 {

    // Loop dongu demek. Bir seyi tekrar tekrar yapmak demek. Monoton bir hayat gibi.
    // JAvada da bir seyi tekrarli yapmak gerekirse loop yapariz.

    /// Ex 1 Ekrana 5000  kere hi yazdiriniz.

    public static void main(String[] args) {


        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi"); // code u tamir etmek te cok zor. code standartlarinda hos karsilanmaz. Tekrar bir kabaliktir.

        // Tekrarli isler icin loop kullaniriz.

        // 4 cesit loop vardir :  i) for loop
        //                        ii) while-loop
        //                        iii) do-while-loop
        //                        iv) for-each-loop   (bu en gelismis loop'tur
        //  4ude ayni isi yapar.

        // 1) for-loop
        // Ekrana 5 defa "Hi" yazdiriniz

        //for un ici 3e bolunur

        // Baslangic value    / loop hangi sartla calisacak     /  Increment(Artirma) Decrement(Azaltma hallerini yazacagiz
//        for(    int i=1       ;            i<6                    ;          i=i+1                          ) {
//            System.out.println("Hi");
//
//
//            // 1'den basladigi icin i=1 dendi.   i<6 denmesinin sebebi 5 defa yazdirilmasi istendigi icin.
//            // 1. bolum 1 defa ; 2. ve 3. kisimlar ise tekrarli calisir.
//
//
//            // Ex 3 :  4'ten 17 ye kadar tum tam sayilari ekrana yazdiran kodu yaziniz.
        //       4'ten baslayin dendigi icin i=4 oldu . 17 dendigi icin bir fazlasini aliyoruz. i<18
//
        for (int i = 4; i < 18; i = i + 1) {
            System.out.print(i + " ");
        }
        // eger sadece print olursa    ==> System.out.print(i+ " "); // olursa yan yana yazar.

        System.out.println();


        // 14 ten 5 e kadar tum sayilari yazdirin.

        for (int i = 14; i > 4; i--) {

            System.out.print(i + " ");
            {
                System.out.println();

            }
            // Ex 5

            for (int i2 = 14; i2 > 4; i2 = -1) {
                System.out.print(i2+" ");
            }


            // 2. yol
            //   for (int i = 14; i > 4; i--) ; {
            // if (i%2 == 0);
            {
                //     System.out.print(i + " ");{
            }


        }


        //  6  28 den 157 kadar tum tek sayilari ekrana yazdirin


    }
}
        //   for(int i = 28; i< 158;i++) {


    //    if (i % 2 != 0) {
         //   System.out.print(i + " ");
//
//
//        // Ex 7   Java Stringini J*a*v*a* Stringine ceviren kodu yaziniz
//
//        String str = "Java";
//
//        for (int i = 0; i < str.length(); i++) {       // uzunluktan kucuk oldugun zaman calis diyorum javaya
//            System.out.print(str.charAt(i) + "*");
//        }
//        {
//
//        } // Stringe git icinde 0 olan karakteri al diyor java. J* oldu (1 dogru ifadedir.
//        // Yine loop un icine gidiyirum i yerine 1 koy. indexi 1 olan karakteri al. o da a dir, a+* oda a* olur
//        // yani J*a* oldu. konkatineysin demek ayni satira birlestirilerek yazilir. sonra sarta bakiyorum.
//        // 2 <4 dogru.
//
//
//        //Ex 8 : Size verilen Stringte tekrarsiz karakterleri ekrana yazdiriniz
//        //  Mesela  " Hellooo Ali " ==> HeAi yazmasi lazim.
//
//        String s = "Hellooo Ali"; // niye loop lazim? alicam bakicam tekrarlimi degilmi diye bakicam, yazdiracagim.surekli olarak
//
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (s.indexOf(c) == s.lastIndexOf(c)) {
//                System.out.print(c);//He Ai






