package practiceAdvanced.practice05;

public class Hacim {


        public void hacimHesapla(int a) {   // metod isimleri ayni, parametreler farkli= metod overloading
            System.out.println("Kupun Hacmi =" + a * a * a);

        }
        public void hacimHesapla(int a, int b) {
            System.out.println("Kare prizmanin hacmi = " + a * a * b);
        }

        public void hacimHesapla(int a, int b, int c) {
            System.out.println("Dikdortgen prizmanin hacmi ="+ a * b * c);


            // sonra obje olusturmamiz lazimm

        }
    }

