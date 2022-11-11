package practiceAdvanced.practice07;

import java.util.Random;

public class Q05_Exception_Throw {
       /*
   rastgeleSayi isminde bir method oluşturunuz.
   Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
   Bu iki random sayının toplamını yazdırın.
   Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
   ("Sayı 12'den küçük ise hata verir") yazdırın.
     */

    public static void main(String[] args) {

        rastgeleSayi();


    }

    public static void rastgeleSayi() {
        Random random = new Random();
        while (true) {
            int a = random.nextInt(11);
            int b = random.nextInt(11);
            try {

                if (a + b < 12) {
                    throw new Exception();
                } else {
                    System.out.println(a + "--" + b);
                    System.out.println(a + b);
                    break;
                }

            } catch (Exception e) {
                System.out.println(a + " + " + b + " = " + (a + b));
                System.out.println("Toplam 12'den küçük olamaz...");
            }
        }
    }
}