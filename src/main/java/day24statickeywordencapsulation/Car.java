package day24statickeywordencapsulation;

public class Car {


    public static String make = "Honda";


    public String model = "Accord";

    public int price = 20000;

    public static int counter = 0;           // Bu olusturdugum arabalari sayacak


    public Car (){
        counter++;
        price++;




    }

}
