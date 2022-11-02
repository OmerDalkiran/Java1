package assignments.Loops;

import java.util.Scanner;

public class LoopTekrar1 {
    public static void main(String[] args) {
        // Java Stringini J*a*v*a Stringine donusturen kodu yaziniz
        // Stringler index kullanir. Onun icin i' miz 0 dan baslar. burada i indexi temsil ediyor.

        String str = "Java";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "***"); // J***a***v***a***  Eger tek yildiz * kullanirsaniz tek yildizli *'li yapar
        }
        System.out.println();
    }
}