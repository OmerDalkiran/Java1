package assignments.mycodes.salarycalcualtion;

import java.util.Scanner;

public class Runners {

    public static void main(String[] args) {

        /*
        Write a code that calculates net salary. (Use interface)
         Salary criteria:
         Set gross salary.* We will set one gross salary) ex. 3000
         + Increase salary by $100 each year based on the employee's total years of employment. ex. 10*100=1000
         + Increase salary by $10 for every hour over 160 hours based on the employee's monthly working hours.
           (ex. 200-160)*10= 400 months of overtime
         - Deduct 30% tax from the salaries of employees with 10 or more working years and 20% from others.
         */

        System.out.println("Please enter your Brutto Salary");
        Scanner input =new Scanner(System.in);
        double bruttoSalary = input.nextDouble();

        System.out.println("Please enter your number of working years");
        int yearNumbers = input.nextInt();

        System.out.println("Please enter your extra working hours for this month");
        int extraWorkingHours =input.nextInt();

        MainCalculations worker = new MainCalculations();

        double workersNettoSalary = worker.netSalary(bruttoSalary,yearNumbers,extraWorkingHours);
        System.out.println("Your net salary is "+workersNettoSalary);

    }
}
