package day07_stringmanipulations;

import java.util.Scanner;

public class C05_StringManipulationsIsEmpty {

    public static void main(String[] args) {

        //
        String str1 = "Hi";

        System.out.println(str1.isEmpty());  // false

        String str2 = "";
        System.out.println(str2.isEmpty());  // true


        String str3 = " ";
        System.out.println(str3.isEmpty());  // false


// Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.
        String str4 = "Kelime bosluk iceriyormu";

        if (str4.isEmpty()) {
            System.out.println("bosluk var");

        } else
            System.out.println("Boşluk yok");


    }
}
