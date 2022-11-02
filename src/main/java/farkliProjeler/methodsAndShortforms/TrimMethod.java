package farkliProjeler.methodsAndShortforms;

import java.util.Scanner;

public class TrimMethod {

    public static void main(String[] args) {

       /* String s = "  Hello World!  ";
        System.out.println(s.trim()); //println("Hello World!");
        System.out.println(s.trimStart());
        System.out.println(s.trimEnd());


*/
        // Scanner input = new Scanner(System.in);
      //  System.out.println("Enter the string to be trimmed: ");
        // String s = input.nextLine();
        // System.out.println("The trimmed string is: " + s.trim());
      //  System.out.println("The trimmed string is: " + s.trimStart());  Acaba bu surumde mi yok ? normalde videolarda trimStart
      //  System.out.println("The trimmed string is: " + s.trimEnd()); ve trimEnd var.


      String text = "       Hello World!        ";  // The trim() Method
                                                     // trim() removes whitespace from both sides of a string:
       String result = text.trim();
        System.out.println(result);  // Hello World!
    }
}
