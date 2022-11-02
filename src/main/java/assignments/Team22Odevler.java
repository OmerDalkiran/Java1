package assignments;

import java.util.Scanner;

public class Team22Odevler {

    // Nested Ternary Switch  Pg 42 q.7
    public static void main(String[] args) {


        int i = 2;
        int j = 3;
        switch (i) {                // Switsch' in icinde i; int i de 2 oldugu icin ikinci case den basliyor.
            case 2:                // ikinci case de j yerine 3 yaziyoruz ve 6 ilave ediyoruz=9 oluyor.
                j += 6;             // Sonra break olmadigi icin bir alttaki case e gecer ve +1 alir 10 olur.
            case 4:                // Sonra yine break olmadigi icin bir alta gecer ve +4 alir, 14 olur.
                j += 1;             // Sonra break olmadigi icin yine bir alta gecer ve 2 alir, 16 olur.
            case 1:
                j += 4;
            default:
                j += 2;
        }
        System.out.println("j = " + j);


        int variable = 1;
        switch (variable){
            case 1 :
                System.out.print("P");
            case 2 :
            case 3 :
                System.out.print("Q");
                break;
            case 4 :
                System.out.print("R");
            default :
                System.out.print("S");


        }
        System.out.println();

        //String Methods pg.48 q.7
        // String str1 = "ali";
        //String str2 = "Ali";
        //Yukarıda verilen String'lere göre aşağıdakilerden hangileri yanlıştır?

        String str1 = "ali";
        String str2 = "Ali";

        System.out.println(str1.equalsIgnoreCase(str2));   // true
        System.out.println(str1==str1);                    // true
        System.out.println(str1.equals(str2));             // False
        System.out.println((str1+str2).equals(str2+str1)); //false

    }

}
