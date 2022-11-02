package assignments.Loops.DoWhileLoops;

import java.util.Scanner;

public class DoWhileDogruYanlisPassword {

    public static void main(String[] args) {

         // Kullanicidan passwordunu alip , passwordun AliCan olup olmadigini kontrol eden, password dogru ise ekrana "Dogru,
         // password yanlis ise ekrana " Yanlis ve "passwordunuzu giriniz yazdiran program code'u.


        Scanner input = new Scanner(System.in);
        String passwNew = "";

        do {
            System.out.println("Passwordunuzu giriniz");
            passwNew=input.nextLine();
            if(passwNew.equals("AliCan")) {
                System.out.println("Dogru");
            }else {
                System.out.println("Yanlis");
            }
        }while (!(passwNew.equals("AliCan")));

        System.out.println();


        // Ayni sorunun farkli bir cozumu

        String passwNew1="";
        System.out.println("Lutfen Passwordunuzu giriniz");
        passwNew1=input.nextLine();
        do{
            System.out.println("Lutfen Passwordunuzu bir daha giriniz");
            passwNew1=input.nextLine();

            if(!(passwNew1.equals("AliCAn"))) {
                System.out.println("Yanlis");
            }
        }while (!(passwNew1.equals("AliCan")));
            System.out.println("Dogru");
        }
   }

