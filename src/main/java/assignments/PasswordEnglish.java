package assignments;

import java.util.Scanner;

public class PasswordEnglish {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen bir password giriniz.");
        String password = input.nextLine();
        boolean space = password.replaceAll("[^ ]", "").length() > 0;
        if (space) {
            System.out.println("Paswordunuz space icermemelidir.");
        }
        boolean symbol = password.replaceAll("[^\\p{Punct}]", "").length() == 0;
        if (symbol) {
            System.out.println("Passwordunuzde en az bir sembol olmalidir.");
        }
        boolean num = password.replaceAll(("[^0-9]"), "").length() == 0;
        if (num) {
            System.out.println("Passwordunuzde en az bir rakam bulunmalidir.");
        }
        boolean smlLetter = password.replaceAll(("[^a-z]"), "").length() == 0;
        if (smlLetter) {
            System.out.println("Passwordunuzde en az bir kucuk harf olmalidir.");
        }
        boolean cptlLetter = password.replaceAll(("[^A-Z]"), "").length() == 0;
        if (cptlLetter) {
            System.out.println("Passwordunuzde en az bir buyuk harf olmalidir.");
        }
        boolean length = password.length() < 8 ;
        if (length) {
            System.out.println("Passwordunuz en az 8 karakter icermelidir. ");
        }
//        boolean gecerli = !space && !symbol && !num && !smlLetter && !cptlLetter && !length ;
////        if (gecerli){
////            System.out.println("Passwordunuz gecerlidir");
//        } else {
//            System.out.println("Passwordunuz gecersizdir. Lutfen tekrar deneyiniz");
        if (!space && !symbol && !num && !smlLetter && !cptlLetter && !length){
            System.out.println("Passwordunuz gecerlidir");
        } else {
            System.out.println("Passwordunuz gecersiz. Lutfen tekrar deneyiniz");
        }
    }
}
