package assignments.mycodes;

import java.util.Scanner;

public class UcBasamakliSayiOkuma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("PLease enter a three-digit number");

        int num = input.nextInt();

        int ones = num % 10;
        int tens = (num / 10) % 10;
        int hundreds = (num / 100);

        if (num < 100 || num >= 1000) {
            System.out.println("Please enter a valid three digit number ");

        }
        if(num<100 && num>0){
            System.out.print("Your number hasn't got 3 digits and it is just ");
        }
        switch (hundreds) {

            case 1:
                System.out.print("Your number is : One Hundred ");
                break;
            case 2:
                System.out.print("Your number is : Two Hundred ");
                break;
            case 3:
                System.out.print("Your number is : Three Hundred ");
                break;
            case 4:
                System.out.print("Your number is : Four Hundred ");
                break;
            case 5:
                System.out.print("Your number is : Five Hundred ");
                break;
            case 6:
                System.out.print("Your number is : Six Hundred ");
                break;
            case 7:
                System.out.print("Your number is : Seven Hundred ");
                break;
            case 8:
                System.out.print("Your number is : Eight Hundred ");
                break;
            case 9:
                System.out.print("Your number is : Nine Hundred ");
                break;
        }

        if (tens == 1) {
            switch (ones) {
                case 0:
                    System.out.print("ten");
                    break;
                case 1:
                    System.out.print("eleven");
                    break;
                case 2:
                    System.out.print("twelve");
                    break;
                case 3:
                    System.out.print("thirteen");
                    break;
                case 4:
                    System.out.print("fourteen");
                    break;
                case 5:
                    System.out.print("fifteen");
                    break;
                case 6:
                    System.out.print("sixteen");
                    break;
                case 7:
                    System.out.print("seventeen");
                    break;
                case 8:
                    System.out.print("eighteen");
                    break;
                case 9:
                    System.out.print("nineteen");
                    break;
            }

        }else {
            switch (tens){
                case 2 :
                    System.out.print("twenty ");
                    break;
                case 3 :
                    System.out.print("thirty ");
                    break;
                case 4 :
                    System.out.print("forty ");
                    break;
                case 5 :
                    System.out.print("fifty ");
                    break;
                case 6  :
                    System.out.print("sixty ");
                    break;
                case 7 :
                    System.out.print("seventy ");
                    break;
                case 8 :
                    System.out.print("eighty ");
                    break;
                case 9 :
                    System.out.print("ninety ");
                    break;

            }

           }
        switch (ones){
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.print("four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("eight");
                break;
            case 9:
                System.out.print("nine");
                break;
        }
    }
}
