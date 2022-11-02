package practiceAdvanced.practice01;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_Variable_FahrenheitToCelsius {

    public static void main(String[] args) {

// Fahrenheit degerini celciusa cavir
        // formul c=(f-32)*5/9


        Scanner input = new Scanner(System.in);

        System.out.println(" Bir Fahrenheit degeri giriniz");

        double f =input.nextDouble();


             double c =  (f-32)*5/9;

             System.out.println(c);

        NumberFormat numberFormat= new DecimalFormat(".##"); // (virgulden sonraki  hane sayisini verir)

        String formattedC = numberFormat.format(c);

        System.out.println(formattedC+1);  // Concatination yapti. sadecesonuna biryazdi
        // tekrar sayilsal degere cevirmek icin    double i Double cevirelim
        double doubleC = Double.valueOf(formattedC);  // yapiyoruz sonra bir containera koyuyoruz, yapiyoruz bir konteynera koyuyoruz.
        System.out.println( "doubleC = " + (doubleC+1)); // ama burada sonuna islem olarak bir ekledi.



    }
}
