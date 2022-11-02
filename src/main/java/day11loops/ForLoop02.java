package day11loops;

public class ForLoop02 {

    public static void main(String[] args) {


        // Bir Stringteki "m" karakteri haric tum karakteri yazdiriniz.
        // Andromeda ==> Androeda  javaya ilk karaktere ba m degilse yazdir. ikinci karaktere bak m degilse yazdir.
        // 3 karaktere bak vs m degilse yazdir


        //2. Yol:
        String str = "madam";
        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);
            if (c == 'm') {
                continue;//Bosveeer
            }
            System.out.print(c);
        }

        // 1 den 100 e kadar tum sayilari  6 ile bolunenler haric tum sayilari ekrana yazdir


        for (int i = 1; i < 101; i++) {


            if (i % 6 == 0) {   // eger sayi 6ya tam bolunuyorsa gec onu demek.

                continue;
            }
            System.out.print(i + "  ");
        }
        System.out.println();

        // Ex. 3 size verilen bir Stringteki M den onceki karakterleri yazdiriniz.
        //           Luxemburg => Luxe  olacak yani


        String s = "Luxemburg";
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == 'm') {
                break;
            }
            System.out.print(c);
        }



            for (int i = 1; i < 3; i++) {

            System.out.println("Week: " + i);

            for (int k = 1; k < 8; k++) {

            System.out.println("Day: " + k);

            }
        }

    }
}