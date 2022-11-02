package suleHaniminClasslari;

public class C02_ifStatement {

    /* NOT HESAPLAYICI

        90 ~100 => A  Cok Iyi
        80 ~ 89 => B  Iyi
        70 ~ 79 => C  Orta
        60 ~ 69 => D  Gecer
        0 ~ 59  => F  Zayif
*/

    public static void main(String[] args) {

        int not = 45;  // ilk once soru notlarla alakali oldugu icin bir esitlik olustur.

        if (not >= 90 && not <= 100) {
            System.out.println("Notunuz cok iyi");

        } else if (not >= 80 && not <= 90) {
            System.out.println("Notunuz iyi");

        } else if (not >= 70 && not <= 80) {
            System.out.println("Notunuz C Orta");


        } else if (not >= 60 && not <= 70) {
            System.out.println("Notunuz D Gecer");


        } else if (not >= 0 && not <= 59) {
            System.out.println("Notunuz D Zayif");
            {

            }

        }

    }
}
