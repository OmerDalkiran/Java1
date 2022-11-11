package assignments.abdullahla;

import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please type code to ask user to enter the int elements and add elements into the list\n" +
                "        - Ask user to enter the elements to remove, then remove that element from list.\n" +
                "        - Ask user to enter the element to update, then update it.");



        int sayi2 = 5;
        //Sayi ikinin 10 ile 20 arasinda olmadigini true diyerek gosterebilirmisiniz.

        System.out.println(sayi2<10 && sayi2>20);


        String str1 = "Java ah java";
        System.out.println(str1.contains("J"));

        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi giriniz");
        String isim = scan.nextLine().toUpperCase();  // Omer Dalkiran  (sadece next olursa ilk ismi aliyor. Ama nextLine olursa isim ve soyismi beraber aliyor.
        System.out.println(isim);                     // OMER                            Omer Dalkiran ----> OMER DALKIRAN


        String str = "Ayhan Beyhan";
        System.out.println(str.replace("han", "ol"));


    }
}
