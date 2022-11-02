import java.util.Scanner;

public class PasswordTrueFalse {


    public void password(){

        Scanner input = new Scanner(System.in);

        String passwNew1="";
        System.out.println("Lutfen Passwordunuzu giriniz");
        passwNew1=input.nextLine();
        do{
            System.out.println("Lutfen Passwordunuzu bir daha giriniz");
            passwNew1=input.nextLine();

            if(!(passwNew1.equals("AliCAn"))) {
                System.out.println("Yanlis");
            }
        }while (!(passwNew1.equals("AliCan")));
        System.out.println("Dogru");
    }
}
