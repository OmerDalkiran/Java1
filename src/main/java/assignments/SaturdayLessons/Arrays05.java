package assignments.SaturdayLessons;

import java.util.Arrays;

public class Arrays05 {
        public static void main(String[] args) {

            // Verilen bir cumlede istenen harfin kac defa kullanildigini yazdiran
            // bir method olusturun

            String cumle= "Nerede o 'hello world' yazdiramayan ogrenciler?";
            char harf='o';
            harfKacKareKullanmis(cumle,harf);
        }
        public static void harfKacKareKullanmis( String cumle, char harf){

            int sayi=0;
            String harfst= "" + harf;
            String karekterler[]=cumle.split("");
            System.out.println(Arrays.toString(karekterler));

            for (int i=0 ; i<karekterler.length; i++){
                if (karekterler[i].equals(harfst)){
                    sayi++;
                }
            }
            System.out.println("aradiginiz " +harf+ "vrilen cumlede "+sayi+ "");

        }
    }

