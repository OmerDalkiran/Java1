package practiceAdvanced.practice10;

import java.util.Scanner;

public class Q08_EnglishThreeDigitNumbersReading {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a three-digit-number");

        int number=input.nextInt();

        int ones=number%10;
        int tens=(number/10)%10;
        int hundreds =number/100;

        if (number<0 || number>999|| hundreds==0){
            System.out.println("Please enter a positive three digit number between 99 and 1000");
        }
        if(number>0 && number<100){
            System.out.println("Your number is not a three digit number. It is just : ");
        }
            switch (hundreds){
                case 1:     System.out.print("One hundred'n ");   break;
                case 2:     System.out.print("Two hundred'n ");   break;
                case 3:     System.out.print("Three hundred'n "); break;
                case 4:     System.out.print("Four hundred'n ");  break;
                case 5:     System.out.print("Five hundred'n ");  break;
                case 6:     System.out.print("Six hundred'n ");   break;
                case 7:     System.out.print("Seven hundred'n "); break;
                case 8:     System.out.print("Eight hundred'n "); break;
                case 9:     System.out.print("Nine hundred'n ");  break;

            }

            if (tens==1){
                switch (ones){
                    case 0:     System.out.print("ten");       break;
                    case 1:     System.out.print("eleven");    break;
                    case 2:     System.out.print("twelve");    break;
                    case 3:     System.out.print("thirteen");  break;
                    case 4:     System.out.print("fourteen");  break;
                    case 5:     System.out.print("fifteen");   break;
                    case 6:     System.out.print("sixteen");   break;
                    case 7:     System.out.print("seventeen"); break;
                    case 8:     System.out.print("eighteen");  break;
                    case 9:     System.out.print("nineteen");  break;
                }
            } else {
                switch (tens){
                    case 2:     System.out.print("twenty");  break;
                    case 3:     System.out.print("thirty");  break;
                    case 4:     System.out.print("forty");   break;
                    case 5:     System.out.print("fifty");   break;
                    case 6:     System.out.print("sixty");   break;
                    case 7:     System.out.print("seventy"); break;
                    case 8:     System.out.print("eightty"); break;
                    case 9:     System.out.print("ninety");  break;
                }
            }
            switch (ones){
                case 1:     System.out.print(" one");   break;
                case 2:     System.out.print(" two");   break;
                case 3:     System.out.print(" three"); break;
                case 4:     System.out.print(" four");  break;
                case 5:     System.out.print(" five");  break;
                case 6:     System.out.print(" six");   break;
                case 7:     System.out.print(" seven"); break;
                case 8:     System.out.print(" eight"); break;
                case 9:     System.out.print(" nine");  break;
            }
        }
    }
