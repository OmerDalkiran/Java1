package farkliProjeler.odevVeAlistirmalar;

import java.util.Scanner;

public class Java01pdf4soru {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     //Type a program which calculates the volume of a rectangular prism
        //whose length, width, and height are entered by user.
        //Hint 1: Volume of a rectangular prism is width x length x height

        System.out.println("Enter the length, width and heght of the rectangula prism whose volume you would like to calculate");

        double length = input.nextDouble();
        double width = input.nextDouble();
        double height = input.nextDouble();
        System.out.println("Volume= " + length * width * height);

    }
}
