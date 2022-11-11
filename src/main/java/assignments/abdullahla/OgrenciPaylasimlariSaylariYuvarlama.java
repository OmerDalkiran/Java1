package assignments.abdullahla;

import java.text.DecimalFormat;

public class OgrenciPaylasimlariSaylariYuvarlama {
    public static void main(String[] args) {

        // SORU:

// Verilen bir double sayının en son basamağı 5 ve 5 ten büyükse, en son basamaktan bir önceki rakamı bir üst
// rakama çeviren ve enson basamağı "0" yapan;
// bu sayının en son basamağı 5 ten küçükse, en son basamaktan bir önceki rakamı aynı değerde tutan ve en son
// basamağı "0" yapan kodu yazınız.
// 1.25 ==> 1.30
// 1.24 ==>1.20

        System.out.println("Son basamaginin yuvarlanmasini istediginiz ondalikli bir sayi giriniz");

        DecimalFormat sayi = new DecimalFormat("1.25");
        System.out.println(sayi);


    }
}
