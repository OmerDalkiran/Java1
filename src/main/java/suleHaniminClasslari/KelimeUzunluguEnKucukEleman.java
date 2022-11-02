package suleHaniminClasslari;

public class KelimeUzunluguEnKucukEleman {


    public static void main(String[] args) {

           // Ex. Kelime uzunluklari verilmis kelimelerden en kisasini yazdiran kodu yaziniz.

        String arr[] = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};

        int uzunluk = Integer.MAX_VALUE;

        String uzunluguKucukEleman = "";

        for (String w : arr) {

            uzunluk = Math.min(uzunluk, w.length());

            if (w.length() == uzunluk) {

                uzunluguKucukEleman = uzunluguKucukEleman + w + " ";
            }
        }
        System.out.println(uzunluguKucukEleman);
        System.out.println(uzunluk);


        // Ex. Kelime uzunluklari verilmis kelimelerden en uzununu yazdiran kodu yaziniz.

        String arr1[] = {"Kemal", "Jonathan", "Mark", "Angie", "Veli"};

        int uzunluk2 = Integer.MIN_VALUE;

        String uzunluguEnBuyukEleman = "";

        for (String w : arr1) {
            uzunluk2 = Math.max(uzunluk2, w.length());

            if (w.length() == uzunluk2) {

                uzunluguEnBuyukEleman = uzunluguEnBuyukEleman + w + " ";
            }
        }
        System.out.println(uzunluguEnBuyukEleman);
        System.out.println(uzunluk2);
    }
}