package assignments.GroupQuestions;

import java.util.Scanner;

public class Q13FibonacciSeries {
    /*
             The elements of an integer array with N elements, the first two elements of which are 0 and 1,
             respectively, are the sum of the element before them. Print this array to the screen.

             input= N
             numbers []=0
             numbers[1]=1;
             output numbers={0,1,1,2,3,5,8,13}
             */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a digit");
        int N = input.nextInt();
        int numbers[]= new int[N];

        int sum=0;
        numbers [0]=0;
        numbers[1]=1;

        for(int i =2; i< numbers.length; i++ ){
            numbers[i]=numbers[i-1]+numbers[i-2];

        }
        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i]+ " ");
        }
    }
}
