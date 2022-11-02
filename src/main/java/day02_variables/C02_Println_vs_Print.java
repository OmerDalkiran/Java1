package day02_variables;

public class C02_Println_vs_Print {

    // println ile print in arasindaki fark

   /* konsolda
    1
    2
    3
    4
    5
     seklinde alt alta ve yan yana yazdiriniz */

    public static void main(String[] args) {

        System.out.println("Println");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");



        System.out.println("**********PRINT*******");
        System.out.print("1");
        System.out.print("2");
        System.out.print("3");
        System.out.print("4");
        System.out.print("5"); // hepsini yan yana yazdiriyor
    }

}
