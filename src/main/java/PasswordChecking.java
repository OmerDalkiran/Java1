import java.util.Scanner;

public class PasswordChecking {

    public static void passwordChecking() {

        //  Bir password'un gecerli olup olmadigini asagidaki kurallara gore test eden kodu yaziniz
        //  i)Space icermemeli. Space varsa "passwordunuzde space olmamali" uyarisi vermeli.
        // ii)En az 1 sembol icermeli. Sembol yoksa "passwordunuzde en az bir sembol olmali" uyarisi vermeli.
        // iii)En az 1 rakam icermeli. Rakam yoksa "passwordunuzde en az bir rakam olmali" uyarisi vermeli.
        // iv)En az 1 buyuk harf icermeli "passwordunuzde en az bir buyuk harf olmali" uyarisi vermeli.
        // v)En az 1 kucuk harf icermeli  "passwordunuzde en az bir kucuk harf olmali" uyarisi vermeli.
        // vi) ve En az 8 karakter olmali  "passwordunuzde en az 8 karakter olmali" uyarisi vermeli.


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
        boolean length = password.length() < 8;
        if (length) {

            System.out.println("Passwordunuz en az 8 karakter icermelidir. ");
        }
        // boolean gecerli = !space && !symbol && !num && !smlLetter && !cptlLetter && !length ;

        if (!space && !symbol && !num && !smlLetter && !cptlLetter && !length) {

            System.out.println("Passwordunuz gecerlidir");
        } else {
            System.out.println("Passwordunuz gecersiz. Lutfen tekrar deneyiniz");
        }

    }

}