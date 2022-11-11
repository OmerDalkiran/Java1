package assignments.abdullahla;

import java.util.Arrays;

public class Q01 {

    // Ex. 1 String’ lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa, o öğelerin baş harflerini alınız.
    // Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JMJ

    public static void main(String[] args) {
        String[] str = {"Kemal", "Jonathan", "Mark", "Jackson", "Ali"};
        String kelimeler = "";
        for (String w : str) {
            if (w.endsWith("n") || w.endsWith("k")) {
                kelimeler = kelimeler + w.charAt(0);
            }
        }
        System.out.println(kelimeler);  //  JMJ

        //Ex. String’ lerden oluşan bir
        // i) arraydeki öğeler eger  's' veya 'r' harflerini iceriyorsa o ogeleri yazdir.
        // ii) o ogelerin son harflerini yazdir. Örnek: { “Mehmet”, “Hasan”, “Mark”, “Ahmet”, “Ali” } ==> Çıktı HASAN , MARK

        String[] str1 = {"mehmet", "hasan", "Mark", "Ahmet"};
        String yyy = "";
        for (String w : str1) {
            if (w.contains("s") || w.contains("r")) {
                System.out.print(w.toUpperCase() + " , ");  // hasan , Mark
                yyy = yyy + w.charAt(w.length() - 1);


                String firstElement = str1[0];
                System.out.println(firstElement); // mehmet

                String lastElement = str1[str1.length - 1]; // Ahmet
                System.out.println(lastElement);


            }


        }
        System.out.println(yyy);  // nk
        System.out.println();

        //  Ex. String’ lerden oluşan bir arrayde öğeler 't' veya 'n' ile bitiyorsa, o öğelerin baş harflerini alınız.
        // Örnek: { “Mehmet”, “Hasan”, “Mark”, “Ahmet”, “Ali” } ==> Çıktı TNT
        String[] str2 = {"mehmet", "hasan", "Mark", "Ahmet"};

        String yyyy = "";

        for (String w : str2) {

            if (w.contains("s") || w.contains("r")) {
                yyyy = yyyy + w.charAt(w.length() - 1);
            }
        }


        String s = "Apex-Love";

        String b = "";


        for (int i = 0; i < s.length(); i++) {

            String c = s.substring(i, i + 1);
            b = b + c;
            System.out.println(b); //
/*

Ap
Ape
Apex
Apex-
Apex-L
Apex-Lo
Apex-Lov
Apex-Love
 */
        }


        String[] st = {"mehmet", "hasan", "Mark", "Ahmet"};
        String sum=" ";
        for (String w : st) {
            sum=sum+w;

                System.out.print(w.toUpperCase() + " "); // MEHMET HASAN MARK AHMET
            System.out.println();
            }
        String[] strr = {"mehmet", "hasan", "Mark", "Ahmet"};
        int sum1=0;
        for (String j : strr) {

            sum1=sum1+ j.length();

        }
        System.out.println(sum1+" "); //20 ( 6+5+4+5)

    }
}
