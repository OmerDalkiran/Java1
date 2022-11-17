package assignments.mycodes;

import java.util.Scanner;

public class GermanThreeDigitReading {

    public static void main(String[] args) {

                Scanner input= new Scanner(System.in);
                System.out.println("Bitte geben Sie eine dreistellige Zahl ein");

                int number=input.nextInt();

                int ones=number%10;
                int tens=(number/10)%10;
                int hundreds =number/100;

                if (number<0 || number>999|| hundreds==0){
                    System.out.println("Bitte geben Sie eine positive dreistellige Zahl zwischen 99 und 1000 ein.");
                }
                if(number>0 && number<100){
                    System.out.println("Ihre Nummer ist keine dreistellige Nummer. Es ist nur: ");
                }
                switch (hundreds){
                    case 1:     System.out.print("Einhunderd");   break;
                    case 2:     System.out.print("Zweihunderd");  break;
                    case 3:     System.out.print("Dreihunderd");  break;
                    case 4:     System.out.print("Vierhunderd");  break;
                    case 5:     System.out.print("Fünfhunderd");  break;
                    case 6:     System.out.print("Sixhunderd");   break;
                    case 7:     System.out.print("Sevenhunderd"); break;
                    case 8:     System.out.print("Eighthunderd"); break;
                    case 9:     System.out.print("Ninehunderd");  break;

                }

                if (tens==1){
                    switch (ones){
                        case 0:     System.out.print("zehn");      break;
                        case 1:     System.out.print("elf");       break;
                        case 2:     System.out.print("zwölf");     break;
                        case 3:     System.out.print("dreizehn");  break;
                        case 4:     System.out.print("vierzehn");  break;
                        case 5:     System.out.print("fünfzehn");  break;
                        case 6:     System.out.print("sechzehn");  break;
                        case 7:     System.out.print("siebzehn");  break;
                        case 8:     System.out.print("achtzehn");  break;
                        case 9:     System.out.print("neunzehn");  break;
                    }
                } else {
                    switch (ones){
                        case 1:     System.out.print("einund");    break;
                        case 2:     System.out.print("zweiund");   break;
                        case 3:     System.out.print("dreiund");   break;
                        case 4:     System.out.print("vierund");   break;
                        case 5:     System.out.print("fünfund");   break;
                        case 6:     System.out.print("sechsund");  break;
                        case 7:     System.out.print("siebenund"); break;
                        case 8:     System.out.print("achtund");   break;
                        case 9:     System.out.print("neunund");   break;

                    }
                    switch (tens){
                        case 2:     System.out.print("zwanzig");  break;
                        case 3:     System.out.print("dreißig");  break;
                        case 4:     System.out.print("vierzig");  break;
                        case 5:     System.out.print("fünfzig");  break;
                        case 6:     System.out.print("sechzig");  break;
                        case 7:     System.out.print("siebzig");  break;
                        case 8:     System.out.print("achtzig");  break;
                        case 9:     System.out.print("neunzig");  break;
                }

                }
            }
        }


