package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {


        //Ex 1 : Japonya ile Almanya arasindaki zaman farkini hesaplayan kodu yaziniz.

        LocalDateTime currentDateTimeInTokyo = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInTokyo);

        LocalDateTime currentDateTimeInBerlin= LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(currentDateTimeInBerlin);

        Long diff = ChronoUnit.HOURS.between(currentDateTimeInBerlin,currentDateTimeInTokyo);

        System.out.println(diff);  // 6

        // Ex 2. Sabit bir tarih olusturunuz.

        LocalDate myDate = LocalDate.of(2022, Month.OCTOBER,21);

        System.out.println(myDate);  //   2022-10-21
        /*
        1- JAvada sabit datalari, (gun, ay, isimleri, Amerikadaki Eyalet isimleri etc ) depolamak ve gerektiginde kullanmak icin depolar olustururuz
            Bu depolara "ENUM" denir.

         */
        // Ex 3 : USA icin "Wooow! , UK icin "Big",  " CANADA" icin "Cold", "TURKEY" icin "vatan", GERMANY icin "Araba", RWANDA icin "Cay"

       // String country = Countries.USA;
        Countries country = Countries.USA;

        switch (country){
            case USA:
                System.out.println("Woow");
            case UK:
                System.out.println("Big");
            case CANADA:
                System.out.println("Cold");
            case TURKEY:
                System.out.println("Vatan");
            case GERMANY:
                System.out.println("Araba");
            case RWANDA:
                System.out.println("Cay");
            default:
                System.out.println("Tanimlanmamis Ulke");

        }
    }
}
